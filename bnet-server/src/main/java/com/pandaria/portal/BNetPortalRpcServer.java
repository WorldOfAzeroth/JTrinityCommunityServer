package com.pandaria.portal;

import com.pandaria.net.ChannelOperations;
import com.pandaria.net.NettyInbound;
import com.pandaria.net.NettyOutbound;
import com.pandaria.net.router.Router;
import com.pandaria.net.server.TcpServer;
import com.pandaria.portal.proto.RpcPacket;
import io.netty.bootstrap.ServerBootstrap;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
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

        private final Map<Integer, BiConsumer<NettyInbound, NettyOutbound>> identityHandlers = new HashMap<>();


        public RpcRouter service(Integer serviceHash, BiConsumer<NettyInbound, NettyOutbound> handler) {
            identityHandlers.put(serviceHash, handler);
            return this;
        }

        static RpcRouter newRoutes() {
            return new RpcRouter();
        }

        @Override
        protected BiConsumer<NettyInbound, NettyOutbound> identity(NettyInbound request) {
            RpcPacket packet = request.receiveObject();
            int serviceHash = packet.getHeader().getServiceHash();
            return identityHandlers.get(serviceHash);
        }
    }
}
