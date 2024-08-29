package com.pandaria.net;

import io.netty.buffer.ByteBuf;

import java.nio.ByteBuffer;
import java.util.function.Consumer;

public interface NettyInbound {
    ByteBuf receive();

    <T> T receiveObject();

    NettyInbound withConnection(Consumer<? super Connection> withConnection);
}
