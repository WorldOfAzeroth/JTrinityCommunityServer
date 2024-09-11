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
@Table(name = "spell_aura_options")
public class SpellAuraOption {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "DifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    private Short difficultyID;

    @ColumnDefault("'0'")
    @Column(name = "CumulativeAura", columnDefinition = "int UNSIGNED not null")
    private Long cumulativeAura;

    @ColumnDefault("0")
    @Column(name = "ProcCategoryRecovery", nullable = false)
    private Integer procCategoryRecovery;

    @ColumnDefault("'0'")
    @Column(name = "ProcChance", columnDefinition = "tinyint UNSIGNED not null")
    private Short procChance;

    @ColumnDefault("0")
    @Column(name = "ProcCharges", nullable = false)
    private Integer procCharges;

    @ColumnDefault("'0'")
    @Column(name = "SpellProcsPerMinuteID", columnDefinition = "smallint UNSIGNED not null")
    private Integer spellProcsPerMinuteID;

    @ColumnDefault("0")
    @Column(name = "ProcTypeMask1", nullable = false)
    private Integer procTypeMask1;

    @ColumnDefault("0")
    @Column(name = "ProcTypeMask2", nullable = false)
    private Integer procTypeMask2;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

}