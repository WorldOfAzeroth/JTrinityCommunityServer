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
@Table(name = "spell_target_restrictions")
public class SpellTargetRestriction {
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

    @ColumnDefault("0")
    @Column(name = "ConeDegrees", nullable = false)
    private Float coneDegrees;

    @ColumnDefault("'0'")
    @Column(name = "MaxTargets", columnDefinition = "tinyint UNSIGNED not null")
    private Short maxTargets;

    @ColumnDefault("'0'")
    @Column(name = "MaxTargetLevel", columnDefinition = "int UNSIGNED not null")
    private Long maxTargetLevel;

    @ColumnDefault("0")
    @Column(name = "TargetCreatureType", nullable = false)
    private Short targetCreatureType;

    @ColumnDefault("0")
    @Column(name = "Targets", nullable = false)
    private Integer targets;

    @ColumnDefault("0")
    @Column(name = "Width", nullable = false)
    private Float width;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

}