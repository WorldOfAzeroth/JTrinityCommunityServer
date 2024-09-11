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
@Table(name = "taxi_nodes")
public class TaxiNode {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @ColumnDefault("0")
    @Column(name = "PosX", nullable = false)
    private Float posX;

    @ColumnDefault("0")
    @Column(name = "PosY", nullable = false)
    private Float posY;

    @ColumnDefault("0")
    @Column(name = "PosZ", nullable = false)
    private Float posZ;

    @ColumnDefault("0")
    @Column(name = "MapOffsetX", nullable = false)
    private Float mapOffsetX;

    @ColumnDefault("0")
    @Column(name = "MapOffsetY", nullable = false)
    private Float mapOffsetY;

    @ColumnDefault("0")
    @Column(name = "FlightMapOffsetX", nullable = false)
    private Float flightMapOffsetX;

    @ColumnDefault("0")
    @Column(name = "FlightMapOffsetY", nullable = false)
    private Float flightMapOffsetY;

    @ColumnDefault("'0'")
    @Column(name = "ContinentID", columnDefinition = "int UNSIGNED not null")
    private Long continentID;

    @ColumnDefault("'0'")
    @Column(name = "ConditionID", columnDefinition = "int UNSIGNED not null")
    private Long conditionID;

    @ColumnDefault("'0'")
    @Column(name = "CharacterBitNumber", columnDefinition = "smallint UNSIGNED not null")
    private Integer characterBitNumber;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "UiTextureKitID", nullable = false)
    private Integer uiTextureKitID;

    @ColumnDefault("0")
    @Column(name = "Facing", nullable = false)
    private Float facing;

    @ColumnDefault("'0'")
    @Column(name = "SpecialIconConditionID", columnDefinition = "int UNSIGNED not null")
    private Long specialIconConditionID;

    @ColumnDefault("'0'")
    @Column(name = "VisibilityConditionID", columnDefinition = "int UNSIGNED not null")
    private Long visibilityConditionID;

    @ColumnDefault("0")
    @Column(name = "MountCreatureID1", nullable = false)
    private Integer mountCreatureID1;

    @ColumnDefault("0")
    @Column(name = "MountCreatureID2", nullable = false)
    private Integer mountCreatureID2;

}