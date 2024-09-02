package com.pandaria.portal.boot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter
@Getter
@ConfigurationProperties(prefix = "bnetserver")
public class PortalConfigurationProperties {

    private String bindIP;

    private String pidFile;

    private int battleNetPort;
    private int useProcessors;
    private int processPriority;
    private int realmsStateUpdateDelay;

    private LoginREST loginREST;


    private String certificatesFile;


    private String privateKeyFile;

    private String banExpiryCheckInterval;
    private String sourceDirectory;
    private String mysqlExecutable;
    private String ipLocationFile;
    boolean allowLoggingIPAddressesInDatabase;
    boolean totPMasterSecret;

    private WrongPass wrongPass;
    private WrongPass updates;




    public static class LoginREST {
        private int loginResTPort;

    }

    public static class WrongPass {
        private int MaxCount;
        private int BanTime;
        private int BanType;
        private int Logging;

    }

    public static class Updates {
        private int EnableDatabases;
        private int AutoSetup;
        private int Redundancy;
        private int ArchivedRedundancy;
        private int AllowRehash;
        private int CleanDeadRefMaxCount;
    }

}
