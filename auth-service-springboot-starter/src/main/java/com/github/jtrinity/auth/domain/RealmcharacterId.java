package com.github.jtrinity.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Embeddable
public class RealmcharacterId implements Serializable {
    private static final long serialVersionUID = 1855754097410790206L;
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