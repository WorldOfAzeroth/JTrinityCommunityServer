package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class BattlenetItemFavoriteAppearanceId implements Serializable {
    private static final long serialVersionUID = 6111977237109422066L;
    @Column(name = "battlenetAccountId", columnDefinition = "int UNSIGNED not null")
    private Long battlenetAccountId;

    @Column(name = "itemModifiedAppearanceId", columnDefinition = "int UNSIGNED not null")
    private Long itemModifiedAppearanceId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BattlenetItemFavoriteAppearanceId entity = (BattlenetItemFavoriteAppearanceId) o;
        return Objects.equals(this.itemModifiedAppearanceId, entity.itemModifiedAppearanceId) &&
                Objects.equals(this.battlenetAccountId, entity.battlenetAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemModifiedAppearanceId, battlenetAccountId);
    }

}