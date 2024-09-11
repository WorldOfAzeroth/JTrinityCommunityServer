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
@Table(name = "chr_races")
public class ChrRace {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "ClientPrefix")
    private String clientPrefix;

    @Lob
    @Column(name = "ClientFileString")
    private String clientFileString;

    @Lob
    @Column(name = "Name")
    private String name;

    @Lob
    @Column(name = "NameFemale")
    private String nameFemale;

    @Lob
    @Column(name = "NameLowercase")
    private String nameLowercase;

    @Lob
    @Column(name = "NameFemaleLowercase")
    private String nameFemaleLowercase;

    @Lob
    @Column(name = "LoreName")
    private String loreName;

    @Lob
    @Column(name = "LoreNameFemale")
    private String loreNameFemale;

    @Lob
    @Column(name = "LoreNameLower")
    private String loreNameLower;

    @Lob
    @Column(name = "LoreNameLowerFemale")
    private String loreNameLowerFemale;

    @Lob
    @Column(name = "LoreDescription")
    private String loreDescription;

    @Lob
    @Column(name = "ShortName")
    private String shortName;

    @Lob
    @Column(name = "ShortNameFemale")
    private String shortNameFemale;

    @Lob
    @Column(name = "ShortNameLower")
    private String shortNameLower;

    @Lob
    @Column(name = "ShortNameLowerFemale")
    private String shortNameLowerFemale;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "MaleDisplayID", columnDefinition = "int UNSIGNED not null")
    private Long maleDisplayID;

    @ColumnDefault("'0'")
    @Column(name = "FemaleDisplayID", columnDefinition = "int UNSIGNED not null")
    private Long femaleDisplayID;

    @ColumnDefault("'0'")
    @Column(name = "HighResMaleDisplayID", columnDefinition = "int UNSIGNED not null")
    private Long highResMaleDisplayID;

    @ColumnDefault("'0'")
    @Column(name = "HighResFemaleDisplayID", columnDefinition = "int UNSIGNED not null")
    private Long highResFemaleDisplayID;

    @ColumnDefault("0")
    @Column(name = "ResSicknessSpellID", nullable = false)
    private Integer resSicknessSpellID;

    @ColumnDefault("0")
    @Column(name = "SplashSoundID", nullable = false)
    private Integer splashSoundID;

    @ColumnDefault("0")
    @Column(name = "CreateScreenFileDataID", nullable = false)
    private Integer createScreenFileDataID;

    @ColumnDefault("0")
    @Column(name = "SelectScreenFileDataID", nullable = false)
    private Integer selectScreenFileDataID;

    @ColumnDefault("0")
    @Column(name = "LowResScreenFileDataID", nullable = false)
    private Integer lowResScreenFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "AlteredFormStartVisualKitID1", columnDefinition = "int UNSIGNED not null")
    private Long alteredFormStartVisualKitID1;

    @ColumnDefault("'0'")
    @Column(name = "AlteredFormStartVisualKitID2", columnDefinition = "int UNSIGNED not null")
    private Long alteredFormStartVisualKitID2;

    @ColumnDefault("'0'")
    @Column(name = "AlteredFormStartVisualKitID3", columnDefinition = "int UNSIGNED not null")
    private Long alteredFormStartVisualKitID3;

    @ColumnDefault("'0'")
    @Column(name = "AlteredFormFinishVisualKitID1", columnDefinition = "int UNSIGNED not null")
    private Long alteredFormFinishVisualKitID1;

    @ColumnDefault("'0'")
    @Column(name = "AlteredFormFinishVisualKitID2", columnDefinition = "int UNSIGNED not null")
    private Long alteredFormFinishVisualKitID2;

    @ColumnDefault("'0'")
    @Column(name = "AlteredFormFinishVisualKitID3", columnDefinition = "int UNSIGNED not null")
    private Long alteredFormFinishVisualKitID3;

    @ColumnDefault("0")
    @Column(name = "HeritageArmorAchievementID", nullable = false)
    private Integer heritageArmorAchievementID;

    @ColumnDefault("0")
    @Column(name = "StartingLevel", nullable = false)
    private Integer startingLevel;

    @ColumnDefault("0")
    @Column(name = "UiDisplayOrder", nullable = false)
    private Integer uiDisplayOrder;

    @ColumnDefault("0")
    @Column(name = "PlayableRaceBit", nullable = false)
    private Integer playableRaceBit;

    @ColumnDefault("0")
    @Column(name = "FemaleSkeletonFileDataID", nullable = false)
    private Integer femaleSkeletonFileDataID;

    @ColumnDefault("0")
    @Column(name = "MaleSkeletonFileDataID", nullable = false)
    private Integer maleSkeletonFileDataID;

    @ColumnDefault("0")
    @Column(name = "HelmetAnimScalingRaceID", nullable = false)
    private Integer helmetAnimScalingRaceID;

    @ColumnDefault("0")
    @Column(name = "TransmogrifyDisabledSlotMask", nullable = false)
    private Integer transmogrifyDisabledSlotMask;

    @ColumnDefault("0")
    @Column(name = "AlteredFormCustomizeOffsetFallback1", nullable = false)
    private Float alteredFormCustomizeOffsetFallback1;

    @ColumnDefault("0")
    @Column(name = "AlteredFormCustomizeOffsetFallback2", nullable = false)
    private Float alteredFormCustomizeOffsetFallback2;

    @ColumnDefault("0")
    @Column(name = "AlteredFormCustomizeOffsetFallback3", nullable = false)
    private Float alteredFormCustomizeOffsetFallback3;

    @ColumnDefault("0")
    @Column(name = "AlteredFormCustomizeRotationFallback", nullable = false)
    private Float alteredFormCustomizeRotationFallback;

    @ColumnDefault("0")
    @Column(name = "Unknown910_11", nullable = false)
    private Float unknown910_11;

    @ColumnDefault("0")
    @Column(name = "Unknown910_12", nullable = false)
    private Float unknown910_12;

    @ColumnDefault("0")
    @Column(name = "Unknown910_13", nullable = false)
    private Float unknown910_13;

    @ColumnDefault("0")
    @Column(name = "Unknown910_21", nullable = false)
    private Float unknown910_21;

    @ColumnDefault("0")
    @Column(name = "Unknown910_22", nullable = false)
    private Float unknown910_22;

    @ColumnDefault("0")
    @Column(name = "Unknown910_23", nullable = false)
    private Float unknown910_23;

    @ColumnDefault("0")
    @Column(name = "FactionID", nullable = false)
    private Short factionID;

    @ColumnDefault("0")
    @Column(name = "CinematicSequenceID", nullable = false)
    private Short cinematicSequenceID;

    @ColumnDefault("0")
    @Column(name = "BaseLanguage", nullable = false)
    private Byte baseLanguage;

    @ColumnDefault("0")
    @Column(name = "CreatureType", nullable = false)
    private Byte creatureType;

    @ColumnDefault("0")
    @Column(name = "Alliance", nullable = false)
    private Byte alliance;

    @ColumnDefault("0")
    @Column(name = "RaceRelated", nullable = false)
    private Byte raceRelated;

    @ColumnDefault("0")
    @Column(name = "UnalteredVisualRaceID", nullable = false)
    private Byte unalteredVisualRaceID;

    @ColumnDefault("0")
    @Column(name = "DefaultClassID", nullable = false)
    private Byte defaultClassID;

    @ColumnDefault("0")
    @Column(name = "NeutralRaceID", nullable = false)
    private Byte neutralRaceID;

    @ColumnDefault("0")
    @Column(name = "MaleModelFallbackRaceID", nullable = false)
    private Byte maleModelFallbackRaceID;

    @ColumnDefault("0")
    @Column(name = "MaleModelFallbackSex", nullable = false)
    private Byte maleModelFallbackSex;

    @ColumnDefault("0")
    @Column(name = "FemaleModelFallbackRaceID", nullable = false)
    private Byte femaleModelFallbackRaceID;

    @ColumnDefault("0")
    @Column(name = "FemaleModelFallbackSex", nullable = false)
    private Byte femaleModelFallbackSex;

    @ColumnDefault("0")
    @Column(name = "MaleTextureFallbackRaceID", nullable = false)
    private Byte maleTextureFallbackRaceID;

    @ColumnDefault("0")
    @Column(name = "MaleTextureFallbackSex", nullable = false)
    private Byte maleTextureFallbackSex;

    @ColumnDefault("0")
    @Column(name = "FemaleTextureFallbackRaceID", nullable = false)
    private Byte femaleTextureFallbackRaceID;

    @ColumnDefault("0")
    @Column(name = "FemaleTextureFallbackSex", nullable = false)
    private Byte femaleTextureFallbackSex;

    @ColumnDefault("0")
    @Column(name = "UnalteredVisualCustomizationRaceID", nullable = false)
    private Byte unalteredVisualCustomizationRaceID;

}