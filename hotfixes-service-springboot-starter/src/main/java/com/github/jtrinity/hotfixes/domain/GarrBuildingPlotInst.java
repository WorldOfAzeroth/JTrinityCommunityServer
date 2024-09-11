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
@Table(name = "garr_building_plot_inst")
public class GarrBuildingPlotInst {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "MapOffsetX", nullable = false)
    private Float mapOffsetX;

    @ColumnDefault("0")
    @Column(name = "MapOffsetY", nullable = false)
    private Float mapOffsetY;

    @ColumnDefault("'0'")
    @Column(name = "GarrBuildingID", columnDefinition = "tinyint UNSIGNED not null")
    private Short garrBuildingID;

    @ColumnDefault("'0'")
    @Column(name = "GarrSiteLevelPlotInstID", columnDefinition = "smallint UNSIGNED not null")
    private Integer garrSiteLevelPlotInstID;

    @ColumnDefault("'0'")
    @Column(name = "UiTextureAtlasMemberID", columnDefinition = "smallint UNSIGNED not null")
    private Integer uiTextureAtlasMemberID;

}