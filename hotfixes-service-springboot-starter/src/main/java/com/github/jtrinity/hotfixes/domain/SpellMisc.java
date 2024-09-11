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
@Table(name = "spell_misc")
public class SpellMisc {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Attributes1", nullable = false)
    private Integer attributes1;

    @ColumnDefault("0")
    @Column(name = "Attributes2", nullable = false)
    private Integer attributes2;

    @ColumnDefault("0")
    @Column(name = "Attributes3", nullable = false)
    private Integer attributes3;

    @ColumnDefault("0")
    @Column(name = "Attributes4", nullable = false)
    private Integer attributes4;

    @ColumnDefault("0")
    @Column(name = "Attributes5", nullable = false)
    private Integer attributes5;

    @ColumnDefault("0")
    @Column(name = "Attributes6", nullable = false)
    private Integer attributes6;

    @ColumnDefault("0")
    @Column(name = "Attributes7", nullable = false)
    private Integer attributes7;

    @ColumnDefault("0")
    @Column(name = "Attributes8", nullable = false)
    private Integer attributes8;

    @ColumnDefault("0")
    @Column(name = "Attributes9", nullable = false)
    private Integer attributes9;

    @ColumnDefault("0")
    @Column(name = "Attributes10", nullable = false)
    private Integer attributes10;

    @ColumnDefault("0")
    @Column(name = "Attributes11", nullable = false)
    private Integer attributes11;

    @ColumnDefault("0")
    @Column(name = "Attributes12", nullable = false)
    private Integer attributes12;

    @ColumnDefault("0")
    @Column(name = "Attributes13", nullable = false)
    private Integer attributes13;

    @ColumnDefault("0")
    @Column(name = "Attributes14", nullable = false)
    private Integer attributes14;

    @ColumnDefault("0")
    @Column(name = "Attributes15", nullable = false)
    private Integer attributes15;

    @ColumnDefault("'0'")
    @Column(name = "DifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    private Short difficultyID;

    @ColumnDefault("'0'")
    @Column(name = "CastingTimeIndex", columnDefinition = "smallint UNSIGNED not null")
    private Integer castingTimeIndex;

    @ColumnDefault("'0'")
    @Column(name = "DurationIndex", columnDefinition = "smallint UNSIGNED not null")
    private Integer durationIndex;

    @ColumnDefault("'0'")
    @Column(name = "RangeIndex", columnDefinition = "smallint UNSIGNED not null")
    private Integer rangeIndex;

    @ColumnDefault("'0'")
    @Column(name = "SchoolMask", columnDefinition = "tinyint UNSIGNED not null")
    private Short schoolMask;

    @ColumnDefault("0")
    @Column(name = "Speed", nullable = false)
    private Float speed;

    @ColumnDefault("0")
    @Column(name = "LaunchDelay", nullable = false)
    private Float launchDelay;

    @ColumnDefault("0")
    @Column(name = "MinDuration", nullable = false)
    private Float minDuration;

    @ColumnDefault("0")
    @Column(name = "SpellIconFileDataID", nullable = false)
    private Integer spellIconFileDataID;

    @ColumnDefault("0")
    @Column(name = "ActiveIconFileDataID", nullable = false)
    private Integer activeIconFileDataID;

    @ColumnDefault("0")
    @Column(name = "ContentTuningID", nullable = false)
    private Integer contentTuningID;

    @ColumnDefault("0")
    @Column(name = "ShowFutureSpellPlayerConditionID", nullable = false)
    private Integer showFutureSpellPlayerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

}