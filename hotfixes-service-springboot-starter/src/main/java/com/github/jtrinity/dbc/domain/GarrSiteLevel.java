package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2DataBind;
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
@Db2DataBind(name = "GarrSiteLevel.db2", layoutHash = 0xD3979C38, fields = {
        @Db2Field(name = {"townHallUiPosX", "townHallUiPosY"}, type = Db2Type.FLOAT),
        @Db2Field(name = "mapID", type = Db2Type.SHORT),
        @Db2Field(name = "uiTextureKitID", type = Db2Type.SHORT),
        @Db2Field(name = "upgradeMovieID", type = Db2Type.SHORT),
        @Db2Field(name = "upgradeCost", type = Db2Type.SHORT),
        @Db2Field(name = "upgradeGoldCost", type = Db2Type.SHORT),
        @Db2Field(name = "garrLevel", type = Db2Type.BYTE),
        @Db2Field(name = "garrSiteID", type = Db2Type.BYTE),
        @Db2Field(name = "maxBuildingLevel", type = Db2Type.BYTE)
})
public class GarrSiteLevel implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "TownHallUiPosX")
    private Float townHallUiPosX;

    @Column(name = "TownHallUiPosY")
    private Float townHallUiPosY;

    @Column(name = "MapID")
    private Short mapID;

    @Column(name = "UiTextureKitID")
    private Short uiTextureKitID;

    @Column(name = "UpgradeMovieID")
    private Short upgradeMovieID;

    @Column(name = "UpgradeCost")
    private Short upgradeCost;

    @Column(name = "UpgradeGoldCost")
    private Short upgradeGoldCost;

    @Column(name = "GarrLevel")
    private Byte garrLevel;

    @Column(name = "GarrSiteID")
    private Short garrSiteID;

    @Column(name = "MaxBuildingLevel")
    private Byte maxBuildingLevel;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
