package com.pandaria.portal.boot;

import bgs.protocol.account.v1.AccountServiceProto;
import bgs.protocol.authentication.v1.AuthenticationServiceProto;
import bnet.protocol.connection.v1.ConnectionServiceProto;
import bnet.protocol.game_utilities.v1.GameUtilitiesServiceProto;
import com.pandaria.net.server.DisposableServer;
import com.pandaria.net.server.LoopResources;
import com.pandaria.net.server.NettyPipeline;
import com.pandaria.net.ssl.TcpSslContextSpec;
import com.pandaria.portal.BNetPortalRpcServer;
import com.pandaria.portal.handler.PortalRpcHandler;
import com.pandaria.portal.handler.RpcProtocolDecoder;
import com.pandaria.portal.handler.RpcProtocolEncoder;
import com.pandaria.portal.rpc.service.AccountService;
import com.pandaria.portal.rpc.service.AuthenticationService;
import com.pandaria.portal.rpc.service.ConnectionService;
import com.pandaria.portal.rpc.service.GameUtilitiesService;
import com.pandaria.utils.SysProperties;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.AdaptiveRecvByteBufAllocator;
import io.netty.channel.ChannelOption;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.timeout.IdleStateHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

@Configuration
public class PortalServerConfiguration {


    @Value("bnetserver.BindIP")
    private String bindIP;

    @Value("bnetserver.BattlenetPort")
    private int battlenetPort;


    @Value("bnetserver.LoginREST.Port")
    private int loginResTPort;


    @Value("bnetserver.CertificatesFile")
    private String certificatesFile;


    @Value("bnetserver.PrivateKeyFile")
    private String privateKeyFile;



    @Bean
    public PortalRpcHandler portalHandler(PortalProperties portalProperties, AuthService authService, RealmManager realmManager) {
        PortalRpcHandler portalRpcHandler = new PortalRpcHandler();
        portalRpcHandler.register(ConnectionServiceProto.ConnectionService.newReflectiveService(new ConnectionService()));
        portalRpcHandler.register(AuthenticationServiceProto.AuthenticationService.newReflectiveService(new AuthenticationService(portalProperties, authService)));
        portalRpcHandler.register(AccountServiceProto.AccountService.newReflectiveService(new AccountService()));
        portalRpcHandler.register(GameUtilitiesServiceProto.GameUtilitiesService.newReflectiveService(new GameUtilitiesService(authService, realmManager)));
        return portalRpcHandler;
    }


    @Bean(destroyMethod = "disposeNow")
    public DisposableServer bNetPortalRpcServer(@Autowired PortalRpcHandler rpcHandler) {
        return BNetPortalRpcServer.create()
                .option(ChannelOption.SO_REUSEADDR, Boolean.TRUE)
                .option(ChannelOption.SO_RCVBUF, SysProperties.PORTAL_SERVER_IO_SO_RCVBUF)
                .option(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT)
                .option(ChannelOption.RCVBUF_ALLOCATOR, new AdaptiveRecvByteBufAllocator(255, 2048, 65535))
                .childOption(ChannelOption.SO_KEEPALIVE, Boolean.TRUE)
                .childOption(ChannelOption.SO_RCVBUF, SysProperties.PORTAL_SERVER_IO_SO_RCVBUF)
                .childOption(ChannelOption.SO_SNDBUF, SysProperties.PORTAL_SERVER_IO_SO_SNDBUF)
                .childOption(ChannelOption.TCP_NODELAY, Boolean.TRUE)
                .childOption(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT)
                .secure(sslContextSpec -> {
                    sslContextSpec.sslContext(TcpSslContextSpec.forServer(new File(certificatesFile), new File(privateKeyFile)));
                }).doOnChannelInit((observer, channel, address) -> {
                    channel.pipeline().addFirst("rpc.IdleHandler", new IdleStateHandler(0, 0, 30, TimeUnit.MINUTES));
                    channel.pipeline().addBefore(NettyPipeline.ReactiveBridge, "rpc.RpcDecoder", new RpcProtocolDecoder());
                    channel.pipeline().addLast("rpc.RpcEncoder", new RpcProtocolEncoder());
                }).handle(rpcHandler)
                .bindAddress(() -> new InetSocketAddress(bindIP, battlenetPort))
                .runOn(LoopResources.create(SysProperties.PORTAL_SERVER_IO_BOSS_THREAD_NAME,
                                SysProperties.PORTAL_SERVER_IO_SELECT_COUNT, SysProperties.PORTAL_SERVER_IO_WORKER_COUNT, true),
                        SysProperties.PORTAL_SERVER_IO_PREFERNATIVE)
                .bindNow();
    }

}
