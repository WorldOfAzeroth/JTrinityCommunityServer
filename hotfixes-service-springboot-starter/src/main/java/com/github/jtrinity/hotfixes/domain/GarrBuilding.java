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
@Table(name = "garr_building")
public class GarrBuilding {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "HordeName")
    private String hordeName;

    @Lob
    @Column(name = "AllianceName")
    private String allianceName;

    @Lob
    @Column(name = "Description")
    private String description;

    @Lob
    @Column(name = "Tooltip")
    private String tooltip;

    @ColumnDefault("'0'")
    @Column(name = "GarrTypeID", columnDefinition = "tinyint UNSIGNED not null")
    private Short garrTypeID;

    @ColumnDefault("'0'")
    @Column(name = "BuildingType", columnDefinition = "tinyint UNSIGNED not null")
    private Short buildingType;

    @ColumnDefault("0")
    @Column(name = "HordeGameObjectID", nullable = false)
    private Integer hordeGameObjectID;

    @ColumnDefault("0")
    @Column(name = "AllianceGameObjectID", nullable = false)
    private Integer allianceGameObjectID;

    @ColumnDefault("'0'")
    @Column(name = "GarrSiteID", columnDefinition = "tinyint UNSIGNED not null")
    private Short garrSiteID;

    @ColumnDefault("'0'")
    @Column(name = "UpgradeLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short upgradeLevel;

    @ColumnDefault("0")
    @Column(name = "BuildSeconds", nullable = false)
    private Integer buildSeconds;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyTypeID", columnDefinition = "smallint UNSIGNED not null")
    private Integer currencyTypeID;

    @ColumnDefault("0")
    @Column(name = "CurrencyQty", nullable = false)
    private Integer currencyQty;

    @ColumnDefault("'0'")
    @Column(name = "HordeUiTextureKitID", columnDefinition = "smallint UNSIGNED not null")
    private Integer hordeUiTextureKitID;

    @ColumnDefault("'0'")
    @Column(name = "AllianceUiTextureKitID", columnDefinition = "smallint UNSIGNED not null")
    private Integer allianceUiTextureKitID;

    @ColumnDefault("0")
    @Column(name = "IconFileDataID", nullable = false)
    private Integer iconFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "AllianceSceneScriptPackageID", columnDefinition = "smallint UNSIGNED not null")
    private Integer allianceSceneScriptPackageID;

    @ColumnDefault("'0'")
    @Column(name = "HordeSceneScriptPackageID", columnDefinition = "smallint UNSIGNED not null")
    private Integer hordeSceneScriptPackageID;

    @ColumnDefault("0")
    @Column(name = "MaxAssignments", nullable = false)
    private Integer maxAssignments;

    @ColumnDefault("'0'")
    @Column(name = "ShipmentCapacity", columnDefinition = "tinyint UNSIGNED not null")
    private Short shipmentCapacity;

    @ColumnDefault("'0'")
    @Column(name = "GarrAbilityID", columnDefinition = "smallint UNSIGNED not null")
    private Integer garrAbilityID;

    @ColumnDefault("'0'")
    @Column(name = "BonusGarrAbilityID", columnDefinition = "smallint UNSIGNED not null")
    private Integer bonusGarrAbilityID;

    @ColumnDefault("'0'")
    @Column(name = "GoldCost", columnDefinition = "smallint UNSIGNED not null")
    private Integer goldCost;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

}