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
@Table(name = "world_map_overlay")
@Db2File(name = "WorldMapOverlay.db2", layoutHash = 0xDC4B6AF3, indexField = 1, parentIndexField = 4)
public class WorldMapOverlay implements DbcEntity {

    @Column(name = "TextureName")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING_NOT_LOCALIZED)
    private String textureName;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer id;


    @Column(name = "TextureWidth")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short textureWidth;


    @Column(name = "TextureHeight")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short textureHeight;


    @Column(name = "MapAreaID")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer mapAreaID;


    @Column(name = "OffsetX")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer offsetX;


    @Column(name = "OffsetY")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer offsetY;


    @Column(name = "HitRectTop")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer hitRectTop;


    @Column(name = "HitRectLeft")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer hitRectLeft;


    @Column(name = "HitRectBottom")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer hitRectBottom;


    @Column(name = "HitRectRight")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer hitRectRight;


    @Column(name = "PlayerConditionID")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Integer playerConditionID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Integer flags;


    @Column(name = "AreaID1")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Integer areaID1;


    @Column(name = "AreaID2")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Integer areaID2;


    @Column(name = "AreaID3")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Integer areaID3;


    @Column(name = "AreaID4")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Integer areaID4;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
