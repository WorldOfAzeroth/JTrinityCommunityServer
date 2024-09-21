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
@Table(name = "map")
@Db2File(name = "Map.db2", layoutHash = 0xF568DF12)
public class MapEntry implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Directory")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String directory;


    @Column(name = "MapName")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString mapName;


    @Column(name = "MapDescription0")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private LocalizedString mapDescription0;


    @Column(name = "MapDescription1")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private LocalizedString mapDescription1;


    @Column(name = "PvpShortDescription")
    @Db2Field(fieldIndex = 5, type = Db2Type.STRING)
    private LocalizedString pvpShortDescription;


    @Column(name = "PvpLongDescription")
    @Db2Field(fieldIndex = 6, type = Db2Type.STRING)
    private LocalizedString pvpLongDescription;


    @Column(name = "Flags1")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer flags1;


    @Column(name = "Flags2")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer flags2;


    @Column(name = "MinimapIconScale")
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float minimapIconScale;


    @Column(name = "CorpseX")
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float corpseX;


    @Column(name = "CorpseY")
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float corpseY;


    @Column(name = "AreaTableID")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Short areaTableID;


    @Column(name = "LoadingScreenID")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT, signed = true)
    private Short loadingScreenID;


    @Column(name = "CorpseMapID")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT, signed = true)
    private Short corpseMapID;


    @Column(name = "TimeOfDayOverride")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT, signed = true)
    private Short timeOfDayOverride;


    @Column(name = "ParentMapID")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT, signed = true)
    private Short parentMapID;


    @Column(name = "CosmeticParentMapID")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT, signed = true)
    private Short cosmeticParentMapID;


    @Column(name = "WindSettingsID")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT, signed = true)
    private Short windSettingsID;


    @Column(name = "InstanceType")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Byte instanceType;


    @Column(name = "MapType")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Byte mapType;


    @Column(name = "ExpansionID")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Byte expansionID;


    @Column(name = "MaxPlayers")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Byte maxPlayers;


    @Column(name = "TimeOffset")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Byte timeOffset;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
