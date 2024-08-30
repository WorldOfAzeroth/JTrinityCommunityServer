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
public class BattlenetAccountTransmogIllusionId implements Serializable {
    private static final long serialVersionUID = 368852148740158888L;
    @Column(name = "battlenetAccountId", columnDefinition = "int UNSIGNED not null")
    private Long battlenetAccountId;

    @Column(name = "blobIndex", columnDefinition = "smallint UNSIGNED not null")
    private Integer blobIndex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BattlenetAccountTransmogIllusionId entity = (BattlenetAccountTransmogIllusionId) o;
        return Objects.equals(this.battlenetAccountId, entity.battlenetAccountId) &&
                Objects.equals(this.blobIndex, entity.blobIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battlenetAccountId, blobIndex);
    }

}