package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "battlenet_item_favorite_appearances")
public class BattlenetItemFavoriteAppearance {
    @EmbeddedId
    private BattlenetItemFavoriteAppearanceId id;

    @MapsId("battlenetAccountId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "battlenetAccountId", nullable = false)
    private BattlenetAccount battlenetAccount;

}