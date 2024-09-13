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
@Table(name = "ui_map_assignment")
@Db2File(name = "UiMapAssignment.db2", fileDataId = 1957219, layoutHash = 0xFA228778, indexField = 3, parentIndexField = 4)
public class UiMapAssignment {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "UiMinX", nullable = false)
    @Db2Field(fieldIndex = 0, type = Db2Type.FLOAT)
    private Float uiMinX;

    @ColumnDefault("0")
    @Column(name = "UiMinY", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float uiMinY;

    @ColumnDefault("0")
    @Column(name = "UiMaxX", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float uiMaxX;

    @ColumnDefault("0")
    @Column(name = "UiMaxY", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float uiMaxY;

    @ColumnDefault("0")
    @Column(name = "Region1X", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float region1X;

    @ColumnDefault("0")
    @Column(name = "Region1Y", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float region1Y;

    @ColumnDefault("0")
    @Column(name = "Region1Z", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float region1Z;

    @ColumnDefault("0")
    @Column(name = "Region2X", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float region2X;

    @ColumnDefault("0")
    @Column(name = "Region2Y", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float region2Y;

    @ColumnDefault("0")
    @Column(name = "Region2Z", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float region2Z;

    @ColumnDefault("0")
    @Column(name = "UiMapID", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer uiMapID;

    @ColumnDefault("0")
    @Column(name = "OrderIndex", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer orderIndex;

    @ColumnDefault("0")
    @Column(name = "MapID", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer mapID;

    @ColumnDefault("0")
    @Column(name = "AreaID", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer areaID;

    @ColumnDefault("0")
    @Column(name = "WmoDoodadPlacementID", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer wmoDoodadPlacementID;

    @ColumnDefault("0")
    @Column(name = "WmoGroupID", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer wmoGroupID;

}