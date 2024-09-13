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
@Table(name = "holidays")
@Db2File(name = "Holidays.db2", fileDataId = 996357, layoutHash = 0xF07BB5AA, indexField = 0)
public class Holiday {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "Region", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Integer region;

    @ColumnDefault("'0'")
    @Column(name = "Looping", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Short looping;

    @ColumnDefault("'0'")
    @Column(name = "HolidayNameID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long holidayNameID;

    @ColumnDefault("'0'")
    @Column(name = "HolidayDescriptionID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Long holidayDescriptionID;

    @ColumnDefault("'0'")
    @Column(name = "Priority", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Short priority;

    @ColumnDefault("0")
    @Column(name = "CalendarFilterType", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte calendarFilterType;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "WorldStateExpressionID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Long worldStateExpressionID;

    @ColumnDefault("'0'")
    @Column(name = "Duration1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Integer duration1;

    @ColumnDefault("'0'")
    @Column(name = "Duration2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Integer duration2;

    @ColumnDefault("'0'")
    @Column(name = "Duration3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Integer duration3;

    @ColumnDefault("'0'")
    @Column(name = "Duration4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Integer duration4;

    @ColumnDefault("'0'")
    @Column(name = "Duration5", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Integer duration5;

    @ColumnDefault("'0'")
    @Column(name = "Duration6", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Integer duration6;

    @ColumnDefault("'0'")
    @Column(name = "Duration7", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Integer duration7;

    @ColumnDefault("'0'")
    @Column(name = "Duration8", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Integer duration8;

    @ColumnDefault("'0'")
    @Column(name = "Duration9", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Integer duration9;

    @ColumnDefault("'0'")
    @Column(name = "Duration10", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT)
    private Integer duration10;

    @ColumnDefault("'0'")
    @Column(name = "Date1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.INT)
    private Long date1;

    @ColumnDefault("'0'")
    @Column(name = "Date2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.INT)
    private Long date2;

    @ColumnDefault("'0'")
    @Column(name = "Date3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.INT)
    private Long date3;

    @ColumnDefault("'0'")
    @Column(name = "Date4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 22, type = Db2Type.INT)
    private Long date4;

    @ColumnDefault("'0'")
    @Column(name = "Date5", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 23, type = Db2Type.INT)
    private Long date5;

    @ColumnDefault("'0'")
    @Column(name = "Date6", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 24, type = Db2Type.INT)
    private Long date6;

    @ColumnDefault("'0'")
    @Column(name = "Date7", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 25, type = Db2Type.INT)
    private Long date7;

    @ColumnDefault("'0'")
    @Column(name = "Date8", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 26, type = Db2Type.INT)
    private Long date8;

    @ColumnDefault("'0'")
    @Column(name = "Date9", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 27, type = Db2Type.INT)
    private Long date9;

    @ColumnDefault("'0'")
    @Column(name = "Date10", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 28, type = Db2Type.INT)
    private Long date10;

    @ColumnDefault("'0'")
    @Column(name = "Date11", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 29, type = Db2Type.INT)
    private Long date11;

    @ColumnDefault("'0'")
    @Column(name = "Date12", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 30, type = Db2Type.INT)
    private Long date12;

    @ColumnDefault("'0'")
    @Column(name = "Date13", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 31, type = Db2Type.INT)
    private Long date13;

    @ColumnDefault("'0'")
    @Column(name = "Date14", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 32, type = Db2Type.INT)
    private Long date14;

    @ColumnDefault("'0'")
    @Column(name = "Date15", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 33, type = Db2Type.INT)
    private Long date15;

    @ColumnDefault("'0'")
    @Column(name = "Date16", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 34, type = Db2Type.INT)
    private Long date16;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 35, type = Db2Type.BYTE)
    private Short calendarFlags1;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 36, type = Db2Type.BYTE)
    private Short calendarFlags2;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 37, type = Db2Type.BYTE)
    private Short calendarFlags3;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 38, type = Db2Type.BYTE)
    private Short calendarFlags4;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags5", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 39, type = Db2Type.BYTE)
    private Short calendarFlags5;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags6", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 40, type = Db2Type.BYTE)
    private Short calendarFlags6;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags7", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 41, type = Db2Type.BYTE)
    private Short calendarFlags7;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags8", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 42, type = Db2Type.BYTE)
    private Short calendarFlags8;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags9", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 43, type = Db2Type.BYTE)
    private Short calendarFlags9;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags10", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 44, type = Db2Type.BYTE)
    private Short calendarFlags10;

    @ColumnDefault("0")
    @Column(name = "TextureFileDataID1", nullable = false)
    @Db2Field(fieldIndex = 45, type = Db2Type.INT, signed = true)
    private Integer textureFileDataID1;

    @ColumnDefault("0")
    @Column(name = "TextureFileDataID2", nullable = false)
    @Db2Field(fieldIndex = 46, type = Db2Type.INT, signed = true)
    private Integer textureFileDataID2;

    @ColumnDefault("0")
    @Column(name = "TextureFileDataID3", nullable = false)
    @Db2Field(fieldIndex = 47, type = Db2Type.INT, signed = true)
    private Integer textureFileDataID3;

}