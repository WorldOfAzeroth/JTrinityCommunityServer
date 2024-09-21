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
@Table(name = "skill_line_ability")
@Db2File(name = "SkillLineAbility.db2", layoutHash = 0x97B5A653, indexField = 1, parentIndexField = 4)
public class SkillLineAbility implements DbcEntity {

    @Column(name = "RaceMask")
    @Db2Field(fieldIndex = 0, type = Db2Type.LONG, signed = true)
    private Long raceMask;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Spell")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer spell;


    @Column(name = "SupercedesSpell")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer supercedesSpell;


    @Column(name = "SkillLine")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT, signed = true)
    private Short skillLine;


    @Column(name = "TrivialSkillLineRankHigh")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT, signed = true)
    private Short trivialSkillLineRankHigh;


    @Column(name = "TrivialSkillLineRankLow")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT, signed = true)
    private Short trivialSkillLineRankLow;


    @Column(name = "UniqueBit")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT, signed = true)
    private Short uniqueBit;


    @Column(name = "TradeSkillCategoryID")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT, signed = true)
    private Short tradeSkillCategoryID;


    @Column(name = "NumSkillUps")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte numSkillUps;


    @Column(name = "ClassMask")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer classMask;


    @Column(name = "MinSkillLineRank")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT, signed = true)
    private Short minSkillLineRank;


    @Column(name = "AcquireMethod")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE, signed = true)
    private Byte acquireMethod;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE, signed = true)
    private Byte flags;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
