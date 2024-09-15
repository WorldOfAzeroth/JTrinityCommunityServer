package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2File;
import com.github.jtrinity.dbc.db2.Db2Type;

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
@Db2File(name = "Item.db2", layoutHash = 0xFFF62904)
public class Item implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "ClassID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short classID;

    @ColumnDefault("'0'")
    @Column(name = "SubclassID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Short subclassID;

    @ColumnDefault("'0'")
    @Column(name = "Material", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short material;

    @ColumnDefault("0")
    @Column(name = "InventoryType", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE, signed = true)
    private Byte inventoryType;

    @ColumnDefault("0")
    @Column(name = "RequiredLevel", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer requiredLevel;

    @ColumnDefault("'0'")
    @Column(name = "SheatheType", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short sheatheType;

    @ColumnDefault("'0'")
    @Column(name = "RandomSelect", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Integer randomSelect;

    @ColumnDefault("'0'")
    @Column(name = "ItemRandomSuffixGroupID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Integer itemRandomSuffixGroupID;

    @ColumnDefault("0")
    @Column(name = "SoundOverrideSubclassID", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte soundOverrideSubclassID;

    @ColumnDefault("'0'")
    @Column(name = "ScalingStatDistributionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Integer scalingStatDistributionID;

    @ColumnDefault("0")
    @Column(name = "IconFileDataID", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer iconFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "ItemGroupSoundsID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE)
    private Short itemGroupSoundsID;

    @ColumnDefault("0")
    @Column(name = "ContentTuningID", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer contentTuningID;

    @ColumnDefault("'0'")
    @Column(name = "MaxDurability", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Long maxDurability;

    @ColumnDefault("'0'")
    @Column(name = "AmmunitionType", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Short ammunitionType;

    @ColumnDefault("0")
    @Column(name = "ScalingStatValue", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer scalingStatValue;

    @ColumnDefault("'0'")
    @Column(name = "DamageType1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Short damageType1;

    @ColumnDefault("'0'")
    @Column(name = "DamageType2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Short damageType2;

    @ColumnDefault("'0'")
    @Column(name = "DamageType3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Short damageType3;

    @ColumnDefault("'0'")
    @Column(name = "DamageType4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Short damageType4;

    @ColumnDefault("'0'")
    @Column(name = "DamageType5", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Short damageType5;

    @ColumnDefault("0")
    @Column(name = "Resistances1", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer resistances1;

    @ColumnDefault("0")
    @Column(name = "Resistances2", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer resistances2;

    @ColumnDefault("0")
    @Column(name = "Resistances3", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer resistances3;

    @ColumnDefault("0")
    @Column(name = "Resistances4", nullable = false)
    @Db2Field(fieldIndex = 25, type = Db2Type.INT, signed = true)
    private Integer resistances4;

    @ColumnDefault("0")
    @Column(name = "Resistances5", nullable = false)
    @Db2Field(fieldIndex = 26, type = Db2Type.INT, signed = true)
    private Integer resistances5;

    @ColumnDefault("0")
    @Column(name = "Resistances6", nullable = false)
    @Db2Field(fieldIndex = 27, type = Db2Type.INT, signed = true)
    private Integer resistances6;

    @ColumnDefault("0")
    @Column(name = "Resistances7", nullable = false)
    @Db2Field(fieldIndex = 28, type = Db2Type.INT, signed = true)
    private Integer resistances7;

    @ColumnDefault("0")
    @Column(name = "MinDamage1", nullable = false)
    @Db2Field(fieldIndex = 29, type = Db2Type.INT, signed = true)
    private Integer minDamage1;

    @ColumnDefault("0")
    @Column(name = "MinDamage2", nullable = false)
    @Db2Field(fieldIndex = 30, type = Db2Type.INT, signed = true)
    private Integer minDamage2;

    @ColumnDefault("0")
    @Column(name = "MinDamage3", nullable = false)
    @Db2Field(fieldIndex = 31, type = Db2Type.INT, signed = true)
    private Integer minDamage3;

    @ColumnDefault("0")
    @Column(name = "MinDamage4", nullable = false)
    @Db2Field(fieldIndex = 32, type = Db2Type.INT, signed = true)
    private Integer minDamage4;

    @ColumnDefault("0")
    @Column(name = "MinDamage5", nullable = false)
    @Db2Field(fieldIndex = 33, type = Db2Type.INT, signed = true)
    private Integer minDamage5;

    @ColumnDefault("0")
    @Column(name = "MaxDamage1", nullable = false)
    @Db2Field(fieldIndex = 34, type = Db2Type.INT, signed = true)
    private Integer maxDamage1;

    @ColumnDefault("0")
    @Column(name = "MaxDamage2", nullable = false)
    @Db2Field(fieldIndex = 35, type = Db2Type.INT, signed = true)
    private Integer maxDamage2;

    @ColumnDefault("0")
    @Column(name = "MaxDamage3", nullable = false)
    @Db2Field(fieldIndex = 36, type = Db2Type.INT, signed = true)
    private Integer maxDamage3;

    @ColumnDefault("0")
    @Column(name = "MaxDamage4", nullable = false)
    @Db2Field(fieldIndex = 37, type = Db2Type.INT, signed = true)
    private Integer maxDamage4;

    @ColumnDefault("0")
    @Column(name = "MaxDamage5", nullable = false)
    @Db2Field(fieldIndex = 38, type = Db2Type.INT, signed = true)
    private Integer maxDamage5;

}