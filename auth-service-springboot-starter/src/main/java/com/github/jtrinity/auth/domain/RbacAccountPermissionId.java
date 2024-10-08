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
public class RbacAccountPermissionId implements Serializable {
    private static final long serialVersionUID = -7458380055474177834L;
    @Column(name = "accountId", columnDefinition = "int UNSIGNED not null")
    private Long accountId;

    @Column(name = "permissionId", columnDefinition = "int UNSIGNED not null")
    private Long permissionId;

    @ColumnDefault("-1")
    @Column(name = "realmId", nullable = false)
    private Integer realmId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RbacAccountPermissionId entity = (RbacAccountPermissionId) o;
        return Objects.equals(this.accountId, entity.accountId) &&
                Objects.equals(this.permissionId, entity.permissionId) &&
                Objects.equals(this.realmId, entity.realmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, permissionId, realmId);
    }

}