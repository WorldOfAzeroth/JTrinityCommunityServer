package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

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

    @ColumnDefault("'0'")
    @Column(name = "appearanceMask", columnDefinition = "int UNSIGNED not null")
    private Long appearanceMask;

}