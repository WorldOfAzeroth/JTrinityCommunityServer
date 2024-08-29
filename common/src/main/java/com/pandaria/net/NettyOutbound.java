package com.pandaria.net;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.function.Consumer;

public interface NettyOutbound {

    ByteBufAllocator alloc();

    NettyOutbound send(ByteBuf message);

    NettyOutbound sendObject(Object message);

    NettyOutbound withConnection(Consumer<? super Connection> withConnection);

}
