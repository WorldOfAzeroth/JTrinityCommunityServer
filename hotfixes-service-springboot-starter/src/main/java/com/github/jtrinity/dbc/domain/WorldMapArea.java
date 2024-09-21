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
@Table(name = "world_map_area")
@Db2File(name = "WorldMapArea.db2", layoutHash = 0xC7E90019, indexField = 15)
public class WorldMapArea implements DbcEntity {

    @Column(name = "AreaName")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING_NOT_LOCALIZED)
    private String areaName;


    @Column(name = "LocLeft")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float locLeft;


    @Column(name = "LocRight")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float locRight;


    @Column(name = "LocTop")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float locTop;


    @Column(name = "LocBottom")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float locBottom;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer flags;


    @Column(name = "MapID")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT, signed = true)
    private Short mapID;


    @Column(name = "AreaID")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Short areaID;


    @Column(name = "DisplayMapID")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT, signed = true)
    private Short displayMapID;


    @Column(name = "DefaultDungeonFloor")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short defaultDungeonFloor;


    @Column(name = "ParentWorldMapID")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short parentWorldMapID;


    @Column(name = "LevelRangeMin")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Byte levelRangeMin;


    @Column(name = "LevelRangeMax")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE)
    private Byte levelRangeMax;


    @Column(name = "BountySetID")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE)
    private Byte bountySetID;


    @Column(name = "BountyDisplayLocation")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE)
    private Byte bountyDisplayLocation;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Integer id;


    @Column(name = "VisibilityPlayerConditionID")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Integer visibilityPlayerConditionID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
