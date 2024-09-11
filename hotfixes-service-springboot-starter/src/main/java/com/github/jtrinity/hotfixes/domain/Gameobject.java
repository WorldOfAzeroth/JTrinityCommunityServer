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
@Table(name = "gameobjects")
public class Gameobject {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

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
    @Column(name = "Rot1", nullable = false)
    private Float rot1;

    @ColumnDefault("0")
    @Column(name = "Rot2", nullable = false)
    private Float rot2;

    @ColumnDefault("0")
    @Column(name = "Rot3", nullable = false)
    private Float rot3;

    @ColumnDefault("0")
    @Column(name = "Rot4", nullable = false)
    private Float rot4;

    @ColumnDefault("'0'")
    @Column(name = "OwnerID", columnDefinition = "smallint UNSIGNED not null")
    private Integer ownerID;

    @ColumnDefault("'0'")
    @Column(name = "DisplayID", columnDefinition = "int UNSIGNED not null")
    private Long displayID;

    @ColumnDefault("0")
    @Column(name = "Scale", nullable = false)
    private Float scale;

    @ColumnDefault("'0'")
    @Column(name = "TypeID", columnDefinition = "tinyint UNSIGNED not null")
    private Short typeID;

    @ColumnDefault("0")
    @Column(name = "PhaseUseFlags", nullable = false)
    private Integer phaseUseFlags;

    @ColumnDefault("'0'")
    @Column(name = "PhaseID", columnDefinition = "smallint UNSIGNED not null")
    private Integer phaseID;

    @ColumnDefault("'0'")
    @Column(name = "PhaseGroupID", columnDefinition = "smallint UNSIGNED not null")
    private Integer phaseGroupID;

    @ColumnDefault("0")
    @Column(name = "PropValue1", nullable = false)
    private Integer propValue1;

    @ColumnDefault("0")
    @Column(name = "PropValue2", nullable = false)
    private Integer propValue2;

    @ColumnDefault("0")
    @Column(name = "PropValue3", nullable = false)
    private Integer propValue3;

    @ColumnDefault("0")
    @Column(name = "PropValue4", nullable = false)
    private Integer propValue4;

    @ColumnDefault("0")
    @Column(name = "PropValue5", nullable = false)
    private Integer propValue5;

    @ColumnDefault("0")
    @Column(name = "PropValue6", nullable = false)
    private Integer propValue6;

    @ColumnDefault("0")
    @Column(name = "PropValue7", nullable = false)
    private Integer propValue7;

    @ColumnDefault("0")
    @Column(name = "PropValue8", nullable = false)
    private Integer propValue8;

}