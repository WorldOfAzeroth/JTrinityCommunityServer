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
@Table(name = "chr_races")
@Db2File(name = "ChrRaces.db2", layoutHash = 0x756C30D6)
public class ChrRace implements DbcEntity {
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
    @Column(name = "ClientPrefix")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String clientPrefix;

    @Lob
    @Column(name = "ClientFileString")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING_NOT_LOCALIZED)
    private String clientFileString;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private String name;

    @Lob
    @Column(name = "NameFemale")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private String nameFemale;

    @Lob
    @Column(name = "NameLowercase")
    @Db2Field(fieldIndex = 5, type = Db2Type.STRING)
    private String nameLowercase;

    @Lob
    @Column(name = "NameFemaleLowercase")
    @Db2Field(fieldIndex = 6, type = Db2Type.STRING)
    private String nameFemaleLowercase;

    @Lob
    @Column(name = "LoreName")
    @Db2Field(fieldIndex = 7, type = Db2Type.STRING)
    private String loreName;

    @Lob
    @Column(name = "LoreNameFemale")
    @Db2Field(fieldIndex = 8, type = Db2Type.STRING)
    private String loreNameFemale;

    @Lob
    @Column(name = "LoreNameLower")
    @Db2Field(fieldIndex = 9, type = Db2Type.STRING)
    private String loreNameLower;

    @Lob
    @Column(name = "LoreNameLowerFemale")
    @Db2Field(fieldIndex = 10, type = Db2Type.STRING)
    private String loreNameLowerFemale;

    @Lob
    @Column(name = "LoreDescription")
    @Db2Field(fieldIndex = 11, type = Db2Type.STRING)
    private String loreDescription;

    @Lob
    @Column(name = "ShortName")
    @Db2Field(fieldIndex = 12, type = Db2Type.STRING)
    private String shortName;

    @Lob
    @Column(name = "ShortNameFemale")
    @Db2Field(fieldIndex = 13, type = Db2Type.STRING)
    private String shortNameFemale;

    @Lob
    @Column(name = "ShortNameLower")
    @Db2Field(fieldIndex = 14, type = Db2Type.STRING)
    private String shortNameLower;

    @Lob
    @Column(name = "ShortNameLowerFemale")
    @Db2Field(fieldIndex = 15, type = Db2Type.STRING)
    private String shortNameLowerFemale;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "MaleDisplayID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT)
    private Long maleDisplayID;

    @ColumnDefault("'0'")
    @Column(name = "FemaleDisplayID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT)
    private Long femaleDisplayID;

    @ColumnDefault("'0'")
    @Column(name = "HighResMaleDisplayID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.INT)
    private Long highResMaleDisplayID;

    @ColumnDefault("'0'")
    @Column(name = "HighResFemaleDisplayID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.INT)
    private Long highResFemaleDisplayID;

    @ColumnDefault("0")
    @Column(name = "ResSicknessSpellID", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.INT, signed = true)
    private Integer resSicknessSpellID;

    @ColumnDefault("0")
    @Column(name = "SplashSoundID", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer splashSoundID;

    @ColumnDefault("0")
    @Column(name = "CreateScreenFileDataID", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer createScreenFileDataID;

    @ColumnDefault("0")
    @Column(name = "SelectScreenFileDataID", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer selectScreenFileDataID;

    @ColumnDefault("0")
    @Column(name = "LowResScreenFileDataID", nullable = false)
    @Db2Field(fieldIndex = 25, type = Db2Type.INT, signed = true)
    private Integer lowResScreenFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "AlteredFormStartVisualKitID1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 26, type = Db2Type.INT)
    private Long alteredFormStartVisualKitID1;

    @ColumnDefault("'0'")
    @Column(name = "AlteredFormStartVisualKitID2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 27, type = Db2Type.INT)
    private Long alteredFormStartVisualKitID2;

    @ColumnDefault("'0'")
    @Column(name = "AlteredFormStartVisualKitID3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 28, type = Db2Type.INT)
    private Long alteredFormStartVisualKitID3;

    @ColumnDefault("'0'")
    @Column(name = "AlteredFormFinishVisualKitID1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 29, type = Db2Type.INT)
    private Long alteredFormFinishVisualKitID1;

    @ColumnDefault("'0'")
    @Column(name = "AlteredFormFinishVisualKitID2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 30, type = Db2Type.INT)
    private Long alteredFormFinishVisualKitID2;

    @ColumnDefault("'0'")
    @Column(name = "AlteredFormFinishVisualKitID3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 31, type = Db2Type.INT)
    private Long alteredFormFinishVisualKitID3;

    @ColumnDefault("0")
    @Column(name = "HeritageArmorAchievementID", nullable = false)
    @Db2Field(fieldIndex = 32, type = Db2Type.INT, signed = true)
    private Integer heritageArmorAchievementID;

    @ColumnDefault("0")
    @Column(name = "StartingLevel", nullable = false)
    @Db2Field(fieldIndex = 33, type = Db2Type.INT, signed = true)
    private Integer startingLevel;

    @ColumnDefault("0")
    @Column(name = "UiDisplayOrder", nullable = false)
    @Db2Field(fieldIndex = 34, type = Db2Type.INT, signed = true)
    private Integer uiDisplayOrder;

    @ColumnDefault("0")
    @Column(name = "PlayableRaceBit", nullable = false)
    @Db2Field(fieldIndex = 35, type = Db2Type.INT, signed = true)
    private Integer playableRaceBit;

    @ColumnDefault("0")
    @Column(name = "FemaleSkeletonFileDataID", nullable = false)
    @Db2Field(fieldIndex = 36, type = Db2Type.INT, signed = true)
    private Integer femaleSkeletonFileDataID;

    @ColumnDefault("0")
    @Column(name = "MaleSkeletonFileDataID", nullable = false)
    @Db2Field(fieldIndex = 37, type = Db2Type.INT, signed = true)
    private Integer maleSkeletonFileDataID;

    @ColumnDefault("0")
    @Column(name = "HelmetAnimScalingRaceID", nullable = false)
    @Db2Field(fieldIndex = 38, type = Db2Type.INT, signed = true)
    private Integer helmetAnimScalingRaceID;

    @ColumnDefault("0")
    @Column(name = "TransmogrifyDisabledSlotMask", nullable = false)
    @Db2Field(fieldIndex = 39, type = Db2Type.INT, signed = true)
    private Integer transmogrifyDisabledSlotMask;

    @ColumnDefault("0")
    @Column(name = "AlteredFormCustomizeOffsetFallback1", nullable = false)
    @Db2Field(fieldIndex = 40, type = Db2Type.FLOAT)
    private Float alteredFormCustomizeOffsetFallback1;

    @ColumnDefault("0")
    @Column(name = "AlteredFormCustomizeOffsetFallback2", nullable = false)
    @Db2Field(fieldIndex = 41, type = Db2Type.FLOAT)
    private Float alteredFormCustomizeOffsetFallback2;

    @ColumnDefault("0")
    @Column(name = "AlteredFormCustomizeOffsetFallback3", nullable = false)
    @Db2Field(fieldIndex = 42, type = Db2Type.FLOAT)
    private Float alteredFormCustomizeOffsetFallback3;

    @ColumnDefault("0")
    @Column(name = "AlteredFormCustomizeRotationFallback", nullable = false)
    @Db2Field(fieldIndex = 43, type = Db2Type.FLOAT)
    private Float alteredFormCustomizeRotationFallback;

    @ColumnDefault("0")
    @Column(name = "Unknown910_11", nullable = false)
    @Db2Field(fieldIndex = 44, type = Db2Type.FLOAT)
    private Float unknown910_11;

    @ColumnDefault("0")
    @Column(name = "Unknown910_12", nullable = false)
    @Db2Field(fieldIndex = 45, type = Db2Type.FLOAT)
    private Float unknown910_12;

    @ColumnDefault("0")
    @Column(name = "Unknown910_13", nullable = false)
    @Db2Field(fieldIndex = 46, type = Db2Type.FLOAT)
    private Float unknown910_13;

    @ColumnDefault("0")
    @Column(name = "Unknown910_21", nullable = false)
    @Db2Field(fieldIndex = 47, type = Db2Type.FLOAT)
    private Float unknown910_21;

    @ColumnDefault("0")
    @Column(name = "Unknown910_22", nullable = false)
    @Db2Field(fieldIndex = 48, type = Db2Type.FLOAT)
    private Float unknown910_22;

    @ColumnDefault("0")
    @Column(name = "Unknown910_23", nullable = false)
    @Db2Field(fieldIndex = 49, type = Db2Type.FLOAT)
    private Float unknown910_23;

    @ColumnDefault("0")
    @Column(name = "FactionID", nullable = false)
    @Db2Field(fieldIndex = 50, type = Db2Type.SHORT, signed = true)
    private Short factionID;

    @ColumnDefault("0")
    @Column(name = "CinematicSequenceID", nullable = false)
    @Db2Field(fieldIndex = 51, type = Db2Type.SHORT, signed = true)
    private Short cinematicSequenceID;

    @ColumnDefault("0")
    @Column(name = "BaseLanguage", nullable = false)
    @Db2Field(fieldIndex = 52, type = Db2Type.BYTE, signed = true)
    private Byte baseLanguage;

    @ColumnDefault("0")
    @Column(name = "CreatureType", nullable = false)
    @Db2Field(fieldIndex = 53, type = Db2Type.BYTE, signed = true)
    private Byte creatureType;

    @ColumnDefault("0")
    @Column(name = "Alliance", nullable = false)
    @Db2Field(fieldIndex = 54, type = Db2Type.BYTE, signed = true)
    private Byte alliance;

    @ColumnDefault("0")
    @Column(name = "RaceRelated", nullable = false)
    @Db2Field(fieldIndex = 55, type = Db2Type.BYTE, signed = true)
    private Byte raceRelated;

    @ColumnDefault("0")
    @Column(name = "UnalteredVisualRaceID", nullable = false)
    @Db2Field(fieldIndex = 56, type = Db2Type.BYTE, signed = true)
    private Byte unalteredVisualRaceID;

    @ColumnDefault("0")
    @Column(name = "DefaultClassID", nullable = false)
    @Db2Field(fieldIndex = 57, type = Db2Type.BYTE, signed = true)
    private Byte defaultClassID;

    @ColumnDefault("0")
    @Column(name = "NeutralRaceID", nullable = false)
    @Db2Field(fieldIndex = 58, type = Db2Type.BYTE, signed = true)
    private Byte neutralRaceID;

    @ColumnDefault("0")
    @Column(name = "MaleModelFallbackRaceID", nullable = false)
    @Db2Field(fieldIndex = 59, type = Db2Type.BYTE, signed = true)
    private Byte maleModelFallbackRaceID;

    @ColumnDefault("0")
    @Column(name = "MaleModelFallbackSex", nullable = false)
    @Db2Field(fieldIndex = 60, type = Db2Type.BYTE, signed = true)
    private Byte maleModelFallbackSex;

    @ColumnDefault("0")
    @Column(name = "FemaleModelFallbackRaceID", nullable = false)
    @Db2Field(fieldIndex = 61, type = Db2Type.BYTE, signed = true)
    private Byte femaleModelFallbackRaceID;

    @ColumnDefault("0")
    @Column(name = "FemaleModelFallbackSex", nullable = false)
    @Db2Field(fieldIndex = 62, type = Db2Type.BYTE, signed = true)
    private Byte femaleModelFallbackSex;

    @ColumnDefault("0")
    @Column(name = "MaleTextureFallbackRaceID", nullable = false)
    @Db2Field(fieldIndex = 63, type = Db2Type.BYTE, signed = true)
    private Byte maleTextureFallbackRaceID;

    @ColumnDefault("0")
    @Column(name = "MaleTextureFallbackSex", nullable = false)
    @Db2Field(fieldIndex = 64, type = Db2Type.BYTE, signed = true)
    private Byte maleTextureFallbackSex;

    @ColumnDefault("0")
    @Column(name = "FemaleTextureFallbackRaceID", nullable = false)
    @Db2Field(fieldIndex = 65, type = Db2Type.BYTE, signed = true)
    private Byte femaleTextureFallbackRaceID;

    @ColumnDefault("0")
    @Column(name = "FemaleTextureFallbackSex", nullable = false)
    @Db2Field(fieldIndex = 66, type = Db2Type.BYTE, signed = true)
    private Byte femaleTextureFallbackSex;

    @ColumnDefault("0")
    @Column(name = "UnalteredVisualCustomizationRaceID", nullable = false)
    @Db2Field(fieldIndex = 67, type = Db2Type.BYTE, signed = true)
    private Byte unalteredVisualCustomizationRaceID;

}