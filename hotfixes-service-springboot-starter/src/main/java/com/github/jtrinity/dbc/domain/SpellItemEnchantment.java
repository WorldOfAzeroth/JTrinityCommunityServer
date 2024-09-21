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
@Table(name = "spell_item_enchantment")
@Db2File(name = "SpellItemEnchantment.db2", layoutHash = 0x80DEA734)
public class SpellItemEnchantment implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "EffectArg1")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer effectArg1;


    @Column(name = "EffectArg2")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer effectArg2;


    @Column(name = "EffectArg3")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer effectArg3;


    @Column(name = "EffectScalingPoints1")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float effectScalingPoints1;


    @Column(name = "EffectScalingPoints2")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float effectScalingPoints2;


    @Column(name = "EffectScalingPoints3")
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float effectScalingPoints3;


    @Column(name = "TransmogCost")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer transmogCost;


    @Column(name = "IconFileDataID")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Integer iconFileDataID;


    @Column(name = "EffectPointsMin1")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT, signed = true)
    private Short effectPointsMin1;


    @Column(name = "EffectPointsMin2")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT, signed = true)
    private Short effectPointsMin2;


    @Column(name = "EffectPointsMin3")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT, signed = true)
    private Short effectPointsMin3;


    @Column(name = "ItemVisual")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short itemVisual;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short flags;


    @Column(name = "RequiredSkillID")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Short requiredSkillID;


    @Column(name = "RequiredSkillRank")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Short requiredSkillRank;


    @Column(name = "ItemLevel")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Short itemLevel;


    @Column(name = "Charges")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Byte charges;


    @Column(name = "Effect1")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Byte effect1;


    @Column(name = "Effect2")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Byte effect2;


    @Column(name = "Effect3")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Byte effect3;


    @Column(name = "ConditionID")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Byte conditionID;


    @Column(name = "MinLevel")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Byte minLevel;


    @Column(name = "MaxLevel")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Byte maxLevel;


    @Column(name = "ScalingClass")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE, signed = true)
    private Byte scalingClass;


    @Column(name = "ScalingClassRestricted")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE, signed = true)
    private Byte scalingClassRestricted;


    @Column(name = "TransmogPlayerConditionID")
    @Db2Field(fieldIndex = 27, type = Db2Type.INT)
    private Integer transmogPlayerConditionID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
