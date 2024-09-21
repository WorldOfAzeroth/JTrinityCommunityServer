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
@Table(name = "adventure_journal")
@Db2File(name = "AdventureJournal.db2", layoutHash = 0xB2FFA8DD)
public class AdventureJournal implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name_Lang")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name_Lang;


    @Column(name = "Description_Lang")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString description_Lang;


    @Column(name = "ButtonText_Lang")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private LocalizedString buttonText_Lang;


    @Column(name = "RewardDescription_Lang")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private LocalizedString rewardDescription_Lang;


    @Column(name = "ContinueDescription_Lang")
    @Db2Field(fieldIndex = 5, type = Db2Type.STRING)
    private LocalizedString continueDescription_Lang;


    @Column(name = "TextureFileDataID")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer textureFileDataID;


    @Column(name = "ItemID")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer itemID;


    @Column(name = "LfgDungeonID")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Short lfgDungeonID;


    @Column(name = "QuestID")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short questID;


    @Column(name = "BattleMasterListID")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short battleMasterListID;


    @Column(name = "BonusPlayerConditionID1")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Short bonusPlayerConditionID1;


    @Column(name = "BonusPlayerConditionID2")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Short bonusPlayerConditionID2;


    @Column(name = "CurrencyType")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short currencyType;


    @Column(name = "WorldMapAreaID")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short worldMapAreaID;


    @Column(name = "Type")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Byte type;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "ButtonActionType")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Byte buttonActionType;


    @Column(name = "PriorityMin")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Byte priorityMin;


    @Column(name = "PriorityMax")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Byte priorityMax;


    @Column(name = "BonusValue1")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Byte bonusValue1;


    @Column(name = "BonusValue2")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Byte bonusValue2;


    @Column(name = "CurrencyQuantity")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Byte currencyQuantity;


    @Column(name = "PlayerConditionID")
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer playerConditionID;


    @Column(name = "ItemQuantity")
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer itemQuantity;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
