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
@Table(name = "player_condition")
@Db2File(name = "PlayerCondition.db2", fileDataId = 1045411, layoutHash = 0x47B4D68A, indexField = 2)
public class PlayerCondition {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "RaceMask", nullable = false)
    @Db2Field(fieldIndex = 0, type = Db2Type.LONG, signed = true)
    private Long raceMask;

    @Lob
    @Column(name = "FailureDescription")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String failureDescription;

    @ColumnDefault("'0'")
    @Column(name = "MinLevel", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Integer minLevel;

    @ColumnDefault("'0'")
    @Column(name = "MaxLevel", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Integer maxLevel;

    @ColumnDefault("0")
    @Column(name = "ClassMask", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer classMask;

    @ColumnDefault("'0'")
    @Column(name = "SkillLogic", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Long skillLogic;

    @ColumnDefault("'0'")
    @Column(name = "LanguageID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Short languageID;

    @ColumnDefault("'0'")
    @Column(name = "MinLanguage", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Short minLanguage;

    @ColumnDefault("0")
    @Column(name = "MaxLanguage", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer maxLanguage;

    @ColumnDefault("'0'")
    @Column(name = "MaxFactionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Integer maxFactionID;

    @ColumnDefault("'0'")
    @Column(name = "MaxReputation", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Short maxReputation;

    @ColumnDefault("'0'")
    @Column(name = "ReputationLogic", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Long reputationLogic;

    @ColumnDefault("0")
    @Column(name = "CurrentPvpFaction", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE, signed = true)
    private Byte currentPvpFaction;

    @ColumnDefault("'0'")
    @Column(name = "PvpMedal", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE)
    private Short pvpMedal;

    @ColumnDefault("'0'")
    @Column(name = "PrevQuestLogic", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Long prevQuestLogic;

    @ColumnDefault("'0'")
    @Column(name = "CurrQuestLogic", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Long currQuestLogic;

    @ColumnDefault("'0'")
    @Column(name = "CurrentCompletedQuestLogic", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT)
    private Long currentCompletedQuestLogic;

    @ColumnDefault("'0'")
    @Column(name = "SpellLogic", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT)
    private Long spellLogic;

    @ColumnDefault("'0'")
    @Column(name = "ItemLogic", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.INT)
    private Long itemLogic;

    @ColumnDefault("'0'")
    @Column(name = "ItemFlags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Short itemFlags;

    @ColumnDefault("'0'")
    @Column(name = "AuraSpellLogic", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.INT)
    private Long auraSpellLogic;

    @ColumnDefault("'0'")
    @Column(name = "WorldStateExpressionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 22, type = Db2Type.SHORT)
    private Integer worldStateExpressionID;

    @ColumnDefault("'0'")
    @Column(name = "WeatherID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Short weatherID;

    @ColumnDefault("'0'")
    @Column(name = "PartyStatus", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Short partyStatus;

    @ColumnDefault("'0'")
    @Column(name = "LifetimeMaxPVPRank", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Short lifetimeMaxPVPRank;

    @ColumnDefault("'0'")
    @Column(name = "AchievementLogic", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 26, type = Db2Type.INT)
    private Long achievementLogic;

    @ColumnDefault("0")
    @Column(name = "Gender", nullable = false)
    @Db2Field(fieldIndex = 27, type = Db2Type.BYTE, signed = true)
    private Byte gender;

    @ColumnDefault("0")
    @Column(name = "NativeGender", nullable = false)
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE, signed = true)
    private Byte nativeGender;

    @ColumnDefault("'0'")
    @Column(name = "AreaLogic", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 29, type = Db2Type.INT)
    private Long areaLogic;

    @ColumnDefault("'0'")
    @Column(name = "LfgLogic", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 30, type = Db2Type.INT)
    private Long lfgLogic;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyLogic", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 31, type = Db2Type.INT)
    private Long currencyLogic;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 32, type = Db2Type.INT)
    private Long questKillID;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillLogic", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 33, type = Db2Type.INT)
    private Long questKillLogic;

    @ColumnDefault("0")
    @Column(name = "MinExpansionLevel", nullable = false)
    @Db2Field(fieldIndex = 34, type = Db2Type.BYTE, signed = true)
    private Byte minExpansionLevel;

    @ColumnDefault("0")
    @Column(name = "MaxExpansionLevel", nullable = false)
    @Db2Field(fieldIndex = 35, type = Db2Type.BYTE, signed = true)
    private Byte maxExpansionLevel;

    @ColumnDefault("0")
    @Column(name = "MinAvgItemLevel", nullable = false)
    @Db2Field(fieldIndex = 36, type = Db2Type.INT, signed = true)
    private Integer minAvgItemLevel;

    @ColumnDefault("0")
    @Column(name = "MaxAvgItemLevel", nullable = false)
    @Db2Field(fieldIndex = 37, type = Db2Type.INT, signed = true)
    private Integer maxAvgItemLevel;

    @ColumnDefault("'0'")
    @Column(name = "MinAvgEquippedItemLevel", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 38, type = Db2Type.SHORT)
    private Integer minAvgEquippedItemLevel;

    @ColumnDefault("'0'")
    @Column(name = "MaxAvgEquippedItemLevel", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 39, type = Db2Type.SHORT)
    private Integer maxAvgEquippedItemLevel;

    @ColumnDefault("0")
    @Column(name = "PhaseUseFlags", nullable = false)
    @Db2Field(fieldIndex = 40, type = Db2Type.INT, signed = true)
    private Integer phaseUseFlags;

    @ColumnDefault("'0'")
    @Column(name = "PhaseID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 41, type = Db2Type.SHORT)
    private Integer phaseID;

    @ColumnDefault("'0'")
    @Column(name = "PhaseGroupID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 42, type = Db2Type.INT)
    private Long phaseGroupID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 43, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "ChrSpecializationIndex", nullable = false)
    @Db2Field(fieldIndex = 44, type = Db2Type.BYTE, signed = true)
    private Byte chrSpecializationIndex;

    @ColumnDefault("0")
    @Column(name = "ChrSpecializationRole", nullable = false)
    @Db2Field(fieldIndex = 45, type = Db2Type.BYTE, signed = true)
    private Byte chrSpecializationRole;

    @ColumnDefault("'0'")
    @Column(name = "ModifierTreeID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 46, type = Db2Type.INT)
    private Long modifierTreeID;

    @ColumnDefault("0")
    @Column(name = "PowerType", nullable = false)
    @Db2Field(fieldIndex = 47, type = Db2Type.BYTE, signed = true)
    private Byte powerType;

    @ColumnDefault("'0'")
    @Column(name = "PowerTypeComp", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 48, type = Db2Type.BYTE)
    private Short powerTypeComp;

    @ColumnDefault("'0'")
    @Column(name = "PowerTypeValue", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 49, type = Db2Type.BYTE)
    private Short powerTypeValue;

    @ColumnDefault("0")
    @Column(name = "WeaponSubclassMask", nullable = false)
    @Db2Field(fieldIndex = 50, type = Db2Type.INT, signed = true)
    private Integer weaponSubclassMask;

    @ColumnDefault("'0'")
    @Column(name = "MaxGuildLevel", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 51, type = Db2Type.BYTE)
    private Short maxGuildLevel;

    @ColumnDefault("'0'")
    @Column(name = "MinGuildLevel", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 52, type = Db2Type.BYTE)
    private Short minGuildLevel;

    @ColumnDefault("0")
    @Column(name = "MaxExpansionTier", nullable = false)
    @Db2Field(fieldIndex = 53, type = Db2Type.BYTE, signed = true)
    private Byte maxExpansionTier;

    @ColumnDefault("0")
    @Column(name = "MinExpansionTier", nullable = false)
    @Db2Field(fieldIndex = 54, type = Db2Type.BYTE, signed = true)
    private Byte minExpansionTier;

    @ColumnDefault("'0'")
    @Column(name = "MinPVPRank", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 55, type = Db2Type.BYTE)
    private Short minPVPRank;

    @ColumnDefault("'0'")
    @Column(name = "MaxPVPRank", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 56, type = Db2Type.BYTE)
    private Short maxPVPRank;

    @ColumnDefault("'0'")
    @Column(name = "SkillID1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 57, type = Db2Type.SHORT)
    private Integer skillID1;

    @ColumnDefault("'0'")
    @Column(name = "SkillID2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 58, type = Db2Type.SHORT)
    private Integer skillID2;

    @ColumnDefault("'0'")
    @Column(name = "SkillID3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 59, type = Db2Type.SHORT)
    private Integer skillID3;

    @ColumnDefault("'0'")
    @Column(name = "SkillID4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 60, type = Db2Type.SHORT)
    private Integer skillID4;

    @ColumnDefault("'0'")
    @Column(name = "MinSkill1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 61, type = Db2Type.SHORT)
    private Integer minSkill1;

    @ColumnDefault("'0'")
    @Column(name = "MinSkill2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 62, type = Db2Type.SHORT)
    private Integer minSkill2;

    @ColumnDefault("'0'")
    @Column(name = "MinSkill3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 63, type = Db2Type.SHORT)
    private Integer minSkill3;

    @ColumnDefault("'0'")
    @Column(name = "MinSkill4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 64, type = Db2Type.SHORT)
    private Integer minSkill4;

    @ColumnDefault("'0'")
    @Column(name = "MaxSkill1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 65, type = Db2Type.SHORT)
    private Integer maxSkill1;

    @ColumnDefault("'0'")
    @Column(name = "MaxSkill2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 66, type = Db2Type.SHORT)
    private Integer maxSkill2;

    @ColumnDefault("'0'")
    @Column(name = "MaxSkill3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 67, type = Db2Type.SHORT)
    private Integer maxSkill3;

    @ColumnDefault("'0'")
    @Column(name = "MaxSkill4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 68, type = Db2Type.SHORT)
    private Integer maxSkill4;

    @ColumnDefault("'0'")
    @Column(name = "MinFactionID1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 69, type = Db2Type.INT)
    private Long minFactionID1;

    @ColumnDefault("'0'")
    @Column(name = "MinFactionID2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 70, type = Db2Type.INT)
    private Long minFactionID2;

    @ColumnDefault("'0'")
    @Column(name = "MinFactionID3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 71, type = Db2Type.INT)
    private Long minFactionID3;

    @ColumnDefault("'0'")
    @Column(name = "MinReputation1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 72, type = Db2Type.BYTE)
    private Short minReputation1;

    @ColumnDefault("'0'")
    @Column(name = "MinReputation2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 73, type = Db2Type.BYTE)
    private Short minReputation2;

    @ColumnDefault("'0'")
    @Column(name = "MinReputation3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 74, type = Db2Type.BYTE)
    private Short minReputation3;

    @ColumnDefault("'0'")
    @Column(name = "PrevQuestID1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 75, type = Db2Type.INT)
    private Long prevQuestID1;

    @ColumnDefault("'0'")
    @Column(name = "PrevQuestID2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 76, type = Db2Type.INT)
    private Long prevQuestID2;

    @ColumnDefault("'0'")
    @Column(name = "PrevQuestID3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 77, type = Db2Type.INT)
    private Long prevQuestID3;

    @ColumnDefault("'0'")
    @Column(name = "PrevQuestID4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 78, type = Db2Type.INT)
    private Long prevQuestID4;

    @ColumnDefault("'0'")
    @Column(name = "CurrQuestID1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 79, type = Db2Type.INT)
    private Long currQuestID1;

    @ColumnDefault("'0'")
    @Column(name = "CurrQuestID2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 80, type = Db2Type.INT)
    private Long currQuestID2;

    @ColumnDefault("'0'")
    @Column(name = "CurrQuestID3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 81, type = Db2Type.INT)
    private Long currQuestID3;

    @ColumnDefault("'0'")
    @Column(name = "CurrQuestID4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 82, type = Db2Type.INT)
    private Long currQuestID4;

    @ColumnDefault("'0'")
    @Column(name = "CurrentCompletedQuestID1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 83, type = Db2Type.INT)
    private Long currentCompletedQuestID1;

    @ColumnDefault("'0'")
    @Column(name = "CurrentCompletedQuestID2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 84, type = Db2Type.INT)
    private Long currentCompletedQuestID2;

    @ColumnDefault("'0'")
    @Column(name = "CurrentCompletedQuestID3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 85, type = Db2Type.INT)
    private Long currentCompletedQuestID3;

    @ColumnDefault("'0'")
    @Column(name = "CurrentCompletedQuestID4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 86, type = Db2Type.INT)
    private Long currentCompletedQuestID4;

    @ColumnDefault("0")
    @Column(name = "SpellID1", nullable = false)
    @Db2Field(fieldIndex = 87, type = Db2Type.INT, signed = true)
    private Integer spellID1;

    @ColumnDefault("0")
    @Column(name = "SpellID2", nullable = false)
    @Db2Field(fieldIndex = 88, type = Db2Type.INT, signed = true)
    private Integer spellID2;

    @ColumnDefault("0")
    @Column(name = "SpellID3", nullable = false)
    @Db2Field(fieldIndex = 89, type = Db2Type.INT, signed = true)
    private Integer spellID3;

    @ColumnDefault("0")
    @Column(name = "SpellID4", nullable = false)
    @Db2Field(fieldIndex = 90, type = Db2Type.INT, signed = true)
    private Integer spellID4;

    @ColumnDefault("0")
    @Column(name = "ItemID1", nullable = false)
    @Db2Field(fieldIndex = 91, type = Db2Type.INT, signed = true)
    private Integer itemID1;

    @ColumnDefault("0")
    @Column(name = "ItemID2", nullable = false)
    @Db2Field(fieldIndex = 92, type = Db2Type.INT, signed = true)
    private Integer itemID2;

    @ColumnDefault("0")
    @Column(name = "ItemID3", nullable = false)
    @Db2Field(fieldIndex = 93, type = Db2Type.INT, signed = true)
    private Integer itemID3;

    @ColumnDefault("0")
    @Column(name = "ItemID4", nullable = false)
    @Db2Field(fieldIndex = 94, type = Db2Type.INT, signed = true)
    private Integer itemID4;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 95, type = Db2Type.INT)
    private Long itemCount1;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 96, type = Db2Type.INT)
    private Long itemCount2;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 97, type = Db2Type.INT)
    private Long itemCount3;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 98, type = Db2Type.INT)
    private Long itemCount4;

    @ColumnDefault("'0'")
    @Column(name = "Explored1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 99, type = Db2Type.SHORT)
    private Integer explored1;

    @ColumnDefault("'0'")
    @Column(name = "Explored2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 100, type = Db2Type.SHORT)
    private Integer explored2;

    @ColumnDefault("'0'")
    @Column(name = "Time1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 101, type = Db2Type.INT)
    private Long time1;

    @ColumnDefault("'0'")
    @Column(name = "Time2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 102, type = Db2Type.INT)
    private Long time2;

    @ColumnDefault("0")
    @Column(name = "AuraSpellID1", nullable = false)
    @Db2Field(fieldIndex = 103, type = Db2Type.INT, signed = true)
    private Integer auraSpellID1;

    @ColumnDefault("0")
    @Column(name = "AuraSpellID2", nullable = false)
    @Db2Field(fieldIndex = 104, type = Db2Type.INT, signed = true)
    private Integer auraSpellID2;

    @ColumnDefault("0")
    @Column(name = "AuraSpellID3", nullable = false)
    @Db2Field(fieldIndex = 105, type = Db2Type.INT, signed = true)
    private Integer auraSpellID3;

    @ColumnDefault("0")
    @Column(name = "AuraSpellID4", nullable = false)
    @Db2Field(fieldIndex = 106, type = Db2Type.INT, signed = true)
    private Integer auraSpellID4;

    @ColumnDefault("'0'")
    @Column(name = "AuraStacks1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 107, type = Db2Type.BYTE)
    private Short auraStacks1;

    @ColumnDefault("'0'")
    @Column(name = "AuraStacks2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 108, type = Db2Type.BYTE)
    private Short auraStacks2;

    @ColumnDefault("'0'")
    @Column(name = "AuraStacks3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 109, type = Db2Type.BYTE)
    private Short auraStacks3;

    @ColumnDefault("'0'")
    @Column(name = "AuraStacks4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 110, type = Db2Type.BYTE)
    private Short auraStacks4;

    @ColumnDefault("'0'")
    @Column(name = "Achievement1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 111, type = Db2Type.SHORT)
    private Integer achievement1;

    @ColumnDefault("'0'")
    @Column(name = "Achievement2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 112, type = Db2Type.SHORT)
    private Integer achievement2;

    @ColumnDefault("'0'")
    @Column(name = "Achievement3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 113, type = Db2Type.SHORT)
    private Integer achievement3;

    @ColumnDefault("'0'")
    @Column(name = "Achievement4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 114, type = Db2Type.SHORT)
    private Integer achievement4;

    @ColumnDefault("'0'")
    @Column(name = "AreaID1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 115, type = Db2Type.SHORT)
    private Integer areaID1;

    @ColumnDefault("'0'")
    @Column(name = "AreaID2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 116, type = Db2Type.SHORT)
    private Integer areaID2;

    @ColumnDefault("'0'")
    @Column(name = "AreaID3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 117, type = Db2Type.SHORT)
    private Integer areaID3;

    @ColumnDefault("'0'")
    @Column(name = "AreaID4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 118, type = Db2Type.SHORT)
    private Integer areaID4;

    @ColumnDefault("'0'")
    @Column(name = "LfgStatus1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 119, type = Db2Type.BYTE)
    private Short lfgStatus1;

    @ColumnDefault("'0'")
    @Column(name = "LfgStatus2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 120, type = Db2Type.BYTE)
    private Short lfgStatus2;

    @ColumnDefault("'0'")
    @Column(name = "LfgStatus3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 121, type = Db2Type.BYTE)
    private Short lfgStatus3;

    @ColumnDefault("'0'")
    @Column(name = "LfgStatus4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 122, type = Db2Type.BYTE)
    private Short lfgStatus4;

    @ColumnDefault("'0'")
    @Column(name = "LfgCompare1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 123, type = Db2Type.BYTE)
    private Short lfgCompare1;

    @ColumnDefault("'0'")
    @Column(name = "LfgCompare2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 124, type = Db2Type.BYTE)
    private Short lfgCompare2;

    @ColumnDefault("'0'")
    @Column(name = "LfgCompare3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 125, type = Db2Type.BYTE)
    private Short lfgCompare3;

    @ColumnDefault("'0'")
    @Column(name = "LfgCompare4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 126, type = Db2Type.BYTE)
    private Short lfgCompare4;

    @ColumnDefault("'0'")
    @Column(name = "LfgValue1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 127, type = Db2Type.INT)
    private Long lfgValue1;

    @ColumnDefault("'0'")
    @Column(name = "LfgValue2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 128, type = Db2Type.INT)
    private Long lfgValue2;

    @ColumnDefault("'0'")
    @Column(name = "LfgValue3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 129, type = Db2Type.INT)
    private Long lfgValue3;

    @ColumnDefault("'0'")
    @Column(name = "LfgValue4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 130, type = Db2Type.INT)
    private Long lfgValue4;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 131, type = Db2Type.INT)
    private Long currencyID1;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 132, type = Db2Type.INT)
    private Long currencyID2;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 133, type = Db2Type.INT)
    private Long currencyID3;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 134, type = Db2Type.INT)
    private Long currencyID4;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 135, type = Db2Type.INT)
    private Long currencyCount1;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 136, type = Db2Type.INT)
    private Long currencyCount2;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 137, type = Db2Type.INT)
    private Long currencyCount3;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 138, type = Db2Type.INT)
    private Long currencyCount4;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillMonster1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 139, type = Db2Type.INT)
    private Long questKillMonster1;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillMonster2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 140, type = Db2Type.INT)
    private Long questKillMonster2;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillMonster3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 141, type = Db2Type.INT)
    private Long questKillMonster3;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillMonster4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 142, type = Db2Type.INT)
    private Long questKillMonster4;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillMonster5", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 143, type = Db2Type.INT)
    private Long questKillMonster5;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillMonster6", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 144, type = Db2Type.INT)
    private Long questKillMonster6;

    @ColumnDefault("0")
    @Column(name = "MovementFlags1", nullable = false)
    @Db2Field(fieldIndex = 145, type = Db2Type.INT, signed = true)
    private Integer movementFlags1;

    @ColumnDefault("0")
    @Column(name = "MovementFlags2", nullable = false)
    @Db2Field(fieldIndex = 146, type = Db2Type.INT, signed = true)
    private Integer movementFlags2;

}