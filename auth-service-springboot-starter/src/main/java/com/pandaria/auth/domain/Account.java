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
@Table(name = "account", uniqueConstraints = {
        @UniqueConstraint(name = "idx_username", columnNames = {"username"}),
        @UniqueConstraint(name = "uk_bnet_acc", columnNames = {"battlenet_account", "battlenet_index"})
})
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @ColumnDefault("''")
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

    @ColumnDefault("''")
    @Column(name = "email", nullable = false)
    private String email;

    @ColumnDefault("''")
    @Column(name = "reg_mail", nullable = false)
    private String regMail;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "joindate", nullable = false)
    private Instant joindate;

    @ColumnDefault("'127.0.0.1'")
    @Column(name = "last_ip", nullable = false, length = 15)
    private String lastIp;

    @ColumnDefault("'127.0.0.1'")
    @Column(name = "last_attempt_ip", nullable = false, length = 15)
    private String lastAttemptIp;

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

    @ColumnDefault("'9'")
    @Column(name = "expansion", columnDefinition = "tinyint UNSIGNED not null")
    private Short expansion;

    @ColumnDefault("0")
    @Column(name = "mutetime", nullable = false)
    private Long mutetime;

    @ColumnDefault("''")
    @Column(name = "mutereason", nullable = false)
    private String mutereason;

    @ColumnDefault("''")
    @Column(name = "muteby", nullable = false, length = 50)
    private String muteby;

    @ColumnDefault("'0'")
    @Column(name = "client_build", columnDefinition = "int UNSIGNED not null")
    private Long clientBuild;

    @ColumnDefault("'0'")
    @Column(name = "locale", columnDefinition = "tinyint UNSIGNED not null")
    private Short locale;

    @ColumnDefault("''")
    @Column(name = "os", nullable = false, length = 4)
    private String os;

    @ColumnDefault("0")
    @Column(name = "timezone_offset", nullable = false)
    private Short timezoneOffset;

    @ColumnDefault("'0'")
    @Column(name = "recruiter", columnDefinition = "int UNSIGNED not null")
    private Long recruiter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "battlenet_account")
    private BattlenetAccount battlenetAccount;

    @Column(name = "battlenet_index", columnDefinition = "tinyint UNSIGNED")
    private Short battlenetIndex;

    @OneToMany(mappedBy = "account")
    private Set<RbacAccountPermission> rbacAccountPermissions = new LinkedHashSet<>();

}