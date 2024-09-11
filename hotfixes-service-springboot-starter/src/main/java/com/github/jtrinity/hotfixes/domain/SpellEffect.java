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
@Table(name = "spell_effect")
public class SpellEffect {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "DifficultyID", nullable = false)
    private Integer difficultyID;

    @ColumnDefault("0")
    @Column(name = "EffectIndex", nullable = false)
    private Integer effectIndex;

    @ColumnDefault("'0'")
    @Column(name = "Effect", columnDefinition = "int UNSIGNED not null")
    private Long effect;

    @ColumnDefault("0")
    @Column(name = "EffectAmplitude", nullable = false)
    private Float effectAmplitude;

    @ColumnDefault("0")
    @Column(name = "EffectAttributes", nullable = false)
    private Integer effectAttributes;

    @ColumnDefault("0")
    @Column(name = "EffectAura", nullable = false)
    private Short effectAura;

    @ColumnDefault("0")
    @Column(name = "EffectAuraPeriod", nullable = false)
    private Integer effectAuraPeriod;

    @ColumnDefault("0")
    @Column(name = "EffectBasePoints", nullable = false)
    private Integer effectBasePoints;

    @ColumnDefault("0")
    @Column(name = "EffectBonusCoefficient", nullable = false)
    private Float effectBonusCoefficient;

    @ColumnDefault("0")
    @Column(name = "EffectChainAmplitude", nullable = false)
    private Float effectChainAmplitude;

    @ColumnDefault("0")
    @Column(name = "EffectChainTargets", nullable = false)
    private Integer effectChainTargets;

    @ColumnDefault("0")
    @Column(name = "EffectDieSides", nullable = false)
    private Integer effectDieSides;

    @ColumnDefault("0")
    @Column(name = "EffectItemType", nullable = false)
    private Integer effectItemType;

    @ColumnDefault("0")
    @Column(name = "EffectMechanic", nullable = false)
    private Integer effectMechanic;

    @ColumnDefault("0")
    @Column(name = "EffectPointsPerResource", nullable = false)
    private Float effectPointsPerResource;

    @ColumnDefault("0")
    @Column(name = "EffectPosFacing", nullable = false)
    private Float effectPosFacing;

    @ColumnDefault("0")
    @Column(name = "EffectRealPointsPerLevel", nullable = false)
    private Float effectRealPointsPerLevel;

    @ColumnDefault("0")
    @Column(name = "EffectTriggerSpell", nullable = false)
    private Integer effectTriggerSpell;

    @ColumnDefault("0")
    @Column(name = "BonusCoefficientFromAP", nullable = false)
    private Float bonusCoefficientFromAP;

    @ColumnDefault("0")
    @Column(name = "PvpMultiplier", nullable = false)
    private Float pvpMultiplier;

    @ColumnDefault("0")
    @Column(name = "Coefficient", nullable = false)
    private Float coefficient;

    @ColumnDefault("0")
    @Column(name = "Variance", nullable = false)
    private Float variance;

    @ColumnDefault("0")
    @Column(name = "ResourceCoefficient", nullable = false)
    private Float resourceCoefficient;

    @ColumnDefault("0")
    @Column(name = "GroupSizeBasePointsCoefficient", nullable = false)
    private Float groupSizeBasePointsCoefficient;

    @ColumnDefault("0")
    @Column(name = "EffectMiscValue1", nullable = false)
    private Integer effectMiscValue1;

    @ColumnDefault("0")
    @Column(name = "EffectMiscValue2", nullable = false)
    private Integer effectMiscValue2;

    @ColumnDefault("'0'")
    @Column(name = "EffectRadiusIndex1", columnDefinition = "int UNSIGNED not null")
    private Long effectRadiusIndex1;

    @ColumnDefault("'0'")
    @Column(name = "EffectRadiusIndex2", columnDefinition = "int UNSIGNED not null")
    private Long effectRadiusIndex2;

    @ColumnDefault("0")
    @Column(name = "EffectSpellClassMask1", nullable = false)
    private Integer effectSpellClassMask1;

    @ColumnDefault("0")
    @Column(name = "EffectSpellClassMask2", nullable = false)
    private Integer effectSpellClassMask2;

    @ColumnDefault("0")
    @Column(name = "EffectSpellClassMask3", nullable = false)
    private Integer effectSpellClassMask3;

    @ColumnDefault("0")
    @Column(name = "EffectSpellClassMask4", nullable = false)
    private Integer effectSpellClassMask4;

    @ColumnDefault("0")
    @Column(name = "ImplicitTarget1", nullable = false)
    private Short implicitTarget1;

    @ColumnDefault("0")
    @Column(name = "ImplicitTarget2", nullable = false)
    private Short implicitTarget2;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

}