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
@Table(name = "skill_line_ability")
public class SkillLineAbility {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "RaceMask", nullable = false)
    private Long raceMask;

    @ColumnDefault("0")
    @Column(name = "SkillLine", nullable = false)
    private Short skillLine;

    @ColumnDefault("0")
    @Column(name = "Spell", nullable = false)
    private Integer spell;

    @ColumnDefault("0")
    @Column(name = "MinSkillLineRank", nullable = false)
    private Short minSkillLineRank;

    @ColumnDefault("0")
    @Column(name = "ClassMask", nullable = false)
    private Integer classMask;

    @ColumnDefault("0")
    @Column(name = "SupercedesSpell", nullable = false)
    private Integer supercedesSpell;

    @ColumnDefault("0")
    @Column(name = "AcquireMethod", nullable = false)
    private Byte acquireMethod;

    @ColumnDefault("0")
    @Column(name = "TrivialSkillLineRankHigh", nullable = false)
    private Short trivialSkillLineRankHigh;

    @ColumnDefault("0")
    @Column(name = "TrivialSkillLineRankLow", nullable = false)
    private Short trivialSkillLineRankLow;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Byte flags;

    @ColumnDefault("0")
    @Column(name = "NumSkillUps", nullable = false)
    private Byte numSkillUps;

    @ColumnDefault("0")
    @Column(name = "UniqueBit", nullable = false)
    private Short uniqueBit;

    @ColumnDefault("0")
    @Column(name = "TradeSkillCategoryID", nullable = false)
    private Short tradeSkillCategoryID;

    @ColumnDefault("0")
    @Column(name = "SkillupSkillLineID", nullable = false)
    private Short skillupSkillLineID;

    @ColumnDefault("0")
    @Column(name = "CharacterPoints1", nullable = false)
    private Integer characterPoints1;

    @ColumnDefault("0")
    @Column(name = "CharacterPoints2", nullable = false)
    private Integer characterPoints2;

}