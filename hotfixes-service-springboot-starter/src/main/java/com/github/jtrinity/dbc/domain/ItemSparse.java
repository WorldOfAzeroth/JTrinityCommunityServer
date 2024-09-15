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
@Table(name = "item_sparse")
@Db2File(name = "ItemSparse.db2", layoutHash = 0xE3090D23)
public class ItemSparse implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "AllowableRace", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.LONG, signed = true)
    private Long allowableRace;

    @Lob
    @Column(name = "Description")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String description;

    @Lob
    @Column(name = "Display3")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private String display3;

    @Lob
    @Column(name = "Display2")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private String display2;

    @Lob
    @Column(name = "Display1")
    @Db2Field(fieldIndex = 5, type = Db2Type.STRING)
    private String display1;

    @Lob
    @Column(name = "Display")
    @Db2Field(fieldIndex = 6, type = Db2Type.STRING)
    private String display;

    @ColumnDefault("0")
    @Column(name = "DmgVariance", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float dmgVariance;

    @ColumnDefault("'0'")
    @Column(name = "DurationInInventory", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Long durationInInventory;

    @ColumnDefault("0")
    @Column(name = "QualityModifier", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float qualityModifier;

    @ColumnDefault("'0'")
    @Column(name = "BagFamily", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long bagFamily;

    @ColumnDefault("0")
    @Column(name = "StartQuestID", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer startQuestID;

    @ColumnDefault("0")
    @Column(name = "ItemRange", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.FLOAT)
    private Float itemRange;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket1", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket1;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket2", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket2;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket3", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket3;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket4", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket4;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket5", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket5;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket6", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket6;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket7", nullable = false)
    @Db2Field(fieldIndex = 19, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket7;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket8", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket8;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket9", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket9;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket10", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket10;

    @ColumnDefault("0")
    @Column(name = "Unknown440_11", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer unknown440_11;

    @ColumnDefault("0")
    @Column(name = "Unknown440_12", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer unknown440_12;

    @ColumnDefault("0")
    @Column(name = "Unknown440_13", nullable = false)
    @Db2Field(fieldIndex = 25, type = Db2Type.INT, signed = true)
    private Integer unknown440_13;

    @ColumnDefault("0")
    @Column(name = "Unknown440_14", nullable = false)
    @Db2Field(fieldIndex = 26, type = Db2Type.INT, signed = true)
    private Integer unknown440_14;

    @ColumnDefault("0")
    @Column(name = "Unknown440_15", nullable = false)
    @Db2Field(fieldIndex = 27, type = Db2Type.INT, signed = true)
    private Integer unknown440_15;

    @ColumnDefault("0")
    @Column(name = "Unknown440_16", nullable = false)
    @Db2Field(fieldIndex = 28, type = Db2Type.INT, signed = true)
    private Integer unknown440_16;

    @ColumnDefault("0")
    @Column(name = "Unknown440_17", nullable = false)
    @Db2Field(fieldIndex = 29, type = Db2Type.INT, signed = true)
    private Integer unknown440_17;

    @ColumnDefault("0")
    @Column(name = "Unknown440_18", nullable = false)
    @Db2Field(fieldIndex = 30, type = Db2Type.INT, signed = true)
    private Integer unknown440_18;

    @ColumnDefault("0")
    @Column(name = "Unknown440_19", nullable = false)
    @Db2Field(fieldIndex = 31, type = Db2Type.INT, signed = true)
    private Integer unknown440_19;

    @ColumnDefault("0")
    @Column(name = "Unknown440_110", nullable = false)
    @Db2Field(fieldIndex = 32, type = Db2Type.INT, signed = true)
    private Integer unknown440_110;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor1", nullable = false)
    @Db2Field(fieldIndex = 33, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor1;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor2", nullable = false)
    @Db2Field(fieldIndex = 34, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor2;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor3", nullable = false)
    @Db2Field(fieldIndex = 35, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor3;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor4", nullable = false)
    @Db2Field(fieldIndex = 36, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor4;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor5", nullable = false)
    @Db2Field(fieldIndex = 37, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor5;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor6", nullable = false)
    @Db2Field(fieldIndex = 38, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor6;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor7", nullable = false)
    @Db2Field(fieldIndex = 39, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor7;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor8", nullable = false)
    @Db2Field(fieldIndex = 40, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor8;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor9", nullable = false)
    @Db2Field(fieldIndex = 41, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor9;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor10", nullable = false)
    @Db2Field(fieldIndex = 42, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor10;

    @ColumnDefault("0")
    @Column(name = "Stackable", nullable = false)
    @Db2Field(fieldIndex = 43, type = Db2Type.INT, signed = true)
    private Integer stackable;

    @ColumnDefault("0")
    @Column(name = "MaxCount", nullable = false)
    @Db2Field(fieldIndex = 44, type = Db2Type.INT, signed = true)
    private Integer maxCount;

    @ColumnDefault("0")
    @Column(name = "MinReputation", nullable = false)
    @Db2Field(fieldIndex = 45, type = Db2Type.INT, signed = true)
    private Integer minReputation;

    @ColumnDefault("'0'")
    @Column(name = "RequiredAbility", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 46, type = Db2Type.INT)
    private Long requiredAbility;

    @ColumnDefault("'0'")
    @Column(name = "SellPrice", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 47, type = Db2Type.INT)
    private Long sellPrice;

    @ColumnDefault("'0'")
    @Column(name = "BuyPrice", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 48, type = Db2Type.INT)
    private Long buyPrice;

    @ColumnDefault("'0'")
    @Column(name = "VendorStackCount", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 49, type = Db2Type.INT)
    private Long vendorStackCount;

    @ColumnDefault("0")
    @Column(name = "PriceVariance", nullable = false)
    @Db2Field(fieldIndex = 50, type = Db2Type.FLOAT)
    private Float priceVariance;

    @ColumnDefault("0")
    @Column(name = "PriceRandomValue", nullable = false)
    @Db2Field(fieldIndex = 51, type = Db2Type.FLOAT)
    private Float priceRandomValue;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    @Db2Field(fieldIndex = 52, type = Db2Type.INT, signed = true)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    @Db2Field(fieldIndex = 53, type = Db2Type.INT, signed = true)
    private Integer flags2;

    @ColumnDefault("0")
    @Column(name = "Flags3", nullable = false)
    @Db2Field(fieldIndex = 54, type = Db2Type.INT, signed = true)
    private Integer flags3;

    @ColumnDefault("0")
    @Column(name = "Flags4", nullable = false)
    @Db2Field(fieldIndex = 55, type = Db2Type.INT, signed = true)
    private Integer flags4;

    @ColumnDefault("0")
    @Column(name = "FactionRelated", nullable = false)
    @Db2Field(fieldIndex = 56, type = Db2Type.INT, signed = true)
    private Integer factionRelated;

    @ColumnDefault("0")
    @Column(name = "ModifiedCraftingReagentItemID", nullable = false)
    @Db2Field(fieldIndex = 57, type = Db2Type.INT, signed = true)
    private Integer modifiedCraftingReagentItemID;

    @ColumnDefault("0")
    @Column(name = "ContentTuningID", nullable = false)
    @Db2Field(fieldIndex = 58, type = Db2Type.INT, signed = true)
    private Integer contentTuningID;

    @ColumnDefault("0")
    @Column(name = "PlayerLevelToItemLevelCurveID", nullable = false)
    @Db2Field(fieldIndex = 59, type = Db2Type.INT, signed = true)
    private Integer playerLevelToItemLevelCurveID;

    @ColumnDefault("'0'")
    @Column(name = "MaxDurability", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 60, type = Db2Type.INT)
    private Long maxDurability;

    @ColumnDefault("'0'")
    @Column(name = "ItemNameDescriptionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 61, type = Db2Type.SHORT)
    private Integer itemNameDescriptionID;

    @ColumnDefault("'0'")
    @Column(name = "RequiredTransmogHoliday", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 62, type = Db2Type.SHORT)
    private Integer requiredTransmogHoliday;

    @ColumnDefault("'0'")
    @Column(name = "RequiredHoliday", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 63, type = Db2Type.SHORT)
    private Integer requiredHoliday;

    @ColumnDefault("'0'")
    @Column(name = "LimitCategory", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 64, type = Db2Type.SHORT)
    private Integer limitCategory;

    @ColumnDefault("'0'")
    @Column(name = "GemProperties", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 65, type = Db2Type.SHORT)
    private Integer gemProperties;

    @ColumnDefault("'0'")
    @Column(name = "SocketMatchEnchantmentId", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 66, type = Db2Type.SHORT)
    private Integer socketMatchEnchantmentId;

    @ColumnDefault("'0'")
    @Column(name = "TotemCategoryID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 67, type = Db2Type.SHORT)
    private Integer totemCategoryID;

    @ColumnDefault("'0'")
    @Column(name = "InstanceBound", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 68, type = Db2Type.SHORT)
    private Integer instanceBound;

    @ColumnDefault("'0'")
    @Column(name = "ZoneBound1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 69, type = Db2Type.SHORT)
    private Integer zoneBound1;

    @ColumnDefault("'0'")
    @Column(name = "ZoneBound2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 70, type = Db2Type.SHORT)
    private Integer zoneBound2;

    @ColumnDefault("'0'")
    @Column(name = "ItemSet", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 71, type = Db2Type.SHORT)
    private Integer itemSet;

    @ColumnDefault("'0'")
    @Column(name = "LockID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 72, type = Db2Type.SHORT)
    private Integer lockID;

    @ColumnDefault("'0'")
    @Column(name = "PageID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 73, type = Db2Type.SHORT)
    private Integer pageID;

    @ColumnDefault("'0'")
    @Column(name = "ItemDelay", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 74, type = Db2Type.SHORT)
    private Integer itemDelay;

    @ColumnDefault("'0'")
    @Column(name = "MinFactionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 75, type = Db2Type.SHORT)
    private Integer minFactionID;

    @ColumnDefault("'0'")
    @Column(name = "RequiredSkillRank", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 76, type = Db2Type.SHORT)
    private Integer requiredSkillRank;

    @ColumnDefault("'0'")
    @Column(name = "RequiredSkill", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 77, type = Db2Type.SHORT)
    private Integer requiredSkill;

    @ColumnDefault("'0'")
    @Column(name = "ItemLevel", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 78, type = Db2Type.SHORT)
    private Integer itemLevel;

    @ColumnDefault("0")
    @Column(name = "AllowableClass", nullable = false)
    @Db2Field(fieldIndex = 79, type = Db2Type.SHORT, signed = true)
    private Short allowableClass;

    @ColumnDefault("'0'")
    @Column(name = "ItemRandomSuffixGroupID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 80, type = Db2Type.SHORT)
    private Integer itemRandomSuffixGroupID;

    @ColumnDefault("'0'")
    @Column(name = "RandomSelect", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 81, type = Db2Type.SHORT)
    private Integer randomSelect;

    @ColumnDefault("'0'")
    @Column(name = "MinDamage1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 82, type = Db2Type.SHORT)
    private Integer minDamage1;

    @ColumnDefault("'0'")
    @Column(name = "MinDamage2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 83, type = Db2Type.SHORT)
    private Integer minDamage2;

    @ColumnDefault("'0'")
    @Column(name = "MinDamage3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 84, type = Db2Type.SHORT)
    private Integer minDamage3;

    @ColumnDefault("'0'")
    @Column(name = "MinDamage4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 85, type = Db2Type.SHORT)
    private Integer minDamage4;

    @ColumnDefault("'0'")
    @Column(name = "MinDamage5", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 86, type = Db2Type.SHORT)
    private Integer minDamage5;

    @ColumnDefault("'0'")
    @Column(name = "MaxDamage1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 87, type = Db2Type.SHORT)
    private Integer maxDamage1;

    @ColumnDefault("'0'")
    @Column(name = "MaxDamage2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 88, type = Db2Type.SHORT)
    private Integer maxDamage2;

    @ColumnDefault("'0'")
    @Column(name = "MaxDamage3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 89, type = Db2Type.SHORT)
    private Integer maxDamage3;

    @ColumnDefault("'0'")
    @Column(name = "MaxDamage4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 90, type = Db2Type.SHORT)
    private Integer maxDamage4;

    @ColumnDefault("'0'")
    @Column(name = "MaxDamage5", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 91, type = Db2Type.SHORT)
    private Integer maxDamage5;

    @ColumnDefault("0")
    @Column(name = "Resistances1", nullable = false)
    @Db2Field(fieldIndex = 92, type = Db2Type.SHORT, signed = true)
    private Short resistances1;

    @ColumnDefault("0")
    @Column(name = "Resistances2", nullable = false)
    @Db2Field(fieldIndex = 93, type = Db2Type.SHORT, signed = true)
    private Short resistances2;

    @ColumnDefault("0")
    @Column(name = "Resistances3", nullable = false)
    @Db2Field(fieldIndex = 94, type = Db2Type.SHORT, signed = true)
    private Short resistances3;

    @ColumnDefault("0")
    @Column(name = "Resistances4", nullable = false)
    @Db2Field(fieldIndex = 95, type = Db2Type.SHORT, signed = true)
    private Short resistances4;

    @ColumnDefault("0")
    @Column(name = "Resistances5", nullable = false)
    @Db2Field(fieldIndex = 96, type = Db2Type.SHORT, signed = true)
    private Short resistances5;

    @ColumnDefault("0")
    @Column(name = "Resistances6", nullable = false)
    @Db2Field(fieldIndex = 97, type = Db2Type.SHORT, signed = true)
    private Short resistances6;

    @ColumnDefault("0")
    @Column(name = "Resistances7", nullable = false)
    @Db2Field(fieldIndex = 98, type = Db2Type.SHORT, signed = true)
    private Short resistances7;

    @ColumnDefault("'0'")
    @Column(name = "ScalingStatDistributionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 99, type = Db2Type.SHORT)
    private Integer scalingStatDistributionID;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount1", nullable = false)
    @Db2Field(fieldIndex = 100, type = Db2Type.SHORT, signed = true)
    private Short statModifierBonusAmount1;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount2", nullable = false)
    @Db2Field(fieldIndex = 101, type = Db2Type.SHORT, signed = true)
    private Short statModifierBonusAmount2;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount3", nullable = false)
    @Db2Field(fieldIndex = 102, type = Db2Type.SHORT, signed = true)
    private Short statModifierBonusAmount3;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount4", nullable = false)
    @Db2Field(fieldIndex = 103, type = Db2Type.SHORT, signed = true)
    private Short statModifierBonusAmount4;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount5", nullable = false)
    @Db2Field(fieldIndex = 104, type = Db2Type.SHORT, signed = true)
    private Short statModifierBonusAmount5;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount6", nullable = false)
    @Db2Field(fieldIndex = 105, type = Db2Type.SHORT, signed = true)
    private Short statModifierBonusAmount6;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount7", nullable = false)
    @Db2Field(fieldIndex = 106, type = Db2Type.SHORT, signed = true)
    private Short statModifierBonusAmount7;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount8", nullable = false)
    @Db2Field(fieldIndex = 107, type = Db2Type.SHORT, signed = true)
    private Short statModifierBonusAmount8;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount9", nullable = false)
    @Db2Field(fieldIndex = 108, type = Db2Type.SHORT, signed = true)
    private Short statModifierBonusAmount9;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount10", nullable = false)
    @Db2Field(fieldIndex = 109, type = Db2Type.SHORT, signed = true)
    private Short statModifierBonusAmount10;

    @ColumnDefault("'0'")
    @Column(name = "ExpansionID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 110, type = Db2Type.BYTE)
    private Short expansionID;

    @ColumnDefault("'0'")
    @Column(name = "ArtifactID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 111, type = Db2Type.BYTE)
    private Short artifactID;

    @ColumnDefault("'0'")
    @Column(name = "SpellWeight", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 112, type = Db2Type.BYTE)
    private Short spellWeight;

    @ColumnDefault("'0'")
    @Column(name = "SpellWeightCategory", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 113, type = Db2Type.BYTE)
    private Short spellWeightCategory;

    @ColumnDefault("'0'")
    @Column(name = "SocketType1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 114, type = Db2Type.BYTE)
    private Short socketType1;

    @ColumnDefault("'0'")
    @Column(name = "SocketType2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 115, type = Db2Type.BYTE)
    private Short socketType2;

    @ColumnDefault("'0'")
    @Column(name = "SocketType3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 116, type = Db2Type.BYTE)
    private Short socketType3;

    @ColumnDefault("'0'")
    @Column(name = "SheatheType", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 117, type = Db2Type.BYTE)
    private Short sheatheType;

    @ColumnDefault("'0'")
    @Column(name = "Material", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 118, type = Db2Type.BYTE)
    private Short material;

    @ColumnDefault("'0'")
    @Column(name = "PageMaterialID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 119, type = Db2Type.BYTE)
    private Short pageMaterialID;

    @ColumnDefault("'0'")
    @Column(name = "LanguageID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 120, type = Db2Type.BYTE)
    private Short languageID;

    @ColumnDefault("'0'")
    @Column(name = "Bonding", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 121, type = Db2Type.BYTE)
    private Short bonding;

    @ColumnDefault("'0'")
    @Column(name = "DamageDamageType", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 122, type = Db2Type.BYTE)
    private Short damageDamageType;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat1", nullable = false)
    @Db2Field(fieldIndex = 123, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat1;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat2", nullable = false)
    @Db2Field(fieldIndex = 124, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat2;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat3", nullable = false)
    @Db2Field(fieldIndex = 125, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat3;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat4", nullable = false)
    @Db2Field(fieldIndex = 126, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat4;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat5", nullable = false)
    @Db2Field(fieldIndex = 127, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat5;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat6", nullable = false)
    @Db2Field(fieldIndex = 128, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat6;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat7", nullable = false)
    @Db2Field(fieldIndex = 129, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat7;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat8", nullable = false)
    @Db2Field(fieldIndex = 130, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat8;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat9", nullable = false)
    @Db2Field(fieldIndex = 131, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat9;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat10", nullable = false)
    @Db2Field(fieldIndex = 132, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat10;

    @ColumnDefault("'0'")
    @Column(name = "ContainerSlots", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 133, type = Db2Type.BYTE)
    private Short containerSlots;

    @ColumnDefault("'0'")
    @Column(name = "RequiredPVPMedal", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 134, type = Db2Type.BYTE)
    private Short requiredPVPMedal;

    @ColumnDefault("'0'")
    @Column(name = "RequiredPVPRank", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 135, type = Db2Type.BYTE)
    private Short requiredPVPRank;

    @ColumnDefault("0")
    @Column(name = "InventoryType", nullable = false)
    @Db2Field(fieldIndex = 136, type = Db2Type.BYTE, signed = true)
    private Byte inventoryType;

    @ColumnDefault("0")
    @Column(name = "OverallQualityID", nullable = false)
    @Db2Field(fieldIndex = 137, type = Db2Type.BYTE, signed = true)
    private Byte overallQualityID;

    @ColumnDefault("'0'")
    @Column(name = "AmmunitionType", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 138, type = Db2Type.BYTE)
    private Short ammunitionType;

    @ColumnDefault("0")
    @Column(name = "RequiredLevel", nullable = false)
    @Db2Field(fieldIndex = 139, type = Db2Type.BYTE, signed = true)
    private Byte requiredLevel;

}