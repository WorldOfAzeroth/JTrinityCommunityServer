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
@Table(name = "garr_site_level")
@Db2File(name = "GarrSiteLevel.db2", layoutHash = 0xD3979C38)
public class GarrSiteLevel implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "TownHallUiPosX")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float townHallUiPosX;


    @Column(name = "TownHallUiPosY")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float townHallUiPosY;


    @Column(name = "MapID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short mapID;


    @Column(name = "UiTextureKitID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short uiTextureKitID;


    @Column(name = "UpgradeMovieID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short upgradeMovieID;


    @Column(name = "UpgradeCost")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short upgradeCost;


    @Column(name = "UpgradeGoldCost")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Short upgradeGoldCost;


    @Column(name = "GarrLevel")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte garrLevel;


    @Column(name = "GarrSiteID")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Byte garrSiteID;


    @Column(name = "MaxBuildingLevel")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Byte maxBuildingLevel;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
