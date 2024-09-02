package com.pandaria.portal.handler;


import bnet.protocol.RpcProto;
import com.google.protobuf.Descriptors;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Service;
import com.pandaria.common.RpcErrorCode;
import com.pandaria.net.NettyInbound;
import com.pandaria.net.NettyOutbound;
import com.pandaria.portal.exception.MethodNotFoundException;
import com.pandaria.portal.exception.ServiceNotFoundException;
import com.pandaria.portal.proto.RpcPacket;
import com.pandaria.portal.rpc.DefaultRpcController;
import com.pandaria.portal.rpc.ServiceMetadata;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

@Slf4j
@Component
public class PortalRpcHandler implements BiConsumer<NettyInbound, NettyOutbound> {


    private final Map<Integer, ServiceMetadata> registeredService = new HashMap<>();



    @Override
    public void accept(NettyInbound in, NettyOutbound out) {
        RpcPacket packet = in.receiveObject();
        AtomicReference<DefaultRpcController> controller = new AtomicReference<>();
        in.withConnection(connection -> {
            controller.set(new DefaultRpcController(connection));
        });
        try {

            ServiceMetadata serviceMeta = registeredService.get(packet.getHeader().getServiceHash());
            if (serviceMeta == null) {
                throw new ServiceNotFoundException("ServiceHash:" + packet.getHeader().getServiceHash());
            }
            Descriptors.MethodDescriptor methodDescriptor = serviceMeta.getMethodDescriptor(packet.getHeader().getMethodId());
            if (methodDescriptor == null) {
                throw new MethodNotFoundException("MethodId:" + packet.getHeader().getMethodId());
            }

            Service service = serviceMeta.getInstance();
            Message prototype = service.getRequestPrototype(methodDescriptor);
            Message request = prototype.newBuilderForType().mergeFrom(packet.getProtoData()).build();

            service.callMethod(methodDescriptor, controller.get(), request, message -> {
                RpcPacket rpcPacket = buildResponseRpcPacket(packet, controller.get(), message);
                out.sendObject(rpcPacket);
            });

        } catch (Exception e) {
            int status = RpcErrorCode.ERROR_RPC_SERVER_ERROR;
            if (e instanceof ServiceNotFoundException) {
                status = RpcErrorCode.ERROR_RPC_SERVICE_NOT_BOUND;
            } else if (e instanceof InvalidProtocolBufferException) {
                status = RpcErrorCode.ERROR_RPC_MALFORMED_REQUEST;
            }

            RpcProto.Header header = RpcProto.Header.newBuilder()
                    .setToken(packet.getHeader().getToken())
                    .setServiceId(0xFE)
                    .setErrorReason(e.getMessage())
                    .setStatus(status).build();

            out.sendObject(header);
        }
    }

    private RpcPacket buildResponseRpcPacket(RpcPacket packet, DefaultRpcController controller, Message result) {
        RpcPacket response;
        RpcProto.Header.Builder builder = RpcProto.Header.newBuilder()
                .setToken(packet.getHeader().getToken())
                .setServiceId(0xFE);
        if (!controller.failed()) {
            if (!(result instanceof RpcProto.NO_RESPONSE)) {
                builder.setSize(result.getSerializedSize());
                response = new RpcPacket(builder.build(), result.toByteArray());
            } else {
                response = new RpcPacket(builder.build());
            }
        } else {
            builder.setStatus(controller.status());
            response = new RpcPacket(builder.build());
        }
        return response;
    }


    public void register(Service service) {
        ServiceMetadata serviceMetadata = new ServiceMetadata(service);
        registeredService.put(serviceMetadata.getServiceHash(), serviceMetadata);
    }

}
