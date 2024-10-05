package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2DataBind;
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
@Table(name = "game_object_display_info")
@Db2DataBind(name = "GameObjectDisplayInfo.db2", layoutHash = 0x9F2098D1, fields = {
        @Db2Field(name = "fileDataID", type = Db2Type.INT, signed = true),
        @Db2Field(name = {"geoBoxMinX", "geoBoxMinY", "geoBoxMinZ", "geoBoxMaxX", "geoBoxMaxY", "geoBoxMaxZ"}, type = Db2Type.FLOAT),
        @Db2Field(name = "overrideLootEffectScale", type = Db2Type.FLOAT),
        @Db2Field(name = "overrideNameScale", type = Db2Type.FLOAT),
        @Db2Field(name = "objectEffectPackageID", type = Db2Type.SHORT, signed = true)
})
public class GameObjectDisplayInfo implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "FileDataID")
    private Integer fileDataID;

    @Column(name = "GeoBoxMinX")
    private Float geoBoxMinX;

    @Column(name = "GeoBoxMinY")
    private Float geoBoxMinY;

    @Column(name = "GeoBoxMinZ")
    private Float geoBoxMinZ;

    @Column(name = "GeoBoxMaxX")
    private Float geoBoxMaxX;

    @Column(name = "GeoBoxMaxY")
    private Float geoBoxMaxY;

    @Column(name = "GeoBoxMaxZ")
    private Float geoBoxMaxZ;

    @Column(name = "OverrideLootEffectScale")
    private Float overrideLootEffectScale;

    @Column(name = "OverrideNameScale")
    private Float overrideNameScale;

    @Column(name = "ObjectEffectPackageID")
    private Short objectEffectPackageID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
