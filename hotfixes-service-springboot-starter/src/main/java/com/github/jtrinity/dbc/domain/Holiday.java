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
@Table(name = "holidays")
@Db2File(name = "Holidays.db2", layoutHash = 0x7C3E60FC, indexField = 0)
public class Holiday implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Date1")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer date1;


    @Column(name = "Date2")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer date2;


    @Column(name = "Date3")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer date3;


    @Column(name = "Date4")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer date4;


    @Column(name = "Date5")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer date5;


    @Column(name = "Date6")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer date6;


    @Column(name = "Date7")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer date7;


    @Column(name = "Date8")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer date8;


    @Column(name = "Date9")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Integer date9;


    @Column(name = "Date10")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Integer date10;


    @Column(name = "Date11")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Integer date11;


    @Column(name = "Date12")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Integer date12;


    @Column(name = "Date13")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Integer date13;


    @Column(name = "Date14")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Integer date14;


    @Column(name = "Date15")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Integer date15;


    @Column(name = "Date16")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Integer date16;


    @Column(name = "Duration1")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Short duration1;


    @Column(name = "Duration2")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT)
    private Short duration2;


    @Column(name = "Duration3")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT)
    private Short duration3;


    @Column(name = "Duration4")
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT)
    private Short duration4;


    @Column(name = "Duration5")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT)
    private Short duration5;


    @Column(name = "Duration6")
    @Db2Field(fieldIndex = 22, type = Db2Type.SHORT)
    private Short duration6;


    @Column(name = "Duration7")
    @Db2Field(fieldIndex = 23, type = Db2Type.SHORT)
    private Short duration7;


    @Column(name = "Duration8")
    @Db2Field(fieldIndex = 24, type = Db2Type.SHORT)
    private Short duration8;


    @Column(name = "Duration9")
    @Db2Field(fieldIndex = 25, type = Db2Type.SHORT)
    private Short duration9;


    @Column(name = "Duration10")
    @Db2Field(fieldIndex = 26, type = Db2Type.SHORT)
    private Short duration10;


    @Column(name = "Region")
    @Db2Field(fieldIndex = 27, type = Db2Type.SHORT)
    private Short region;


    @Column(name = "Looping")
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE)
    private Byte looping;


    @Column(name = "CalendarFlags1")
    @Db2Field(fieldIndex = 29, type = Db2Type.BYTE)
    private Byte calendarFlags1;


    @Column(name = "CalendarFlags2")
    @Db2Field(fieldIndex = 30, type = Db2Type.BYTE)
    private Byte calendarFlags2;


    @Column(name = "CalendarFlags3")
    @Db2Field(fieldIndex = 31, type = Db2Type.BYTE)
    private Byte calendarFlags3;


    @Column(name = "CalendarFlags4")
    @Db2Field(fieldIndex = 32, type = Db2Type.BYTE)
    private Byte calendarFlags4;


    @Column(name = "CalendarFlags5")
    @Db2Field(fieldIndex = 33, type = Db2Type.BYTE)
    private Byte calendarFlags5;


    @Column(name = "CalendarFlags6")
    @Db2Field(fieldIndex = 34, type = Db2Type.BYTE)
    private Byte calendarFlags6;


    @Column(name = "CalendarFlags7")
    @Db2Field(fieldIndex = 35, type = Db2Type.BYTE)
    private Byte calendarFlags7;


    @Column(name = "CalendarFlags8")
    @Db2Field(fieldIndex = 36, type = Db2Type.BYTE)
    private Byte calendarFlags8;


    @Column(name = "CalendarFlags9")
    @Db2Field(fieldIndex = 37, type = Db2Type.BYTE)
    private Byte calendarFlags9;


    @Column(name = "CalendarFlags10")
    @Db2Field(fieldIndex = 38, type = Db2Type.BYTE)
    private Byte calendarFlags10;


    @Column(name = "Priority")
    @Db2Field(fieldIndex = 39, type = Db2Type.BYTE)
    private Byte priority;


    @Column(name = "CalendarFilterType")
    @Db2Field(fieldIndex = 40, type = Db2Type.BYTE, signed = true)
    private Byte calendarFilterType;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 41, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "HolidayNameID")
    @Db2Field(fieldIndex = 42, type = Db2Type.INT)
    private Integer holidayNameID;


    @Column(name = "HolidayDescriptionID")
    @Db2Field(fieldIndex = 43, type = Db2Type.INT)
    private Integer holidayDescriptionID;


    @Column(name = "TextureFileDataID1")
    @Db2Field(fieldIndex = 44, type = Db2Type.INT, signed = true)
    private Integer textureFileDataID1;


    @Column(name = "TextureFileDataID2")
    @Db2Field(fieldIndex = 45, type = Db2Type.INT, signed = true)
    private Integer textureFileDataID2;


    @Column(name = "TextureFileDataID3")
    @Db2Field(fieldIndex = 46, type = Db2Type.INT, signed = true)
    private Integer textureFileDataID3;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
