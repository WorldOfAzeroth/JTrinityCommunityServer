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
@Table(name = "garr_site_level_plot_inst")
@Db2File(name = "GarrSiteLevelPlotInst.db2", layoutHash = 0xC4E74201, parentIndexField = 1)
public class GarrSiteLevelPlotInst implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "UiMarkerPosX")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float uiMarkerPosX;


    @Column(name = "UiMarkerPosY")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float uiMarkerPosY;


    @Column(name = "GarrSiteLevelID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short garrSiteLevelID;


    @Column(name = "GarrPlotInstanceID")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte garrPlotInstanceID;


    @Column(name = "UiMarkerSize")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte uiMarkerSize;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
