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
public class AccountAccessId implements Serializable {
    private static final long serialVersionUID = 3805707612014341857L;
    @Column(name = "AccountID", columnDefinition = "int UNSIGNED not null")
    private Long accountID;

    @ColumnDefault("-1")
    @Column(name = "RealmID", nullable = false)
    private Integer realmID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AccountAccessId entity = (AccountAccessId) o;
        return Objects.equals(this.accountID, entity.accountID) &&
                Objects.equals(this.realmID, entity.realmID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountID, realmID);
    }

}