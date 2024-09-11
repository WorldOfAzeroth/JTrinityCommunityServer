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
@Table(name = "player_condition")
public class PlayerCondition {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "RaceMask", nullable = false)
    private Long raceMask;

    @Lob
    @Column(name = "FailureDescription")
    private String failureDescription;

    @ColumnDefault("'0'")
    @Column(name = "MinLevel", columnDefinition = "smallint UNSIGNED not null")
    private Integer minLevel;

    @ColumnDefault("'0'")
    @Column(name = "MaxLevel", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxLevel;

    @ColumnDefault("0")
    @Column(name = "ClassMask", nullable = false)
    private Integer classMask;

    @ColumnDefault("'0'")
    @Column(name = "SkillLogic", columnDefinition = "int UNSIGNED not null")
    private Long skillLogic;

    @ColumnDefault("'0'")
    @Column(name = "LanguageID", columnDefinition = "tinyint UNSIGNED not null")
    private Short languageID;

    @ColumnDefault("'0'")
    @Column(name = "MinLanguage", columnDefinition = "tinyint UNSIGNED not null")
    private Short minLanguage;

    @ColumnDefault("0")
    @Column(name = "MaxLanguage", nullable = false)
    private Integer maxLanguage;

    @ColumnDefault("'0'")
    @Column(name = "MaxFactionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxFactionID;

    @ColumnDefault("'0'")
    @Column(name = "MaxReputation", columnDefinition = "tinyint UNSIGNED not null")
    private Short maxReputation;

    @ColumnDefault("'0'")
    @Column(name = "ReputationLogic", columnDefinition = "int UNSIGNED not null")
    private Long reputationLogic;

    @ColumnDefault("0")
    @Column(name = "CurrentPvpFaction", nullable = false)
    private Byte currentPvpFaction;

    @ColumnDefault("'0'")
    @Column(name = "PvpMedal", columnDefinition = "tinyint UNSIGNED not null")
    private Short pvpMedal;

    @ColumnDefault("'0'")
    @Column(name = "PrevQuestLogic", columnDefinition = "int UNSIGNED not null")
    private Long prevQuestLogic;

    @ColumnDefault("'0'")
    @Column(name = "CurrQuestLogic", columnDefinition = "int UNSIGNED not null")
    private Long currQuestLogic;

    @ColumnDefault("'0'")
    @Column(name = "CurrentCompletedQuestLogic", columnDefinition = "int UNSIGNED not null")
    private Long currentCompletedQuestLogic;

    @ColumnDefault("'0'")
    @Column(name = "SpellLogic", columnDefinition = "int UNSIGNED not null")
    private Long spellLogic;

    @ColumnDefault("'0'")
    @Column(name = "ItemLogic", columnDefinition = "int UNSIGNED not null")
    private Long itemLogic;

    @ColumnDefault("'0'")
    @Column(name = "ItemFlags", columnDefinition = "tinyint UNSIGNED not null")
    private Short itemFlags;

    @ColumnDefault("'0'")
    @Column(name = "AuraSpellLogic", columnDefinition = "int UNSIGNED not null")
    private Long auraSpellLogic;

    @ColumnDefault("'0'")
    @Column(name = "WorldStateExpressionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer worldStateExpressionID;

    @ColumnDefault("'0'")
    @Column(name = "WeatherID", columnDefinition = "tinyint UNSIGNED not null")
    private Short weatherID;

    @ColumnDefault("'0'")
    @Column(name = "PartyStatus", columnDefinition = "tinyint UNSIGNED not null")
    private Short partyStatus;

    @ColumnDefault("'0'")
    @Column(name = "LifetimeMaxPVPRank", columnDefinition = "tinyint UNSIGNED not null")
    private Short lifetimeMaxPVPRank;

    @ColumnDefault("'0'")
    @Column(name = "AchievementLogic", columnDefinition = "int UNSIGNED not null")
    private Long achievementLogic;

    @ColumnDefault("0")
    @Column(name = "Gender", nullable = false)
    private Byte gender;

    @ColumnDefault("0")
    @Column(name = "NativeGender", nullable = false)
    private Byte nativeGender;

    @ColumnDefault("'0'")
    @Column(name = "AreaLogic", columnDefinition = "int UNSIGNED not null")
    private Long areaLogic;

    @ColumnDefault("'0'")
    @Column(name = "LfgLogic", columnDefinition = "int UNSIGNED not null")
    private Long lfgLogic;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyLogic", columnDefinition = "int UNSIGNED not null")
    private Long currencyLogic;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillID", columnDefinition = "int UNSIGNED not null")
    private Long questKillID;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillLogic", columnDefinition = "int UNSIGNED not null")
    private Long questKillLogic;

    @ColumnDefault("0")
    @Column(name = "MinExpansionLevel", nullable = false)
    private Byte minExpansionLevel;

    @ColumnDefault("0")
    @Column(name = "MaxExpansionLevel", nullable = false)
    private Byte maxExpansionLevel;

    @ColumnDefault("0")
    @Column(name = "MinAvgItemLevel", nullable = false)
    private Integer minAvgItemLevel;

    @ColumnDefault("0")
    @Column(name = "MaxAvgItemLevel", nullable = false)
    private Integer maxAvgItemLevel;

    @ColumnDefault("'0'")
    @Column(name = "MinAvgEquippedItemLevel", columnDefinition = "smallint UNSIGNED not null")
    private Integer minAvgEquippedItemLevel;

    @ColumnDefault("'0'")
    @Column(name = "MaxAvgEquippedItemLevel", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxAvgEquippedItemLevel;

    @ColumnDefault("0")
    @Column(name = "PhaseUseFlags", nullable = false)
    private Integer phaseUseFlags;

    @ColumnDefault("'0'")
    @Column(name = "PhaseID", columnDefinition = "smallint UNSIGNED not null")
    private Integer phaseID;

    @ColumnDefault("'0'")
    @Column(name = "PhaseGroupID", columnDefinition = "int UNSIGNED not null")
    private Long phaseGroupID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "ChrSpecializationIndex", nullable = false)
    private Byte chrSpecializationIndex;

    @ColumnDefault("0")
    @Column(name = "ChrSpecializationRole", nullable = false)
    private Byte chrSpecializationRole;

    @ColumnDefault("'0'")
    @Column(name = "ModifierTreeID", columnDefinition = "int UNSIGNED not null")
    private Long modifierTreeID;

    @ColumnDefault("0")
    @Column(name = "PowerType", nullable = false)
    private Byte powerType;

    @ColumnDefault("'0'")
    @Column(name = "PowerTypeComp", columnDefinition = "tinyint UNSIGNED not null")
    private Short powerTypeComp;

    @ColumnDefault("'0'")
    @Column(name = "PowerTypeValue", columnDefinition = "tinyint UNSIGNED not null")
    private Short powerTypeValue;

    @ColumnDefault("0")
    @Column(name = "WeaponSubclassMask", nullable = false)
    private Integer weaponSubclassMask;

    @ColumnDefault("'0'")
    @Column(name = "MaxGuildLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short maxGuildLevel;

    @ColumnDefault("'0'")
    @Column(name = "MinGuildLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short minGuildLevel;

    @ColumnDefault("0")
    @Column(name = "MaxExpansionTier", nullable = false)
    private Byte maxExpansionTier;

    @ColumnDefault("0")
    @Column(name = "MinExpansionTier", nullable = false)
    private Byte minExpansionTier;

    @ColumnDefault("'0'")
    @Column(name = "MinPVPRank", columnDefinition = "tinyint UNSIGNED not null")
    private Short minPVPRank;

    @ColumnDefault("'0'")
    @Column(name = "MaxPVPRank", columnDefinition = "tinyint UNSIGNED not null")
    private Short maxPVPRank;

    @ColumnDefault("'0'")
    @Column(name = "SkillID1", columnDefinition = "smallint UNSIGNED not null")
    private Integer skillID1;

    @ColumnDefault("'0'")
    @Column(name = "SkillID2", columnDefinition = "smallint UNSIGNED not null")
    private Integer skillID2;

    @ColumnDefault("'0'")
    @Column(name = "SkillID3", columnDefinition = "smallint UNSIGNED not null")
    private Integer skillID3;

    @ColumnDefault("'0'")
    @Column(name = "SkillID4", columnDefinition = "smallint UNSIGNED not null")
    private Integer skillID4;

    @ColumnDefault("'0'")
    @Column(name = "MinSkill1", columnDefinition = "smallint UNSIGNED not null")
    private Integer minSkill1;

    @ColumnDefault("'0'")
    @Column(name = "MinSkill2", columnDefinition = "smallint UNSIGNED not null")
    private Integer minSkill2;

    @ColumnDefault("'0'")
    @Column(name = "MinSkill3", columnDefinition = "smallint UNSIGNED not null")
    private Integer minSkill3;

    @ColumnDefault("'0'")
    @Column(name = "MinSkill4", columnDefinition = "smallint UNSIGNED not null")
    private Integer minSkill4;

    @ColumnDefault("'0'")
    @Column(name = "MaxSkill1", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxSkill1;

    @ColumnDefault("'0'")
    @Column(name = "MaxSkill2", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxSkill2;

    @ColumnDefault("'0'")
    @Column(name = "MaxSkill3", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxSkill3;

    @ColumnDefault("'0'")
    @Column(name = "MaxSkill4", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxSkill4;

    @ColumnDefault("'0'")
    @Column(name = "MinFactionID1", columnDefinition = "int UNSIGNED not null")
    private Long minFactionID1;

    @ColumnDefault("'0'")
    @Column(name = "MinFactionID2", columnDefinition = "int UNSIGNED not null")
    private Long minFactionID2;

    @ColumnDefault("'0'")
    @Column(name = "MinFactionID3", columnDefinition = "int UNSIGNED not null")
    private Long minFactionID3;

    @ColumnDefault("'0'")
    @Column(name = "MinReputation1", columnDefinition = "tinyint UNSIGNED not null")
    private Short minReputation1;

    @ColumnDefault("'0'")
    @Column(name = "MinReputation2", columnDefinition = "tinyint UNSIGNED not null")
    private Short minReputation2;

    @ColumnDefault("'0'")
    @Column(name = "MinReputation3", columnDefinition = "tinyint UNSIGNED not null")
    private Short minReputation3;

    @ColumnDefault("'0'")
    @Column(name = "PrevQuestID1", columnDefinition = "int UNSIGNED not null")
    private Long prevQuestID1;

    @ColumnDefault("'0'")
    @Column(name = "PrevQuestID2", columnDefinition = "int UNSIGNED not null")
    private Long prevQuestID2;

    @ColumnDefault("'0'")
    @Column(name = "PrevQuestID3", columnDefinition = "int UNSIGNED not null")
    private Long prevQuestID3;

    @ColumnDefault("'0'")
    @Column(name = "PrevQuestID4", columnDefinition = "int UNSIGNED not null")
    private Long prevQuestID4;

    @ColumnDefault("'0'")
    @Column(name = "CurrQuestID1", columnDefinition = "int UNSIGNED not null")
    private Long currQuestID1;

    @ColumnDefault("'0'")
    @Column(name = "CurrQuestID2", columnDefinition = "int UNSIGNED not null")
    private Long currQuestID2;

    @ColumnDefault("'0'")
    @Column(name = "CurrQuestID3", columnDefinition = "int UNSIGNED not null")
    private Long currQuestID3;

    @ColumnDefault("'0'")
    @Column(name = "CurrQuestID4", columnDefinition = "int UNSIGNED not null")
    private Long currQuestID4;

    @ColumnDefault("'0'")
    @Column(name = "CurrentCompletedQuestID1", columnDefinition = "int UNSIGNED not null")
    private Long currentCompletedQuestID1;

    @ColumnDefault("'0'")
    @Column(name = "CurrentCompletedQuestID2", columnDefinition = "int UNSIGNED not null")
    private Long currentCompletedQuestID2;

    @ColumnDefault("'0'")
    @Column(name = "CurrentCompletedQuestID3", columnDefinition = "int UNSIGNED not null")
    private Long currentCompletedQuestID3;

    @ColumnDefault("'0'")
    @Column(name = "CurrentCompletedQuestID4", columnDefinition = "int UNSIGNED not null")
    private Long currentCompletedQuestID4;

    @ColumnDefault("0")
    @Column(name = "SpellID1", nullable = false)
    private Integer spellID1;

    @ColumnDefault("0")
    @Column(name = "SpellID2", nullable = false)
    private Integer spellID2;

    @ColumnDefault("0")
    @Column(name = "SpellID3", nullable = false)
    private Integer spellID3;

    @ColumnDefault("0")
    @Column(name = "SpellID4", nullable = false)
    private Integer spellID4;

    @ColumnDefault("0")
    @Column(name = "ItemID1", nullable = false)
    private Integer itemID1;

    @ColumnDefault("0")
    @Column(name = "ItemID2", nullable = false)
    private Integer itemID2;

    @ColumnDefault("0")
    @Column(name = "ItemID3", nullable = false)
    private Integer itemID3;

    @ColumnDefault("0")
    @Column(name = "ItemID4", nullable = false)
    private Integer itemID4;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount1", columnDefinition = "int UNSIGNED not null")
    private Long itemCount1;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount2", columnDefinition = "int UNSIGNED not null")
    private Long itemCount2;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount3", columnDefinition = "int UNSIGNED not null")
    private Long itemCount3;

    @ColumnDefault("'0'")
    @Column(name = "ItemCount4", columnDefinition = "int UNSIGNED not null")
    private Long itemCount4;

    @ColumnDefault("'0'")
    @Column(name = "Explored1", columnDefinition = "smallint UNSIGNED not null")
    private Integer explored1;

    @ColumnDefault("'0'")
    @Column(name = "Explored2", columnDefinition = "smallint UNSIGNED not null")
    private Integer explored2;

    @ColumnDefault("'0'")
    @Column(name = "Time1", columnDefinition = "int UNSIGNED not null")
    private Long time1;

    @ColumnDefault("'0'")
    @Column(name = "Time2", columnDefinition = "int UNSIGNED not null")
    private Long time2;

    @ColumnDefault("0")
    @Column(name = "AuraSpellID1", nullable = false)
    private Integer auraSpellID1;

    @ColumnDefault("0")
    @Column(name = "AuraSpellID2", nullable = false)
    private Integer auraSpellID2;

    @ColumnDefault("0")
    @Column(name = "AuraSpellID3", nullable = false)
    private Integer auraSpellID3;

    @ColumnDefault("0")
    @Column(name = "AuraSpellID4", nullable = false)
    private Integer auraSpellID4;

    @ColumnDefault("'0'")
    @Column(name = "AuraStacks1", columnDefinition = "tinyint UNSIGNED not null")
    private Short auraStacks1;

    @ColumnDefault("'0'")
    @Column(name = "AuraStacks2", columnDefinition = "tinyint UNSIGNED not null")
    private Short auraStacks2;

    @ColumnDefault("'0'")
    @Column(name = "AuraStacks3", columnDefinition = "tinyint UNSIGNED not null")
    private Short auraStacks3;

    @ColumnDefault("'0'")
    @Column(name = "AuraStacks4", columnDefinition = "tinyint UNSIGNED not null")
    private Short auraStacks4;

    @ColumnDefault("'0'")
    @Column(name = "Achievement1", columnDefinition = "smallint UNSIGNED not null")
    private Integer achievement1;

    @ColumnDefault("'0'")
    @Column(name = "Achievement2", columnDefinition = "smallint UNSIGNED not null")
    private Integer achievement2;

    @ColumnDefault("'0'")
    @Column(name = "Achievement3", columnDefinition = "smallint UNSIGNED not null")
    private Integer achievement3;

    @ColumnDefault("'0'")
    @Column(name = "Achievement4", columnDefinition = "smallint UNSIGNED not null")
    private Integer achievement4;

    @ColumnDefault("'0'")
    @Column(name = "AreaID1", columnDefinition = "smallint UNSIGNED not null")
    private Integer areaID1;

    @ColumnDefault("'0'")
    @Column(name = "AreaID2", columnDefinition = "smallint UNSIGNED not null")
    private Integer areaID2;

    @ColumnDefault("'0'")
    @Column(name = "AreaID3", columnDefinition = "smallint UNSIGNED not null")
    private Integer areaID3;

    @ColumnDefault("'0'")
    @Column(name = "AreaID4", columnDefinition = "smallint UNSIGNED not null")
    private Integer areaID4;

    @ColumnDefault("'0'")
    @Column(name = "LfgStatus1", columnDefinition = "tinyint UNSIGNED not null")
    private Short lfgStatus1;

    @ColumnDefault("'0'")
    @Column(name = "LfgStatus2", columnDefinition = "tinyint UNSIGNED not null")
    private Short lfgStatus2;

    @ColumnDefault("'0'")
    @Column(name = "LfgStatus3", columnDefinition = "tinyint UNSIGNED not null")
    private Short lfgStatus3;

    @ColumnDefault("'0'")
    @Column(name = "LfgStatus4", columnDefinition = "tinyint UNSIGNED not null")
    private Short lfgStatus4;

    @ColumnDefault("'0'")
    @Column(name = "LfgCompare1", columnDefinition = "tinyint UNSIGNED not null")
    private Short lfgCompare1;

    @ColumnDefault("'0'")
    @Column(name = "LfgCompare2", columnDefinition = "tinyint UNSIGNED not null")
    private Short lfgCompare2;

    @ColumnDefault("'0'")
    @Column(name = "LfgCompare3", columnDefinition = "tinyint UNSIGNED not null")
    private Short lfgCompare3;

    @ColumnDefault("'0'")
    @Column(name = "LfgCompare4", columnDefinition = "tinyint UNSIGNED not null")
    private Short lfgCompare4;

    @ColumnDefault("'0'")
    @Column(name = "LfgValue1", columnDefinition = "int UNSIGNED not null")
    private Long lfgValue1;

    @ColumnDefault("'0'")
    @Column(name = "LfgValue2", columnDefinition = "int UNSIGNED not null")
    private Long lfgValue2;

    @ColumnDefault("'0'")
    @Column(name = "LfgValue3", columnDefinition = "int UNSIGNED not null")
    private Long lfgValue3;

    @ColumnDefault("'0'")
    @Column(name = "LfgValue4", columnDefinition = "int UNSIGNED not null")
    private Long lfgValue4;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID1", columnDefinition = "int UNSIGNED not null")
    private Long currencyID1;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID2", columnDefinition = "int UNSIGNED not null")
    private Long currencyID2;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID3", columnDefinition = "int UNSIGNED not null")
    private Long currencyID3;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyID4", columnDefinition = "int UNSIGNED not null")
    private Long currencyID4;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount1", columnDefinition = "int UNSIGNED not null")
    private Long currencyCount1;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount2", columnDefinition = "int UNSIGNED not null")
    private Long currencyCount2;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount3", columnDefinition = "int UNSIGNED not null")
    private Long currencyCount3;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount4", columnDefinition = "int UNSIGNED not null")
    private Long currencyCount4;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillMonster1", columnDefinition = "int UNSIGNED not null")
    private Long questKillMonster1;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillMonster2", columnDefinition = "int UNSIGNED not null")
    private Long questKillMonster2;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillMonster3", columnDefinition = "int UNSIGNED not null")
    private Long questKillMonster3;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillMonster4", columnDefinition = "int UNSIGNED not null")
    private Long questKillMonster4;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillMonster5", columnDefinition = "int UNSIGNED not null")
    private Long questKillMonster5;

    @ColumnDefault("'0'")
    @Column(name = "QuestKillMonster6", columnDefinition = "int UNSIGNED not null")
    private Long questKillMonster6;

    @ColumnDefault("0")
    @Column(name = "MovementFlags1", nullable = false)
    private Integer movementFlags1;

    @ColumnDefault("0")
    @Column(name = "MovementFlags2", nullable = false)
    private Integer movementFlags2;

}