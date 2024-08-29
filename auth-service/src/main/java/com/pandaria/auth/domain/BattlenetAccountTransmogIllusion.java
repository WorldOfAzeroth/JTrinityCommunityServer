package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "battlenet_account_transmog_illusions")
public class BattlenetAccountTransmogIllusion {
    @EmbeddedId
    private BattlenetAccountTransmogIllusionId id;

    @MapsId("battlenetAccountId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "battlenetAccountId", nullable = false)
    private BattlenetAccount battlenetAccount;

    @Column(name = "illusionMask", columnDefinition = "int UNSIGNED not null")
    private Long illusionMask;

}