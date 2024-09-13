package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Db2File(name = "Talent.db2", fileDataId = 1369062, layoutHash = 0x8384964D)
public class Talent {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Description")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String description;

    @ColumnDefault("'0'")
    @Column(name = "TierID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Short tierID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "ColumnIndex", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Short columnIndex;

    @ColumnDefault("'0'")
    @Column(name = "TabID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Integer tabID;

    @ColumnDefault("'0'")
    @Column(name = "ClassID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short classID;

    @ColumnDefault("'0'")
    @Column(name = "SpecID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Integer specID;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @ColumnDefault("0")
    @Column(name = "OverridesSpellID", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer overridesSpellID;

    @ColumnDefault("0")
    @Column(name = "RequiredSpellID", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer requiredSpellID;

    @ColumnDefault("0")
    @Column(name = "CategoryMask1", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer categoryMask1;

    @ColumnDefault("0")
    @Column(name = "CategoryMask2", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer categoryMask2;

    @ColumnDefault("0")
    @Column(name = "SpellRank1", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer spellRank1;

    @ColumnDefault("0")
    @Column(name = "SpellRank2", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer spellRank2;

    @ColumnDefault("0")
    @Column(name = "SpellRank3", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer spellRank3;

    @ColumnDefault("0")
    @Column(name = "SpellRank4", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer spellRank4;

    @ColumnDefault("0")
    @Column(name = "SpellRank5", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.INT, signed = true)
    private Integer spellRank5;

    @ColumnDefault("0")
    @Column(name = "SpellRank6", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.INT, signed = true)
    private Integer spellRank6;

    @ColumnDefault("0")
    @Column(name = "SpellRank7", nullable = false)
    @Db2Field(fieldIndex = 19, type = Db2Type.INT, signed = true)
    private Integer spellRank7;

    @ColumnDefault("0")
    @Column(name = "SpellRank8", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.INT, signed = true)
    private Integer spellRank8;

    @ColumnDefault("0")
    @Column(name = "SpellRank9", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.INT, signed = true)
    private Integer spellRank9;

    @ColumnDefault("0")
    @Column(name = "PrereqTalent1", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer prereqTalent1;

    @ColumnDefault("0")
    @Column(name = "PrereqTalent2", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer prereqTalent2;

    @ColumnDefault("0")
    @Column(name = "PrereqTalent3", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer prereqTalent3;

    @ColumnDefault("0")
    @Column(name = "PrereqRank1", nullable = false)
    @Db2Field(fieldIndex = 25, type = Db2Type.INT, signed = true)
    private Integer prereqRank1;

    @ColumnDefault("0")
    @Column(name = "PrereqRank2", nullable = false)
    @Db2Field(fieldIndex = 26, type = Db2Type.INT, signed = true)
    private Integer prereqRank2;

    @ColumnDefault("0")
    @Column(name = "PrereqRank3", nullable = false)
    @Db2Field(fieldIndex = 27, type = Db2Type.INT, signed = true)
    private Integer prereqRank3;

}