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
@Table(name = "spell_item_enchantment")
public class SpellItemEnchantment {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @Lob
    @Column(name = "HordeName")
    private String hordeName;

    @ColumnDefault("0")
    @Column(name = "Charges", nullable = false)
    private Integer charges;

    @ColumnDefault("0")
    @Column(name = "Effect1", nullable = false)
    private Integer effect1;

    @ColumnDefault("0")
    @Column(name = "Effect2", nullable = false)
    private Integer effect2;

    @ColumnDefault("0")
    @Column(name = "Effect3", nullable = false)
    private Integer effect3;

    @ColumnDefault("0")
    @Column(name = "EffectPointsMin1", nullable = false)
    private Integer effectPointsMin1;

    @ColumnDefault("0")
    @Column(name = "EffectPointsMin2", nullable = false)
    private Integer effectPointsMin2;

    @ColumnDefault("0")
    @Column(name = "EffectPointsMin3", nullable = false)
    private Integer effectPointsMin3;

    @ColumnDefault("0")
    @Column(name = "EffectPointsMax1", nullable = false)
    private Integer effectPointsMax1;

    @ColumnDefault("0")
    @Column(name = "EffectPointsMax2", nullable = false)
    private Integer effectPointsMax2;

    @ColumnDefault("0")
    @Column(name = "EffectPointsMax3", nullable = false)
    private Integer effectPointsMax3;

    @ColumnDefault("0")
    @Column(name = "EffectArg1", nullable = false)
    private Integer effectArg1;

    @ColumnDefault("0")
    @Column(name = "EffectArg2", nullable = false)
    private Integer effectArg2;

    @ColumnDefault("0")
    @Column(name = "EffectArg3", nullable = false)
    private Integer effectArg3;

    @ColumnDefault("0")
    @Column(name = "ItemVisual", nullable = false)
    private Integer itemVisual;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "EffectScalingPoints1", nullable = false)
    private Float effectScalingPoints1;

    @ColumnDefault("0")
    @Column(name = "EffectScalingPoints2", nullable = false)
    private Float effectScalingPoints2;

    @ColumnDefault("0")
    @Column(name = "EffectScalingPoints3", nullable = false)
    private Float effectScalingPoints3;

    @ColumnDefault("0")
    @Column(name = "ScalingClass", nullable = false)
    private Integer scalingClass;

    @ColumnDefault("0")
    @Column(name = "Unk440_1", nullable = false)
    private Integer unk440_1;

    @ColumnDefault("0")
    @Column(name = "GemItemID", nullable = false)
    private Integer gemItemID;

    @ColumnDefault("0")
    @Column(name = "ConditionID", nullable = false)
    private Integer conditionID;

    @ColumnDefault("0")
    @Column(name = "RequiredSkillID", nullable = false)
    private Integer requiredSkillID;

    @ColumnDefault("0")
    @Column(name = "RequiredSkillRank", nullable = false)
    private Integer requiredSkillRank;

    @ColumnDefault("0")
    @Column(name = "MinLevel", nullable = false)
    private Integer minLevel;

    @ColumnDefault("0")
    @Column(name = "Unk440_2", nullable = false)
    private Integer unk440_2;

    @ColumnDefault("0")
    @Column(name = "Unk440_3", nullable = false)
    private Integer unk440_3;

    @ColumnDefault("0")
    @Column(name = "ItemLevel", nullable = false)
    private Integer itemLevel;

    @ColumnDefault("0")
    @Column(name = "Unk440_4", nullable = false)
    private Integer unk440_4;

    @ColumnDefault("0")
    @Column(name = "Unk440_5", nullable = false)
    private Integer unk440_5;

}