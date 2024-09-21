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
@Table(name = "lfg_dungeons")
@Db2File(name = "LFGDungeons.db2", layoutHash = 0xF02081A0)
public class LfgDungeon implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer flags;


    @Column(name = "MinGear")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float minGear;


    @Column(name = "MaxLevel")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short maxLevel;


    @Column(name = "TargetLevelMax")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short targetLevelMax;


    @Column(name = "MapID")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT, signed = true)
    private Short mapID;


    @Column(name = "RandomID")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Short randomID;


    @Column(name = "ScenarioID")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short scenarioID;


    @Column(name = "FinalEncounterID")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short finalEncounterID;


    @Column(name = "BonusReputationAmount")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Short bonusReputationAmount;


    @Column(name = "MentorItemLevel")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Short mentorItemLevel;


    @Column(name = "RequiredPlayerConditionId")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short requiredPlayerConditionId;


    @Column(name = "MinLevel")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE)
    private Byte minLevel;


    @Column(name = "TargetLevel")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Byte targetLevel;


    @Column(name = "TargetLevelMin")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE)
    private Byte targetLevelMin;


    @Column(name = "DifficultyID")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Byte difficultyID;


    @Column(name = "TypeID")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Byte typeID;


    @Column(name = "Faction")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE, signed = true)
    private Byte faction;


    @Column(name = "ExpansionLevel")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Byte expansionLevel;


    @Column(name = "OrderIndex")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Byte orderIndex;


    @Column(name = "GroupID")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Byte groupID;


    @Column(name = "CountTank")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Byte countTank;


    @Column(name = "CountHealer")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Byte countHealer;


    @Column(name = "CountDamage")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Byte countDamage;


    @Column(name = "MinCountTank")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE)
    private Byte minCountTank;


    @Column(name = "MinCountHealer")
    @Db2Field(fieldIndex = 27, type = Db2Type.BYTE)
    private Byte minCountHealer;


    @Column(name = "MinCountDamage")
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE)
    private Byte minCountDamage;


    @Column(name = "Subtype")
    @Db2Field(fieldIndex = 29, type = Db2Type.BYTE)
    private Byte subtype;


    @Column(name = "MentorCharLevel")
    @Db2Field(fieldIndex = 30, type = Db2Type.BYTE)
    private Byte mentorCharLevel;


    @Column(name = "IconTextureFileID")
    @Db2Field(fieldIndex = 31, type = Db2Type.INT, signed = true)
    private Integer iconTextureFileID;


    @Column(name = "RewardsBgTextureFileID")
    @Db2Field(fieldIndex = 32, type = Db2Type.INT, signed = true)
    private Integer rewardsBgTextureFileID;


    @Column(name = "PopupBgTextureFileID")
    @Db2Field(fieldIndex = 33, type = Db2Type.INT, signed = true)
    private Integer popupBgTextureFileID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
