package com.pandaria.net;

import com.pandaria.net.server.ConnectionObserver;
import com.pandaria.net.server.NettyPipeline;
import io.netty.buffer.*;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoop;
import io.netty.handler.ssl.SslHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.handler.timeout.IdleStateHandler;
import io.netty.util.AttributeKey;
import io.netty.util.ReferenceCounted;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.SocketException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.time.ZoneId;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.util.Objects.requireNonNull;

/**
 * Internal helpers for reactor-netty contracts.
 *
 * @author Stephane Maldini
 */
@Slf4j
public final class CommonNetty {

    // System properties names


    /**
     * Specifies whether the channel ID will be prepended to the log message when possible.
     * By default, it will be prepended.
     */
    static final boolean LOG_CHANNEL_INFO =
            Boolean.parseBoolean(System.getProperty("netty.logChannelInfo", "true"));

    /**
     * Default worker thread count, fallback to available processor
     * (but with a minimum value of 4).
     */
    public static final String IO_WORKER_COUNT = "netty.ioWorkerCount";
    /**
     * Default selector thread count, fallback to -1 (no selector thread)
     * <p><strong>Note:</strong> In most use cases using a worker thread also as a selector thread works well.
     * A possible use case for specifying a separate selector thread might be when the worker threads are too busy
     * and connections cannot be accepted fast enough.
     * <p><strong>Note:</strong> Although more than 1 can be configured as a selector thread count, in reality
     * only 1 thread will be used as a selector thread.
     */
    public static final String IO_SELECT_COUNT = "netty.ioSelectCount";
    /**
     * Default worker thread count for UDP, fallback to available processor
     * (but with a minimum value of 4).
     */
    public static final String UDP_IO_THREAD_COUNT = "netty.udp.ioThreadCount";
    /**
     * Default quiet period that guarantees that the disposal of the underlying LoopResources
     * will not happen, fallback to 2 seconds.
     */
    public static final String SHUTDOWN_QUIET_PERIOD = "netty.ioShutdownQuietPeriod";
    /**
     * Default maximum amount of time to wait until the disposal of the underlying LoopResources
     * regardless if a task was submitted during the quiet period, fallback to 15 seconds.
     */
    public static final String SHUTDOWN_TIMEOUT = "netty.ioShutdownTimeout";

    /**
     * Default value whether the native transport (epoll, kqueue) will be preferred,
     * fallback it will be preferred when available.
     */
    public static final String NATIVE = "netty.native";

    /**
     * Default SSL handshake timeout (milliseconds), fallback to 10 seconds.
     */
    public static final String SSL_HANDSHAKE_TIMEOUT = "netty.tcp.sslHandshakeTimeout";
    /**
     * Default value whether the SSL debugging on the client side will be enabled/disabled,
     * fallback to SSL debugging disabled.
     */
    public static final String SSL_CLIENT_DEBUG = "netty.tcp.ssl.client.debug";
    /**
     * Default value whether the SSL debugging on the server side will be enabled/disabled,
     * fallback to SSL debugging disabled.
     */
    public static final String SSL_SERVER_DEBUG = "netty.tcp.ssl.server.debug";


    /**
     * Specifies whether the Http Server access log will be enabled.
     * By default, it is disabled.
     */
    public static final String ACCESS_LOG_ENABLED = "netty.http.server.accessLogEnabled";

    /**
     *  Specifies the zone id used by the access log.
     */
    public static final ZoneId ZONE_ID_SYSTEM = ZoneId.systemDefault();

    public static void safeRelease(Object msg) {
        if (msg instanceof ReferenceCounted referenceCounted) {
            if (referenceCounted.refCnt() > 0) {
                referenceCounted.release();
            }
        }
    }

