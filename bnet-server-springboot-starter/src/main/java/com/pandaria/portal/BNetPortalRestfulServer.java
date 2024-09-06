package com.pandaria.portal;

import com.pandaria.net.server.TcpServer;
import com.pandaria.portal.handler.DefaultPortalRpcHandler;
import com.pandaria.utils.SysProperties;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.util.concurrent.DefaultThreadFactory;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;


@Slf4j
public class BNetPortalRestfulServer extends TcpServer<BNetPortalRestfulServer> {

    public static BNetPortalRestfulServer create() {
        return new BNetPortalRestfulServer();
    }

    @Override
    protected BNetPortalRestfulServer self() {
        return this;
    }

    private BNetPortalRestfulServer() {
        super(new ServerBootstrap());
    }
}
