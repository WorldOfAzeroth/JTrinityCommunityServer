package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Table(name = "taxi_path_node")
@Db2File(name = "TaxiPathNode.db2", fileDataId = 1000437, layoutHash = 0xC38748B1, indexField = 1, parentIndexField = 2)
public class TaxiPathNode {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "LocX", nullable = false)
    @Db2Field(fieldIndex = 0, type = Db2Type.FLOAT)
    private Float locX;

    @ColumnDefault("0")
    @Column(name = "LocY", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float locY;

    @ColumnDefault("0")
    @Column(name = "LocZ", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float locZ;

    @ColumnDefault("'0'")
    @Column(name = "PathID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Integer pathID;

    @ColumnDefault("0")
    @Column(name = "NodeIndex", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer nodeIndex;

    @ColumnDefault("'0'")
    @Column(name = "ContinentID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Integer continentID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "Delay", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Long delay;

    @ColumnDefault("'0'")
    @Column(name = "ArrivalEventID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Long arrivalEventID;

    @ColumnDefault("'0'")
    @Column(name = "DepartureEventID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long departureEventID;

}