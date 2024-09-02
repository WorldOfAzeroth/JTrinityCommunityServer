package com.pandaria.portal.rpc.service;

import bgs.protocol.authentication.v1.AuthenticationServiceProto;
import bgs.protocol.challenge.v1.ChallengeServiceProto;
import bnet.protocol.EntityProto;
import bnet.protocol.RpcProto;
import com.google.protobuf.ByteString;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcController;
import com.pandaria.auth.domain.*;
import com.pandaria.auth.repository.BattlenetAccountRepository;
import com.pandaria.common.RpcErrorCode;
import com.pandaria.portal.rpc.DefaultRpcChannel;
import com.pandaria.portal.rpc.DefaultRpcController;
import com.pandaria.portal.rpc.RpcSession;
import com.pandaria.portal.utils.LocaleConstant;
import com.pandaria.utils.SecureUtils;
import com.pandaria.utils.SysProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

@Slf4j
@Service
public class AuthenticationService implements AuthenticationServiceProto.AuthenticationService.Interface {

    @Value("bnetserver.LoginREST.Port")
    private String externalAddress;

    private final AuthenticationServiceProto.AuthenticationListener.Interface authenticationListener = AuthenticationServiceProto.AuthenticationListener.newStub(new DefaultRpcChannel());
    private final ChallengeServiceProto.ChallengeListener.Interface challengeListener = ChallengeServiceProto.ChallengeListener.newStub(new DefaultRpcChannel());

    private final BattlenetAccountRepository repository;

    public AuthenticationService(BattlenetAccountRepository repository) {
        this.repository = repository;
    }


    @Override
    public void logon(RpcController controller, AuthenticationServiceProto.LogonRequest request, RpcCallback<RpcProto.NoData> done) {
        DefaultRpcController statusController = (DefaultRpcController) controller;
        if (!SysProperties.PORTAL_WOW_PROGRAM_NAME.equals(request.getProgram())) {
            log.info("Attempted to log in with game other than WoW (using {})!", request.getProgram());
            statusController.setFailed(RpcErrorCode.ERROR_BAD_PROGRAM);
            done.run(RpcProto.NoData.getDefaultInstance());
            return;
        }

        if (!LocaleConstant.isValidLocale(request.getLocale())) {
            log.info("Attempted to log in with unsupported locale (using {})!", request.getLocale());
            statusController.setFailed(RpcErrorCode.ERROR_BAD_LOCALE);
            done.run(RpcProto.NoData.getDefaultInstance());
            return;
        }

        if (!SysProperties.PORTAL_SUPPORTED_PLATFORM_LIST.contains(request.getPlatform())) {
            log.info("attempted to log in from an unsupported platform (using {})!", request.getPlatform());
            statusController.setFailed(RpcErrorCode.ERROR_BAD_PLATFORM);
            done.run(RpcProto.NoData.getDefaultInstance());
            return;
        }

        RpcSession rpcSession = statusController.getRpcSession();
        rpcSession.setLocale(request.getLocale());
        rpcSession.setPlatform(request.getPlatform());
        rpcSession.setBuild(request.getApplicationVersion());

        if (request.hasCachedWebCredentials()) {
            AuthenticationServiceProto.VerifyWebCredentialsRequest parameter = AuthenticationServiceProto.VerifyWebCredentialsRequest.newBuilder().setWebCredentials(request.getCachedWebCredentials()).build();
            this.verifyWebCredentials(controller, parameter, done);
        } else {

            "https://%s:%d/bnetserver/login/".formatted(host, port)
            ChallengeServiceProto.ChallengeExternalRequest challengeExternalRequest = ChallengeServiceProto.ChallengeExternalRequest.newBuilder().setPayloadType("web_auth_url").setPayload(ByteString.copyFromUtf8(webAuthUrl())).build();
            challengeListener.onExternalChallenge(statusController, challengeExternalRequest, null);
            done.run(RpcProto.NoData.getDefaultInstance());
        }
    }


    @Override
    public void moduleNotify(RpcController controller, AuthenticationServiceProto.ModuleNotification request, RpcCallback<RpcProto.NoData> done) {
        DefaultRpcController nettyRpcController = (DefaultRpcController) controller;
        nettyRpcController.setFailed(RpcErrorCode.ERROR_RPC_NOT_IMPLEMENTED);
        done.run(RpcProto.NoData.getDefaultInstance());
    }

    @Override
    public void moduleMessage(RpcController controller, AuthenticationServiceProto.ModuleMessageRequest request, RpcCallback<RpcProto.NoData> done) {
        DefaultRpcController nettyRpcController = (DefaultRpcController) controller;
        nettyRpcController.setFailed(RpcErrorCode.ERROR_RPC_NOT_IMPLEMENTED);
        done.run(RpcProto.NoData.getDefaultInstance());
    }

    @Override
    public void selectGameAccountDEPRECATED(RpcController controller, EntityProto.EntityId request, RpcCallback<RpcProto.NoData> done) {
        DefaultRpcController nettyRpcController = (DefaultRpcController) controller;
        nettyRpcController.setFailed(RpcErrorCode.ERROR_RPC_NOT_IMPLEMENTED);
        done.run(RpcProto.NoData.getDefaultInstance());
    }

