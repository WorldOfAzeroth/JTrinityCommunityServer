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
@Table(name = "ui_map_link")
public class UiMapLink {
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
    @Column(name = "ParentUiMapID", nullable = false)
    private Integer parentUiMapID;

    @ColumnDefault("0")
    @Column(name = "OrderIndex", nullable = false)
    private Integer orderIndex;

    @ColumnDefault("0")
    @Column(name = "ChildUiMapID", nullable = false)
    private Integer childUiMapID;

    @ColumnDefault("0")
    @Column(name = "OverrideHighlightFileDataID", nullable = false)
    private Integer overrideHighlightFileDataID;

    @ColumnDefault("0")
    @Column(name = "OverrideHighlightAtlasID", nullable = false)
    private Integer overrideHighlightAtlasID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

}