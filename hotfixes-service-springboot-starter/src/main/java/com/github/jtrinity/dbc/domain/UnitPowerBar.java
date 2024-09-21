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
@Table(name = "unit_power_bar")
@Db2File(name = "UnitPowerBar.db2", layoutHash = 0x626C94CD)
public class UnitPowerBar implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "Cost")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString cost;


    @Column(name = "OutOfError")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private LocalizedString outOfError;


    @Column(name = "ToolTip")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private LocalizedString toolTip;


    @Column(name = "RegenerationPeace")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float regenerationPeace;


    @Column(name = "RegenerationCombat")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float regenerationCombat;


    @Column(name = "FileDataID1")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer fileDataID1;


    @Column(name = "FileDataID2")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer fileDataID2;


    @Column(name = "FileDataID3")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer fileDataID3;


    @Column(name = "FileDataID4")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer fileDataID4;


    @Column(name = "FileDataID5")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer fileDataID5;


    @Column(name = "FileDataID6")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer fileDataID6;


    @Column(name = "Color1")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer color1;


    @Column(name = "Color2")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer color2;


    @Column(name = "Color3")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer color3;


    @Column(name = "Color4")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer color4;


    @Column(name = "Color5")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT, signed = true)
    private Integer color5;


    @Column(name = "Color6")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT, signed = true)
    private Integer color6;


    @Column(name = "StartInset")
    @Db2Field(fieldIndex = 19, type = Db2Type.FLOAT)
    private Float startInset;


    @Column(name = "EndInset")
    @Db2Field(fieldIndex = 20, type = Db2Type.FLOAT)
    private Float endInset;


    @Column(name = "StartPower")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT)
    private Short startPower;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 22, type = Db2Type.SHORT)
    private Short flags;


    @Column(name = "CenterPower")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Byte centerPower;


    @Column(name = "BarType")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Byte barType;


    @Column(name = "MinPower")
    @Db2Field(fieldIndex = 25, type = Db2Type.INT)
    private Integer minPower;


    @Column(name = "MaxPower")
    @Db2Field(fieldIndex = 26, type = Db2Type.INT)
    private Integer maxPower;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
