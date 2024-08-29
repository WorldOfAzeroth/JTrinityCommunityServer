package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "battlenet_item_appearances")
public class BattlenetItemAppearance {
    @EmbeddedId
    private BattlenetItemAppearanceId id;

    @MapsId("battlenetAccountId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "battlenetAccountId", nullable = false)
    private BattlenetAccount battlenetAccount;

    @Column(name = "appearanceMask", columnDefinition = "int UNSIGNED not null")
    private Long appearanceMask;

}