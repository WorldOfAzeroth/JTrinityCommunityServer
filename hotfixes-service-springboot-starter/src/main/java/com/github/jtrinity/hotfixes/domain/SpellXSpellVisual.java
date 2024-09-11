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
@Table(name = "spell_x_spell_visual")
public class SpellXSpellVisual {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "DifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    private Short difficultyID;

    @ColumnDefault("'0'")
    @Column(name = "SpellVisualID", columnDefinition = "int UNSIGNED not null")
    private Long spellVisualID;

    @ColumnDefault("0")
    @Column(name = "Probability", nullable = false)
    private Float probability;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("0")
    @Column(name = "Priority", nullable = false)
    private Integer priority;

    @ColumnDefault("0")
    @Column(name = "SpellIconFileID", nullable = false)
    private Integer spellIconFileID;

    @ColumnDefault("0")
    @Column(name = "ActiveIconFileID", nullable = false)
    private Integer activeIconFileID;

    @ColumnDefault("'0'")
    @Column(name = "ViewerUnitConditionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer viewerUnitConditionID;

    @ColumnDefault("'0'")
    @Column(name = "ViewerPlayerConditionID", columnDefinition = "int UNSIGNED not null")
    private Long viewerPlayerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "CasterUnitConditionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer casterUnitConditionID;

    @ColumnDefault("'0'")
    @Column(name = "CasterPlayerConditionID", columnDefinition = "int UNSIGNED not null")
    private Long casterPlayerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

}