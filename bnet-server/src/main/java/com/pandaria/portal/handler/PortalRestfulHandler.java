package com.pandaria.portal.handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.QueryStringDecoder;
import io.netty.handler.codec.http.multipart.HttpPostRequestDecoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ChannelHandler.Sharable
public class PortalRestfulHandler extends SimpleChannelInboundHandler<FullHttpRequest> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, FullHttpRequest request) throws Exception {
        // Handle a bad request.
        if (!request.decoderResult().isSuccess()) {
            sendHttpResponse(ctx, req, new DefaultFullHttpResponse(HTTP_1_1, BAD_REQUEST));
            return;
        }
        final String uri = request.uri();
        // request URI parameters
        QueryStringDecoder queryStringDecoder = new QueryStringDecoder(uri);
        HttpMethod method = request.method();
        if(nettyRequest.method() != HttpMethod.GET && !"application/octet-stream".equals(nettyRequest.headers().get("Content-Type"))){
            HttpPostRequestDecoder decoder = null;
            try {
                decoder = new HttpPostRequestDecoder(HTTP_DATA_FACTORY, request);
                this.putParams(decoder);
            } finally {
                if(null != decoder){
                    decoder.destroy();
                    decoder = null;
                }
            }
        }

        // IP
        this.putIp(ctx);
    }
}
