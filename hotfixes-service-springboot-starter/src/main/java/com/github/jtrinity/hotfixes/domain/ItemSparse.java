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
@Table(name = "item_sparse")
public class ItemSparse {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "AllowableRace", nullable = false)
    private Long allowableRace;

    @Lob
    @Column(name = "Description")
    private String description;

    @Lob
    @Column(name = "Display3")
    private String display3;

    @Lob
    @Column(name = "Display2")
    private String display2;

    @Lob
    @Column(name = "Display1")
    private String display1;

    @Lob
    @Column(name = "Display")
    private String display;

    @ColumnDefault("0")
    @Column(name = "DmgVariance", nullable = false)
    private Float dmgVariance;

    @ColumnDefault("'0'")
    @Column(name = "DurationInInventory", columnDefinition = "int UNSIGNED not null")
    private Long durationInInventory;

    @ColumnDefault("0")
    @Column(name = "QualityModifier", nullable = false)
    private Float qualityModifier;

    @ColumnDefault("'0'")
    @Column(name = "BagFamily", columnDefinition = "int UNSIGNED not null")
    private Long bagFamily;

    @ColumnDefault("0")
    @Column(name = "StartQuestID", nullable = false)
    private Integer startQuestID;

    @ColumnDefault("0")
    @Column(name = "ItemRange", nullable = false)
    private Float itemRange;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket1", nullable = false)
    private Float statPercentageOfSocket1;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket2", nullable = false)
    private Float statPercentageOfSocket2;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket3", nullable = false)
    private Float statPercentageOfSocket3;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket4", nullable = false)
    private Float statPercentageOfSocket4;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket5", nullable = false)
    private Float statPercentageOfSocket5;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket6", nullable = false)
    private Float statPercentageOfSocket6;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket7", nullable = false)
    private Float statPercentageOfSocket7;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket8", nullable = false)
    private Float statPercentageOfSocket8;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket9", nullable = false)
    private Float statPercentageOfSocket9;

    @ColumnDefault("0")
    @Column(name = "StatPercentageOfSocket10", nullable = false)
    private Float statPercentageOfSocket10;

    @ColumnDefault("0")
    @Column(name = "Unknown440_11", nullable = false)
    private Integer unknown440_11;

    @ColumnDefault("0")
    @Column(name = "Unknown440_12", nullable = false)
    private Integer unknown440_12;

    @ColumnDefault("0")
    @Column(name = "Unknown440_13", nullable = false)
    private Integer unknown440_13;

    @ColumnDefault("0")
    @Column(name = "Unknown440_14", nullable = false)
    private Integer unknown440_14;

    @ColumnDefault("0")
    @Column(name = "Unknown440_15", nullable = false)
    private Integer unknown440_15;

    @ColumnDefault("0")
    @Column(name = "Unknown440_16", nullable = false)
    private Integer unknown440_16;

    @ColumnDefault("0")
    @Column(name = "Unknown440_17", nullable = false)
    private Integer unknown440_17;

    @ColumnDefault("0")
    @Column(name = "Unknown440_18", nullable = false)
    private Integer unknown440_18;

    @ColumnDefault("0")
    @Column(name = "Unknown440_19", nullable = false)
    private Integer unknown440_19;

    @ColumnDefault("0")
    @Column(name = "Unknown440_110", nullable = false)
    private Integer unknown440_110;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor1", nullable = false)
    private Integer statPercentEditor1;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor2", nullable = false)
    private Integer statPercentEditor2;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor3", nullable = false)
    private Integer statPercentEditor3;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor4", nullable = false)
    private Integer statPercentEditor4;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor5", nullable = false)
    private Integer statPercentEditor5;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor6", nullable = false)
    private Integer statPercentEditor6;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor7", nullable = false)
    private Integer statPercentEditor7;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor8", nullable = false)
    private Integer statPercentEditor8;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor9", nullable = false)
    private Integer statPercentEditor9;

    @ColumnDefault("0")
    @Column(name = "StatPercentEditor10", nullable = false)
    private Integer statPercentEditor10;

    @ColumnDefault("0")
    @Column(name = "Stackable", nullable = false)
    private Integer stackable;

    @ColumnDefault("0")
    @Column(name = "MaxCount", nullable = false)
    private Integer maxCount;

    @ColumnDefault("0")
    @Column(name = "MinReputation", nullable = false)
    private Integer minReputation;

    @ColumnDefault("'0'")
    @Column(name = "RequiredAbility", columnDefinition = "int UNSIGNED not null")
    private Long requiredAbility;

    @ColumnDefault("'0'")
    @Column(name = "SellPrice", columnDefinition = "int UNSIGNED not null")
    private Long sellPrice;

    @ColumnDefault("'0'")
    @Column(name = "BuyPrice", columnDefinition = "int UNSIGNED not null")
    private Long buyPrice;

    @ColumnDefault("'0'")
    @Column(name = "VendorStackCount", columnDefinition = "int UNSIGNED not null")
    private Long vendorStackCount;

    @ColumnDefault("0")
    @Column(name = "PriceVariance", nullable = false)
    private Float priceVariance;

    @ColumnDefault("0")
    @Column(name = "PriceRandomValue", nullable = false)
    private Float priceRandomValue;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    private Integer flags2;

    @ColumnDefault("0")
    @Column(name = "Flags3", nullable = false)
    private Integer flags3;

    @ColumnDefault("0")
    @Column(name = "Flags4", nullable = false)
    private Integer flags4;

    @ColumnDefault("0")
    @Column(name = "FactionRelated", nullable = false)
    private Integer factionRelated;

    @ColumnDefault("0")
    @Column(name = "ModifiedCraftingReagentItemID", nullable = false)
    private Integer modifiedCraftingReagentItemID;

    @ColumnDefault("0")
    @Column(name = "ContentTuningID", nullable = false)
    private Integer contentTuningID;

    @ColumnDefault("0")
    @Column(name = "PlayerLevelToItemLevelCurveID", nullable = false)
    private Integer playerLevelToItemLevelCurveID;

    @ColumnDefault("'0'")
    @Column(name = "MaxDurability", columnDefinition = "int UNSIGNED not null")
    private Long maxDurability;

    @ColumnDefault("'0'")
    @Column(name = "ItemNameDescriptionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemNameDescriptionID;

    @ColumnDefault("'0'")
    @Column(name = "RequiredTransmogHoliday", columnDefinition = "smallint UNSIGNED not null")
    private Integer requiredTransmogHoliday;

    @ColumnDefault("'0'")
    @Column(name = "RequiredHoliday", columnDefinition = "smallint UNSIGNED not null")
    private Integer requiredHoliday;

    @ColumnDefault("'0'")
    @Column(name = "LimitCategory", columnDefinition = "smallint UNSIGNED not null")
    private Integer limitCategory;

    @ColumnDefault("'0'")
    @Column(name = "GemProperties", columnDefinition = "smallint UNSIGNED not null")
    private Integer gemProperties;

    @ColumnDefault("'0'")
    @Column(name = "SocketMatchEnchantmentId", columnDefinition = "smallint UNSIGNED not null")
    private Integer socketMatchEnchantmentId;

    @ColumnDefault("'0'")
    @Column(name = "TotemCategoryID", columnDefinition = "smallint UNSIGNED not null")
    private Integer totemCategoryID;

    @ColumnDefault("'0'")
    @Column(name = "InstanceBound", columnDefinition = "smallint UNSIGNED not null")
    private Integer instanceBound;

    @ColumnDefault("'0'")
    @Column(name = "ZoneBound1", columnDefinition = "smallint UNSIGNED not null")
    private Integer zoneBound1;

    @ColumnDefault("'0'")
    @Column(name = "ZoneBound2", columnDefinition = "smallint UNSIGNED not null")
    private Integer zoneBound2;

    @ColumnDefault("'0'")
    @Column(name = "ItemSet", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemSet;

    @ColumnDefault("'0'")
    @Column(name = "LockID", columnDefinition = "smallint UNSIGNED not null")
    private Integer lockID;

    @ColumnDefault("'0'")
    @Column(name = "PageID", columnDefinition = "smallint UNSIGNED not null")
    private Integer pageID;

    @ColumnDefault("'0'")
    @Column(name = "ItemDelay", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemDelay;

    @ColumnDefault("'0'")
    @Column(name = "MinFactionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer minFactionID;

    @ColumnDefault("'0'")
    @Column(name = "RequiredSkillRank", columnDefinition = "smallint UNSIGNED not null")
    private Integer requiredSkillRank;

    @ColumnDefault("'0'")
    @Column(name = "RequiredSkill", columnDefinition = "smallint UNSIGNED not null")
    private Integer requiredSkill;

    @ColumnDefault("'0'")
    @Column(name = "ItemLevel", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemLevel;

    @ColumnDefault("0")
    @Column(name = "AllowableClass", nullable = false)
    private Short allowableClass;

    @ColumnDefault("'0'")
    @Column(name = "ItemRandomSuffixGroupID", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemRandomSuffixGroupID;

    @ColumnDefault("'0'")
    @Column(name = "RandomSelect", columnDefinition = "smallint UNSIGNED not null")
    private Integer randomSelect;

    @ColumnDefault("'0'")
    @Column(name = "MinDamage1", columnDefinition = "smallint UNSIGNED not null")
    private Integer minDamage1;

    @ColumnDefault("'0'")
    @Column(name = "MinDamage2", columnDefinition = "smallint UNSIGNED not null")
    private Integer minDamage2;

    @ColumnDefault("'0'")
    @Column(name = "MinDamage3", columnDefinition = "smallint UNSIGNED not null")
    private Integer minDamage3;

    @ColumnDefault("'0'")
    @Column(name = "MinDamage4", columnDefinition = "smallint UNSIGNED not null")
    private Integer minDamage4;

    @ColumnDefault("'0'")
    @Column(name = "MinDamage5", columnDefinition = "smallint UNSIGNED not null")
    private Integer minDamage5;

    @ColumnDefault("'0'")
    @Column(name = "MaxDamage1", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxDamage1;

    @ColumnDefault("'0'")
    @Column(name = "MaxDamage2", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxDamage2;

    @ColumnDefault("'0'")
    @Column(name = "MaxDamage3", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxDamage3;

    @ColumnDefault("'0'")
    @Column(name = "MaxDamage4", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxDamage4;

    @ColumnDefault("'0'")
    @Column(name = "MaxDamage5", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxDamage5;

    @ColumnDefault("0")
    @Column(name = "Resistances1", nullable = false)
    private Short resistances1;

    @ColumnDefault("0")
    @Column(name = "Resistances2", nullable = false)
    private Short resistances2;

    @ColumnDefault("0")
    @Column(name = "Resistances3", nullable = false)
    private Short resistances3;

    @ColumnDefault("0")
    @Column(name = "Resistances4", nullable = false)
    private Short resistances4;

    @ColumnDefault("0")
    @Column(name = "Resistances5", nullable = false)
    private Short resistances5;

    @ColumnDefault("0")
    @Column(name = "Resistances6", nullable = false)
    private Short resistances6;

    @ColumnDefault("0")
    @Column(name = "Resistances7", nullable = false)
    private Short resistances7;

    @ColumnDefault("'0'")
    @Column(name = "ScalingStatDistributionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer scalingStatDistributionID;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount1", nullable = false)
    private Short statModifierBonusAmount1;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount2", nullable = false)
    private Short statModifierBonusAmount2;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount3", nullable = false)
    private Short statModifierBonusAmount3;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount4", nullable = false)
    private Short statModifierBonusAmount4;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount5", nullable = false)
    private Short statModifierBonusAmount5;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount6", nullable = false)
    private Short statModifierBonusAmount6;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount7", nullable = false)
    private Short statModifierBonusAmount7;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount8", nullable = false)
    private Short statModifierBonusAmount8;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount9", nullable = false)
    private Short statModifierBonusAmount9;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusAmount10", nullable = false)
    private Short statModifierBonusAmount10;

    @ColumnDefault("'0'")
    @Column(name = "ExpansionID", columnDefinition = "tinyint UNSIGNED not null")
    private Short expansionID;

    @ColumnDefault("'0'")
    @Column(name = "ArtifactID", columnDefinition = "tinyint UNSIGNED not null")
    private Short artifactID;

    @ColumnDefault("'0'")
    @Column(name = "SpellWeight", columnDefinition = "tinyint UNSIGNED not null")
    private Short spellWeight;

    @ColumnDefault("'0'")
    @Column(name = "SpellWeightCategory", columnDefinition = "tinyint UNSIGNED not null")
    private Short spellWeightCategory;

    @ColumnDefault("'0'")
    @Column(name = "SocketType1", columnDefinition = "tinyint UNSIGNED not null")
    private Short socketType1;

    @ColumnDefault("'0'")
    @Column(name = "SocketType2", columnDefinition = "tinyint UNSIGNED not null")
    private Short socketType2;

    @ColumnDefault("'0'")
    @Column(name = "SocketType3", columnDefinition = "tinyint UNSIGNED not null")
    private Short socketType3;

    @ColumnDefault("'0'")
    @Column(name = "SheatheType", columnDefinition = "tinyint UNSIGNED not null")
    private Short sheatheType;

    @ColumnDefault("'0'")
    @Column(name = "Material", columnDefinition = "tinyint UNSIGNED not null")
    private Short material;

    @ColumnDefault("'0'")
    @Column(name = "PageMaterialID", columnDefinition = "tinyint UNSIGNED not null")
    private Short pageMaterialID;

    @ColumnDefault("'0'")
    @Column(name = "LanguageID", columnDefinition = "tinyint UNSIGNED not null")
    private Short languageID;

    @ColumnDefault("'0'")
    @Column(name = "Bonding", columnDefinition = "tinyint UNSIGNED not null")
    private Short bonding;

    @ColumnDefault("'0'")
    @Column(name = "DamageDamageType", columnDefinition = "tinyint UNSIGNED not null")
    private Short damageDamageType;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat1", nullable = false)
    private Byte statModifierBonusStat1;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat2", nullable = false)
    private Byte statModifierBonusStat2;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat3", nullable = false)
    private Byte statModifierBonusStat3;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat4", nullable = false)
    private Byte statModifierBonusStat4;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat5", nullable = false)
    private Byte statModifierBonusStat5;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat6", nullable = false)
    private Byte statModifierBonusStat6;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat7", nullable = false)
    private Byte statModifierBonusStat7;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat8", nullable = false)
    private Byte statModifierBonusStat8;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat9", nullable = false)
    private Byte statModifierBonusStat9;

    @ColumnDefault("0")
    @Column(name = "StatModifierBonusStat10", nullable = false)
    private Byte statModifierBonusStat10;

    @ColumnDefault("'0'")
    @Column(name = "ContainerSlots", columnDefinition = "tinyint UNSIGNED not null")
    private Short containerSlots;

    @ColumnDefault("'0'")
    @Column(name = "RequiredPVPMedal", columnDefinition = "tinyint UNSIGNED not null")
    private Short requiredPVPMedal;

    @ColumnDefault("'0'")
    @Column(name = "RequiredPVPRank", columnDefinition = "tinyint UNSIGNED not null")
    private Short requiredPVPRank;

    @ColumnDefault("0")
    @Column(name = "InventoryType", nullable = false)
    private Byte inventoryType;

    @ColumnDefault("0")
    @Column(name = "OverallQualityID", nullable = false)
    private Byte overallQualityID;

    @ColumnDefault("'0'")
    @Column(name = "AmmunitionType", columnDefinition = "tinyint UNSIGNED not null")
    private Short ammunitionType;

    @ColumnDefault("0")
    @Column(name = "RequiredLevel", nullable = false)
    private Byte requiredLevel;

}