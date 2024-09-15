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
@Table(name = "spell_effect")
@Db2File(name = "SpellEffect.db2", layoutHash = 0x6B64DD7A, parentIndexField = 28)
public class SpellEffect implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private  Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "DifficultyID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer difficultyID;

    @ColumnDefault("0")
    @Column(name = "EffectIndex", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer effectIndex;

    @ColumnDefault("'0'")
    @Column(name = "Effect", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long effect;

    @ColumnDefault("0")
    @Column(name = "EffectAmplitude", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float effectAmplitude;

    @ColumnDefault("0")
    @Column(name = "EffectAttributes", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer effectAttributes;

    @ColumnDefault("0")
    @Column(name = "EffectAura", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT, signed = true)
    private Short effectAura;

    @ColumnDefault("0")
    @Column(name = "EffectAuraPeriod", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer effectAuraPeriod;

    @ColumnDefault("0")
    @Column(name = "EffectBasePoints", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer effectBasePoints;

    @ColumnDefault("0")
    @Column(name = "EffectBonusCoefficient", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float effectBonusCoefficient;

    @ColumnDefault("0")
    @Column(name = "EffectChainAmplitude", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float effectChainAmplitude;

    @ColumnDefault("0")
    @Column(name = "EffectChainTargets", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer effectChainTargets;

    @ColumnDefault("0")
    @Column(name = "EffectDieSides", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer effectDieSides;

    @ColumnDefault("0")
    @Column(name = "EffectItemType", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer effectItemType;

    @ColumnDefault("0")
    @Column(name = "EffectMechanic", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer effectMechanic;

    @ColumnDefault("0")
    @Column(name = "EffectPointsPerResource", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.FLOAT)
    private Float effectPointsPerResource;

    @ColumnDefault("0")
    @Column(name = "EffectPosFacing", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.FLOAT)
    private Float effectPosFacing;

    @ColumnDefault("0")
    @Column(name = "EffectRealPointsPerLevel", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.FLOAT)
    private Float effectRealPointsPerLevel;

    @ColumnDefault("0")
    @Column(name = "EffectTriggerSpell", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.INT, signed = true)
    private Integer effectTriggerSpell;

    @ColumnDefault("0")
    @Column(name = "BonusCoefficientFromAP", nullable = false)
    @Db2Field(fieldIndex = 19, type = Db2Type.FLOAT)
    private Float bonusCoefficientFromAP;

    @ColumnDefault("0")
    @Column(name = "PvpMultiplier", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.FLOAT)
    private Float pvpMultiplier;

    @ColumnDefault("0")
    @Column(name = "Coefficient", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.FLOAT)
    private Float coefficient;

    @ColumnDefault("0")
    @Column(name = "Variance", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.FLOAT)
    private Float variance;

    @ColumnDefault("0")
    @Column(name = "ResourceCoefficient", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.FLOAT)
    private Float resourceCoefficient;

    @ColumnDefault("0")
    @Column(name = "GroupSizeBasePointsCoefficient", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.FLOAT)
    private Float groupSizeBasePointsCoefficient;

    @ColumnDefault("0")
    @Column(name = "EffectMiscValue1", nullable = false)
    @Db2Field(fieldIndex = 25, type = Db2Type.INT, signed = true)
    private Integer effectMiscValue1;

    @ColumnDefault("0")
    @Column(name = "EffectMiscValue2", nullable = false)
    @Db2Field(fieldIndex = 26, type = Db2Type.INT, signed = true)
    private Integer effectMiscValue2;

    @ColumnDefault("'0'")
    @Column(name = "EffectRadiusIndex1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 27, type = Db2Type.INT)
    private Long effectRadiusIndex1;

    @ColumnDefault("'0'")
    @Column(name = "EffectRadiusIndex2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 28, type = Db2Type.INT)
    private Long effectRadiusIndex2;

    @ColumnDefault("0")
    @Column(name = "EffectSpellClassMask1", nullable = false)
    @Db2Field(fieldIndex = 29, type = Db2Type.INT, signed = true)
    private Integer effectSpellClassMask1;

    @ColumnDefault("0")
    @Column(name = "EffectSpellClassMask2", nullable = false)
    @Db2Field(fieldIndex = 30, type = Db2Type.INT, signed = true)
    private Integer effectSpellClassMask2;

    @ColumnDefault("0")
    @Column(name = "EffectSpellClassMask3", nullable = false)
    @Db2Field(fieldIndex = 31, type = Db2Type.INT, signed = true)
    private Integer effectSpellClassMask3;

    @ColumnDefault("0")
    @Column(name = "EffectSpellClassMask4", nullable = false)
    @Db2Field(fieldIndex = 32, type = Db2Type.INT, signed = true)
    private Integer effectSpellClassMask4;

    @ColumnDefault("0")
    @Column(name = "ImplicitTarget1", nullable = false)
    @Db2Field(fieldIndex = 33, type = Db2Type.SHORT, signed = true)
    private Short implicitTarget1;

    @ColumnDefault("0")
    @Column(name = "ImplicitTarget2", nullable = false)
    @Db2Field(fieldIndex = 34, type = Db2Type.SHORT, signed = true)
    private Short implicitTarget2;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 35, type = Db2Type.INT)
    private Long spellID;

}