package com.pandaria.net;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.DefaultFileRegion;
import io.netty.handler.stream.ChunkedNioFile;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface NettyOutbound {

    ByteBufAllocator alloc();

    NettyOutbound sendObject(Object message);

    default NettyOutbound send(ByteBuf message) {
        return sendObject(message);
    }

    NettyOutbound withConnection(Consumer<? super Connection> withConnection);


}
