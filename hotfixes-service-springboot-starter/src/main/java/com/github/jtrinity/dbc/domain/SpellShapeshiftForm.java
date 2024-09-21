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
@Table(name = "spell_shapeshift_form")
@Db2File(name = "SpellShapeshiftForm.db2", layoutHash = 0x130819AF)
public class SpellShapeshiftForm implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "DamageVariance")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float damageVariance;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer flags;


    @Column(name = "CombatRoundTime")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT, signed = true)
    private Short combatRoundTime;


    @Column(name = "MountTypeID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short mountTypeID;


    @Column(name = "CreatureType")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte creatureType;


    @Column(name = "BonusActionBar")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte bonusActionBar;


    @Column(name = "AttackIconFileID")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer attackIconFileID;


    @Column(name = "CreatureDisplayID1")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Integer creatureDisplayID1;


    @Column(name = "CreatureDisplayID2")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Integer creatureDisplayID2;


    @Column(name = "CreatureDisplayID3")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Integer creatureDisplayID3;


    @Column(name = "CreatureDisplayID4")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Integer creatureDisplayID4;


    @Column(name = "PresetSpellID1")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Integer presetSpellID1;


    @Column(name = "PresetSpellID2")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Integer presetSpellID2;


    @Column(name = "PresetSpellID3")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Integer presetSpellID3;


    @Column(name = "PresetSpellID4")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Integer presetSpellID4;


    @Column(name = "PresetSpellID5")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT)
    private Integer presetSpellID5;


    @Column(name = "PresetSpellID6")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT)
    private Integer presetSpellID6;


    @Column(name = "PresetSpellID7")
    @Db2Field(fieldIndex = 19, type = Db2Type.INT)
    private Integer presetSpellID7;


    @Column(name = "PresetSpellID8")
    @Db2Field(fieldIndex = 20, type = Db2Type.INT)
    private Integer presetSpellID8;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
