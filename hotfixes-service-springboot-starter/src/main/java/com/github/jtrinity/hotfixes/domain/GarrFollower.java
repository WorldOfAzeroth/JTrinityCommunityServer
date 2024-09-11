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
@Table(name = "garr_follower")
public class GarrFollower {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "HordeSourceText")
    private String hordeSourceText;

    @Lob
    @Column(name = "AllianceSourceText")
    private String allianceSourceText;

    @Lob
    @Column(name = "TitleName")
    private String titleName;

    @ColumnDefault("'0'")
    @Column(name = "GarrTypeID", columnDefinition = "tinyint UNSIGNED not null")
    private Short garrTypeID;

    @ColumnDefault("'0'")
    @Column(name = "GarrFollowerTypeID", columnDefinition = "tinyint UNSIGNED not null")
    private Short garrFollowerTypeID;

    @ColumnDefault("0")
    @Column(name = "HordeCreatureID", nullable = false)
    private Integer hordeCreatureID;

    @ColumnDefault("0")
    @Column(name = "AllianceCreatureID", nullable = false)
    private Integer allianceCreatureID;

    @ColumnDefault("'0'")
    @Column(name = "HordeGarrFollRaceID", columnDefinition = "tinyint UNSIGNED not null")
    private Short hordeGarrFollRaceID;

    @ColumnDefault("'0'")
    @Column(name = "AllianceGarrFollRaceID", columnDefinition = "tinyint UNSIGNED not null")
    private Short allianceGarrFollRaceID;

    @ColumnDefault("'0'")
    @Column(name = "HordeGarrClassSpecID", columnDefinition = "tinyint UNSIGNED not null")
    private Short hordeGarrClassSpecID;

    @ColumnDefault("'0'")
    @Column(name = "AllianceGarrClassSpecID", columnDefinition = "tinyint UNSIGNED not null")
    private Short allianceGarrClassSpecID;

    @ColumnDefault("'0'")
    @Column(name = "Quality", columnDefinition = "tinyint UNSIGNED not null")
    private Short quality;

    @ColumnDefault("'0'")
    @Column(name = "FollowerLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short followerLevel;

    @ColumnDefault("'0'")
    @Column(name = "ItemLevelWeapon", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemLevelWeapon;

    @ColumnDefault("'0'")
    @Column(name = "ItemLevelArmor", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemLevelArmor;

    @ColumnDefault("0")
    @Column(name = "HordeSourceTypeEnum", nullable = false)
    private Byte hordeSourceTypeEnum;

    @ColumnDefault("0")
    @Column(name = "AllianceSourceTypeEnum", nullable = false)
    private Byte allianceSourceTypeEnum;

    @ColumnDefault("0")
    @Column(name = "HordeIconFileDataID", nullable = false)
    private Integer hordeIconFileDataID;

    @ColumnDefault("0")
    @Column(name = "AllianceIconFileDataID", nullable = false)
    private Integer allianceIconFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "HordeGarrFollItemSetID", columnDefinition = "smallint UNSIGNED not null")
    private Integer hordeGarrFollItemSetID;

    @ColumnDefault("'0'")
    @Column(name = "AllianceGarrFollItemSetID", columnDefinition = "smallint UNSIGNED not null")
    private Integer allianceGarrFollItemSetID;

    @ColumnDefault("'0'")
    @Column(name = "HordeUITextureKitID", columnDefinition = "smallint UNSIGNED not null")
    private Integer hordeUITextureKitID;

    @ColumnDefault("'0'")
    @Column(name = "AllianceUITextureKitID", columnDefinition = "smallint UNSIGNED not null")
    private Integer allianceUITextureKitID;

    @ColumnDefault("'0'")
    @Column(name = "Vitality", columnDefinition = "tinyint UNSIGNED not null")
    private Short vitality;

    @ColumnDefault("'0'")
    @Column(name = "HordeFlavorGarrStringID", columnDefinition = "tinyint UNSIGNED not null")
    private Short hordeFlavorGarrStringID;

    @ColumnDefault("'0'")
    @Column(name = "AllianceFlavorGarrStringID", columnDefinition = "tinyint UNSIGNED not null")
    private Short allianceFlavorGarrStringID;

    @ColumnDefault("'0'")
    @Column(name = "HordeSlottingBroadcastTextID", columnDefinition = "int UNSIGNED not null")
    private Long hordeSlottingBroadcastTextID;

    @ColumnDefault("'0'")
    @Column(name = "AllySlottingBroadcastTextID", columnDefinition = "int UNSIGNED not null")
    private Long allySlottingBroadcastTextID;

    @ColumnDefault("'0'")
    @Column(name = "ChrClassID", columnDefinition = "tinyint UNSIGNED not null")
    private Short chrClassID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "Gender", columnDefinition = "tinyint UNSIGNED not null")
    private Short gender;

}