    /**
     * Append channel ID to a log message for correlated traces.
     * @param channel current channel associated with the msg
     * @param msg the log msg
     * @return a formatted msg
     */
    public static String format(Channel channel, String msg) {
        Objects.requireNonNull(channel, "channel");
        Objects.requireNonNull(msg, "msg");
        if (LOG_CHANNEL_INFO) {
            String channelStr;
            StringBuilder result;
            Connection connection = Connection.from(channel);
            if (connection instanceof ChannelOperations<?,?>) {
                channelStr = connection.toString();
                if (channelStr.charAt(0) != TRACE_ID_PREFIX) {
                    result = new StringBuilder(1 + channelStr.length() + 2 + msg.length())
                            .append(CHANNEL_ID_PREFIX)
                            .append(channelStr)
                            .append(CHANNEL_ID_SUFFIX_1);
                }
                else {
                    result = new StringBuilder(channelStr.length() + 1 + msg.length())
                            .append(channelStr)
                            .append(CHANNEL_ID_SUFFIX_2);
                }
                return result.append(msg)
                        .toString();
            }
            else {
                channelStr = channel.toString();
                if (channelStr.charAt(0) == CHANNEL_ID_PREFIX) {
                    channelStr = channelStr.substring(ORIGINAL_CHANNEL_ID_PREFIX_LENGTH);
                    result = new StringBuilder(1 + channelStr.length() + 1 + msg.length())
                            .append(CHANNEL_ID_PREFIX)
                            .append(channelStr);
                }
                else {
                    int ind = channelStr.indexOf(ORIGINAL_CHANNEL_ID_PREFIX);
                    result = new StringBuilder(1 + (channelStr.length() - ORIGINAL_CHANNEL_ID_PREFIX_LENGTH) + 1 + msg.length())
                            .append(channelStr.substring(0, ind))
                            .append(CHANNEL_ID_PREFIX)
                            .append(channelStr.substring(ind + ORIGINAL_CHANNEL_ID_PREFIX_LENGTH));
                }
                return result.append(CHANNEL_ID_SUFFIX_2)
                        .append(msg)
                        .toString();
            }
        }
        else {
            return msg;
        }
    }

    /**
     * Pretty hex dump will be returned when the object is {@link ByteBuf} or {@link ByteBufHolder}.
     *
     * @deprecated as of 1.1.0. This will be removed in 2.0.0 as the functionality is not used anymore.
     */
    @Deprecated
    public static String toPrettyHexDump(Object msg) {
        Objects.requireNonNull(msg, "msg");
        String result;
        if (msg instanceof ByteBufHolder &&
                !Objects.equals(Unpooled.EMPTY_BUFFER, ((ByteBufHolder) msg).content())) {
            ByteBuf buffer = ((ByteBufHolder) msg).content();
            result = "\n" + ByteBufUtil.prettyHexDump(buffer);
        }
        else if (msg instanceof ByteBuf) {
            result = "\n" + ByteBufUtil.prettyHexDump((ByteBuf) msg);
        }
        else {
            result = msg.toString();
        }
        return result;
    }



    /**
     * Wrap possibly fatal or singleton exception into a new exception instance in order to propagate in reactor flows without side effect.
     *
     * @return a wrapped {@link RuntimeException}
     */
    public static RuntimeException wrapException(Throwable throwable) {
        return new InternalNettyException(Objects.requireNonNull(throwable));
    }

    static void addChunkedWriter(Connection c) {
        if (c.channel()
                .pipeline()
                .get(ChunkedWriteHandler.class) == null) {
            c.addHandlerLast(NettyPipeline.ChunkedWriter, new ChunkedWriteHandler());
        }
    }

    /**
     * A common implementation for the {@link Connection#addHandlerLast(String, ChannelHandler)}
     * method that can be reused by other implementors.
     * <p>
     * This implementation will look for reactor added handlers on the right hand side of
     * the pipeline, provided they are identified with the {@link NettyPipeline#RIGHT}
     * prefix, and add the handler just before the first of these.
     *
     * @param context the {@link Connection} on which to add the decoder.
     * @param name the name of the decoder.
     * @param handler the decoder to add before the final reactor-specific handlers.
     * @see Connection#addHandlerLast(String, ChannelHandler)
     */
    static void addHandlerBeforeReactorEndHandlers(Connection context, String
            name,	ChannelHandler handler) {
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(handler, "handler");

        Channel channel = context.channel();
        boolean exists = channel.pipeline().get(name) != null;

        if (exists) {
            if (log.isDebugEnabled()) {
                log.debug(format(channel, "Handler [{}] already exists in the pipeline, decoder has been skipped"),
                        name);
            }
            return;
        }

        //we need to find the correct position
        String before = null;
        for (String s : channel.pipeline().names()) {
            if (s.startsWith(NettyPipeline.RIGHT)) {
                before = s;
                break;
            }
        }

        if (before == null) {
            channel.pipeline().addLast(name, handler);
        }
        else {
            channel.pipeline().addBefore(before, name, handler);
        }


        if (log.isDebugEnabled()) {
            log.debug(format(channel, "Added decoder [{}] at the end of the user pipeline, full pipeline: {}"),
                    name,
                    channel.pipeline().names());
        }
    }

