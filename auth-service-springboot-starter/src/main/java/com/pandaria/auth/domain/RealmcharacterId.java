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
public class RealmcharacterId implements Serializable {
    private static final long serialVersionUID = 8452818513618361621L;
    @ColumnDefault("'0'")
    @Column(name = "realmid", columnDefinition = "int UNSIGNED not null")
    private Long realmid;

    @Column(name = "acctid", columnDefinition = "int UNSIGNED not null")
    private Long acctid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RealmcharacterId entity = (RealmcharacterId) o;
        return Objects.equals(this.realmid, entity.realmid) &&
                Objects.equals(this.acctid, entity.acctid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realmid, acctid);
    }

}