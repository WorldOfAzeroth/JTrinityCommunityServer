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
@Table(name = "wmo_area_table")
@Db2File(name = "WMOAreaTable.db2", layoutHash = 0x4616C893, indexField = 12, parentIndexField = 14)
public class WmoAreaTable implements DbcEntity {

    @Column(name = "AreaName")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString areaName;


    @Column(name = "WmoGroupID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer wmoGroupID;


    @Column(name = "AmbienceID")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short ambienceID;


    @Column(name = "ZoneMusic")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short zoneMusic;


    @Column(name = "IntroSound")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short introSound;


    @Column(name = "AreaTableID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short areaTableID;


    @Column(name = "UwIntroSound")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short uwIntroSound;


    @Column(name = "UwAmbience")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Short uwAmbience;


    @Column(name = "NameSetID")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte nameSetID;


    @Column(name = "SoundProviderPref")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Byte soundProviderPref;


    @Column(name = "SoundProviderPrefUnderwater")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Byte soundProviderPrefUnderwater;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Byte flags;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Integer id;


    @Column(name = "UwZoneMusic")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Integer uwZoneMusic;


    @Column(name = "WmoID")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short wmoID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
