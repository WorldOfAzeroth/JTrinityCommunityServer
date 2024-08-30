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
public class BattlePetSlotId implements Serializable {
    private static final long serialVersionUID = -8398261569727863567L;
    @Column(name = "id", nullable = false)
    private Byte id;

    @Column(name = "battlenetAccountId", nullable = false)
    private Integer battlenetAccountId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BattlePetSlotId entity = (BattlePetSlotId) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.battlenetAccountId, entity.battlenetAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, battlenetAccountId);
    }

}