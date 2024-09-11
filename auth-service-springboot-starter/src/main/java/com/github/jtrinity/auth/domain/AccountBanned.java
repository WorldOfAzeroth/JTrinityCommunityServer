package com.github.jtrinity.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "account_banned")
public class AccountBanned {
    @EmbeddedId
    private AccountBannedId id;

    @ColumnDefault("'0'")
    @Column(name = "unbandate", columnDefinition = "int UNSIGNED not null")
    private Long unbandate;

    @Column(name = "bannedby", nullable = false, length = 50)
    private String bannedby;

    @Column(name = "banreason", nullable = false)
    private String banreason;

    @ColumnDefault("'1'")
    @Column(name = "active", columnDefinition = "tinyint UNSIGNED not null")
    private Short active;

}