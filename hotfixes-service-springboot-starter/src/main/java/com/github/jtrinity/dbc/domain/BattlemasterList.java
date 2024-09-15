package com.github.jtrinity.dbc.domain;

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
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "battlemaster_list")
@Db2File(name = "BattlemasterList.db2", layoutHash = 0xE67A4AF0)
public class BattlemasterList implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String name;

    @Lob
    @Column(name = "GameType")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String gameType;

    @Lob
    @Column(name = "ShortDescription")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private String shortDescription;

    @Lob
    @Column(name = "LongDescription")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private String longDescription;

    @ColumnDefault("0")
    @Column(name = "InstanceType", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte instanceType;

    @ColumnDefault("0")
    @Column(name = "MinLevel", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte minLevel;

    @ColumnDefault("0")
    @Column(name = "MaxLevel", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte maxLevel;

    @ColumnDefault("0")
    @Column(name = "RatedPlayers", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte ratedPlayers;

    @ColumnDefault("0")
    @Column(name = "MinPlayers", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte minPlayers;

    @ColumnDefault("0")
    @Column(name = "MaxPlayers", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer maxPlayers;

    @ColumnDefault("0")
    @Column(name = "GroupsAllowed", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE, signed = true)
    private Byte groupsAllowed;

    @ColumnDefault("0")
    @Column(name = "MaxGroupSize", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE, signed = true)
    private Byte maxGroupSize;

    @ColumnDefault("0")
    @Column(name = "HolidayWorldState", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT, signed = true)
    private Short holidayWorldState;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE, signed = true)
    private Byte flags;

    @ColumnDefault("0")
    @Column(name = "IconFileDataID", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer iconFileDataID;

    @ColumnDefault("0")
    @Column(name = "RequiredPlayerConditionID", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer requiredPlayerConditionID;

    @ColumnDefault("0")
    @Column(name = "Field_4_4_0_54339_016", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.INT, signed = true)
    private Integer field_4_4_0_54339_016;

    @ColumnDefault("0")
    @Column(name = "Field_4_4_0_54339_017", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.INT, signed = true)
    private Integer field_4_4_0_54339_017;

    @ColumnDefault("0")
    @Column(name = "MapID1", nullable = false)
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT, signed = true)
    private Short mapID1;

    @ColumnDefault("0")
    @Column(name = "MapID2", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT, signed = true)
    private Short mapID2;

    @ColumnDefault("0")
    @Column(name = "MapID3", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT, signed = true)
    private Short mapID3;

    @ColumnDefault("0")
    @Column(name = "MapID4", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.SHORT, signed = true)
    private Short mapID4;

    @ColumnDefault("0")
    @Column(name = "MapID5", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.SHORT, signed = true)
    private Short mapID5;

    @ColumnDefault("0")
    @Column(name = "MapID6", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.SHORT, signed = true)
    private Short mapID6;

    @ColumnDefault("0")
    @Column(name = "MapID7", nullable = false)
    @Db2Field(fieldIndex = 25, type = Db2Type.SHORT, signed = true)
    private Short mapID7;

    @ColumnDefault("0")
    @Column(name = "MapID8", nullable = false)
    @Db2Field(fieldIndex = 26, type = Db2Type.SHORT, signed = true)
    private Short mapID8;

    @ColumnDefault("0")
    @Column(name = "MapID9", nullable = false)
    @Db2Field(fieldIndex = 27, type = Db2Type.SHORT, signed = true)
    private Short mapID9;

    @ColumnDefault("0")
    @Column(name = "MapID10", nullable = false)
    @Db2Field(fieldIndex = 28, type = Db2Type.SHORT, signed = true)
    private Short mapID10;

    @ColumnDefault("0")
    @Column(name = "MapID11", nullable = false)
    @Db2Field(fieldIndex = 29, type = Db2Type.SHORT, signed = true)
    private Short mapID11;

    @ColumnDefault("0")
    @Column(name = "MapID12", nullable = false)
    @Db2Field(fieldIndex = 30, type = Db2Type.SHORT, signed = true)
    private Short mapID12;

    @ColumnDefault("0")
    @Column(name = "MapID13", nullable = false)
    @Db2Field(fieldIndex = 31, type = Db2Type.SHORT, signed = true)
    private Short mapID13;

    @ColumnDefault("0")
    @Column(name = "MapID14", nullable = false)
    @Db2Field(fieldIndex = 32, type = Db2Type.SHORT, signed = true)
    private Short mapID14;

    @ColumnDefault("0")
    @Column(name = "MapID15", nullable = false)
    @Db2Field(fieldIndex = 33, type = Db2Type.SHORT, signed = true)
    private Short mapID15;

    @ColumnDefault("0")
    @Column(name = "MapID16", nullable = false)
    @Db2Field(fieldIndex = 34, type = Db2Type.SHORT, signed = true)
    private Short mapID16;

}