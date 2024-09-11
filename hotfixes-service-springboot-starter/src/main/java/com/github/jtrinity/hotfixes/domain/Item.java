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
@Table(name = "item")
public class Item {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "ClassID", columnDefinition = "tinyint UNSIGNED not null")
    private Short classID;

    @ColumnDefault("'0'")
    @Column(name = "SubclassID", columnDefinition = "tinyint UNSIGNED not null")
    private Short subclassID;

    @ColumnDefault("'0'")
    @Column(name = "Material", columnDefinition = "tinyint UNSIGNED not null")
    private Short material;

    @ColumnDefault("0")
    @Column(name = "InventoryType", nullable = false)
    private Byte inventoryType;

    @ColumnDefault("0")
    @Column(name = "RequiredLevel", nullable = false)
    private Integer requiredLevel;

    @ColumnDefault("'0'")
    @Column(name = "SheatheType", columnDefinition = "tinyint UNSIGNED not null")
    private Short sheatheType;

    @ColumnDefault("'0'")
    @Column(name = "RandomSelect", columnDefinition = "smallint UNSIGNED not null")
    private Integer randomSelect;

    @ColumnDefault("'0'")
    @Column(name = "ItemRandomSuffixGroupID", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemRandomSuffixGroupID;

    @ColumnDefault("0")
    @Column(name = "SoundOverrideSubclassID", nullable = false)
    private Byte soundOverrideSubclassID;

    @ColumnDefault("'0'")
    @Column(name = "ScalingStatDistributionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer scalingStatDistributionID;

    @ColumnDefault("0")
    @Column(name = "IconFileDataID", nullable = false)
    private Integer iconFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "ItemGroupSoundsID", columnDefinition = "tinyint UNSIGNED not null")
    private Short itemGroupSoundsID;

    @ColumnDefault("0")
    @Column(name = "ContentTuningID", nullable = false)
    private Integer contentTuningID;

    @ColumnDefault("'0'")
    @Column(name = "MaxDurability", columnDefinition = "int UNSIGNED not null")
    private Long maxDurability;

    @ColumnDefault("'0'")
    @Column(name = "AmmunitionType", columnDefinition = "tinyint UNSIGNED not null")
    private Short ammunitionType;

    @ColumnDefault("0")
    @Column(name = "ScalingStatValue", nullable = false)
    private Integer scalingStatValue;

    @ColumnDefault("'0'")
    @Column(name = "DamageType1", columnDefinition = "tinyint UNSIGNED not null")
    private Short damageType1;

    @ColumnDefault("'0'")
    @Column(name = "DamageType2", columnDefinition = "tinyint UNSIGNED not null")
    private Short damageType2;

    @ColumnDefault("'0'")
    @Column(name = "DamageType3", columnDefinition = "tinyint UNSIGNED not null")
    private Short damageType3;

    @ColumnDefault("'0'")
    @Column(name = "DamageType4", columnDefinition = "tinyint UNSIGNED not null")
    private Short damageType4;

    @ColumnDefault("'0'")
    @Column(name = "DamageType5", columnDefinition = "tinyint UNSIGNED not null")
    private Short damageType5;

    @ColumnDefault("0")
    @Column(name = "Resistances1", nullable = false)
    private Integer resistances1;

    @ColumnDefault("0")
    @Column(name = "Resistances2", nullable = false)
    private Integer resistances2;

    @ColumnDefault("0")
    @Column(name = "Resistances3", nullable = false)
    private Integer resistances3;

    @ColumnDefault("0")
    @Column(name = "Resistances4", nullable = false)
    private Integer resistances4;

    @ColumnDefault("0")
    @Column(name = "Resistances5", nullable = false)
    private Integer resistances5;

    @ColumnDefault("0")
    @Column(name = "Resistances6", nullable = false)
    private Integer resistances6;

    @ColumnDefault("0")
    @Column(name = "Resistances7", nullable = false)
    private Integer resistances7;

    @ColumnDefault("0")
    @Column(name = "MinDamage1", nullable = false)
    private Integer minDamage1;

    @ColumnDefault("0")
    @Column(name = "MinDamage2", nullable = false)
    private Integer minDamage2;

    @ColumnDefault("0")
    @Column(name = "MinDamage3", nullable = false)
    private Integer minDamage3;

    @ColumnDefault("0")
    @Column(name = "MinDamage4", nullable = false)
    private Integer minDamage4;

    @ColumnDefault("0")
    @Column(name = "MinDamage5", nullable = false)
    private Integer minDamage5;

    @ColumnDefault("0")
    @Column(name = "MaxDamage1", nullable = false)
    private Integer maxDamage1;

    @ColumnDefault("0")
    @Column(name = "MaxDamage2", nullable = false)
    private Integer maxDamage2;

    @ColumnDefault("0")
    @Column(name = "MaxDamage3", nullable = false)
    private Integer maxDamage3;

    @ColumnDefault("0")
    @Column(name = "MaxDamage4", nullable = false)
    private Integer maxDamage4;

    @ColumnDefault("0")
    @Column(name = "MaxDamage5", nullable = false)
    private Integer maxDamage5;

}