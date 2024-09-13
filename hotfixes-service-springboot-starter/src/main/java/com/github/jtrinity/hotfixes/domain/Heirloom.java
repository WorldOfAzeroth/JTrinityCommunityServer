package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Table(name = "heirloom")
@Db2File(name = "Heirloom.db2", fileDataId = 1097696, layoutHash = 0xFD204E4C, indexField = 1)
public class Heirloom {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "SourceText")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private String sourceText;

    @ColumnDefault("0")
    @Column(name = "ItemID", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer itemID;

    @ColumnDefault("0")
    @Column(name = "LegacyUpgradedItemID", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer legacyUpgradedItemID;

    @ColumnDefault("0")
    @Column(name = "StaticUpgradedItemID", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer staticUpgradedItemID;

    @ColumnDefault("0")
    @Column(name = "SourceTypeEnum", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte sourceTypeEnum;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short flags;

    @ColumnDefault("0")
    @Column(name = "LegacyItemID", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer legacyItemID;

    @ColumnDefault("0")
    @Column(name = "UpgradeItemID1", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer upgradeItemID1;

    @ColumnDefault("0")
    @Column(name = "UpgradeItemID2", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer upgradeItemID2;

    @ColumnDefault("0")
    @Column(name = "UpgradeItemID3", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer upgradeItemID3;

    @ColumnDefault("0")
    @Column(name = "UpgradeItemID4", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer upgradeItemID4;

    @ColumnDefault("0")
    @Column(name = "UpgradeItemID5", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer upgradeItemID5;

    @ColumnDefault("0")
    @Column(name = "UpgradeItemID6", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer upgradeItemID6;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeItemBonusListID1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Integer upgradeItemBonusListID1;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeItemBonusListID2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Integer upgradeItemBonusListID2;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeItemBonusListID3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Integer upgradeItemBonusListID3;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeItemBonusListID4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Integer upgradeItemBonusListID4;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeItemBonusListID5", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT)
    private Integer upgradeItemBonusListID5;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeItemBonusListID6", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT)
    private Integer upgradeItemBonusListID6;

}