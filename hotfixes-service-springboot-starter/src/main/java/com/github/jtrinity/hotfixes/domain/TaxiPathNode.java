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
@Table(name = "taxi_path_node")
public class TaxiPathNode {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "LocX", nullable = false)
    private Float locX;

    @ColumnDefault("0")
    @Column(name = "LocY", nullable = false)
    private Float locY;

    @ColumnDefault("0")
    @Column(name = "LocZ", nullable = false)
    private Float locZ;

    @ColumnDefault("'0'")
    @Column(name = "PathID", columnDefinition = "smallint UNSIGNED not null")
    private Integer pathID;

    @ColumnDefault("0")
    @Column(name = "NodeIndex", nullable = false)
    private Integer nodeIndex;

    @ColumnDefault("'0'")
    @Column(name = "ContinentID", columnDefinition = "smallint UNSIGNED not null")
    private Integer continentID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "Delay", columnDefinition = "int UNSIGNED not null")
    private Long delay;

    @ColumnDefault("'0'")
    @Column(name = "ArrivalEventID", columnDefinition = "int UNSIGNED not null")
    private Long arrivalEventID;

    @ColumnDefault("'0'")
    @Column(name = "DepartureEventID", columnDefinition = "int UNSIGNED not null")
    private Long departureEventID;

}