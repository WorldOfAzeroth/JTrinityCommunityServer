package com.github.jtrinity.world;

import com.google.protobuf.Service;
import com.pandaria.net.NettyInbound;
import com.pandaria.net.NettyOutbound;
import com.pandaria.net.router.Router;
import com.pandaria.net.server.TcpServer;
import com.github.jtrinity.world.handler.DefaultPortalRpcHandler;
import com.github.jtrinity.world.handler.PortalRpcHandler;
import com.github.jtrinity.world.proto.RpcPacket;
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

    private BNetPortalRpcServer() {
        super(new ServerBootstrap());
    }



    public final static class RpcRouter extends Router<RpcRouter, NettyInbound, NettyOutbound> {
        private final static RpcRouter instance = new RpcRouter();

        private final PortalRpcHandler handler = new DefaultPortalRpcHandler();

        public RpcRouter service(int serviceHash, Service service) {
            route(nettyInbound -> {
                RpcPacket o = nettyInbound.receiveObject(RpcPacket.class);
                return serviceHash == o.getHeader().getServiceHash();
            }, (in, out)-> handler.handle(in, out, service));
            return this;
        }

        static RpcRouter newRoutes() {
            return instance;
        }

    }

}


