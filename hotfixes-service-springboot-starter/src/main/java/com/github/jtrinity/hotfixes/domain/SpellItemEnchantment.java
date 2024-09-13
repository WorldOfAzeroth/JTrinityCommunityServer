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
@Table(name = "spell_item_enchantment")
@Db2File(name = "SpellItemEnchantment.db2", fileDataId = 1362771, layoutHash = 0x31CF18E7)
public class SpellItemEnchantment {
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
    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String name;

    @Lob
    @Column(name = "HordeName")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String hordeName;

    @ColumnDefault("0")
    @Column(name = "Charges", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer charges;

    @ColumnDefault("0")
    @Column(name = "Effect1", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer effect1;

    @ColumnDefault("0")
    @Column(name = "Effect2", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer effect2;

    @ColumnDefault("0")
    @Column(name = "Effect3", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer effect3;

    @ColumnDefault("0")
    @Column(name = "EffectPointsMin1", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer effectPointsMin1;

    @ColumnDefault("0")
    @Column(name = "EffectPointsMin2", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer effectPointsMin2;

    @ColumnDefault("0")
    @Column(name = "EffectPointsMin3", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer effectPointsMin3;

    @ColumnDefault("0")
    @Column(name = "EffectPointsMax1", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer effectPointsMax1;

    @ColumnDefault("0")
    @Column(name = "EffectPointsMax2", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer effectPointsMax2;

    @ColumnDefault("0")
    @Column(name = "EffectPointsMax3", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer effectPointsMax3;

    @ColumnDefault("0")
    @Column(name = "EffectArg1", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer effectArg1;

    @ColumnDefault("0")
    @Column(name = "EffectArg2", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer effectArg2;

    @ColumnDefault("0")
    @Column(name = "EffectArg3", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer effectArg3;

    @ColumnDefault("0")
    @Column(name = "ItemVisual", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer itemVisual;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "EffectScalingPoints1", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.FLOAT)
    private Float effectScalingPoints1;

    @ColumnDefault("0")
    @Column(name = "EffectScalingPoints2", nullable = false)
    @Db2Field(fieldIndex = 19, type = Db2Type.FLOAT)
    private Float effectScalingPoints2;

    @ColumnDefault("0")
    @Column(name = "EffectScalingPoints3", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.FLOAT)
    private Float effectScalingPoints3;

    @ColumnDefault("0")
    @Column(name = "ScalingClass", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.INT, signed = true)
    private Integer scalingClass;

    @ColumnDefault("0")
    @Column(name = "Unk440_1", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer unk440_1;

    @ColumnDefault("0")
    @Column(name = "GemItemID", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer gemItemID;

    @ColumnDefault("0")
    @Column(name = "ConditionID", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer conditionID;

    @ColumnDefault("0")
    @Column(name = "RequiredSkillID", nullable = false)
    @Db2Field(fieldIndex = 25, type = Db2Type.INT, signed = true)
    private Integer requiredSkillID;

    @ColumnDefault("0")
    @Column(name = "RequiredSkillRank", nullable = false)
    @Db2Field(fieldIndex = 26, type = Db2Type.INT, signed = true)
    private Integer requiredSkillRank;

    @ColumnDefault("0")
    @Column(name = "MinLevel", nullable = false)
    @Db2Field(fieldIndex = 27, type = Db2Type.INT, signed = true)
    private Integer minLevel;

    @ColumnDefault("0")
    @Column(name = "Unk440_2", nullable = false)
    @Db2Field(fieldIndex = 28, type = Db2Type.INT, signed = true)
    private Integer unk440_2;

    @ColumnDefault("0")
    @Column(name = "Unk440_3", nullable = false)
    @Db2Field(fieldIndex = 29, type = Db2Type.INT, signed = true)
    private Integer unk440_3;

    @ColumnDefault("0")
    @Column(name = "ItemLevel", nullable = false)
    @Db2Field(fieldIndex = 30, type = Db2Type.INT, signed = true)
    private Integer itemLevel;

    @ColumnDefault("0")
    @Column(name = "Unk440_4", nullable = false)
    @Db2Field(fieldIndex = 31, type = Db2Type.INT, signed = true)
    private Integer unk440_4;

    @ColumnDefault("0")
    @Column(name = "Unk440_5", nullable = false)
    @Db2Field(fieldIndex = 32, type = Db2Type.INT, signed = true)
    private Integer unk440_5;

}