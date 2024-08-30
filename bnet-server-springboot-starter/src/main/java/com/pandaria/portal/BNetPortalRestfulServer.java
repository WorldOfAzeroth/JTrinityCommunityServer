package com.pandaria.portal;

import com.pandaria.portal.handler.PortalRpcHandler;
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
public class BNetPortalRestfulServer {

    @Value("bnetserver.BindIP")
    private String bindIP;

    @Value("bnetserver.LoginREST.Port")
    private int loginResTPort;

    @Setter
    private PortalRpcHandler rpcHandler;


    private ChannelFuture closeFuture;
    private final NioEventLoopGroup bossGroup = new NioEventLoopGroup(SysProperties.PORTAL_SERVER_IO_SELECT_COUNT, new DefaultThreadFactory(SysProperties.PORTAL_SERVER_IO_BOSS_THREAD_NAME, true));
    private final NioEventLoopGroup workerGroup = new NioEventLoopGroup(SysProperties.PORTAL_SERVER_IO_WORKER_COUNT, new DefaultThreadFactory(SysProperties.PORTAL_SERVER_IO_WORKER_THREAD_NAME, true));



    public void start() {

        ChannelFuture httpFuture = new ServerBootstrap()
                .group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_REUSEADDR, Boolean.TRUE)
                .option(ChannelOption.SO_RCVBUF, SysProperties.PORTAL_SERVER_IO_SO_RCVBUF)
                .option(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT)
                .childOption(ChannelOption.SO_KEEPALIVE, Boolean.TRUE)
                .childOption(ChannelOption.SO_RCVBUF, SysProperties.PORTAL_SERVER_IO_SO_RCVBUF)
                .childOption(ChannelOption.SO_SNDBUF, SysProperties.PORTAL_SERVER_IO_SO_SNDBUF)
                .childOption(ChannelOption.TCP_NODELAY, Boolean.TRUE)
                .childOption(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT)
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) {
                        ch.pipeline().addLast("decoder",new HttpRequestDecoder())
                                .addLast("encoder",new HttpResponseEncoder())
                                .addLast("aggregator",new HttpObjectAggregator(512*1024))
                                .addLast("handler",new HttpServerHandler());
                    }
                })
                .bind(bindIP, loginResTPort);

        Thread thread = new Thread("portal-restful-daemon") {
            @Override
            public void run() {
                try {
                    log.info("portal http server started on port {}: ", loginResTPort);
                    closeFuture = httpFuture.sync();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        thread.setDaemon(true);
        thread.start();



    }

    public void stop() {
        if (closeFuture != null) {
            try {
                closeFuture.channel().closeFuture().sync();
            } catch (InterruptedException ignored) {

            }
            log.info("portal restful server stopped.");
        }
    }


}
