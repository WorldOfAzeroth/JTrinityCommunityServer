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
@Table(name = "spell_power")
@Db2File(name = "SpellPower.db2", layoutHash = 0x8E5E46EC, indexField = 7, parentIndexField = 13)
public class SpellPower implements DbcEntity {

    @Column(name = "ManaCost")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT, signed = true)
    private Integer manaCost;


    @Column(name = "PowerCostPct")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float powerCostPct;


    @Column(name = "PowerPctPerSecond")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float powerPctPerSecond;


    @Column(name = "RequiredAuraSpellID")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer requiredAuraSpellID;


    @Column(name = "PowerCostMaxPct")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float powerCostMaxPct;


    @Column(name = "OrderIndex")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte orderIndex;


    @Column(name = "PowerType")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte powerType;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer id;


    @Column(name = "ManaCostPerLevel")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer manaCostPerLevel;


    @Column(name = "ManaPerSecond")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer manaPerSecond;


    @Column(name = "OptionalCost")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Integer optionalCost;


    @Column(name = "PowerDisplayID")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Integer powerDisplayID;


    @Column(name = "AltPowerBarID")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer altPowerBarID;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
