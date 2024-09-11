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
@Table(name = "garr_plot_building")
public class GarrPlotBuilding {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "GarrPlotID", columnDefinition = "tinyint UNSIGNED not null")
    private Short garrPlotID;

    @ColumnDefault("'0'")
    @Column(name = "GarrBuildingID", columnDefinition = "tinyint UNSIGNED not null")
    private Short garrBuildingID;

}