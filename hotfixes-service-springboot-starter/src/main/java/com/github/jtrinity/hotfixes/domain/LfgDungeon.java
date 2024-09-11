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
@Table(name = "lfg_dungeons")
public class LfgDungeon {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @Lob
    @Column(name = "Description")
    private String description;

    @ColumnDefault("'0'")
    @Column(name = "MinLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short minLevel;

    @ColumnDefault("'0'")
    @Column(name = "MaxLevel", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxLevel;

    @ColumnDefault("'0'")
    @Column(name = "TypeID", columnDefinition = "tinyint UNSIGNED not null")
    private Short typeID;

    @ColumnDefault("'0'")
    @Column(name = "Subtype", columnDefinition = "tinyint UNSIGNED not null")
    private Short subtype;

    @ColumnDefault("0")
    @Column(name = "Faction", nullable = false)
    private Byte faction;

    @ColumnDefault("0")
    @Column(name = "IconTextureFileID", nullable = false)
    private Integer iconTextureFileID;

    @ColumnDefault("0")
    @Column(name = "RewardsBgTextureFileID", nullable = false)
    private Integer rewardsBgTextureFileID;

    @ColumnDefault("0")
    @Column(name = "PopupBgTextureFileID", nullable = false)
    private Integer popupBgTextureFileID;

    @ColumnDefault("'0'")
    @Column(name = "ExpansionLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short expansionLevel;

    @ColumnDefault("0")
    @Column(name = "MapID", nullable = false)
    private Short mapID;

    @ColumnDefault("'0'")
    @Column(name = "DifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    private Short difficultyID;

    @ColumnDefault("0")
    @Column(name = "MinGear", nullable = false)
    private Float minGear;

    @ColumnDefault("'0'")
    @Column(name = "GroupID", columnDefinition = "tinyint UNSIGNED not null")
    private Short groupID;

    @ColumnDefault("'0'")
    @Column(name = "OrderIndex", columnDefinition = "tinyint UNSIGNED not null")
    private Short orderIndex;

    @ColumnDefault("'0'")
    @Column(name = "RequiredPlayerConditionId", columnDefinition = "int UNSIGNED not null")
    private Long requiredPlayerConditionId;

    @ColumnDefault("'0'")
    @Column(name = "TargetLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short targetLevel;

    @ColumnDefault("'0'")
    @Column(name = "TargetLevelMin", columnDefinition = "tinyint UNSIGNED not null")
    private Short targetLevelMin;

    @ColumnDefault("'0'")
    @Column(name = "TargetLevelMax", columnDefinition = "smallint UNSIGNED not null")
    private Integer targetLevelMax;

    @ColumnDefault("'0'")
    @Column(name = "RandomID", columnDefinition = "smallint UNSIGNED not null")
    private Integer randomID;

    @ColumnDefault("'0'")
    @Column(name = "ScenarioID", columnDefinition = "smallint UNSIGNED not null")
    private Integer scenarioID;

    @ColumnDefault("'0'")
    @Column(name = "FinalEncounterID", columnDefinition = "smallint UNSIGNED not null")
    private Integer finalEncounterID;

    @ColumnDefault("'0'")
    @Column(name = "CountTank", columnDefinition = "tinyint UNSIGNED not null")
    private Short countTank;

    @ColumnDefault("'0'")
    @Column(name = "CountHealer", columnDefinition = "tinyint UNSIGNED not null")
    private Short countHealer;

    @ColumnDefault("'0'")
    @Column(name = "CountDamage", columnDefinition = "tinyint UNSIGNED not null")
    private Short countDamage;

    @ColumnDefault("'0'")
    @Column(name = "MinCountTank", columnDefinition = "tinyint UNSIGNED not null")
    private Short minCountTank;

    @ColumnDefault("'0'")
    @Column(name = "MinCountHealer", columnDefinition = "tinyint UNSIGNED not null")
    private Short minCountHealer;

    @ColumnDefault("'0'")
    @Column(name = "MinCountDamage", columnDefinition = "tinyint UNSIGNED not null")
    private Short minCountDamage;

    @ColumnDefault("'0'")
    @Column(name = "BonusReputationAmount", columnDefinition = "smallint UNSIGNED not null")
    private Integer bonusReputationAmount;

    @ColumnDefault("'0'")
    @Column(name = "MentorItemLevel", columnDefinition = "smallint UNSIGNED not null")
    private Integer mentorItemLevel;

    @ColumnDefault("'0'")
    @Column(name = "MentorCharLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short mentorCharLevel;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    private Integer flags2;

}