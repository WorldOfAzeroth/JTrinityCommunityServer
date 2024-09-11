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
@Table(name = "ui_map_assignment")
public class UiMapAssignment {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "UiMinX", nullable = false)
    private Float uiMinX;

    @ColumnDefault("0")
    @Column(name = "UiMinY", nullable = false)
    private Float uiMinY;

    @ColumnDefault("0")
    @Column(name = "UiMaxX", nullable = false)
    private Float uiMaxX;

    @ColumnDefault("0")
    @Column(name = "UiMaxY", nullable = false)
    private Float uiMaxY;

    @ColumnDefault("0")
    @Column(name = "Region1X", nullable = false)
    private Float region1X;

    @ColumnDefault("0")
    @Column(name = "Region1Y", nullable = false)
    private Float region1Y;

    @ColumnDefault("0")
    @Column(name = "Region1Z", nullable = false)
    private Float region1Z;

    @ColumnDefault("0")
    @Column(name = "Region2X", nullable = false)
    private Float region2X;

    @ColumnDefault("0")
    @Column(name = "Region2Y", nullable = false)
    private Float region2Y;

    @ColumnDefault("0")
    @Column(name = "Region2Z", nullable = false)
    private Float region2Z;

    @ColumnDefault("0")
    @Column(name = "UiMapID", nullable = false)
    private Integer uiMapID;

    @ColumnDefault("0")
    @Column(name = "OrderIndex", nullable = false)
    private Integer orderIndex;

    @ColumnDefault("0")
    @Column(name = "MapID", nullable = false)
    private Integer mapID;

    @ColumnDefault("0")
    @Column(name = "AreaID", nullable = false)
    private Integer areaID;

    @ColumnDefault("0")
    @Column(name = "WmoDoodadPlacementID", nullable = false)
    private Integer wmoDoodadPlacementID;

    @ColumnDefault("0")
    @Column(name = "WmoGroupID", nullable = false)
    private Integer wmoGroupID;

}