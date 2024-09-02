package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "battlenet_accounts")
public class BattlenetAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Column(name = "email", nullable = false, length = 320)
    private String email;

    @ColumnDefault("1")
    @Column(name = "srp_version", nullable = false)
    private Byte srpVersion;

    @Column(name = "salt", nullable = false, length = 32)
    private String salt;

    @Column(name = "verifier", nullable = false)
    private byte[] verifier;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "joindate", nullable = false)
    private Instant joindate;

    @ColumnDefault("'127.0.0.1'")
    @Column(name = "last_ip", nullable = false, length = 15)
    private String lastIp;

    @ColumnDefault("'0'")
    @Column(name = "failed_logins", columnDefinition = "int UNSIGNED not null")
    private Long failedLogins;

    @ColumnDefault("'0'")
    @Column(name = "locked", columnDefinition = "tinyint UNSIGNED not null")
    private Short locked;

    @ColumnDefault("'00'")
    @Column(name = "lock_country", nullable = false, length = 2)
    private String lockCountry;

    @Column(name = "last_login")
    private Instant lastLogin;

    @ColumnDefault("'0'")
    @Column(name = "online", columnDefinition = "tinyint UNSIGNED not null")
    private Short online;

    @ColumnDefault("'0'")
    @Column(name = "locale", columnDefinition = "tinyint UNSIGNED not null")
    private Short locale;

    @ColumnDefault("''")
    @Column(name = "os", nullable = false, length = 4)
    private String os;

    @ColumnDefault("'0'")
    @Column(name = "LastCharacterUndelete", columnDefinition = "int UNSIGNED not null")
    private Long lastCharacterUndelete;

    @Column(name = "LoginTicket", length = 64)
    private String loginTicket;

    @Column(name = "LoginTicketExpiry", columnDefinition = "int UNSIGNED")
    private Long loginTicketExpiry;

    @OneToMany(mappedBy = "battlenetAccount")
    private Set<Account> accounts = new LinkedHashSet<>();

    @OneToMany(mappedBy = "battlenetAccount")
    private Set<BattlenetAccountTransmogIllusion> battlenetAccountTransmogIllusions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "battlenetAccount")
    private Set<BattlenetItemAppearance> battlenetItemAppearances = new LinkedHashSet<>();

    @OneToMany(mappedBy = "battlenetAccount")
    private Set<BattlenetItemFavoriteAppearance> battlenetItemFavoriteAppearances = new LinkedHashSet<>();

}