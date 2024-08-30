package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "battlenet_account_bans")
public class BattlenetAccountBan {
    @EmbeddedId
    private BattlenetAccountBanId id;

    @ColumnDefault("'0'")
    @Column(name = "unbandate", columnDefinition = "int UNSIGNED not null")
    private Long unbandate;

    @Column(name = "bannedby", nullable = false, length = 50)
    private String bannedby;

    @Column(name = "banreason", nullable = false)
    private String banreason;

}