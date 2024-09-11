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
public class RbacDefaultPermissionId implements Serializable {
    private static final long serialVersionUID = -6452935551696130759L;
    @Column(name = "secId", columnDefinition = "int UNSIGNED not null")
    private Long secId;

    @Column(name = "permissionId", columnDefinition = "int UNSIGNED not null")
    private Long permissionId;

    @ColumnDefault("-1")
    @Column(name = "realmId", nullable = false)
    private Integer realmId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RbacDefaultPermissionId entity = (RbacDefaultPermissionId) o;
        return Objects.equals(this.permissionId, entity.permissionId) &&
                Objects.equals(this.realmId, entity.realmId) &&
                Objects.equals(this.secId, entity.secId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionId, realmId, secId);
    }

}