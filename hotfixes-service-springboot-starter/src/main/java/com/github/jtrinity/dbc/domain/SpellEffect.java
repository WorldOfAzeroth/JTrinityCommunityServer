package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
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
@ToString
@IdClass(DB2Id.class)
@Entity
@Table(name = "spell_effect")
@Db2File(name = "SpellEffect.db2", layoutHash = 0x3244098B, indexField = 0, parentIndexField = 29)
public class SpellEffect implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Effect")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer effect;


    @Column(name = "EffectBasePoints")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer effectBasePoints;


    @Column(name = "EffectIndex")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer effectIndex;


    @Column(name = "EffectAura")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer effectAura;


    @Column(name = "DifficultyID")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer difficultyID;


    @Column(name = "EffectAmplitude")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float effectAmplitude;


    @Column(name = "EffectAuraPeriod")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer effectAuraPeriod;


    @Column(name = "EffectBonusCoefficient")
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float effectBonusCoefficient;


    @Column(name = "EffectChainAmplitude")
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float effectChainAmplitude;


    @Column(name = "EffectChainTargets")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer effectChainTargets;


    @Column(name = "EffectDieSides")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer effectDieSides;


    @Column(name = "EffectItemType")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer effectItemType;


    @Column(name = "EffectMechanic")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer effectMechanic;


    @Column(name = "EffectPointsPerResource")
    @Db2Field(fieldIndex = 14, type = Db2Type.FLOAT)
    private Float effectPointsPerResource;


    @Column(name = "EffectRealPointsPerLevel")
    @Db2Field(fieldIndex = 15, type = Db2Type.FLOAT)
    private Float effectRealPointsPerLevel;


    @Column(name = "EffectTriggerSpell")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer effectTriggerSpell;


    @Column(name = "EffectPosFacing")
    @Db2Field(fieldIndex = 17, type = Db2Type.FLOAT)
    private Float effectPosFacing;


    @Column(name = "EffectAttributes")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT, signed = true)
    private Integer effectAttributes;


    @Column(name = "BonusCoefficientFromAP")
    @Db2Field(fieldIndex = 19, type = Db2Type.FLOAT)
    private Float bonusCoefficientFromAP;


    @Column(name = "PvpMultiplier")
    @Db2Field(fieldIndex = 20, type = Db2Type.FLOAT)
    private Float pvpMultiplier;


    @Column(name = "Coefficient")
    @Db2Field(fieldIndex = 21, type = Db2Type.FLOAT)
    private Float coefficient;


    @Column(name = "Variance")
    @Db2Field(fieldIndex = 22, type = Db2Type.FLOAT)
    private Float variance;


    @Column(name = "ResourceCoefficient")
    @Db2Field(fieldIndex = 23, type = Db2Type.FLOAT)
    private Float resourceCoefficient;


    @Column(name = "GroupSizeBasePointsCoefficient")
    @Db2Field(fieldIndex = 24, type = Db2Type.FLOAT)
    private Float groupSizeBasePointsCoefficient;


    @Column(name = "EffectSpellClassMask1")
    @Db2Field(fieldIndex = 25, type = Db2Type.INT)
    private Integer effectSpellClassMask1;


    @Column(name = "EffectSpellClassMask2")
    @Db2Field(fieldIndex = 26, type = Db2Type.INT)
    private Integer effectSpellClassMask2;


    @Column(name = "EffectSpellClassMask3")
    @Db2Field(fieldIndex = 27, type = Db2Type.INT)
    private Integer effectSpellClassMask3;


    @Column(name = "EffectSpellClassMask4")
    @Db2Field(fieldIndex = 28, type = Db2Type.INT)
    private Integer effectSpellClassMask4;


    @Column(name = "EffectMiscValue1")
    @Db2Field(fieldIndex = 29, type = Db2Type.INT, signed = true)
    private Integer effectMiscValue1;


    @Column(name = "EffectMiscValue2")
    @Db2Field(fieldIndex = 30, type = Db2Type.INT, signed = true)
    private Integer effectMiscValue2;


    @Column(name = "EffectRadiusIndex1")
    @Db2Field(fieldIndex = 31, type = Db2Type.INT)
    private Integer effectRadiusIndex1;


    @Column(name = "EffectRadiusIndex2")
    @Db2Field(fieldIndex = 32, type = Db2Type.INT)
    private Integer effectRadiusIndex2;


    @Column(name = "ImplicitTarget1")
    @Db2Field(fieldIndex = 33, type = Db2Type.INT)
    private Integer implicitTarget1;


    @Column(name = "ImplicitTarget2")
    @Db2Field(fieldIndex = 34, type = Db2Type.INT)
    private Integer implicitTarget2;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 35, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
