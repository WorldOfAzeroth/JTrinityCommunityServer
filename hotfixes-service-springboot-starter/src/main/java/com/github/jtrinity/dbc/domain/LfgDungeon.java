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
@Table(name = "lfg_dungeons")
@Db2File(name = "LFGDungeons.db2", layoutHash = 0x6EA3052A, parentIndexField = 6)
public class LfgDungeon implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String name;

    @Lob
    @Column(name = "Description")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String description;

    @ColumnDefault("'0'")
    @Column(name = "MinLevel", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short minLevel;

    @ColumnDefault("'0'")
    @Column(name = "MaxLevel", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Integer maxLevel;

    @ColumnDefault("'0'")
    @Column(name = "TypeID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Short typeID;

    @ColumnDefault("'0'")
    @Column(name = "Subtype", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short subtype;

    @ColumnDefault("0")
    @Column(name = "Faction", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte faction;

    @ColumnDefault("0")
    @Column(name = "IconTextureFileID", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer iconTextureFileID;

    @ColumnDefault("0")
    @Column(name = "RewardsBgTextureFileID", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer rewardsBgTextureFileID;

    @ColumnDefault("0")
    @Column(name = "PopupBgTextureFileID", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer popupBgTextureFileID;

    @ColumnDefault("'0'")
    @Column(name = "ExpansionLevel", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Short expansionLevel;

    @ColumnDefault("0")
    @Column(name = "MapID", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT, signed = true)
    private Short mapID;

    @ColumnDefault("'0'")
    @Column(name = "DifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE)
    private Short difficultyID;

    @ColumnDefault("0")
    @Column(name = "MinGear", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.FLOAT)
    private Float minGear;

    @ColumnDefault("'0'")
    @Column(name = "GroupID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Short groupID;

    @ColumnDefault("'0'")
    @Column(name = "OrderIndex", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE)
    private Short orderIndex;

    @ColumnDefault("'0'")
    @Column(name = "RequiredPlayerConditionId", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT)
    private Long requiredPlayerConditionId;

    @ColumnDefault("'0'")
    @Column(name = "TargetLevel", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Short targetLevel;

    @ColumnDefault("'0'")
    @Column(name = "TargetLevelMin", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Short targetLevelMin;

    @ColumnDefault("'0'")
    @Column(name = "TargetLevelMax", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT)
    private Integer targetLevelMax;

    @ColumnDefault("'0'")
    @Column(name = "RandomID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT)
    private Integer randomID;

    @ColumnDefault("'0'")
    @Column(name = "ScenarioID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 22, type = Db2Type.SHORT)
    private Integer scenarioID;

    @ColumnDefault("'0'")
    @Column(name = "FinalEncounterID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 23, type = Db2Type.SHORT)
    private Integer finalEncounterID;

    @ColumnDefault("'0'")
    @Column(name = "CountTank", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Short countTank;

    @ColumnDefault("'0'")
    @Column(name = "CountHealer", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Short countHealer;

    @ColumnDefault("'0'")
    @Column(name = "CountDamage", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE)
    private Short countDamage;

    @ColumnDefault("'0'")
    @Column(name = "MinCountTank", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 27, type = Db2Type.BYTE)
    private Short minCountTank;

    @ColumnDefault("'0'")
    @Column(name = "MinCountHealer", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE)
    private Short minCountHealer;

    @ColumnDefault("'0'")
    @Column(name = "MinCountDamage", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 29, type = Db2Type.BYTE)
    private Short minCountDamage;

    @ColumnDefault("'0'")
    @Column(name = "BonusReputationAmount", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 30, type = Db2Type.SHORT)
    private Integer bonusReputationAmount;

    @ColumnDefault("'0'")
    @Column(name = "MentorItemLevel", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 31, type = Db2Type.SHORT)
    private Integer mentorItemLevel;

    @ColumnDefault("'0'")
    @Column(name = "MentorCharLevel", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 32, type = Db2Type.BYTE)
    private Short mentorCharLevel;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    @Db2Field(fieldIndex = 33, type = Db2Type.INT, signed = true)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    @Db2Field(fieldIndex = 34, type = Db2Type.INT, signed = true)
    private Integer flags2;

}