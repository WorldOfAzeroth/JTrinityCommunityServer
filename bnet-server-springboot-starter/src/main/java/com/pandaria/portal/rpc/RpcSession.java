package com.pandaria.portal.rpc;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RpcSession {
    private String locale;
    private String platform;
    private int build;
    private String ipCountry;
    private boolean authed;
    private boolean authorized;
}
