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
@Table(name = "taxi_path_node")
@Db2File(name = "TaxiPathNode.db2", layoutHash = 0xD38E8C01, indexField = 4, parentIndexField = 1)
public class TaxiPathNode implements DbcEntity {

    @Column(name = "LocX")
    @Db2Field(fieldIndex = 0, type = Db2Type.FLOAT)
    private Float locX;


    @Column(name = "LocY")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float locY;


    @Column(name = "LocZ")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float locZ;


    @Column(name = "PathID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short pathID;


    @Column(name = "ContinentID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short continentID;


    @Column(name = "NodeIndex")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte nodeIndex;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "Delay")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer delay;


    @Column(name = "ArrivalEventID")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short arrivalEventID;


    @Column(name = "DepartureEventID")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short departureEventID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
