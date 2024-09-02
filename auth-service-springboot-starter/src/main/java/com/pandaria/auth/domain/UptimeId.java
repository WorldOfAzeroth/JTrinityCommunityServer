package com.pandaria.auth.domain;

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
public class UptimeId implements Serializable {
    private static final long serialVersionUID = -3242579835011887697L;
    @Column(name = "realmid", columnDefinition = "int UNSIGNED not null")
    private Long realmid;

    @ColumnDefault("'0'")
    @Column(name = "starttime", columnDefinition = "int UNSIGNED not null")
    private Long starttime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UptimeId entity = (UptimeId) o;
        return Objects.equals(this.realmid, entity.realmid) &&
                Objects.equals(this.starttime, entity.starttime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realmid, starttime);
    }

}