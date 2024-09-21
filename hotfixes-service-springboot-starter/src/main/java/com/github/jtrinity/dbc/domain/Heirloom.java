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
@Table(name = "heirloom")
@Db2File(name = "Heirloom.db2", layoutHash = 0x36887C6F, indexField = 9)
public class Heirloom implements DbcEntity {

    @Column(name = "SourceText")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString sourceText;


    @Column(name = "ItemID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer itemID;


    @Column(name = "LegacyItemID")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer legacyItemID;


    @Column(name = "LegacyUpgradedItemID")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer legacyUpgradedItemID;


    @Column(name = "StaticUpgradedItemID")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer staticUpgradedItemID;


    @Column(name = "UpgradeItemID1")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer upgradeItemID1;


    @Column(name = "UpgradeItemID2")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer upgradeItemID2;


    @Column(name = "UpgradeItemID3")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer upgradeItemID3;


    @Column(name = "UpgradeItemBonusListID1")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Short upgradeItemBonusListID1;


    @Column(name = "UpgradeItemBonusListID2")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short upgradeItemBonusListID2;


    @Column(name = "UpgradeItemBonusListID3")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short upgradeItemBonusListID3;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "SourceTypeEnum")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE, signed = true)
    private Byte sourceTypeEnum;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
