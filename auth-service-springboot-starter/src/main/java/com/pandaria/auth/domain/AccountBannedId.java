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
public class AccountBannedId implements Serializable {
    private static final long serialVersionUID = 937894471405896740L;
    @ColumnDefault("'0'")
    @Column(name = "id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @ColumnDefault("'0'")
    @Column(name = "bandate", columnDefinition = "int UNSIGNED not null")
    private Long bandate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AccountBannedId entity = (AccountBannedId) o;
        return Objects.equals(this.bandate, entity.bandate) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandate, id);
    }

}