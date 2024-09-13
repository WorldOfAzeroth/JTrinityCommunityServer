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
@Table(name = "gameobject_display_info")
@Db2File(name = "GameObjectDisplayInfo.db2", fileDataId = 1266277, layoutHash = 0xB59CF0B2)
public class GameobjectDisplayInfo {
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
    @Column(name = "ModelName")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String modelName;

    @ColumnDefault("0")
    @Column(name = "GeoBoxMinX", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float geoBoxMinX;

    @ColumnDefault("0")
    @Column(name = "GeoBoxMinY", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float geoBoxMinY;

    @ColumnDefault("0")
    @Column(name = "GeoBoxMinZ", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float geoBoxMinZ;

    @ColumnDefault("0")
    @Column(name = "GeoBoxMaxX", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float geoBoxMaxX;

    @ColumnDefault("0")
    @Column(name = "GeoBoxMaxY", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float geoBoxMaxY;

    @ColumnDefault("0")
    @Column(name = "GeoBoxMaxZ", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float geoBoxMaxZ;

    @ColumnDefault("0")
    @Column(name = "FileDataID", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer fileDataID;

    @ColumnDefault("0")
    @Column(name = "ObjectEffectPackageID", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT, signed = true)
    private Short objectEffectPackageID;

    @ColumnDefault("0")
    @Column(name = "OverrideLootEffectScale", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float overrideLootEffectScale;

    @ColumnDefault("0")
    @Column(name = "OverrideNameScale", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float overrideNameScale;

}