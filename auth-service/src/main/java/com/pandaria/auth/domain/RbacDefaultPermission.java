package com.pandaria.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "rbac_default_permissions")
public class RbacDefaultPermission {
    @EmbeddedId
    private RbacDefaultPermissionId id;

    @MapsId("permissionId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "permissionId", nullable = false)
    private RbacPermission permission;

}