    /**
     * A common implementation for the {@link Connection#addHandlerFirst(String, ChannelHandler)}
     * method that can be reused by other implementors.
     * <p>
     * This implementation will look for reactor added handlers on the left hand side of
     * the pipeline, provided they are identified with the {@link NettyPipeline#LEFT}
     * prefix, and add the handler just after the last of these.
     *
     * @param context the {@link Connection} on which to add the decoder.
     * @param name the name of the encoder.
     * @param handler the encoder to add after the initial reactor-specific handlers.
     * @see Connection#addHandlerFirst(String, ChannelHandler)
     */
    static void addHandlerAfterReactorCodecs(Connection context, String
            name,
                                             ChannelHandler handler) {
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(handler, "handler");

        Channel channel = context.channel();
        boolean exists = channel.pipeline().get(name) != null;

        if (exists) {
            if (log.isDebugEnabled()) {
                log.debug(format(channel, "Handler [{}] already exists in the pipeline, encoder has been skipped"),
                        name);
            }
            return;
        }

        //we need to find the correct position
        String after = null;
        for (String s : channel.pipeline().names()) {
            if (s.startsWith(NettyPipeline.LEFT)) {
                after = s;
            }
        }

        if (after == null) {
            channel.pipeline().addFirst(name, handler);
        }
        else {
            channel.pipeline().addAfter(after, name, handler);
        }


        if (log.isDebugEnabled()) {
            log.debug(format(channel, "Added encoder [{}] at the beginning of the user pipeline, full pipeline: {}"),
                    name,
                    channel.pipeline().names());
        }
    }

    static boolean mustChunkFileTransfer(Connection c, Path file) {
        // if channel multiplexing a parent channel as an http2 stream
        if (c.channel().parent() != null && c.channel().parent().pipeline().get(NettyPipeline.H2MultiplexHandler) != null) {
            return true;
        }
        ChannelPipeline p = c.channel().pipeline();
        return p.get(SslHandler.class) != null  ||
                p.get(NettyPipeline.CompressionHandler) != null ||
                (!(c.channel().eventLoop() instanceof NioEventLoop) &&
                        !"file".equals(file.toUri().getScheme()));
    }

    static void removeHandler(Channel channel, String name) {
        if (channel.isActive() && channel.pipeline()
                .context(name) != null) {
            channel.pipeline()
                    .remove(name);
            if (log.isDebugEnabled()) {
                log.debug(format(channel, "Removed handler: {}, pipeline: {}"),
                        name,
                        channel.pipeline());
            }
        }
        else if (log.isDebugEnabled()) {
            log.debug(format(channel, "Non Removed handler: {}, context: {}, pipeline: {}"),
                    name,
                    channel.pipeline()
                            .context(name),
                    channel.pipeline());
        }
    }

    static void replaceHandler(Channel channel, String name, ChannelHandler handler) {
        if (channel.isActive() && channel.pipeline()
                .context(name) != null) {
            channel.pipeline()
                    .replace(name, name, handler);
            if (log.isDebugEnabled()) {
                log.debug(format(channel, "Replaced handler: {}, pipeline: {}"),
                        name,
                        channel.pipeline());
            }
        }
        else if (log.isDebugEnabled()) {
            log.debug(format(channel, "Non Replaced handler: {}, context: {}, pipeline: {}"),
                    name,
                    channel.pipeline()
                            .context(name),
                    channel.pipeline());
        }
    }

    public static boolean isConnectionReset(Throwable err) {
        return ((err instanceof IOException && (err.getMessage() == null ||
                        err.getMessage()
                                .contains("Broken pipe") ||
                        err.getMessage()
                                .contains("Connection reset by peer"))) ||
                (err instanceof SocketException && err.getMessage() != null &&
                        err.getMessage()
                                .contains("Connection reset by peer")));
    }

    CommonNetty() {
    }


    static final class OutboundIdleStateHandler extends IdleStateHandler {

        final Runnable onWriteIdle;

        OutboundIdleStateHandler(long idleTimeout, Runnable onWriteIdle) {
            super(0, idleTimeout, 0, TimeUnit.MILLISECONDS);
            this.onWriteIdle = requireNonNull(onWriteIdle, "onWriteIdle");
        }

