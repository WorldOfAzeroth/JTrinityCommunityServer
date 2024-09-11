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
@Table(name = "wmo_area_table")
public class WmoAreaTable {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "AreaName")
    private String areaName;

    @ColumnDefault("'0'")
    @Column(name = "WmoID", columnDefinition = "smallint UNSIGNED not null")
    private Integer wmoID;

    @ColumnDefault("'0'")
    @Column(name = "NameSetID", columnDefinition = "tinyint UNSIGNED not null")
    private Short nameSetID;

    @ColumnDefault("0")
    @Column(name = "WmoGroupID", nullable = false)
    private Integer wmoGroupID;

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
    @Column(name = "UwZoneMusic", columnDefinition = "int UNSIGNED not null")
    private Long uwZoneMusic;

    @ColumnDefault("'0'")
    @Column(name = "IntroSound", columnDefinition = "smallint UNSIGNED not null")
    private Integer introSound;

    @ColumnDefault("'0'")
    @Column(name = "UwIntroSound", columnDefinition = "smallint UNSIGNED not null")
    private Integer uwIntroSound;

    @ColumnDefault("'0'")
    @Column(name = "AreaTableID", columnDefinition = "smallint UNSIGNED not null")
    private Integer areaTableID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

}