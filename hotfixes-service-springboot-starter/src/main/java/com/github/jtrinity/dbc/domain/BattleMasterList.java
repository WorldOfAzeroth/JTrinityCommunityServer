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
@Table(name = "battlemaster_list")
@Db2File(name = "BattlemasterList.db2", layoutHash = 0xD8AAA088)
public class BattleMasterList implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "GameType")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString gameType;


    @Column(name = "ShortDescription")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private LocalizedString shortDescription;


    @Column(name = "LongDescription")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private LocalizedString longDescription;


    @Column(name = "IconFileDataID")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer iconFileDataID;


    @Column(name = "MapID1")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT, signed = true)
    private Short mapID1;


    @Column(name = "MapID2")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT, signed = true)
    private Short mapID2;


    @Column(name = "MapID3")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT, signed = true)
    private Short mapID3;


    @Column(name = "MapID4")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT, signed = true)
    private Short mapID4;


    @Column(name = "MapID5")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT, signed = true)
    private Short mapID5;


    @Column(name = "MapID6")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT, signed = true)
    private Short mapID6;


    @Column(name = "MapID7")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT, signed = true)
    private Short mapID7;


    @Column(name = "MapID8")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT, signed = true)
    private Short mapID8;


    @Column(name = "MapID9")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT, signed = true)
    private Short mapID9;


    @Column(name = "MapID10")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT, signed = true)
    private Short mapID10;


    @Column(name = "MapID11")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT, signed = true)
    private Short mapID11;


    @Column(name = "MapID12")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT, signed = true)
    private Short mapID12;


    @Column(name = "MapID13")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT, signed = true)
    private Short mapID13;


    @Column(name = "MapID14")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT, signed = true)
    private Short mapID14;


    @Column(name = "MapID15")
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT, signed = true)
    private Short mapID15;


    @Column(name = "MapID16")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT, signed = true)
    private Short mapID16;


    @Column(name = "HolidayWorldState")
    @Db2Field(fieldIndex = 22, type = Db2Type.SHORT, signed = true)
    private Short holidayWorldState;


    @Column(name = "RequiredPlayerConditionID")
    @Db2Field(fieldIndex = 23, type = Db2Type.SHORT, signed = true)
    private Short requiredPlayerConditionID;


    @Column(name = "InstanceType")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE, signed = true)
    private Byte instanceType;


    @Column(name = "GroupsAllowed")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE, signed = true)
    private Byte groupsAllowed;


    @Column(name = "MaxGroupSize")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE, signed = true)
    private Byte maxGroupSize;


    @Column(name = "MinLevel")
    @Db2Field(fieldIndex = 27, type = Db2Type.BYTE, signed = true)
    private Byte minLevel;


    @Column(name = "MaxLevel")
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE, signed = true)
    private Byte maxLevel;


    @Column(name = "RatedPlayers")
    @Db2Field(fieldIndex = 29, type = Db2Type.BYTE, signed = true)
    private Byte ratedPlayers;


    @Column(name = "MinPlayers")
    @Db2Field(fieldIndex = 30, type = Db2Type.BYTE, signed = true)
    private Byte minPlayers;


    @Column(name = "MaxPlayers")
    @Db2Field(fieldIndex = 31, type = Db2Type.BYTE, signed = true)
    private Byte maxPlayers;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 32, type = Db2Type.BYTE, signed = true)
    private Byte flags;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
