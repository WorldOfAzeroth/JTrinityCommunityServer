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
@Table(name = "wmo_area_table")
@Db2File(name = "WMOAreaTable.db2", fileDataId = 1355528, layoutHash = 0xCD7AF6E0, indexField = 1, parentIndexField = 2)
public class WmoAreaTable {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "AreaName")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private String areaName;

    @ColumnDefault("'0'")
    @Column(name = "WmoID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Integer wmoID;

    @ColumnDefault("'0'")
    @Column(name = "NameSetID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short nameSetID;

    @ColumnDefault("0")
    @Column(name = "WmoGroupID", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer wmoGroupID;

    @ColumnDefault("'0'")
    @Column(name = "SoundProviderPref", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Short soundProviderPref;

    @ColumnDefault("'0'")
    @Column(name = "SoundProviderPrefUnderwater", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short soundProviderPrefUnderwater;

    @ColumnDefault("'0'")
    @Column(name = "AmbienceID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Integer ambienceID;

    @ColumnDefault("'0'")
    @Column(name = "UwAmbience", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Integer uwAmbience;

    @ColumnDefault("'0'")
    @Column(name = "ZoneMusic", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Integer zoneMusic;

    @ColumnDefault("'0'")
    @Column(name = "UwZoneMusic", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long uwZoneMusic;

    @ColumnDefault("'0'")
    @Column(name = "IntroSound", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Integer introSound;

    @ColumnDefault("'0'")
    @Column(name = "UwIntroSound", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Integer uwIntroSound;

    @ColumnDefault("'0'")
    @Column(name = "AreaTableID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Integer areaTableID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE)
    private Short flags;

}