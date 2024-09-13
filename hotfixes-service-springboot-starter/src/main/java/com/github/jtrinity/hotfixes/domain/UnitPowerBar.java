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
@Table(name = "unit_power_bar")
@Db2File(name = "UnitPowerBar.db2", fileDataId = 1237753, layoutHash = 0x6D90F2FD)
public class UnitPowerBar {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String name;

    @Lob
    @Column(name = "Cost")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String cost;

    @Lob
    @Column(name = "OutOfError")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private String outOfError;

    @Lob
    @Column(name = "ToolTip")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private String toolTip;

    @ColumnDefault("'0'")
    @Column(name = "MinPower", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Long minPower;

    @ColumnDefault("'0'")
    @Column(name = "MaxPower", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Long maxPower;

    @ColumnDefault("'0'")
    @Column(name = "StartPower", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Integer startPower;

    @ColumnDefault("'0'")
    @Column(name = "CenterPower", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Short centerPower;

    @ColumnDefault("0")
    @Column(name = "RegenerationPeace", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float regenerationPeace;

    @ColumnDefault("0")
    @Column(name = "RegenerationCombat", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float regenerationCombat;

    @ColumnDefault("'0'")
    @Column(name = "BarType", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Short barType;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "StartInset", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.FLOAT)
    private Float startInset;

    @ColumnDefault("0")
    @Column(name = "EndInset", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.FLOAT)
    private Float endInset;

    @ColumnDefault("0")
    @Column(name = "FileDataID1", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer fileDataID1;

    @ColumnDefault("0")
    @Column(name = "FileDataID2", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer fileDataID2;

    @ColumnDefault("0")
    @Column(name = "FileDataID3", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.INT, signed = true)
    private Integer fileDataID3;

    @ColumnDefault("0")
    @Column(name = "FileDataID4", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.INT, signed = true)
    private Integer fileDataID4;

    @ColumnDefault("0")
    @Column(name = "FileDataID5", nullable = false)
    @Db2Field(fieldIndex = 19, type = Db2Type.INT, signed = true)
    private Integer fileDataID5;

    @ColumnDefault("0")
    @Column(name = "FileDataID6", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.INT, signed = true)
    private Integer fileDataID6;

    @ColumnDefault("0")
    @Column(name = "Color1", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.INT, signed = true)
    private Integer color1;

    @ColumnDefault("0")
    @Column(name = "Color2", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer color2;

    @ColumnDefault("0")
    @Column(name = "Color3", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer color3;

    @ColumnDefault("0")
    @Column(name = "Color4", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer color4;

    @ColumnDefault("0")
    @Column(name = "Color5", nullable = false)
    @Db2Field(fieldIndex = 25, type = Db2Type.INT, signed = true)
    private Integer color5;

    @ColumnDefault("0")
    @Column(name = "Color6", nullable = false)
    @Db2Field(fieldIndex = 26, type = Db2Type.INT, signed = true)
    private Integer color6;

}