/*
 * Copyright (c) 2011-2024 VMware, Inc. or its affiliates, All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pandaria.net;

import com.pandaria.net.server.ConnectionObserver;
import com.pandaria.net.server.NettyPipeline;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;

import java.net.SocketAddress;
import java.util.LinkedList;
import java.util.function.Consumer;

import static java.util.Objects.requireNonNull;


/**
 * {@link NettyInbound} and {@link NettyOutbound}  that apply to a {@link Connection}.
 *
 * @author Stephane Maldini
 * @since 0.6
 */
@Slf4j
public class ChannelOperations<IN extends NettyInbound, OUT extends NettyOutbound>
        implements NettyInbound, NettyOutbound, Connection {

    public static void addReactiveBridge(Channel ch, OnSetup opsFactory, ConnectionObserver listener) {
        requireNonNull(ch, "channel");
        requireNonNull(opsFactory, "opsFactory");
        requireNonNull(listener, "listener");
        ch.pipeline().addLast(NettyPipeline.ReactiveBridge, new ChannelOperationsHandler(opsFactory, listener));
    }


    public static ChannelOperations<?, ?> get(Channel ch) {
        return Connection.from(ch)
                .as(ChannelOperations.class);
    }


    final LinkedList<Object> received = new LinkedList<>();

    final Connection connection;
    final ConnectionObserver listener;

    boolean localActive;
    String longId;
    String shortId;

    protected ChannelOperations(ChannelOperations<IN, OUT> replaced) {
        this.connection = replaced.connection;
        this.listener = replaced.listener;
        this.shortId = replaced.shortId;
        this.longId = replaced.longId;
        this.localActive = replaced.localActive;
    }


    public ChannelOperations(Connection connection, ConnectionObserver listener) {
        this.connection = requireNonNull(connection, "connection");
        this.listener = requireNonNull(listener, "listener");

    }

    @Override
    public <T extends Connection> T as(Class<T> clazz) {
        if (clazz == ChannelOperations.class) {
            @SuppressWarnings("unchecked")
            T thiz = (T) this;
            return thiz;
        }
        return Connection.super.as(clazz);
    }

    @Override
    public ByteBufAllocator alloc() {
        return connection.channel().alloc();
    }

    @Override
    public NettyInbound inbound() {
        return this;
    }

    @Override
    public NettyOutbound outbound() {
        return this;
    }

    @Override
    public final Channel channel() {
        return connection.channel();
    }

    @Override
    public ChannelOperations<IN, OUT> withConnection(Consumer<? super Connection> withConnection) {
        requireNonNull(withConnection, "withConnection");
        withConnection.accept(this);
        return this;
    }

    @Override
    public void dispose() {
        if (log.isDebugEnabled()) {
            log.debug(CommonNetty.format(channel(), "Disposing ChannelOperation from a channel"));
        }
        connection.dispose();
    }


    @Override
    public <T> T receiveObject() {
        @SuppressWarnings("unchecked")
        T result = (T) received.poll();
        return result;
    }

    @Override
    public ByteBuf receive() {
        return receiveObject();
    }

    @Override
    public NettyOutbound send(ByteBuf dataStream) {
        return sendObject(dataStream);
    }

    @Override
    public NettyOutbound sendObject(Object dataStream) {
        if (!channel().isActive()) {
            CommonNetty.safeRelease(dataStream);
            throw new RuntimeException("Connection has been closed BEFORE send operation");
        }
        channel().writeAndFlush(dataStream);
        return this;
    }



    public final ConnectionObserver listener() {
        return listener;
    }


    protected void onInboundNext(ChannelHandlerContext ctx, Object msg) {
        received.offer(msg);
        listener.onStateChange(this, ConnectionObserver.State.READ);
    }


    protected void onInboundClose() {
        while (received.isEmpty()) {
            CommonNetty.safeRelease(received.poll());
        }
        if (unbind(connection)) {
            if (log.isTraceEnabled()) {
                log.trace(CommonNetty.format(channel(), "Disposing ChannelOperation from a channel"),
                        new Exception("ChannelOperation terminal stack"));
            }
            listener.onStateChange(this, ConnectionObserver.State.DISCONNECTING);
        }

    }

    protected final void onInboundError(Throwable err) {
        listener.onUncaughtException(connection, err);
    }

    protected final Connection connection() {
        return connection;
    }



    protected void onWritabilityChanged() {
    }


    public String asShortText() {
        if (shortId == null) {
            shortId = channel().id().asShortText();
        }

        return shortId;
    }




    @Override
    public String toString() {
        boolean active = channel().isActive();
        if (localActive == active && longId != null) {
            return longId;
        }

        SocketAddress remoteAddress = channel().remoteAddress();
        SocketAddress localAddress = channel().localAddress();
        String shortText = asShortText();
        if (remoteAddress != null) {
            String localAddressStr = String.valueOf(localAddress);
            String remoteAddressStr = String.valueOf(remoteAddress);
            longId = shortText + ", L:" + localAddressStr + (active ? " - " : " ! ") + "R:" + remoteAddressStr;
        } else if (localAddress != null) {
            String localAddressStr = String.valueOf(localAddress);
            longId = shortText +
                    ", L:" +
                    localAddressStr;
        } else {
            longId = shortText;
        }

        localActive = active;
        return longId;
    }

    /**
     * A {@link ChannelOperations} factory.
     */
    @FunctionalInterface
    public interface OnSetup {

        /**
         * Return an empty, no-op factory.
         *
         * @return an empty, no-op factory
         */
        static OnSetup empty() {
            return EMPTY_SETUP;
        }

        /**
         * Create a new {@link ChannelOperations} given a netty channel, a parent {@link
         * ConnectionObserver} and an optional message (nullable).
         *
         * @param c        a {@link Connection}
         * @param listener a {@link ConnectionObserver}
         * @param msg      an optional message
         * @return the new {@link ChannelOperations}
         */
        ChannelOperations<?, ?> create(Connection c, ConnectionObserver listener, Object msg);

    }

    static final Object TERMINATED_OPS = new Object();

    static final OnSetup EMPTY_SETUP = (c, l, msg) -> null;


}