    @Override
    public void generateSSOToken(RpcController controller, AuthenticationServiceProto.GenerateSSOTokenRequest request, RpcCallback<AuthenticationServiceProto.GenerateSSOTokenResponse> done) {
        DefaultRpcController nettyRpcController = (DefaultRpcController) controller;
        nettyRpcController.setFailed(RpcErrorCode.ERROR_RPC_NOT_IMPLEMENTED);
        done.run(AuthenticationServiceProto.GenerateSSOTokenResponse.getDefaultInstance());
    }

    @Override
    public void selectGameAccount(RpcController controller, AuthenticationServiceProto.SelectGameAccountRequest request, RpcCallback<RpcProto.NoData> done) {
        DefaultRpcController nettyRpcController = (DefaultRpcController) controller;
        nettyRpcController.setFailed(RpcErrorCode.ERROR_RPC_NOT_IMPLEMENTED);
        done.run(RpcProto.NoData.getDefaultInstance());
    }

    @Override
    public void verifyWebCredentials(RpcController controller, AuthenticationServiceProto.VerifyWebCredentialsRequest request, RpcCallback<RpcProto.NoData> done) {
        DefaultRpcController statusController = (DefaultRpcController) controller;
        if (request.getWebCredentials().isEmpty()) {
            statusController.setFailed(RpcErrorCode.ERROR_DENIED);
            done.run(RpcProto.NoData.newBuilder().build());
            return;
        }
        String loginTicket = request.getWebCredentials().toStringUtf8();
        Object[][] results = repository.queryByLoginTicket(loginTicket);
        if (results.length < 1) {
            statusController.setFailed(RpcErrorCode.ERROR_DENIED);
            done.run(RpcProto.NoData.newBuilder().build());
            return;
        }

        BattlenetAccount o1 = (BattlenetAccount) results[0][0];
        BattlenetAccountBan o2 = (BattlenetAccountBan) results[0][1];

        if (System.currentTimeMillis() - o1.getLoginTicketExpiry() < 0) {
            statusController.setFailed(RpcErrorCode.ERROR_TIMED_OUT);
            done.run(RpcProto.NoData.newBuilder().build());
            return;
        }

        // If the IP is 'locked', check that the player comes indeed from the correct IP address
        if (!Objects.equals(o1.getLocked(), 0)) {
            log.debug("[Session::HandleVerifyWebCredentials] Account '{}' is locked to IP - '{}' is logging in from '{}'", o1.getEmail(), o1.getLastIp(), statusController.remoteAddress().getHostName());
            statusController.setFailed(RpcErrorCode.ERROR_RISK_ACCOUNT_LOCKED);
            done.run(RpcProto.NoData.newBuilder().build());
            return;
        }

        Boolean banded = Optional.ofNullable(o2).map(e -> e.getId().getBandate() > System.currentTimeMillis()).orElse(false);
        Boolean permanentlyBanned = Optional.ofNullable(o2).map(e -> Objects.equals(e.getUnbandate(), e.getId().getBandate())).orElse(false);

        if (permanentlyBanned) {
            log.info("[Session::HandleVerifyWebCredentials] Banned account {} tried to login!", o1.getEmail());
            statusController.setFailed(RpcErrorCode.ERROR_GAME_ACCOUNT_BANNED);
            done.run(RpcProto.NoData.newBuilder().build());
            return;
        } else if (banded) {
            log.info("[Session::HandleVerifyWebCredentials] Temporarily banned account {} tried to login!", o1.getEmail());
            statusController.setFailed(RpcErrorCode.ERROR_GAME_ACCOUNT_BANNED);
            done.run(RpcProto.NoData.newBuilder().build());
            return;
        }
        done.run(RpcProto.NoData.getDefaultInstance());
        AuthenticationServiceProto.LogonResult.Builder resultBuilder = AuthenticationServiceProto.LogonResult.newBuilder()
                .setErrorCode(RpcErrorCode.STATUS_OK)
                .setAccountId(EntityProto.EntityId.newBuilder().setLow(o1.getId()).setHigh(0x100000000000000L).build())
                .setSessionKey(ByteString.copyFrom(SecureUtils.generateRandomBytes(SysProperties.PORTAL_SESSION_KEY_LENGTH)));

        Arrays.stream(results).forEach(objects -> {
            Account account = (Account) objects[2];
            resultBuilder.addGameAccountId(EntityProto.EntityId.newBuilder().setLow(account.getId()).setHigh(0x200000200576F57L).build());
        });

        if (StringUtils.hasText(o1.getLockCountry())) {
            resultBuilder.setGeoipCountry(o1.getLockCountry());
        }

        RpcSession rpcSession = statusController.getRpcSession();
        rpcSession.setAuthorized(true);



        authenticationListener.onLogonComplete(statusController, resultBuilder.build(), response -> {
        });
    }


    @Override
    public void generateWebCredentials(RpcController controller, AuthenticationServiceProto.GenerateWebCredentialsRequest request, RpcCallback<AuthenticationServiceProto.GenerateWebCredentialsResponse> done) {
        DefaultRpcController nettyRpcController = (DefaultRpcController) controller;
        nettyRpcController.setFailed(RpcErrorCode.ERROR_RPC_NOT_IMPLEMENTED);
        done.run(AuthenticationServiceProto.GenerateWebCredentialsResponse.getDefaultInstance());
    }

    private String webAuthUrl(boolean ssl, String host, int port) {

        return "http%s://%s:%d/bnetserver/login/".formatted(ssl ? "s" : "", host, port);
    }


}


