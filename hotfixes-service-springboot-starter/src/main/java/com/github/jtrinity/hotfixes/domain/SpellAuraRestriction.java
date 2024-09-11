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
@Table(name = "spell_aura_restrictions")
public class SpellAuraRestriction {
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
    @Column(name = "CasterAuraState", columnDefinition = "tinyint UNSIGNED not null")
    private Short casterAuraState;

    @ColumnDefault("'0'")
    @Column(name = "TargetAuraState", columnDefinition = "tinyint UNSIGNED not null")
    private Short targetAuraState;

    @ColumnDefault("'0'")
    @Column(name = "ExcludeCasterAuraState", columnDefinition = "tinyint UNSIGNED not null")
    private Short excludeCasterAuraState;

    @ColumnDefault("'0'")
    @Column(name = "ExcludeTargetAuraState", columnDefinition = "tinyint UNSIGNED not null")
    private Short excludeTargetAuraState;

    @ColumnDefault("0")
    @Column(name = "CasterAuraSpell", nullable = false)
    private Integer casterAuraSpell;

    @ColumnDefault("0")
    @Column(name = "TargetAuraSpell", nullable = false)
    private Integer targetAuraSpell;

    @ColumnDefault("0")
    @Column(name = "ExcludeCasterAuraSpell", nullable = false)
    private Integer excludeCasterAuraSpell;

    @ColumnDefault("0")
    @Column(name = "ExcludeTargetAuraSpell", nullable = false)
    private Integer excludeTargetAuraSpell;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

}