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
public class AutobroadcastId implements Serializable {
    private static final long serialVersionUID = 1713033418462574479L;
    @Column(name = "id", columnDefinition = "tinyint UNSIGNED not null")
    private Short id;

    @ColumnDefault("-1")
    @Column(name = "realmid", nullable = false)
    private Integer realmid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AutobroadcastId entity = (AutobroadcastId) o;
        return Objects.equals(this.realmid, entity.realmid) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realmid, id);
    }

}