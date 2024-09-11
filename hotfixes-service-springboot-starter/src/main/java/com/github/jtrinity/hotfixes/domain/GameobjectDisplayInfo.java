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
@Table(name = "gameobject_display_info")
public class GameobjectDisplayInfo {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "ModelName")
    private String modelName;

    @ColumnDefault("0")
    @Column(name = "GeoBoxMinX", nullable = false)
    private Float geoBoxMinX;

    @ColumnDefault("0")
    @Column(name = "GeoBoxMinY", nullable = false)
    private Float geoBoxMinY;

    @ColumnDefault("0")
    @Column(name = "GeoBoxMinZ", nullable = false)
    private Float geoBoxMinZ;

    @ColumnDefault("0")
    @Column(name = "GeoBoxMaxX", nullable = false)
    private Float geoBoxMaxX;

    @ColumnDefault("0")
    @Column(name = "GeoBoxMaxY", nullable = false)
    private Float geoBoxMaxY;

    @ColumnDefault("0")
    @Column(name = "GeoBoxMaxZ", nullable = false)
    private Float geoBoxMaxZ;

    @ColumnDefault("0")
    @Column(name = "FileDataID", nullable = false)
    private Integer fileDataID;

    @ColumnDefault("0")
    @Column(name = "ObjectEffectPackageID", nullable = false)
    private Short objectEffectPackageID;

    @ColumnDefault("0")
    @Column(name = "OverrideLootEffectScale", nullable = false)
    private Float overrideLootEffectScale;

    @ColumnDefault("0")
    @Column(name = "OverrideNameScale", nullable = false)
    private Float overrideNameScale;

}