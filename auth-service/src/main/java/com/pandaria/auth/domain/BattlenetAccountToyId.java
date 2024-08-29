package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class BattlenetAccountToyId implements Serializable {
    private static final long serialVersionUID = -386584861234501718L;
    @Column(name = "accountId", columnDefinition = "int UNSIGNED not null")
    private Long accountId;

    @ColumnDefault("0")
    @Column(name = "itemId", nullable = false)
    private Integer itemId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BattlenetAccountToyId entity = (BattlenetAccountToyId) o;
        return Objects.equals(this.accountId, entity.accountId) &&
                Objects.equals(this.itemId, entity.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, itemId);
    }

}