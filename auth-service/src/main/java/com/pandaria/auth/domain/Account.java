package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Column(name = "username", nullable = false, length = 32)
    private String username;

    @Column(name = "salt", nullable = false, length = 32)
    private String salt;

    @Column(name = "verifier", nullable = false, length = 32)
    private String verifier;

    @Column(name = "session_key_auth", length = 40)
    private String sessionKeyAuth;

    @Column(name = "session_key_bnet", length = 64)
    private String sessionKeyBnet;

    @Column(name = "totp_secret", length = 128)
    private String totpSecret;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "reg_mail", nullable = false)
    private String regMail;

    @Column(name = "joindate", nullable = false)
    private Instant joindate;

    @Column(name = "last_ip", nullable = false, length = 15)
    private String lastIp;

    @Column(name = "last_attempt_ip", nullable = false, length = 15)
    private String lastAttemptIp;

    @Column(name = "failed_logins", columnDefinition = "int UNSIGNED not null")
    private Long failedLogins;

    @Column(name = "locked", columnDefinition = "tinyint UNSIGNED not null")
    private Short locked;

    @Column(name = "lock_country", nullable = false, length = 2)
    private String lockCountry;

    @Column(name = "last_login")
    private Instant lastLogin;

    @Column(name = "online", columnDefinition = "tinyint UNSIGNED not null")
    private Short online;

    @Column(name = "expansion", columnDefinition = "tinyint UNSIGNED not null")
    private Short expansion;

    @Column(name = "mutetime", nullable = false)
    private Long mutetime;

    @Column(name = "mutereason", nullable = false)
    private String mutereason;

    @Column(name = "muteby", nullable = false, length = 50)
    private String muteby;

    @Column(name = "client_build", columnDefinition = "int UNSIGNED not null")
    private Long clientBuild;

    @Column(name = "locale", columnDefinition = "tinyint UNSIGNED not null")
    private Short locale;

    @Column(name = "os", nullable = false, length = 4)
    private String os;

    @Column(name = "timezone_offset", nullable = false)
    private Short timezoneOffset;

    @Column(name = "recruiter", columnDefinition = "int UNSIGNED not null")
    private Long recruiter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "battlenet_account")
    private BattlenetAccount battlenetAccount;

    @Column(name = "battlenet_index", columnDefinition = "tinyint UNSIGNED")
    private Short battlenetIndex;

}