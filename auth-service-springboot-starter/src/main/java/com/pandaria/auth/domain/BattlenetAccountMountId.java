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
public class BattlenetAccountMountId implements Serializable {
    private static final long serialVersionUID = -6685086559393278621L;
    @Column(name = "battlenetAccountId", columnDefinition = "int UNSIGNED not null")
    private Long battlenetAccountId;

    @Column(name = "mountSpellId", columnDefinition = "int UNSIGNED not null")
    private Long mountSpellId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BattlenetAccountMountId entity = (BattlenetAccountMountId) o;
        return Objects.equals(this.mountSpellId, entity.mountSpellId) &&
                Objects.equals(this.battlenetAccountId, entity.battlenetAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mountSpellId, battlenetAccountId);
    }

}