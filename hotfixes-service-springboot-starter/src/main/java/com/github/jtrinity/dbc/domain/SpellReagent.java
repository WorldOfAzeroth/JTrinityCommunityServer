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
@Table(name = "spell_reagents")
@Db2File(name = "SpellReagents.db2", layoutHash = 0x0463C688)
public class SpellReagent implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spellID;


    @Column(name = "Reagent1")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer reagent1;


    @Column(name = "Reagent2")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer reagent2;


    @Column(name = "Reagent3")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer reagent3;


    @Column(name = "Reagent4")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer reagent4;


    @Column(name = "Reagent5")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer reagent5;


    @Column(name = "Reagent6")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer reagent6;


    @Column(name = "Reagent7")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer reagent7;


    @Column(name = "Reagent8")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer reagent8;


    @Column(name = "ReagentCount1")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT, signed = true)
    private Short reagentCount1;


    @Column(name = "ReagentCount2")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT, signed = true)
    private Short reagentCount2;


    @Column(name = "ReagentCount3")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT, signed = true)
    private Short reagentCount3;


    @Column(name = "ReagentCount4")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT, signed = true)
    private Short reagentCount4;


    @Column(name = "ReagentCount5")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT, signed = true)
    private Short reagentCount5;


    @Column(name = "ReagentCount6")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT, signed = true)
    private Short reagentCount6;


    @Column(name = "ReagentCount7")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT, signed = true)
    private Short reagentCount7;


    @Column(name = "ReagentCount8")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT, signed = true)
    private Short reagentCount8;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
