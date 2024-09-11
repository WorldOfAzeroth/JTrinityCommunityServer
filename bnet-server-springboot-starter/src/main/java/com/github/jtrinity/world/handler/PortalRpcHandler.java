package com.github.jtrinity.world.handler;

import com.google.protobuf.Service;
import com.pandaria.net.NettyInbound;
import com.pandaria.net.NettyOutbound;

@FunctionalInterface
public interface PortalRpcHandler {

    void handle(NettyInbound in, NettyOutbound out, Service service);

}
