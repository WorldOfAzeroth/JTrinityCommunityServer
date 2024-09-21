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
@Table(name = "world_map_transforms")
@Db2File(name = "WorldMapTransforms.db2", layoutHash = 0x99FB4B71, parentIndexField = 3)
public class WorldMapTransform implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "RegionMinX")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float regionMinX;


    @Column(name = "RegionMinY")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float regionMinY;


    @Column(name = "RegionMinZ")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float regionMinZ;


    @Column(name = "RegionMaxX")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float regionMaxX;


    @Column(name = "RegionMaxY")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float regionMaxY;


    @Column(name = "RegionMaxZ")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float regionMaxZ;


    @Column(name = "RegionOffsetX")
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float regionOffsetX;


    @Column(name = "RegionOffsetY")
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float regionOffsetY;


    @Column(name = "RegionScale")
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float regionScale;


    @Column(name = "MapID")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short mapID;


    @Column(name = "AreaID")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Short areaID;


    @Column(name = "NewMapID")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Short newMapID;


    @Column(name = "NewDungeonMapID")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short newDungeonMapID;


    @Column(name = "NewAreaID")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short newAreaID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "Priority")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer priority;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
