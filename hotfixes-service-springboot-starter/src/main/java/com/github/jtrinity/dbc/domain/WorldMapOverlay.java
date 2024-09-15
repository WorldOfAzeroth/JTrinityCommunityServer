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
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "world_map_overlay")
@Db2File(name = "WorldMapOverlay.db2", layoutHash = 0xD73DE991, indexField = 0, parentIndexField = 1)
public class WorldMapOverlay implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private  Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "UiMapArtID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Long uiMapArtID;

    @ColumnDefault("'0'")
    @Column(name = "TextureWidth", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Integer textureWidth;

    @ColumnDefault("'0'")
    @Column(name = "TextureHeight", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Integer textureHeight;

    @ColumnDefault("0")
    @Column(name = "OffsetX", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer offsetX;

    @ColumnDefault("0")
    @Column(name = "OffsetY", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer offsetY;

    @ColumnDefault("0")
    @Column(name = "HitRectTop", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer hitRectTop;

    @ColumnDefault("0")
    @Column(name = "HitRectBottom", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer hitRectBottom;

    @ColumnDefault("0")
    @Column(name = "HitRectLeft", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer hitRectLeft;

    @ColumnDefault("0")
    @Column(name = "HitRectRight", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer hitRectRight;

    @ColumnDefault("'0'")
    @Column(name = "PlayerConditionID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long playerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Long flags;

    @ColumnDefault("'0'")
    @Column(name = "AreaID1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Long areaID1;

    @ColumnDefault("'0'")
    @Column(name = "AreaID2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Long areaID2;

    @ColumnDefault("'0'")
    @Column(name = "AreaID3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Long areaID3;

    @ColumnDefault("'0'")
    @Column(name = "AreaID4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Long areaID4;

}