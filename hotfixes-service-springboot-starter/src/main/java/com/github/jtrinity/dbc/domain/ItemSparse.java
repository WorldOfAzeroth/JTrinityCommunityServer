package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
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
@ToString
@IdClass(DB2Id.class)
@Entity
@Table(name = "item_sparse")
@Db2File(name = "ItemSparse.db2", layoutHash = 0x4007DE16)
public class ItemSparse implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "AllowableRace")
    @Db2Field(fieldIndex = 1, type = Db2Type.LONG, signed = true)
    private Long allowableRace;


    @Column(name = "Display")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString display;


    @Column(name = "Display1")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private LocalizedString display1;


    @Column(name = "Display2")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private LocalizedString display2;


    @Column(name = "Display3")
    @Db2Field(fieldIndex = 5, type = Db2Type.STRING)
    private LocalizedString display3;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 6, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "Flags1")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer flags1;


    @Column(name = "Flags2")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer flags2;


    @Column(name = "Flags3")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer flags3;


    @Column(name = "Flags4")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer flags4;


    @Column(name = "PriceRandomValue")
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float priceRandomValue;


    @Column(name = "PriceVariance")
    @Db2Field(fieldIndex = 12, type = Db2Type.FLOAT)
    private Float priceVariance;


    @Column(name = "VendorStackCount")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Integer vendorStackCount;


    @Column(name = "BuyPrice")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Integer buyPrice;


    @Column(name = "SellPrice")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Integer sellPrice;


    @Column(name = "RequiredAbility")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Integer requiredAbility;


    @Column(name = "MaxCount")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT, signed = true)
    private Integer maxCount;


    @Column(name = "Stackable")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT, signed = true)
    private Integer stackable;


    @Column(name = "StatPercentEditor1")
    @Db2Field(fieldIndex = 19, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor1;


    @Column(name = "StatPercentEditor2")
    @Db2Field(fieldIndex = 20, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor2;


    @Column(name = "StatPercentEditor3")
    @Db2Field(fieldIndex = 21, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor3;


    @Column(name = "StatPercentEditor4")
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor4;


    @Column(name = "StatPercentEditor5")
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor5;


    @Column(name = "StatPercentEditor6")
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor6;


    @Column(name = "StatPercentEditor7")
    @Db2Field(fieldIndex = 25, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor7;


    @Column(name = "StatPercentEditor8")
    @Db2Field(fieldIndex = 26, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor8;


    @Column(name = "StatPercentEditor9")
    @Db2Field(fieldIndex = 27, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor9;


    @Column(name = "StatPercentEditor10")
    @Db2Field(fieldIndex = 28, type = Db2Type.INT, signed = true)
    private Integer statPercentEditor10;


    @Column(name = "StatPercentageOfSocket1")
    @Db2Field(fieldIndex = 29, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket1;


    @Column(name = "StatPercentageOfSocket2")
    @Db2Field(fieldIndex = 30, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket2;


    @Column(name = "StatPercentageOfSocket3")
    @Db2Field(fieldIndex = 31, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket3;


    @Column(name = "StatPercentageOfSocket4")
    @Db2Field(fieldIndex = 32, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket4;


    @Column(name = "StatPercentageOfSocket5")
    @Db2Field(fieldIndex = 33, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket5;


    @Column(name = "StatPercentageOfSocket6")
    @Db2Field(fieldIndex = 34, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket6;


    @Column(name = "StatPercentageOfSocket7")
    @Db2Field(fieldIndex = 35, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket7;


    @Column(name = "StatPercentageOfSocket8")
    @Db2Field(fieldIndex = 36, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket8;


    @Column(name = "StatPercentageOfSocket9")
    @Db2Field(fieldIndex = 37, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket9;


    @Column(name = "StatPercentageOfSocket10")
    @Db2Field(fieldIndex = 38, type = Db2Type.FLOAT)
    private Float statPercentageOfSocket10;


    @Column(name = "ItemRange")
    @Db2Field(fieldIndex = 39, type = Db2Type.FLOAT)
    private Float itemRange;


    @Column(name = "BagFamily")
    @Db2Field(fieldIndex = 40, type = Db2Type.INT)
    private Integer bagFamily;


    @Column(name = "QualityModifier")
    @Db2Field(fieldIndex = 41, type = Db2Type.FLOAT)
    private Float qualityModifier;


    @Column(name = "DurationInInventory")
    @Db2Field(fieldIndex = 42, type = Db2Type.INT)
    private Integer durationInInventory;


    @Column(name = "DmgVariance")
    @Db2Field(fieldIndex = 43, type = Db2Type.FLOAT)
    private Float dmgVariance;


    @Column(name = "AllowableClass")
    @Db2Field(fieldIndex = 44, type = Db2Type.SHORT, signed = true)
    private Short allowableClass;


    @Column(name = "ItemLevel")
    @Db2Field(fieldIndex = 45, type = Db2Type.SHORT)
    private Short itemLevel;


    @Column(name = "RequiredSkill")
    @Db2Field(fieldIndex = 46, type = Db2Type.SHORT)
    private Short requiredSkill;


    @Column(name = "RequiredSkillRank")
    @Db2Field(fieldIndex = 47, type = Db2Type.SHORT)
    private Short requiredSkillRank;


    @Column(name = "MinFactionID")
    @Db2Field(fieldIndex = 48, type = Db2Type.SHORT)
    private Short minFactionID;


    @Column(name = "ItemStatValue1")
    @Db2Field(fieldIndex = 49, type = Db2Type.SHORT, signed = true)
    private Short itemStatValue1;


    @Column(name = "ItemStatValue2")
    @Db2Field(fieldIndex = 50, type = Db2Type.SHORT, signed = true)
    private Short itemStatValue2;


    @Column(name = "ItemStatValue3")
    @Db2Field(fieldIndex = 51, type = Db2Type.SHORT, signed = true)
    private Short itemStatValue3;


    @Column(name = "ItemStatValue4")
    @Db2Field(fieldIndex = 52, type = Db2Type.SHORT, signed = true)
    private Short itemStatValue4;


    @Column(name = "ItemStatValue5")
    @Db2Field(fieldIndex = 53, type = Db2Type.SHORT, signed = true)
    private Short itemStatValue5;


    @Column(name = "ItemStatValue6")
    @Db2Field(fieldIndex = 54, type = Db2Type.SHORT, signed = true)
    private Short itemStatValue6;


    @Column(name = "ItemStatValue7")
    @Db2Field(fieldIndex = 55, type = Db2Type.SHORT, signed = true)
    private Short itemStatValue7;


    @Column(name = "ItemStatValue8")
    @Db2Field(fieldIndex = 56, type = Db2Type.SHORT, signed = true)
    private Short itemStatValue8;


    @Column(name = "ItemStatValue9")
    @Db2Field(fieldIndex = 57, type = Db2Type.SHORT, signed = true)
    private Short itemStatValue9;


    @Column(name = "ItemStatValue10")
    @Db2Field(fieldIndex = 58, type = Db2Type.SHORT, signed = true)
    private Short itemStatValue10;


    @Column(name = "ScalingStatDistributionID")
    @Db2Field(fieldIndex = 59, type = Db2Type.SHORT)
    private Short scalingStatDistributionID;


    @Column(name = "ItemDelay")
    @Db2Field(fieldIndex = 60, type = Db2Type.SHORT)
    private Short itemDelay;


    @Column(name = "PageID")
    @Db2Field(fieldIndex = 61, type = Db2Type.SHORT)
    private Short pageID;


    @Column(name = "StartQuestID")
    @Db2Field(fieldIndex = 62, type = Db2Type.SHORT)
    private Short startQuestID;


    @Column(name = "LockID")
    @Db2Field(fieldIndex = 63, type = Db2Type.SHORT)
    private Short lockID;


    @Column(name = "RandomSelect")
    @Db2Field(fieldIndex = 64, type = Db2Type.SHORT)
    private Short randomSelect;


    @Column(name = "ItemRandomSuffixGroupID")
    @Db2Field(fieldIndex = 65, type = Db2Type.SHORT)
    private Short itemRandomSuffixGroupID;


    @Column(name = "ItemSet")
    @Db2Field(fieldIndex = 66, type = Db2Type.SHORT)
    private Short itemSet;


    @Column(name = "ZoneBound")
    @Db2Field(fieldIndex = 67, type = Db2Type.SHORT)
    private Short zoneBound;


    @Column(name = "InstanceBound")
    @Db2Field(fieldIndex = 68, type = Db2Type.SHORT)
    private Short instanceBound;


    @Column(name = "TotemCategoryID")
    @Db2Field(fieldIndex = 69, type = Db2Type.SHORT)
    private Short totemCategoryID;


    @Column(name = "SocketMatchEnchantmentId")
    @Db2Field(fieldIndex = 70, type = Db2Type.SHORT)
    private Short socketMatchEnchantmentId;


    @Column(name = "GemProperties")
    @Db2Field(fieldIndex = 71, type = Db2Type.SHORT)
    private Short gemProperties;


    @Column(name = "LimitCategory")
    @Db2Field(fieldIndex = 72, type = Db2Type.SHORT)
    private Short limitCategory;


    @Column(name = "RequiredHoliday")
    @Db2Field(fieldIndex = 73, type = Db2Type.SHORT)
    private Short requiredHoliday;


    @Column(name = "RequiredTransmogHoliday")
    @Db2Field(fieldIndex = 74, type = Db2Type.SHORT)
    private Short requiredTransmogHoliday;


    @Column(name = "ItemNameDescriptionID")
    @Db2Field(fieldIndex = 75, type = Db2Type.SHORT)
    private Short itemNameDescriptionID;


    @Column(name = "OverallQualityID")
    @Db2Field(fieldIndex = 76, type = Db2Type.BYTE)
    private Byte overallQualityID;


    @Column(name = "InventoryType")
    @Db2Field(fieldIndex = 77, type = Db2Type.BYTE)
    private Byte inventoryType;


    @Column(name = "RequiredLevel")
    @Db2Field(fieldIndex = 78, type = Db2Type.BYTE, signed = true)
    private Byte requiredLevel;


    @Column(name = "RequiredPVPRank")
    @Db2Field(fieldIndex = 79, type = Db2Type.BYTE)
    private Byte requiredPVPRank;


    @Column(name = "RequiredPVPMedal")
    @Db2Field(fieldIndex = 80, type = Db2Type.BYTE)
    private Byte requiredPVPMedal;


    @Column(name = "MinReputation")
    @Db2Field(fieldIndex = 81, type = Db2Type.BYTE)
    private Byte minReputation;


    @Column(name = "ContainerSlots")
    @Db2Field(fieldIndex = 82, type = Db2Type.BYTE)
    private Byte containerSlots;


    @Column(name = "StatModifierBonusStat1")
    @Db2Field(fieldIndex = 83, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat1;


    @Column(name = "StatModifierBonusStat2")
    @Db2Field(fieldIndex = 84, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat2;


    @Column(name = "StatModifierBonusStat3")
    @Db2Field(fieldIndex = 85, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat3;


    @Column(name = "StatModifierBonusStat4")
    @Db2Field(fieldIndex = 86, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat4;


    @Column(name = "StatModifierBonusStat5")
    @Db2Field(fieldIndex = 87, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat5;


    @Column(name = "StatModifierBonusStat6")
    @Db2Field(fieldIndex = 88, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat6;


    @Column(name = "StatModifierBonusStat7")
    @Db2Field(fieldIndex = 89, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat7;


    @Column(name = "StatModifierBonusStat8")
    @Db2Field(fieldIndex = 90, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat8;


    @Column(name = "StatModifierBonusStat9")
    @Db2Field(fieldIndex = 91, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat9;


    @Column(name = "StatModifierBonusStat10")
    @Db2Field(fieldIndex = 92, type = Db2Type.BYTE, signed = true)
    private Byte statModifierBonusStat10;


    @Column(name = "DamageDamageType")
    @Db2Field(fieldIndex = 93, type = Db2Type.BYTE)
    private Byte damageDamageType;


    @Column(name = "Bonding")
    @Db2Field(fieldIndex = 94, type = Db2Type.BYTE)
    private Byte bonding;


    @Column(name = "LanguageID")
    @Db2Field(fieldIndex = 95, type = Db2Type.BYTE)
    private Byte languageID;


    @Column(name = "PageMaterialID")
    @Db2Field(fieldIndex = 96, type = Db2Type.BYTE)
    private Byte pageMaterialID;


    @Column(name = "Material")
    @Db2Field(fieldIndex = 97, type = Db2Type.BYTE)
    private Byte material;


    @Column(name = "SheatheType")
    @Db2Field(fieldIndex = 98, type = Db2Type.BYTE)
    private Byte sheatheType;


    @Column(name = "SocketType1")
    @Db2Field(fieldIndex = 99, type = Db2Type.BYTE)
    private Byte socketType1;


    @Column(name = "SocketType2")
    @Db2Field(fieldIndex = 100, type = Db2Type.BYTE)
    private Byte socketType2;


    @Column(name = "SocketType3")
    @Db2Field(fieldIndex = 101, type = Db2Type.BYTE)
    private Byte socketType3;


    @Column(name = "SpellWeightCategory")
    @Db2Field(fieldIndex = 102, type = Db2Type.BYTE)
    private Byte spellWeightCategory;


    @Column(name = "SpellWeight")
    @Db2Field(fieldIndex = 103, type = Db2Type.BYTE)
    private Byte spellWeight;


    @Column(name = "ArtifactID")
    @Db2Field(fieldIndex = 104, type = Db2Type.BYTE)
    private Byte artifactID;


    @Column(name = "ExpansionID")
    @Db2Field(fieldIndex = 105, type = Db2Type.BYTE)
    private Byte expansionID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
