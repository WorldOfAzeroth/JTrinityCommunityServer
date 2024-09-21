package com.github.jtrinity.dbc.domain;

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
@Table(name = "gameobject_display_info")
@Db2File(name = "GameObjectDisplayInfo.db2", layoutHash = 0x9F2098D1)
public class GameObjectDisplayInfo implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "FileDataID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer fileDataID;


    @Column(name = "GeoBoxMinX")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float geoBoxMinX;


    @Column(name = "GeoBoxMinY")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float geoBoxMinY;


    @Column(name = "GeoBoxMinZ")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float geoBoxMinZ;


    @Column(name = "GeoBoxMaxX")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float geoBoxMaxX;


    @Column(name = "GeoBoxMaxY")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float geoBoxMaxY;


    @Column(name = "GeoBoxMaxZ")
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float geoBoxMaxZ;


    @Column(name = "OverrideLootEffectScale")
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float overrideLootEffectScale;


    @Column(name = "OverrideNameScale")
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float overrideNameScale;


    @Column(name = "ObjectEffectPackageID")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT, signed = true)
    private Short objectEffectPackageID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
