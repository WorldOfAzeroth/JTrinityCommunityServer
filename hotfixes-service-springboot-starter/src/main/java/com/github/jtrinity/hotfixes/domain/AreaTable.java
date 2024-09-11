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
@Table(name = "area_table")
public class AreaTable {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "ZoneName")
    private String zoneName;

    @Lob
    @Column(name = "AreaName")
    private String areaName;

    @ColumnDefault("'0'")
    @Column(name = "ContinentID", columnDefinition = "smallint UNSIGNED not null")
    private Integer continentID;

    @ColumnDefault("'0'")
    @Column(name = "ParentAreaID", columnDefinition = "smallint UNSIGNED not null")
    private Integer parentAreaID;

    @ColumnDefault("0")
    @Column(name = "AreaBit", nullable = false)
    private Short areaBit;

    @ColumnDefault("'0'")
    @Column(name = "SoundProviderPref", columnDefinition = "tinyint UNSIGNED not null")
    private Short soundProviderPref;

    @ColumnDefault("'0'")
    @Column(name = "SoundProviderPrefUnderwater", columnDefinition = "tinyint UNSIGNED not null")
    private Short soundProviderPrefUnderwater;

    @ColumnDefault("'0'")
    @Column(name = "AmbienceID", columnDefinition = "smallint UNSIGNED not null")
    private Integer ambienceID;

    @ColumnDefault("'0'")
    @Column(name = "UwAmbience", columnDefinition = "smallint UNSIGNED not null")
    private Integer uwAmbience;

    @ColumnDefault("'0'")
    @Column(name = "ZoneMusic", columnDefinition = "smallint UNSIGNED not null")
    private Integer zoneMusic;

    @ColumnDefault("'0'")
    @Column(name = "UwZoneMusic", columnDefinition = "smallint UNSIGNED not null")
    private Integer uwZoneMusic;

    @ColumnDefault("0")
    @Column(name = "ExplorationLevel", nullable = false)
    private Byte explorationLevel;

    @ColumnDefault("'0'")
    @Column(name = "IntroSound", columnDefinition = "smallint UNSIGNED not null")
    private Integer introSound;

    @ColumnDefault("'0'")
    @Column(name = "UwIntroSound", columnDefinition = "int UNSIGNED not null")
    private Long uwIntroSound;

    @ColumnDefault("'0'")
    @Column(name = "FactionGroupMask", columnDefinition = "tinyint UNSIGNED not null")
    private Short factionGroupMask;

    @ColumnDefault("0")
    @Column(name = "AmbientMultiplier", nullable = false)
    private Float ambientMultiplier;

    @ColumnDefault("0")
    @Column(name = "MountFlags", nullable = false)
    private Integer mountFlags;

    @ColumnDefault("0")
    @Column(name = "PvpCombatWorldStateID", nullable = false)
    private Short pvpCombatWorldStateID;

    @ColumnDefault("'0'")
    @Column(name = "WildBattlePetLevelMin", columnDefinition = "tinyint UNSIGNED not null")
    private Short wildBattlePetLevelMin;

    @ColumnDefault("'0'")
    @Column(name = "WildBattlePetLevelMax", columnDefinition = "tinyint UNSIGNED not null")
    private Short wildBattlePetLevelMax;

    @ColumnDefault("'0'")
    @Column(name = "WindSettingsID", columnDefinition = "tinyint UNSIGNED not null")
    private Short windSettingsID;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    private Integer flags2;

    @ColumnDefault("'0'")
    @Column(name = "LiquidTypeID1", columnDefinition = "smallint UNSIGNED not null")
    private Integer liquidTypeID1;

    @ColumnDefault("'0'")
    @Column(name = "LiquidTypeID2", columnDefinition = "smallint UNSIGNED not null")
    private Integer liquidTypeID2;

    @ColumnDefault("'0'")
    @Column(name = "LiquidTypeID3", columnDefinition = "smallint UNSIGNED not null")
    private Integer liquidTypeID3;

    @ColumnDefault("'0'")
    @Column(name = "LiquidTypeID4", columnDefinition = "smallint UNSIGNED not null")
    private Integer liquidTypeID4;

}