package com.github.jtrinity.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "rbac_account_permissions")
public class RbacAccountPermission {
    @EmbeddedId
    private RbacAccountPermissionId id;

    @MapsId("accountId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "accountId", nullable = false)
    private Account account;

    @MapsId("permissionId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "permissionId", nullable = false)
    private RbacPermission permission;

    @ColumnDefault("1")
    @Column(name = "granted", nullable = false)
    private Boolean granted = false;

}