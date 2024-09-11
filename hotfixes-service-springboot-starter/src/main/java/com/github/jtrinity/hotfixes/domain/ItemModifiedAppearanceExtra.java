package com.github.jtrinity.hotfixes.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "item_modified_appearance_extra")
public class ItemModifiedAppearanceExtra {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "IconFileDataID", nullable = false)
    private Integer iconFileDataID;

    @ColumnDefault("0")
    @Column(name = "UnequippedIconFileDataID", nullable = false)
    private Integer unequippedIconFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "SheatheType", columnDefinition = "tinyint UNSIGNED not null")
    private Short sheatheType;

    @ColumnDefault("0")
    @Column(name = "DisplayWeaponSubclassID", nullable = false)
    private Byte displayWeaponSubclassID;

    @ColumnDefault("0")
    @Column(name = "DisplayInventoryType", nullable = false)
    private Byte displayInventoryType;

}