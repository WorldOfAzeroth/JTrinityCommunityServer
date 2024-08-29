package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "account_banned")
public class AccountBanned {
    @EmbeddedId
    private AccountBannedId id;

    @Column(name = "unbandate", columnDefinition = "int UNSIGNED not null")
    private Long unbandate;

    @Column(name = "bannedby", nullable = false, length = 50)
    private String bannedby;

    @Column(name = "banreason", nullable = false)
    private String banreason;

    @Column(name = "active", columnDefinition = "tinyint UNSIGNED not null")
    private Short active;

}