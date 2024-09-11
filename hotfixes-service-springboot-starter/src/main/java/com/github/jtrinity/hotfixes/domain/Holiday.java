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
@Table(name = "holidays")
public class Holiday {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "Region", columnDefinition = "smallint UNSIGNED not null")
    private Integer region;

    @ColumnDefault("'0'")
    @Column(name = "Looping", columnDefinition = "tinyint UNSIGNED not null")
    private Short looping;

    @ColumnDefault("'0'")
    @Column(name = "HolidayNameID", columnDefinition = "int UNSIGNED not null")
    private Long holidayNameID;

    @ColumnDefault("'0'")
    @Column(name = "HolidayDescriptionID", columnDefinition = "int UNSIGNED not null")
    private Long holidayDescriptionID;

    @ColumnDefault("'0'")
    @Column(name = "Priority", columnDefinition = "tinyint UNSIGNED not null")
    private Short priority;

    @ColumnDefault("0")
    @Column(name = "CalendarFilterType", nullable = false)
    private Byte calendarFilterType;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "WorldStateExpressionID", columnDefinition = "int UNSIGNED not null")
    private Long worldStateExpressionID;

    @ColumnDefault("'0'")
    @Column(name = "Duration1", columnDefinition = "smallint UNSIGNED not null")
    private Integer duration1;

    @ColumnDefault("'0'")
    @Column(name = "Duration2", columnDefinition = "smallint UNSIGNED not null")
    private Integer duration2;

    @ColumnDefault("'0'")
    @Column(name = "Duration3", columnDefinition = "smallint UNSIGNED not null")
    private Integer duration3;

    @ColumnDefault("'0'")
    @Column(name = "Duration4", columnDefinition = "smallint UNSIGNED not null")
    private Integer duration4;

    @ColumnDefault("'0'")
    @Column(name = "Duration5", columnDefinition = "smallint UNSIGNED not null")
    private Integer duration5;

    @ColumnDefault("'0'")
    @Column(name = "Duration6", columnDefinition = "smallint UNSIGNED not null")
    private Integer duration6;

    @ColumnDefault("'0'")
    @Column(name = "Duration7", columnDefinition = "smallint UNSIGNED not null")
    private Integer duration7;

    @ColumnDefault("'0'")
    @Column(name = "Duration8", columnDefinition = "smallint UNSIGNED not null")
    private Integer duration8;

    @ColumnDefault("'0'")
    @Column(name = "Duration9", columnDefinition = "smallint UNSIGNED not null")
    private Integer duration9;

    @ColumnDefault("'0'")
    @Column(name = "Duration10", columnDefinition = "smallint UNSIGNED not null")
    private Integer duration10;

    @ColumnDefault("'0'")
    @Column(name = "Date1", columnDefinition = "int UNSIGNED not null")
    private Long date1;

    @ColumnDefault("'0'")
    @Column(name = "Date2", columnDefinition = "int UNSIGNED not null")
    private Long date2;

    @ColumnDefault("'0'")
    @Column(name = "Date3", columnDefinition = "int UNSIGNED not null")
    private Long date3;

    @ColumnDefault("'0'")
    @Column(name = "Date4", columnDefinition = "int UNSIGNED not null")
    private Long date4;

    @ColumnDefault("'0'")
    @Column(name = "Date5", columnDefinition = "int UNSIGNED not null")
    private Long date5;

    @ColumnDefault("'0'")
    @Column(name = "Date6", columnDefinition = "int UNSIGNED not null")
    private Long date6;

    @ColumnDefault("'0'")
    @Column(name = "Date7", columnDefinition = "int UNSIGNED not null")
    private Long date7;

    @ColumnDefault("'0'")
    @Column(name = "Date8", columnDefinition = "int UNSIGNED not null")
    private Long date8;

    @ColumnDefault("'0'")
    @Column(name = "Date9", columnDefinition = "int UNSIGNED not null")
    private Long date9;

    @ColumnDefault("'0'")
    @Column(name = "Date10", columnDefinition = "int UNSIGNED not null")
    private Long date10;

    @ColumnDefault("'0'")
    @Column(name = "Date11", columnDefinition = "int UNSIGNED not null")
    private Long date11;

    @ColumnDefault("'0'")
    @Column(name = "Date12", columnDefinition = "int UNSIGNED not null")
    private Long date12;

    @ColumnDefault("'0'")
    @Column(name = "Date13", columnDefinition = "int UNSIGNED not null")
    private Long date13;

    @ColumnDefault("'0'")
    @Column(name = "Date14", columnDefinition = "int UNSIGNED not null")
    private Long date14;

    @ColumnDefault("'0'")
    @Column(name = "Date15", columnDefinition = "int UNSIGNED not null")
    private Long date15;

    @ColumnDefault("'0'")
    @Column(name = "Date16", columnDefinition = "int UNSIGNED not null")
    private Long date16;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags1", columnDefinition = "tinyint UNSIGNED not null")
    private Short calendarFlags1;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags2", columnDefinition = "tinyint UNSIGNED not null")
    private Short calendarFlags2;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags3", columnDefinition = "tinyint UNSIGNED not null")
    private Short calendarFlags3;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags4", columnDefinition = "tinyint UNSIGNED not null")
    private Short calendarFlags4;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags5", columnDefinition = "tinyint UNSIGNED not null")
    private Short calendarFlags5;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags6", columnDefinition = "tinyint UNSIGNED not null")
    private Short calendarFlags6;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags7", columnDefinition = "tinyint UNSIGNED not null")
    private Short calendarFlags7;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags8", columnDefinition = "tinyint UNSIGNED not null")
    private Short calendarFlags8;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags9", columnDefinition = "tinyint UNSIGNED not null")
    private Short calendarFlags9;

    @ColumnDefault("'0'")
    @Column(name = "CalendarFlags10", columnDefinition = "tinyint UNSIGNED not null")
    private Short calendarFlags10;

    @ColumnDefault("0")
    @Column(name = "TextureFileDataID1", nullable = false)
    private Integer textureFileDataID1;

    @ColumnDefault("0")
    @Column(name = "TextureFileDataID2", nullable = false)
    private Integer textureFileDataID2;

    @ColumnDefault("0")
    @Column(name = "TextureFileDataID3", nullable = false)
    private Integer textureFileDataID3;

}