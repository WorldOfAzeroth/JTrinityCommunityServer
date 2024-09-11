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
@Table(name = "garr_plot")
public class GarrPlot {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @ColumnDefault("'0'")
    @Column(name = "PlotType", columnDefinition = "tinyint UNSIGNED not null")
    private Short plotType;

    @ColumnDefault("0")
    @Column(name = "HordeConstructObjID", nullable = false)
    private Integer hordeConstructObjID;

    @ColumnDefault("0")
    @Column(name = "AllianceConstructObjID", nullable = false)
    private Integer allianceConstructObjID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "UiCategoryID", columnDefinition = "tinyint UNSIGNED not null")
    private Short uiCategoryID;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeRequirement1", columnDefinition = "int UNSIGNED not null")
    private Long upgradeRequirement1;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeRequirement2", columnDefinition = "int UNSIGNED not null")
    private Long upgradeRequirement2;

}