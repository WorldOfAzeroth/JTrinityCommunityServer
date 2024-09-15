package com.github.jtrinity.world.handler;

import com.google.protobuf.Service;
import com.github.jtrinity.net.NettyInbound;
import com.github.jtrinity.net.NettyOutbound;

@FunctionalInterface
public interface PortalRpcHandler {

    void handle(NettyInbound in, NettyOutbound out, Service service);

}
