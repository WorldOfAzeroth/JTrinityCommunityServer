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
@Table(name = "power_type")
@Db2File(name = "PowerType.db2", layoutHash = 0xA1F55F15)
public class PowerType implements DbcEntity {
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
    @Column(name = "NameGlobalStringTag")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String nameGlobalStringTag;

    @Lob
    @Column(name = "CostGlobalStringTag")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING_NOT_LOCALIZED)
    private String costGlobalStringTag;

    @ColumnDefault("0")
    @Column(name = "PowerTypeEnum", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE, signed = true)
    private Byte powerTypeEnum;

    @ColumnDefault("0")
    @Column(name = "MinPower", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer minPower;

    @ColumnDefault("0")
    @Column(name = "MaxBasePower", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer maxBasePower;

    @ColumnDefault("0")
    @Column(name = "CenterPower", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer centerPower;

    @ColumnDefault("0")
    @Column(name = "DefaultPower", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer defaultPower;

    @ColumnDefault("0")
    @Column(name = "DisplayModifier", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer displayModifier;

    @ColumnDefault("0")
    @Column(name = "RegenInterruptTimeMS", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer regenInterruptTimeMS;

    @ColumnDefault("0")
    @Column(name = "RegenPeace", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float regenPeace;

    @ColumnDefault("0")
    @Column(name = "RegenCombat", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float regenCombat;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT, signed = true)
    private Short flags;

}