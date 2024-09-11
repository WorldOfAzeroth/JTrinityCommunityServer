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
@Table(name = "unit_power_bar")
public class UnitPowerBar {
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

    @Lob
    @Column(name = "Cost")
    private String cost;

    @Lob
    @Column(name = "OutOfError")
    private String outOfError;

    @Lob
    @Column(name = "ToolTip")
    private String toolTip;

    @ColumnDefault("'0'")
    @Column(name = "MinPower", columnDefinition = "int UNSIGNED not null")
    private Long minPower;

    @ColumnDefault("'0'")
    @Column(name = "MaxPower", columnDefinition = "int UNSIGNED not null")
    private Long maxPower;

    @ColumnDefault("'0'")
    @Column(name = "StartPower", columnDefinition = "smallint UNSIGNED not null")
    private Integer startPower;

    @ColumnDefault("'0'")
    @Column(name = "CenterPower", columnDefinition = "tinyint UNSIGNED not null")
    private Short centerPower;

    @ColumnDefault("0")
    @Column(name = "RegenerationPeace", nullable = false)
    private Float regenerationPeace;

    @ColumnDefault("0")
    @Column(name = "RegenerationCombat", nullable = false)
    private Float regenerationCombat;

    @ColumnDefault("'0'")
    @Column(name = "BarType", columnDefinition = "tinyint UNSIGNED not null")
    private Short barType;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "smallint UNSIGNED not null")
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "StartInset", nullable = false)
    private Float startInset;

    @ColumnDefault("0")
    @Column(name = "EndInset", nullable = false)
    private Float endInset;

    @ColumnDefault("0")
    @Column(name = "FileDataID1", nullable = false)
    private Integer fileDataID1;

    @ColumnDefault("0")
    @Column(name = "FileDataID2", nullable = false)
    private Integer fileDataID2;

    @ColumnDefault("0")
    @Column(name = "FileDataID3", nullable = false)
    private Integer fileDataID3;

    @ColumnDefault("0")
    @Column(name = "FileDataID4", nullable = false)
    private Integer fileDataID4;

    @ColumnDefault("0")
    @Column(name = "FileDataID5", nullable = false)
    private Integer fileDataID5;

    @ColumnDefault("0")
    @Column(name = "FileDataID6", nullable = false)
    private Integer fileDataID6;

    @ColumnDefault("0")
    @Column(name = "Color1", nullable = false)
    private Integer color1;

    @ColumnDefault("0")
    @Column(name = "Color2", nullable = false)
    private Integer color2;

    @ColumnDefault("0")
    @Column(name = "Color3", nullable = false)
    private Integer color3;

    @ColumnDefault("0")
    @Column(name = "Color4", nullable = false)
    private Integer color4;

    @ColumnDefault("0")
    @Column(name = "Color5", nullable = false)
    private Integer color5;

    @ColumnDefault("0")
    @Column(name = "Color6", nullable = false)
    private Integer color6;

}