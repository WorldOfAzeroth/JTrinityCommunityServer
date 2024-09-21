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
@Table(name = "garr_plot")
@Db2File(name = "GarrPlot.db2", layoutHash = 0xE12049E0)
public class GarrPlot implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "AllianceConstructObjID")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer allianceConstructObjID;


    @Column(name = "HordeConstructObjID")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer hordeConstructObjID;


    @Column(name = "UiCategoryID")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte uiCategoryID;


    @Column(name = "PlotType")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte plotType;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "UpgradeRequirement1")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer upgradeRequirement1;


    @Column(name = "UpgradeRequirement2")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer upgradeRequirement2;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
