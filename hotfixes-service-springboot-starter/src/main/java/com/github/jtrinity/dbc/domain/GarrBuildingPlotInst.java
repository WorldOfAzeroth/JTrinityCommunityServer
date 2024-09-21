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
@Table(name = "garr_building_plot_inst")
@Db2File(name = "GarrBuildingPlotInst.db2", layoutHash = 0xF45B6227, indexField = 4, parentIndexField = 3)
public class GarrBuildingPlotInst implements DbcEntity {

    @Column(name = "MapOffsetX")
    @Db2Field(fieldIndex = 0, type = Db2Type.FLOAT)
    private Float mapOffsetX;


    @Column(name = "MapOffsetY")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float mapOffsetY;


    @Column(name = "UiTextureAtlasMemberID")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short uiTextureAtlasMemberID;


    @Column(name = "GarrSiteLevelPlotInstID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short garrSiteLevelPlotInstID;


    @Column(name = "GarrBuildingID")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte garrBuildingID;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
