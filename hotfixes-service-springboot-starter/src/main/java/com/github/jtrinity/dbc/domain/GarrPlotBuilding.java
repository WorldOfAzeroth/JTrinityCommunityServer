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
@Table(name = "garr_plot_building")
@Db2File(name = "GarrPlotBuilding.db2", layoutHash = 0x3F77A6FA)
public class GarrPlotBuilding implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "GarrPlotID")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Byte garrPlotID;


    @Column(name = "GarrBuildingID")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Byte garrBuildingID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
