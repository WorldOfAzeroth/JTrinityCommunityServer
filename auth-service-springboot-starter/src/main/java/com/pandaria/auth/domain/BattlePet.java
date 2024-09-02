package com.pandaria.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
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

    @ColumnDefault("0")
    @Column(name = "displayId", nullable = false)
    private Integer displayId;

    @ColumnDefault("1")
    @Column(name = "level", nullable = false)
    private Short level;

    @ColumnDefault("0")
    @Column(name = "exp", nullable = false)
    private Short exp;

    @ColumnDefault("1")
    @Column(name = "health", nullable = false)
    private Integer health;

    @ColumnDefault("0")
    @Column(name = "quality", nullable = false)
    private Byte quality;

    @ColumnDefault("0")
    @Column(name = "flags", nullable = false)
    private Short flags;

    @Column(name = "name", nullable = false, length = 12)
    private String name;

    @ColumnDefault("0")
    @Column(name = "nameTimestamp", nullable = false)
    private Long nameTimestamp;

    @Column(name = "owner")
    private Long owner;

    @Column(name = "ownerRealmId")
    private Integer ownerRealmId;

}