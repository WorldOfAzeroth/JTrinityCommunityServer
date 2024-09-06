package com.pandaria.portal;

import com.google.protobuf.Service;
import com.pandaria.net.ChannelOperations;
import com.pandaria.net.NettyInbound;
import com.pandaria.net.NettyOutbound;
import com.pandaria.net.router.Router;
import com.pandaria.net.server.TcpServer;
import com.pandaria.portal.handler.DefaultPortalRpcHandler;
import com.pandaria.portal.handler.PortalRpcHandler;
import com.pandaria.portal.proto.RpcPacket;
import io.netty.bootstrap.ServerBootstrap;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;
import java.util.function.Consumer;

@Slf4j
public class BNetPortalRpcServer extends TcpServer<BNetPortalRpcServer> {


    public static BNetPortalRpcServer create() {
        return new BNetPortalRpcServer();
    }

    public final BNetPortalRpcServer route(Consumer<? super RpcRouter> routesBuilder) {
        Objects.requireNonNull(routesBuilder, "routeBuilder");
        RpcRouter routes = RpcRouter.newRoutes();
        routesBuilder.accept(routes);
        return handle(routes);
    }


    @Override
    protected BNetPortalRpcServer self() {
        return this;
    }

    @Override
    protected ChannelOperations.OnSetup onSetup() {
        return null;
    }

    private BNetPortalRpcServer() {
        super(new ServerBootstrap());
    }



    public final static class RpcRouter extends Router<RpcRouter, NettyInbound, NettyOutbound> {
        private final static RpcRouter instance = new RpcRouter();

        private final PortalRpcHandler handler = new DefaultPortalRpcHandler();

        public RpcRouter service(int serviceHash, Service service) {
            route(nettyInbound -> {
                RpcPacket o = nettyInbound.receiveObject();
                return serviceHash == o.getHeader().getServiceHash();
            }, (in, out)-> handler.handle(in, out, service));
            return this;
        }

        static RpcRouter newRoutes() {
            return instance;
        }

    }

}


