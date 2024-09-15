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
@Table(name = "spell_reagents")
@Db2File(name = "SpellReagents.db2", layoutHash = 0xF0E58683)
public class SpellReagent implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private  Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @ColumnDefault("0")
    @Column(name = "Reagent1", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer reagent1;

    @ColumnDefault("0")
    @Column(name = "Reagent2", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer reagent2;

    @ColumnDefault("0")
    @Column(name = "Reagent3", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer reagent3;

    @ColumnDefault("0")
    @Column(name = "Reagent4", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer reagent4;

    @ColumnDefault("0")
    @Column(name = "Reagent5", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer reagent5;

    @ColumnDefault("0")
    @Column(name = "Reagent6", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer reagent6;

    @ColumnDefault("0")
    @Column(name = "Reagent7", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer reagent7;

    @ColumnDefault("0")
    @Column(name = "Reagent8", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer reagent8;

    @ColumnDefault("0")
    @Column(name = "ReagentCount1", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT, signed = true)
    private Short reagentCount1;

    @ColumnDefault("0")
    @Column(name = "ReagentCount2", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT, signed = true)
    private Short reagentCount2;

    @ColumnDefault("0")
    @Column(name = "ReagentCount3", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT, signed = true)
    private Short reagentCount3;

    @ColumnDefault("0")
    @Column(name = "ReagentCount4", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT, signed = true)
    private Short reagentCount4;

    @ColumnDefault("0")
    @Column(name = "ReagentCount5", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT, signed = true)
    private Short reagentCount5;

    @ColumnDefault("0")
    @Column(name = "ReagentCount6", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT, signed = true)
    private Short reagentCount6;

    @ColumnDefault("0")
    @Column(name = "ReagentCount7", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT, signed = true)
    private Short reagentCount7;

    @ColumnDefault("0")
    @Column(name = "ReagentCount8", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT, signed = true)
    private Short reagentCount8;

}