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
@Table(name = "garr_building")
@Db2File(name = "GarrBuilding.db2", layoutHash = 0x200F9858)
public class GarrBuilding implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "AllianceName")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString allianceName;


    @Column(name = "HordeName")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString hordeName;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "Tooltip")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private LocalizedString tooltip;


    @Column(name = "HordeGameObjectID")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer hordeGameObjectID;


    @Column(name = "AllianceGameObjectID")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer allianceGameObjectID;


    @Column(name = "IconFileDataID")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer iconFileDataID;


    @Column(name = "CurrencyTypeID")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Short currencyTypeID;


    @Column(name = "HordeUiTextureKitID")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short hordeUiTextureKitID;


    @Column(name = "AllianceUiTextureKitID")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short allianceUiTextureKitID;


    @Column(name = "AllianceSceneScriptPackageID")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Short allianceSceneScriptPackageID;


    @Column(name = "HordeSceneScriptPackageID")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Short hordeSceneScriptPackageID;


    @Column(name = "GarrAbilityID")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short garrAbilityID;


    @Column(name = "BonusGarrAbilityID")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short bonusGarrAbilityID;


    @Column(name = "GoldCost")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Short goldCost;


    @Column(name = "GarrSiteID")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE)
    private Byte garrSiteID;


    @Column(name = "BuildingType")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Byte buildingType;


    @Column(name = "UpgradeLevel")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Byte upgradeLevel;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "ShipmentCapacity")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Byte shipmentCapacity;


    @Column(name = "GarrTypeID")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Byte garrTypeID;


    @Column(name = "BuildSeconds")
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer buildSeconds;


    @Column(name = "CurrencyQty")
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer currencyQty;


    @Column(name = "MaxAssignments")
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer maxAssignments;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
