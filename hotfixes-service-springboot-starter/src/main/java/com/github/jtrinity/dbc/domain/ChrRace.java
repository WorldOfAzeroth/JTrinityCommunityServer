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
@Table(name = "chr_races")
@Db2File(name = "ChrRaces.db2", layoutHash = 0x51C511F9, indexField = 30)
public class ChrRace implements DbcEntity {

    @Column(name = "ClientPrefix")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING_NOT_LOCALIZED)
    private String clientPrefix;


    @Column(name = "ClientFileString")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String clientFileString;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "NameFemale")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private LocalizedString nameFemale;


    @Column(name = "NameLowercase")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private LocalizedString nameLowercase;


    @Column(name = "NameFemaleLowercase")
    @Db2Field(fieldIndex = 5, type = Db2Type.STRING)
    private LocalizedString nameFemaleLowercase;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer flags;


    @Column(name = "MaleDisplayId")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer maleDisplayId;


    @Column(name = "FemaleDisplayId")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer femaleDisplayId;


    @Column(name = "CreateScreenFileDataID")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer createScreenFileDataID;


    @Column(name = "SelectScreenFileDataID")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer selectScreenFileDataID;


    @Column(name = "MaleCustomizeOffset1")
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float maleCustomizeOffset1;


    @Column(name = "MaleCustomizeOffset2")
    @Db2Field(fieldIndex = 12, type = Db2Type.FLOAT)
    private Float maleCustomizeOffset2;


    @Column(name = "MaleCustomizeOffset3")
    @Db2Field(fieldIndex = 13, type = Db2Type.FLOAT)
    private Float maleCustomizeOffset3;


    @Column(name = "FemaleCustomizeOffset1")
    @Db2Field(fieldIndex = 14, type = Db2Type.FLOAT)
    private Float femaleCustomizeOffset1;


    @Column(name = "FemaleCustomizeOffset2")
    @Db2Field(fieldIndex = 15, type = Db2Type.FLOAT)
    private Float femaleCustomizeOffset2;


    @Column(name = "FemaleCustomizeOffset3")
    @Db2Field(fieldIndex = 16, type = Db2Type.FLOAT)
    private Float femaleCustomizeOffset3;


    @Column(name = "LowResScreenFileDataID")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT, signed = true)
    private Integer lowResScreenFileDataID;


    @Column(name = "StartingLevel")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT, signed = true)
    private Integer startingLevel;


    @Column(name = "UiDisplayOrder")
    @Db2Field(fieldIndex = 19, type = Db2Type.INT, signed = true)
    private Integer uiDisplayOrder;


    @Column(name = "FactionID")
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT, signed = true)
    private Short factionID;


    @Column(name = "ResSicknessSpellID")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT, signed = true)
    private Short resSicknessSpellID;


    @Column(name = "SplashSoundID")
    @Db2Field(fieldIndex = 22, type = Db2Type.SHORT, signed = true)
    private Short splashSoundID;


    @Column(name = "CinematicSequenceID")
    @Db2Field(fieldIndex = 23, type = Db2Type.SHORT, signed = true)
    private Short cinematicSequenceID;


    @Column(name = "BaseLanguage")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE, signed = true)
    private Byte baseLanguage;


    @Column(name = "CreatureType")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE, signed = true)
    private Byte creatureType;


    @Column(name = "Alliance")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE, signed = true)
    private Byte alliance;


    @Column(name = "RaceRelated")
    @Db2Field(fieldIndex = 27, type = Db2Type.BYTE, signed = true)
    private Byte raceRelated;


    @Column(name = "UnalteredVisualRaceID")
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE, signed = true)
    private Byte unalteredVisualRaceID;


    @Column(name = "CharComponentTextureLayoutID")
    @Db2Field(fieldIndex = 29, type = Db2Type.BYTE, signed = true)
    private Byte charComponentTextureLayoutID;


    @Column(name = "DefaultClassID")
    @Db2Field(fieldIndex = 30, type = Db2Type.BYTE, signed = true)
    private Byte defaultClassID;


    @Column(name = "NeutralRaceID")
    @Db2Field(fieldIndex = 31, type = Db2Type.BYTE, signed = true)
    private Byte neutralRaceID;


    @Column(name = "DisplayRaceID")
    @Db2Field(fieldIndex = 32, type = Db2Type.BYTE, signed = true)
    private Byte displayRaceID;


    @Column(name = "CharComponentTexLayoutHiResID")
    @Db2Field(fieldIndex = 33, type = Db2Type.BYTE, signed = true)
    private Byte charComponentTexLayoutHiResID;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 34, type = Db2Type.INT)
    private Integer id;


    @Column(name = "HighResMaleDisplayId")
    @Db2Field(fieldIndex = 35, type = Db2Type.INT)
    private Integer highResMaleDisplayId;


    @Column(name = "HighResFemaleDisplayId")
    @Db2Field(fieldIndex = 36, type = Db2Type.INT)
    private Integer highResFemaleDisplayId;


    @Column(name = "HeritageArmorAchievementID")
    @Db2Field(fieldIndex = 37, type = Db2Type.INT, signed = true)
    private Integer heritageArmorAchievementID;


    @Column(name = "MaleSkeletonFileDataID")
    @Db2Field(fieldIndex = 38, type = Db2Type.INT, signed = true)
    private Integer maleSkeletonFileDataID;


    @Column(name = "FemaleSkeletonFileDataID")
    @Db2Field(fieldIndex = 39, type = Db2Type.INT, signed = true)
    private Integer femaleSkeletonFileDataID;


    @Column(name = "AlteredFormStartVisualKitID1")
    @Db2Field(fieldIndex = 40, type = Db2Type.INT)
    private Integer alteredFormStartVisualKitID1;


    @Column(name = "AlteredFormStartVisualKitID2")
    @Db2Field(fieldIndex = 41, type = Db2Type.INT)
    private Integer alteredFormStartVisualKitID2;


    @Column(name = "AlteredFormStartVisualKitID3")
    @Db2Field(fieldIndex = 42, type = Db2Type.INT)
    private Integer alteredFormStartVisualKitID3;


    @Column(name = "AlteredFormFinishVisualKitID1")
    @Db2Field(fieldIndex = 43, type = Db2Type.INT)
    private Integer alteredFormFinishVisualKitID1;


    @Column(name = "AlteredFormFinishVisualKitID2")
    @Db2Field(fieldIndex = 44, type = Db2Type.INT)
    private Integer alteredFormFinishVisualKitID2;


    @Column(name = "AlteredFormFinishVisualKitID3")
    @Db2Field(fieldIndex = 45, type = Db2Type.INT)
    private Integer alteredFormFinishVisualKitID3;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
