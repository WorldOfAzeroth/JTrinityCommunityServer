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
@Table(name = "talent")
public class Talent {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Description")
    private String description;

    @ColumnDefault("'0'")
    @Column(name = "TierID", columnDefinition = "tinyint UNSIGNED not null")
    private Short tierID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "ColumnIndex", columnDefinition = "tinyint UNSIGNED not null")
    private Short columnIndex;

    @ColumnDefault("'0'")
    @Column(name = "TabID", columnDefinition = "smallint UNSIGNED not null")
    private Integer tabID;

    @ColumnDefault("'0'")
    @Column(name = "ClassID", columnDefinition = "tinyint UNSIGNED not null")
    private Short classID;

    @ColumnDefault("'0'")
    @Column(name = "SpecID", columnDefinition = "smallint UNSIGNED not null")
    private Integer specID;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    private Integer spellID;

    @ColumnDefault("0")
    @Column(name = "OverridesSpellID", nullable = false)
    private Integer overridesSpellID;

    @ColumnDefault("0")
    @Column(name = "RequiredSpellID", nullable = false)
    private Integer requiredSpellID;

    @ColumnDefault("0")
    @Column(name = "CategoryMask1", nullable = false)
    private Integer categoryMask1;

    @ColumnDefault("0")
    @Column(name = "CategoryMask2", nullable = false)
    private Integer categoryMask2;

    @ColumnDefault("0")
    @Column(name = "SpellRank1", nullable = false)
    private Integer spellRank1;

    @ColumnDefault("0")
    @Column(name = "SpellRank2", nullable = false)
    private Integer spellRank2;

    @ColumnDefault("0")
    @Column(name = "SpellRank3", nullable = false)
    private Integer spellRank3;

    @ColumnDefault("0")
    @Column(name = "SpellRank4", nullable = false)
    private Integer spellRank4;

    @ColumnDefault("0")
    @Column(name = "SpellRank5", nullable = false)
    private Integer spellRank5;

    @ColumnDefault("0")
    @Column(name = "SpellRank6", nullable = false)
    private Integer spellRank6;

    @ColumnDefault("0")
    @Column(name = "SpellRank7", nullable = false)
    private Integer spellRank7;

    @ColumnDefault("0")
    @Column(name = "SpellRank8", nullable = false)
    private Integer spellRank8;

    @ColumnDefault("0")
    @Column(name = "SpellRank9", nullable = false)
    private Integer spellRank9;

    @ColumnDefault("0")
    @Column(name = "PrereqTalent1", nullable = false)
    private Integer prereqTalent1;

    @ColumnDefault("0")
    @Column(name = "PrereqTalent2", nullable = false)
    private Integer prereqTalent2;

    @ColumnDefault("0")
    @Column(name = "PrereqTalent3", nullable = false)
    private Integer prereqTalent3;

    @ColumnDefault("0")
    @Column(name = "PrereqRank1", nullable = false)
    private Integer prereqRank1;

    @ColumnDefault("0")
    @Column(name = "PrereqRank2", nullable = false)
    private Integer prereqRank2;

    @ColumnDefault("0")
    @Column(name = "PrereqRank3", nullable = false)
    private Integer prereqRank3;

}