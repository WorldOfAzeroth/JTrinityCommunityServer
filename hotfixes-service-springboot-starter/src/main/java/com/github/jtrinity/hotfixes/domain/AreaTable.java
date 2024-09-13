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
@Table(name = "area_table")
@Db2File(name = "AreaTable.db2", fileDataId = 1353545, layoutHash = 0x19CA1DC6)
public class AreaTable {
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
    @Column(name = "ZoneName")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String zoneName;

    @Lob
    @Column(name = "AreaName")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String areaName;

    @ColumnDefault("'0'")
    @Column(name = "ContinentID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Integer continentID;

    @ColumnDefault("'0'")
    @Column(name = "ParentAreaID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Integer parentAreaID;

    @ColumnDefault("0")
    @Column(name = "AreaBit", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT, signed = true)
    private Short areaBit;

    @ColumnDefault("'0'")
    @Column(name = "SoundProviderPref", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short soundProviderPref;

    @ColumnDefault("'0'")
    @Column(name = "SoundProviderPrefUnderwater", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Short soundProviderPrefUnderwater;

    @ColumnDefault("'0'")
    @Column(name = "AmbienceID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Integer ambienceID;

    @ColumnDefault("'0'")
    @Column(name = "UwAmbience", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Integer uwAmbience;

    @ColumnDefault("'0'")
    @Column(name = "ZoneMusic", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Integer zoneMusic;

    @ColumnDefault("'0'")
    @Column(name = "UwZoneMusic", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Integer uwZoneMusic;

    @ColumnDefault("0")
    @Column(name = "ExplorationLevel", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE, signed = true)
    private Byte explorationLevel;

    @ColumnDefault("'0'")
    @Column(name = "IntroSound", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Integer introSound;

    @ColumnDefault("'0'")
    @Column(name = "UwIntroSound", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Long uwIntroSound;

    @ColumnDefault("'0'")
    @Column(name = "FactionGroupMask", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Short factionGroupMask;

    @ColumnDefault("0")
    @Column(name = "AmbientMultiplier", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.FLOAT)
    private Float ambientMultiplier;

    @ColumnDefault("0")
    @Column(name = "MountFlags", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.INT, signed = true)
    private Integer mountFlags;

    @ColumnDefault("0")
    @Column(name = "PvpCombatWorldStateID", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT, signed = true)
    private Short pvpCombatWorldStateID;

    @ColumnDefault("'0'")
    @Column(name = "WildBattlePetLevelMin", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Short wildBattlePetLevelMin;

    @ColumnDefault("'0'")
    @Column(name = "WildBattlePetLevelMax", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Short wildBattlePetLevelMax;

    @ColumnDefault("'0'")
    @Column(name = "WindSettingsID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Short windSettingsID;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer flags2;

    @ColumnDefault("'0'")
    @Column(name = "LiquidTypeID1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 24, type = Db2Type.SHORT)
    private Integer liquidTypeID1;

    @ColumnDefault("'0'")
    @Column(name = "LiquidTypeID2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 25, type = Db2Type.SHORT)
    private Integer liquidTypeID2;

    @ColumnDefault("'0'")
    @Column(name = "LiquidTypeID3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 26, type = Db2Type.SHORT)
    private Integer liquidTypeID3;

    @ColumnDefault("'0'")
    @Column(name = "LiquidTypeID4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 27, type = Db2Type.SHORT)
    private Integer liquidTypeID4;

}