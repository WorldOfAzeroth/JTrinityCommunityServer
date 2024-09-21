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
@Table(name = "player_condition")
@Db2File(name = "PlayerCondition.db2", layoutHash = 0x5B3DA113, indexField = 2)
public class PlayerCondition implements DbcEntity {

    @Column(name = "RaceMask")
    @Db2Field(fieldIndex = 0, type = Db2Type.LONG, signed = true)
    private Long raceMask;


    @Column(name = "FailureDescription")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString failureDescription;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "MinLevel")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short minLevel;


    @Column(name = "MaxLevel")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short maxLevel;


    @Column(name = "ClassMask")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer classMask;


    @Column(name = "Gender")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte gender;


    @Column(name = "NativeGender")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte nativeGender;


    @Column(name = "SkillLogic")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Integer skillLogic;


    @Column(name = "LanguageID")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Byte languageID;


    @Column(name = "MinLanguage")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Byte minLanguage;


    @Column(name = "MaxLanguage")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer maxLanguage;


    @Column(name = "MaxFactionID")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short maxFactionID;


    @Column(name = "MaxReputation")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE)
    private Byte maxReputation;


    @Column(name = "ReputationLogic")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Integer reputationLogic;


    @Column(name = "CurrentPvpFaction")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE, signed = true)
    private Byte currentPvpFaction;


    @Column(name = "MinPVPRank")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Byte minPVPRank;


    @Column(name = "MaxPVPRank")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Byte maxPVPRank;


    @Column(name = "PvpMedal")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Byte pvpMedal;


    @Column(name = "PrevQuestLogic")
    @Db2Field(fieldIndex = 20, type = Db2Type.INT)
    private Integer prevQuestLogic;


    @Column(name = "CurrQuestLogic")
    @Db2Field(fieldIndex = 21, type = Db2Type.INT)
    private Integer currQuestLogic;


    @Column(name = "CurrentCompletedQuestLogic")
    @Db2Field(fieldIndex = 22, type = Db2Type.INT)
    private Integer currentCompletedQuestLogic;


    @Column(name = "SpellLogic")
    @Db2Field(fieldIndex = 23, type = Db2Type.INT)
    private Integer spellLogic;


    @Column(name = "ItemLogic")
    @Db2Field(fieldIndex = 24, type = Db2Type.INT)
    private Integer itemLogic;


    @Column(name = "ItemFlags")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Byte itemFlags;


    @Column(name = "AuraSpellLogic")
    @Db2Field(fieldIndex = 26, type = Db2Type.INT)
    private Integer auraSpellLogic;


    @Column(name = "WorldStateExpressionID")
    @Db2Field(fieldIndex = 27, type = Db2Type.SHORT)
    private Short worldStateExpressionID;


    @Column(name = "WeatherID")
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE)
    private Byte weatherID;


    @Column(name = "PartyStatus")
    @Db2Field(fieldIndex = 29, type = Db2Type.BYTE)
    private Byte partyStatus;


    @Column(name = "LifetimeMaxPVPRank")
    @Db2Field(fieldIndex = 30, type = Db2Type.BYTE)
    private Byte lifetimeMaxPVPRank;


    @Column(name = "AchievementLogic")
    @Db2Field(fieldIndex = 31, type = Db2Type.INT)
    private Integer achievementLogic;


    @Column(name = "LfgLogic")
    @Db2Field(fieldIndex = 32, type = Db2Type.INT)
    private Integer lfgLogic;


    @Column(name = "AreaLogic")
    @Db2Field(fieldIndex = 33, type = Db2Type.INT)
    private Integer areaLogic;


    @Column(name = "CurrencyLogic")
    @Db2Field(fieldIndex = 34, type = Db2Type.INT)
    private Integer currencyLogic;


    @Column(name = "QuestKillID")
    @Db2Field(fieldIndex = 35, type = Db2Type.SHORT)
    private Short questKillID;


    @Column(name = "QuestKillLogic")
    @Db2Field(fieldIndex = 36, type = Db2Type.INT)
    private Integer questKillLogic;


    @Column(name = "MinExpansionLevel")
    @Db2Field(fieldIndex = 37, type = Db2Type.BYTE, signed = true)
    private Byte minExpansionLevel;


    @Column(name = "MaxExpansionLevel")
    @Db2Field(fieldIndex = 38, type = Db2Type.BYTE, signed = true)
    private Byte maxExpansionLevel;


    @Column(name = "MinExpansionTier")
    @Db2Field(fieldIndex = 39, type = Db2Type.BYTE, signed = true)
    private Byte minExpansionTier;


    @Column(name = "MaxExpansionTier")
    @Db2Field(fieldIndex = 40, type = Db2Type.BYTE, signed = true)
    private Byte maxExpansionTier;


    @Column(name = "MinGuildLevel")
    @Db2Field(fieldIndex = 41, type = Db2Type.BYTE)
    private Byte minGuildLevel;


    @Column(name = "MaxGuildLevel")
    @Db2Field(fieldIndex = 42, type = Db2Type.BYTE)
    private Byte maxGuildLevel;


    @Column(name = "PhaseUseFlags")
    @Db2Field(fieldIndex = 43, type = Db2Type.BYTE)
    private Byte phaseUseFlags;


    @Column(name = "PhaseID")
    @Db2Field(fieldIndex = 44, type = Db2Type.SHORT)
    private Short phaseID;


    @Column(name = "PhaseGroupID")
    @Db2Field(fieldIndex = 45, type = Db2Type.INT)
    private Integer phaseGroupID;


    @Column(name = "MinAvgItemLevel")
    @Db2Field(fieldIndex = 46, type = Db2Type.INT, signed = true)
    private Integer minAvgItemLevel;


    @Column(name = "MaxAvgItemLevel")
    @Db2Field(fieldIndex = 47, type = Db2Type.INT, signed = true)
    private Integer maxAvgItemLevel;


    @Column(name = "MinAvgEquippedItemLevel")
    @Db2Field(fieldIndex = 48, type = Db2Type.SHORT)
    private Short minAvgEquippedItemLevel;


    @Column(name = "MaxAvgEquippedItemLevel")
    @Db2Field(fieldIndex = 49, type = Db2Type.SHORT)
    private Short maxAvgEquippedItemLevel;


    @Column(name = "ChrSpecializationIndex")
    @Db2Field(fieldIndex = 50, type = Db2Type.BYTE, signed = true)
    private Byte chrSpecializationIndex;


    @Column(name = "ChrSpecializationRole")
    @Db2Field(fieldIndex = 51, type = Db2Type.BYTE, signed = true)
    private Byte chrSpecializationRole;


    @Column(name = "PowerType")
    @Db2Field(fieldIndex = 52, type = Db2Type.BYTE, signed = true)
    private Byte powerType;


    @Column(name = "PowerTypeComp")
    @Db2Field(fieldIndex = 53, type = Db2Type.BYTE)
    private Byte powerTypeComp;


    @Column(name = "PowerTypeValue")
    @Db2Field(fieldIndex = 54, type = Db2Type.BYTE)
    private Byte powerTypeValue;


    @Column(name = "ModifierTreeID")
    @Db2Field(fieldIndex = 55, type = Db2Type.INT)
    private Integer ModifierTreeID;


    @Column(name = "WeaponSubclassMask")
    @Db2Field(fieldIndex = 56, type = Db2Type.INT, signed = true)
    private Integer weaponSubclassMask;


    @Column(name = "SkillID1")
    @Db2Field(fieldIndex = 57, type = Db2Type.SHORT)
    private Short skillID1;


    @Column(name = "SkillID2")
    @Db2Field(fieldIndex = 58, type = Db2Type.SHORT)
    private Short skillID2;


    @Column(name = "SkillID3")
    @Db2Field(fieldIndex = 59, type = Db2Type.SHORT)
    private Short skillID3;


    @Column(name = "SkillID4")
    @Db2Field(fieldIndex = 60, type = Db2Type.SHORT)
    private Short skillID4;


    @Column(name = "MinSkill1")
    @Db2Field(fieldIndex = 61, type = Db2Type.SHORT)
    private Short minSkill1;


    @Column(name = "MinSkill2")
    @Db2Field(fieldIndex = 62, type = Db2Type.SHORT)
    private Short minSkill2;


    @Column(name = "MinSkill3")
    @Db2Field(fieldIndex = 63, type = Db2Type.SHORT)
    private Short minSkill3;


    @Column(name = "MinSkill4")
    @Db2Field(fieldIndex = 64, type = Db2Type.SHORT)
    private Short minSkill4;


    @Column(name = "MaxSkill1")
    @Db2Field(fieldIndex = 65, type = Db2Type.SHORT)
    private Short maxSkill1;


    @Column(name = "MaxSkill2")
    @Db2Field(fieldIndex = 66, type = Db2Type.SHORT)
    private Short maxSkill2;


    @Column(name = "MaxSkill3")
    @Db2Field(fieldIndex = 67, type = Db2Type.SHORT)
    private Short maxSkill3;


    @Column(name = "MaxSkill4")
    @Db2Field(fieldIndex = 68, type = Db2Type.SHORT)
    private Short maxSkill4;


    @Column(name = "MinFactionID1")
    @Db2Field(fieldIndex = 69, type = Db2Type.INT)
    private Integer minFactionID1;


    @Column(name = "MinFactionID2")
    @Db2Field(fieldIndex = 70, type = Db2Type.INT)
    private Integer minFactionID2;


    @Column(name = "MinFactionID3")
    @Db2Field(fieldIndex = 71, type = Db2Type.INT)
    private Integer minFactionID3;


    @Column(name = "MinReputation1")
    @Db2Field(fieldIndex = 72, type = Db2Type.BYTE)
    private Byte minReputation1;


    @Column(name = "MinReputation2")
    @Db2Field(fieldIndex = 73, type = Db2Type.BYTE)
    private Byte minReputation2;


    @Column(name = "MinReputation3")
    @Db2Field(fieldIndex = 74, type = Db2Type.BYTE)
    private Byte minReputation3;


    @Column(name = "PrevQuestID1")
    @Db2Field(fieldIndex = 75, type = Db2Type.SHORT)
    private Short prevQuestID1;


    @Column(name = "PrevQuestID2")
    @Db2Field(fieldIndex = 76, type = Db2Type.SHORT)
    private Short prevQuestID2;


    @Column(name = "PrevQuestID3")
    @Db2Field(fieldIndex = 77, type = Db2Type.SHORT)
    private Short prevQuestID3;


    @Column(name = "PrevQuestID4")
    @Db2Field(fieldIndex = 78, type = Db2Type.SHORT)
    private Short prevQuestID4;


    @Column(name = "CurrQuestID1")
    @Db2Field(fieldIndex = 79, type = Db2Type.SHORT)
    private Short currQuestID1;


    @Column(name = "CurrQuestID2")
    @Db2Field(fieldIndex = 80, type = Db2Type.SHORT)
    private Short currQuestID2;


    @Column(name = "CurrQuestID3")
    @Db2Field(fieldIndex = 81, type = Db2Type.SHORT)
    private Short currQuestID3;


    @Column(name = "CurrQuestID4")
    @Db2Field(fieldIndex = 82, type = Db2Type.SHORT)
    private Short currQuestID4;


    @Column(name = "CurrentCompletedQuestID1")
    @Db2Field(fieldIndex = 83, type = Db2Type.SHORT)
    private Short currentCompletedQuestID1;


    @Column(name = "CurrentCompletedQuestID2")
    @Db2Field(fieldIndex = 84, type = Db2Type.SHORT)
    private Short currentCompletedQuestID2;


    @Column(name = "CurrentCompletedQuestID3")
    @Db2Field(fieldIndex = 85, type = Db2Type.SHORT)
    private Short currentCompletedQuestID3;


    @Column(name = "CurrentCompletedQuestID4")
    @Db2Field(fieldIndex = 86, type = Db2Type.SHORT)
    private Short currentCompletedQuestID4;


    @Column(name = "SpellID1")
    @Db2Field(fieldIndex = 87, type = Db2Type.INT, signed = true)
    private Integer spellID1;


    @Column(name = "SpellID2")
    @Db2Field(fieldIndex = 88, type = Db2Type.INT, signed = true)
    private Integer spellID2;


    @Column(name = "SpellID3")
    @Db2Field(fieldIndex = 89, type = Db2Type.INT, signed = true)
    private Integer spellID3;


    @Column(name = "SpellID4")
    @Db2Field(fieldIndex = 90, type = Db2Type.INT, signed = true)
    private Integer spellID4;


    @Column(name = "ItemID1")
    @Db2Field(fieldIndex = 91, type = Db2Type.INT, signed = true)
    private Integer itemID1;


    @Column(name = "ItemID2")
    @Db2Field(fieldIndex = 92, type = Db2Type.INT, signed = true)
    private Integer itemID2;


    @Column(name = "ItemID3")
    @Db2Field(fieldIndex = 93, type = Db2Type.INT, signed = true)
    private Integer itemID3;


    @Column(name = "ItemID4")
    @Db2Field(fieldIndex = 94, type = Db2Type.INT, signed = true)
    private Integer itemID4;


    @Column(name = "ItemCount1")
    @Db2Field(fieldIndex = 95, type = Db2Type.INT)
    private Integer itemCount1;


    @Column(name = "ItemCount2")
    @Db2Field(fieldIndex = 96, type = Db2Type.INT)
    private Integer itemCount2;


    @Column(name = "ItemCount3")
    @Db2Field(fieldIndex = 97, type = Db2Type.INT)
    private Integer itemCount3;


    @Column(name = "ItemCount4")
    @Db2Field(fieldIndex = 98, type = Db2Type.INT)
    private Integer itemCount4;


    @Column(name = "Explored1")
    @Db2Field(fieldIndex = 99, type = Db2Type.SHORT)
    private Short explored1;


    @Column(name = "Explored2")
    @Db2Field(fieldIndex = 100, type = Db2Type.SHORT)
    private Short explored2;


    @Column(name = "Time1")
    @Db2Field(fieldIndex = 101, type = Db2Type.INT)
    private Integer time1;


    @Column(name = "Time2")
    @Db2Field(fieldIndex = 102, type = Db2Type.INT)
    private Integer time2;


    @Column(name = "AuraSpellID1")
    @Db2Field(fieldIndex = 103, type = Db2Type.INT, signed = true)
    private Integer auraSpellID1;


    @Column(name = "AuraSpellID2")
    @Db2Field(fieldIndex = 104, type = Db2Type.INT, signed = true)
    private Integer auraSpellID2;


    @Column(name = "AuraSpellID3")
    @Db2Field(fieldIndex = 105, type = Db2Type.INT, signed = true)
    private Integer auraSpellID3;


    @Column(name = "AuraSpellID4")
    @Db2Field(fieldIndex = 106, type = Db2Type.INT, signed = true)
    private Integer auraSpellID4;


    @Column(name = "AuraStacks1")
    @Db2Field(fieldIndex = 107, type = Db2Type.BYTE)
    private Byte auraStacks1;


    @Column(name = "AuraStacks2")
    @Db2Field(fieldIndex = 108, type = Db2Type.BYTE)
    private Byte auraStacks2;


    @Column(name = "AuraStacks3")
    @Db2Field(fieldIndex = 109, type = Db2Type.BYTE)
    private Byte auraStacks3;


    @Column(name = "AuraStacks4")
    @Db2Field(fieldIndex = 110, type = Db2Type.BYTE)
    private Byte auraStacks4;


    @Column(name = "Achievement1")
    @Db2Field(fieldIndex = 111, type = Db2Type.SHORT)
    private Short achievement1;


    @Column(name = "Achievement2")
    @Db2Field(fieldIndex = 112, type = Db2Type.SHORT)
    private Short achievement2;


    @Column(name = "Achievement3")
    @Db2Field(fieldIndex = 113, type = Db2Type.SHORT)
    private Short achievement3;


    @Column(name = "Achievement4")
    @Db2Field(fieldIndex = 114, type = Db2Type.SHORT)
    private Short achievement4;


    @Column(name = "LfgStatus1")
    @Db2Field(fieldIndex = 115, type = Db2Type.BYTE)
    private Byte lfgStatus1;


    @Column(name = "LfgStatus2")
    @Db2Field(fieldIndex = 116, type = Db2Type.BYTE)
    private Byte lfgStatus2;


    @Column(name = "LfgStatus3")
    @Db2Field(fieldIndex = 117, type = Db2Type.BYTE)
    private Byte lfgStatus3;


    @Column(name = "LfgStatus4")
    @Db2Field(fieldIndex = 118, type = Db2Type.BYTE)
    private Byte lfgStatus4;


    @Column(name = "LfgCompare1")
    @Db2Field(fieldIndex = 119, type = Db2Type.BYTE)
    private Byte lfgCompare1;


    @Column(name = "LfgCompare2")
    @Db2Field(fieldIndex = 120, type = Db2Type.BYTE)
    private Byte lfgCompare2;


    @Column(name = "LfgCompare3")
    @Db2Field(fieldIndex = 121, type = Db2Type.BYTE)
    private Byte lfgCompare3;


    @Column(name = "LfgCompare4")
    @Db2Field(fieldIndex = 122, type = Db2Type.BYTE)
    private Byte lfgCompare4;


    @Column(name = "LfgValue1")
    @Db2Field(fieldIndex = 123, type = Db2Type.INT)
    private Integer lfgValue1;


    @Column(name = "LfgValue2")
    @Db2Field(fieldIndex = 124, type = Db2Type.INT)
    private Integer lfgValue2;


    @Column(name = "LfgValue3")
    @Db2Field(fieldIndex = 125, type = Db2Type.INT)
    private Integer lfgValue3;


    @Column(name = "LfgValue4")
    @Db2Field(fieldIndex = 126, type = Db2Type.INT)
    private Integer lfgValue4;


    @Column(name = "AreaID1")
    @Db2Field(fieldIndex = 127, type = Db2Type.SHORT)
    private Short areaID1;


    @Column(name = "AreaID2")
    @Db2Field(fieldIndex = 128, type = Db2Type.SHORT)
    private Short areaID2;


    @Column(name = "AreaID3")
    @Db2Field(fieldIndex = 129, type = Db2Type.SHORT)
    private Short areaID3;


    @Column(name = "AreaID4")
    @Db2Field(fieldIndex = 130, type = Db2Type.SHORT)
    private Short areaID4;


    @Column(name = "CurrencyID1")
    @Db2Field(fieldIndex = 131, type = Db2Type.INT)
    private Integer currencyID1;


    @Column(name = "CurrencyID2")
    @Db2Field(fieldIndex = 132, type = Db2Type.INT)
    private Integer currencyID2;


    @Column(name = "CurrencyID3")
    @Db2Field(fieldIndex = 133, type = Db2Type.INT)
    private Integer currencyID3;


    @Column(name = "CurrencyID4")
    @Db2Field(fieldIndex = 134, type = Db2Type.INT)
    private Integer currencyID4;


    @Column(name = "CurrencyCount1")
    @Db2Field(fieldIndex = 135, type = Db2Type.INT)
    private Integer currencyCount1;


    @Column(name = "CurrencyCount2")
    @Db2Field(fieldIndex = 136, type = Db2Type.INT)
    private Integer currencyCount2;


    @Column(name = "CurrencyCount3")
    @Db2Field(fieldIndex = 137, type = Db2Type.INT)
    private Integer currencyCount3;


    @Column(name = "CurrencyCount4")
    @Db2Field(fieldIndex = 138, type = Db2Type.INT)
    private Integer currencyCount4;


    @Column(name = "QuestKillMonster1")
    @Db2Field(fieldIndex = 139, type = Db2Type.INT)
    private Integer questKillMonster1;


    @Column(name = "QuestKillMonster2")
    @Db2Field(fieldIndex = 140, type = Db2Type.INT)
    private Integer questKillMonster2;


    @Column(name = "QuestKillMonster3")
    @Db2Field(fieldIndex = 141, type = Db2Type.INT)
    private Integer questKillMonster3;


    @Column(name = "QuestKillMonster4")
    @Db2Field(fieldIndex = 142, type = Db2Type.INT)
    private Integer questKillMonster4;


    @Column(name = "QuestKillMonster5")
    @Db2Field(fieldIndex = 143, type = Db2Type.INT)
    private Integer questKillMonster5;


    @Column(name = "QuestKillMonster6")
    @Db2Field(fieldIndex = 144, type = Db2Type.INT)
    private Integer questKillMonster6;


    @Column(name = "MovementFlags1")
    @Db2Field(fieldIndex = 145, type = Db2Type.INT, signed = true)
    private Integer movementFlags1;


    @Column(name = "MovementFlags2")
    @Db2Field(fieldIndex = 146, type = Db2Type.INT, signed = true)
    private Integer movementFlags2;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
