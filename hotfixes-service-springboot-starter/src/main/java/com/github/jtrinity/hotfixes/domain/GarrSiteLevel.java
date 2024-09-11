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
@Table(name = "garr_site_level")
public class GarrSiteLevel {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "TownHallUiPosX", nullable = false)
    private Float townHallUiPosX;

    @ColumnDefault("0")
    @Column(name = "TownHallUiPosY", nullable = false)
    private Float townHallUiPosY;

    @ColumnDefault("'0'")
    @Column(name = "GarrSiteID", columnDefinition = "int UNSIGNED not null")
    private Long garrSiteID;

    @ColumnDefault("'0'")
    @Column(name = "GarrLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short garrLevel;

    @ColumnDefault("'0'")
    @Column(name = "MapID", columnDefinition = "smallint UNSIGNED not null")
    private Integer mapID;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeMovieID", columnDefinition = "smallint UNSIGNED not null")
    private Integer upgradeMovieID;

    @ColumnDefault("'0'")
    @Column(name = "UiTextureKitID", columnDefinition = "smallint UNSIGNED not null")
    private Integer uiTextureKitID;

    @ColumnDefault("'0'")
    @Column(name = "MaxBuildingLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short maxBuildingLevel;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeCost", columnDefinition = "smallint UNSIGNED not null")
    private Integer upgradeCost;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeGoldCost", columnDefinition = "smallint UNSIGNED not null")
    private Integer upgradeGoldCost;

}