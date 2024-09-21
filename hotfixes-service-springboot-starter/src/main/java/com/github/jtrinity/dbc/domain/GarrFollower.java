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
@Table(name = "garr_follower")
@Db2File(name = "GarrFollower.db2", layoutHash = 0xAAB75E04, indexField = 31)
public class GarrFollower implements DbcEntity {

    @Column(name = "HordeSourceText")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString hordeSourceText;


    @Column(name = "AllianceSourceText")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString allianceSourceText;


    @Column(name = "TitleName")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString titleName;


    @Column(name = "HordeCreatureID")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer hordeCreatureID;


    @Column(name = "AllianceCreatureID")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer allianceCreatureID;


    @Column(name = "HordeIconFileDataID")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer hordeIconFileDataID;


    @Column(name = "AllianceIconFileDataID")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer allianceIconFileDataID;


    @Column(name = "HordeSlottingBroadcastTextID")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer hordeSlottingBroadcastTextID;


    @Column(name = "AllySlottingBroadcastTextID")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer allySlottingBroadcastTextID;


    @Column(name = "HordeGarrFollItemSetID")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short hordeGarrFollItemSetID;


    @Column(name = "AllianceGarrFollItemSetID")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short allianceGarrFollItemSetID;


    @Column(name = "ItemLevelWeapon")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Short itemLevelWeapon;


    @Column(name = "ItemLevelArmor")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Short itemLevelArmor;


    @Column(name = "HordeUITextureKitID")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short hordeUITextureKitID;


    @Column(name = "AllianceUITextureKitID")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short allianceUITextureKitID;


    @Column(name = "GarrFollowerTypeID")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Byte garrFollowerTypeID;


    @Column(name = "HordeGarrFollRaceID")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE)
    private Byte hordeGarrFollRaceID;


    @Column(name = "AllianceGarrFollRaceID")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Byte allianceGarrFollRaceID;


    @Column(name = "Quality")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Byte quality;


    @Column(name = "HordeGarrClassSpecID")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Byte hordeGarrClassSpecID;


    @Column(name = "AllianceGarrClassSpecID")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Byte allianceGarrClassSpecID;


    @Column(name = "FollowerLevel")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Byte followerLevel;


    @Column(name = "Gender")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Byte gender;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "HordeSourceTypeEnum")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE, signed = true)
    private Byte hordeSourceTypeEnum;


    @Column(name = "AllianceSourceTypeEnum")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE, signed = true)
    private Byte allianceSourceTypeEnum;


    @Column(name = "GarrTypeID")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE)
    private Byte garrTypeID;


    @Column(name = "Vitality")
    @Db2Field(fieldIndex = 27, type = Db2Type.BYTE)
    private Byte vitality;


    @Column(name = "ChrClassID")
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE)
    private Byte chrClassID;


    @Column(name = "HordeFlavorGarrStringID")
    @Db2Field(fieldIndex = 29, type = Db2Type.BYTE)
    private Byte hordeFlavorGarrStringID;


    @Column(name = "AllianceFlavorGarrStringID")
    @Db2Field(fieldIndex = 30, type = Db2Type.BYTE)
    private Byte allianceFlavorGarrStringID;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 31, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
