package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "battlenet_accounts")
public class BattlenetAccount {
    @Id
    @Column(name = "id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Column(name = "email", nullable = false, length = 320)
    private String email;

    @Column(name = "srp_version", nullable = false)
    private Byte srpVersion;

    @Column(name = "salt", nullable = false, length = 32)
    private String salt;

    @Column(name = "verifier", nullable = false)
    private byte[] verifier;

    @Column(name = "joindate", nullable = false)
    private Instant joindate;

    @Column(name = "last_ip", nullable = false, length = 15)
    private String lastIp;

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

    @Column(name = "locale", columnDefinition = "tinyint UNSIGNED not null")
    private Short locale;

    @Column(name = "os", nullable = false, length = 4)
    private String os;

    @Column(name = "LastCharacterUndelete", columnDefinition = "int UNSIGNED not null")
    private Long lastCharacterUndelete;

    @Column(name = "LoginTicket", length = 64)
    private String loginTicket;

    @Column(name = "LoginTicketExpiry", columnDefinition = "int UNSIGNED")
    private Long loginTicketExpiry;

}