        @Override
        protected void channelIdle(ChannelHandlerContext ctx,
                                   IdleStateEvent evt) throws Exception {
            if (evt.state() == IdleState.WRITER_IDLE) {
                onWriteIdle.run();
            }
            super.channelIdle(ctx, evt);
        }
    }

    static final class InboundIdleStateHandler extends IdleStateHandler {

        final Runnable onReadIdle;

        InboundIdleStateHandler(long idleTimeout, Runnable onReadIdle) {
            super(idleTimeout, 0, 0, TimeUnit.MILLISECONDS);
            this.onReadIdle = requireNonNull(onReadIdle, "onReadIdle");
        }

        @Override
        protected void channelIdle(ChannelHandlerContext ctx,
                                   IdleStateEvent evt) throws Exception {
            if (evt.state() == IdleState.READER_IDLE) {
                onReadIdle.run();
            }
            super.channelIdle(ctx, evt);
        }
    }


    /**
     * A handler that can be used to extract {@link ByteBuf} out of {@link ByteBufHolder},
     * optionally also outputting additional messages.
     *
     * @author Stephane Maldini
     * @author Simon Baslé
     */
    @ChannelHandler.Sharable
    static final class ExtractorHandler extends ChannelInboundHandlerAdapter {


        final BiConsumer<? super ChannelHandlerContext, Object> extractor;
        ExtractorHandler(BiConsumer<? super ChannelHandlerContext, Object> extractor) {
            this.extractor = Objects.requireNonNull(extractor, "extractor");
        }

        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) {
            extractor.accept(ctx, msg);
        }

    }


    static final class SimpleConnection extends AtomicLong implements Connection {

        final Channel channel;

        SimpleConnection(Channel channel) {
            this.channel = Objects.requireNonNull(channel, "channel");
        }

        @Override
        public Channel channel() {
            return channel;
        }

        @Override
        public String toString() {
            return "SimpleConnection{" + "channel=" + channel + '}';
        }
    }

    static NettyInbound unavailableInbound(Connection c) {
        return new NettyInbound() {
            @Override
            public ByteBuf receive() {
                throw new IllegalStateException("Receiver Unavailable");
            }

            @Override
            public Object receiveObject() {
                throw new IllegalStateException("Receiver Unavailable");
            }

            @Override
            public NettyInbound withConnection(Consumer<? super Connection> withConnection) {
                withConnection.accept(c);
                return this;
            }
        };
    }

    static NettyOutbound unavailableOutbound(Connection c) {
        return new NettyOutbound() {

            @Override
            public ByteBufAllocator alloc() {
                return null;
            }

            @Override
            public NettyOutbound send(ByteBuf message) {
                return null;
            }

            @Override
            public NettyOutbound sendObject(Object message) {
                return null;
            }

            @Override
            public NettyOutbound withConnection(Consumer<? super Connection> withConnection) {
                return null;
            }
        };
    }

    static final class InternalNettyException extends RuntimeException {

        InternalNettyException(Throwable cause) {
            super(cause);
        }

        @Override
        public synchronized Throwable fillInStackTrace() {
            return this;
        }

        private static final long serialVersionUID = 6643227207055930902L;
    }


    static final ConnectionObserver NOOP_LISTENER = (connection, newState) -> {};

    static final AttributeKey<Connection> CONNECTION = AttributeKey.valueOf("$CONNECTION");


    static final Consumer<? super FileChannel> fileCloser = fc -> {
        try {
            fc.close();
        }
        catch (Throwable e) {
            if (log.isTraceEnabled()) {
                log.trace("", e);
            }
        }
    };


    static final Predicate<ByteBuf>        PREDICATE_BB_FLUSH    = b -> false;

    static final Predicate<Object>         PREDICATE_FLUSH       = o -> false;

    static final ByteBuf                   BOUNDARY              = Unpooled.EMPTY_BUFFER;

    static final char CHANNEL_ID_PREFIX = '[';
    static final String CHANNEL_ID_SUFFIX_1 = "] ";
    static final char CHANNEL_ID_SUFFIX_2 = ' ';
    static final String ORIGINAL_CHANNEL_ID_PREFIX = "[id: 0x";
    static final int ORIGINAL_CHANNEL_ID_PREFIX_LENGTH = ORIGINAL_CHANNEL_ID_PREFIX.length();
    static final char TRACE_ID_PREFIX = '(';

    @SuppressWarnings("ReferenceEquality")
    //Design to use reference comparison here
    public static final Predicate<ByteBuf> PREDICATE_GROUP_FLUSH = b -> b == BOUNDARY;

}