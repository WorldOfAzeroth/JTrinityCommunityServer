package com.pandaria.portal;

import com.pandaria.net.ChannelOperations;
import com.pandaria.net.Connection;
import com.pandaria.net.http.HttpOperations;
import com.pandaria.net.server.ConnectionObserver;
import com.pandaria.net.server.TcpServer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.Charset;


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

    @Override
    protected ChannelOperations.OnSetup onSetup() {
        return (ch, c, msg) -> new ServerOperations(ch, c);
    }

    private static final class ServerOperations extends HttpOperations {

        public ServerOperations(Connection connection, ConnectionObserver listener) {
            super(connection, listener);
        }

        @Override
        protected void deserialize(Object content, ByteBuf buffer, Charset charset) {
            
        }

        @Override
        protected <T> T serialize(ByteBuf content, Class<T> clazz, Charset charset) {
            return null;
        }
    }


}
