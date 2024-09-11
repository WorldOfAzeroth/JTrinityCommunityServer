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
@Table(name = "heirloom")
public class Heirloom {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "SourceText")
    private String sourceText;

    @ColumnDefault("0")
    @Column(name = "ItemID", nullable = false)
    private Integer itemID;

    @ColumnDefault("0")
    @Column(name = "LegacyUpgradedItemID", nullable = false)
    private Integer legacyUpgradedItemID;

    @ColumnDefault("0")
    @Column(name = "StaticUpgradedItemID", nullable = false)
    private Integer staticUpgradedItemID;

    @ColumnDefault("0")
    @Column(name = "SourceTypeEnum", nullable = false)
    private Byte sourceTypeEnum;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("0")
    @Column(name = "LegacyItemID", nullable = false)
    private Integer legacyItemID;

    @ColumnDefault("0")
    @Column(name = "UpgradeItemID1", nullable = false)
    private Integer upgradeItemID1;

    @ColumnDefault("0")
    @Column(name = "UpgradeItemID2", nullable = false)
    private Integer upgradeItemID2;

    @ColumnDefault("0")
    @Column(name = "UpgradeItemID3", nullable = false)
    private Integer upgradeItemID3;

    @ColumnDefault("0")
    @Column(name = "UpgradeItemID4", nullable = false)
    private Integer upgradeItemID4;

    @ColumnDefault("0")
    @Column(name = "UpgradeItemID5", nullable = false)
    private Integer upgradeItemID5;

    @ColumnDefault("0")
    @Column(name = "UpgradeItemID6", nullable = false)
    private Integer upgradeItemID6;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeItemBonusListID1", columnDefinition = "smallint UNSIGNED not null")
    private Integer upgradeItemBonusListID1;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeItemBonusListID2", columnDefinition = "smallint UNSIGNED not null")
    private Integer upgradeItemBonusListID2;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeItemBonusListID3", columnDefinition = "smallint UNSIGNED not null")
    private Integer upgradeItemBonusListID3;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeItemBonusListID4", columnDefinition = "smallint UNSIGNED not null")
    private Integer upgradeItemBonusListID4;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeItemBonusListID5", columnDefinition = "smallint UNSIGNED not null")
    private Integer upgradeItemBonusListID5;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeItemBonusListID6", columnDefinition = "smallint UNSIGNED not null")
    private Integer upgradeItemBonusListID6;

}