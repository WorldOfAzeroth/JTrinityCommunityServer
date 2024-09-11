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
@Table(name = "battlemaster_list")
public class BattlemasterList {
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

    @Lob
    @Column(name = "GameType")
    private String gameType;

    @Lob
    @Column(name = "ShortDescription")
    private String shortDescription;

    @Lob
    @Column(name = "LongDescription")
    private String longDescription;

    @ColumnDefault("0")
    @Column(name = "InstanceType", nullable = false)
    private Byte instanceType;

    @ColumnDefault("0")
    @Column(name = "MinLevel", nullable = false)
    private Byte minLevel;

    @ColumnDefault("0")
    @Column(name = "MaxLevel", nullable = false)
    private Byte maxLevel;

    @ColumnDefault("0")
    @Column(name = "RatedPlayers", nullable = false)
    private Byte ratedPlayers;

    @ColumnDefault("0")
    @Column(name = "MinPlayers", nullable = false)
    private Byte minPlayers;

    @ColumnDefault("0")
    @Column(name = "MaxPlayers", nullable = false)
    private Integer maxPlayers;

    @ColumnDefault("0")
    @Column(name = "GroupsAllowed", nullable = false)
    private Byte groupsAllowed;

    @ColumnDefault("0")
    @Column(name = "MaxGroupSize", nullable = false)
    private Byte maxGroupSize;

    @ColumnDefault("0")
    @Column(name = "HolidayWorldState", nullable = false)
    private Short holidayWorldState;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Byte flags;

    @ColumnDefault("0")
    @Column(name = "IconFileDataID", nullable = false)
    private Integer iconFileDataID;

    @ColumnDefault("0")
    @Column(name = "RequiredPlayerConditionID", nullable = false)
    private Integer requiredPlayerConditionID;

    @ColumnDefault("0")
    @Column(name = "Field_4_4_0_54339_016", nullable = false)
    private Integer field_4_4_0_54339_016;

    @ColumnDefault("0")
    @Column(name = "Field_4_4_0_54339_017", nullable = false)
    private Integer field_4_4_0_54339_017;

    @ColumnDefault("0")
    @Column(name = "MapID1", nullable = false)
    private Short mapID1;

    @ColumnDefault("0")
    @Column(name = "MapID2", nullable = false)
    private Short mapID2;

    @ColumnDefault("0")
    @Column(name = "MapID3", nullable = false)
    private Short mapID3;

    @ColumnDefault("0")
    @Column(name = "MapID4", nullable = false)
    private Short mapID4;

    @ColumnDefault("0")
    @Column(name = "MapID5", nullable = false)
    private Short mapID5;

    @ColumnDefault("0")
    @Column(name = "MapID6", nullable = false)
    private Short mapID6;

    @ColumnDefault("0")
    @Column(name = "MapID7", nullable = false)
    private Short mapID7;

    @ColumnDefault("0")
    @Column(name = "MapID8", nullable = false)
    private Short mapID8;

    @ColumnDefault("0")
    @Column(name = "MapID9", nullable = false)
    private Short mapID9;

    @ColumnDefault("0")
    @Column(name = "MapID10", nullable = false)
    private Short mapID10;

    @ColumnDefault("0")
    @Column(name = "MapID11", nullable = false)
    private Short mapID11;

    @ColumnDefault("0")
    @Column(name = "MapID12", nullable = false)
    private Short mapID12;

    @ColumnDefault("0")
    @Column(name = "MapID13", nullable = false)
    private Short mapID13;

    @ColumnDefault("0")
    @Column(name = "MapID14", nullable = false)
    private Short mapID14;

    @ColumnDefault("0")
    @Column(name = "MapID15", nullable = false)
    private Short mapID15;

    @ColumnDefault("0")
    @Column(name = "MapID16", nullable = false)
    private Short mapID16;

}