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
@Table(name = "skill_line_ability")
@Db2File(name = "SkillLineAbility.db2", layoutHash = 0x5DEA6909, indexField = 1, parentIndexField = 2)
public class SkillLineAbility implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "RaceMask", nullable = false)
    @Db2Field(fieldIndex = 0, type = Db2Type.LONG, signed = true)
    private Long raceMask;

    @ColumnDefault("0")
    @Column(name = "SkillLine", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short skillLine;

    @ColumnDefault("0")
    @Column(name = "Spell", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer spell;

    @ColumnDefault("0")
    @Column(name = "MinSkillLineRank", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT, signed = true)
    private Short minSkillLineRank;

    @ColumnDefault("0")
    @Column(name = "ClassMask", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer classMask;

    @ColumnDefault("0")
    @Column(name = "SupercedesSpell", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer supercedesSpell;

    @ColumnDefault("0")
    @Column(name = "AcquireMethod", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte acquireMethod;

    @ColumnDefault("0")
    @Column(name = "TrivialSkillLineRankHigh", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT, signed = true)
    private Short trivialSkillLineRankHigh;

    @ColumnDefault("0")
    @Column(name = "TrivialSkillLineRankLow", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT, signed = true)
    private Short trivialSkillLineRankLow;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE, signed = true)
    private Byte flags;

    @ColumnDefault("0")
    @Column(name = "NumSkillUps", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE, signed = true)
    private Byte numSkillUps;

    @ColumnDefault("0")
    @Column(name = "UniqueBit", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT, signed = true)
    private Short uniqueBit;

    @ColumnDefault("0")
    @Column(name = "TradeSkillCategoryID", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT, signed = true)
    private Short tradeSkillCategoryID;

    @ColumnDefault("0")
    @Column(name = "SkillupSkillLineID", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT, signed = true)
    private Short skillupSkillLineID;

    @ColumnDefault("0")
    @Column(name = "CharacterPoints1", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer characterPoints1;

    @ColumnDefault("0")
    @Column(name = "CharacterPoints2", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer characterPoints2;

}