package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "battle_pets")
public class BattlePet {
    @Id
    @Column(name = "guid", nullable = false)
    private Long id;

    @Column(name = "battlenetAccountId", nullable = false)
    private Integer battlenetAccountId;

    @Column(name = "species", nullable = false)
    private Integer species;

    @Column(name = "breed", nullable = false)
    private Short breed;

    @Column(name = "displayId", nullable = false)
    private Integer displayId;

    @Column(name = "level", nullable = false)
    private Short level;

    @Column(name = "exp", nullable = false)
    private Short exp;

    @Column(name = "health", nullable = false)
    private Integer health;

    @Column(name = "quality", nullable = false)
    private Byte quality;

    @Column(name = "flags", nullable = false)
    private Short flags;

    @Column(name = "name", nullable = false, length = 12)
    private String name;

    @Column(name = "nameTimestamp", nullable = false)
    private Long nameTimestamp;

    @Column(name = "owner")
    private Long owner;

    @Column(name = "ownerRealmId")
    private Integer ownerRealmId;

}