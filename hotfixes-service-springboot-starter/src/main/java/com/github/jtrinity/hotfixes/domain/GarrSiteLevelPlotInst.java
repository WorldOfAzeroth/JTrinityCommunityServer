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
@Table(name = "garr_site_level_plot_inst")
public class GarrSiteLevelPlotInst {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "UiMarkerPosX", nullable = false)
    private Float uiMarkerPosX;

    @ColumnDefault("0")
    @Column(name = "UiMarkerPosY", nullable = false)
    private Float uiMarkerPosY;

    @ColumnDefault("'0'")
    @Column(name = "GarrSiteLevelID", columnDefinition = "smallint UNSIGNED not null")
    private Integer garrSiteLevelID;

    @ColumnDefault("'0'")
    @Column(name = "GarrPlotInstanceID", columnDefinition = "tinyint UNSIGNED not null")
    private Short garrPlotInstanceID;

    @ColumnDefault("'0'")
    @Column(name = "UiMarkerSize", columnDefinition = "tinyint UNSIGNED not null")
    private Short uiMarkerSize;

}