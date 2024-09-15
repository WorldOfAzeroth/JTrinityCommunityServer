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
@Table(name = "spell_shapeshift_form")
@Db2File(name = "SpellShapeshiftForm.db2", layoutHash = 0xF8FD06AC)
public class SpellShapeshiftForm implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private  Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String name;

    @ColumnDefault("'0'")
    @Column(name = "Field115052124002", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Long field115052124002;

    @ColumnDefault("0")
    @Column(name = "CreatureType", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE, signed = true)
    private Byte creatureType;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "AttackIconFileID", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer attackIconFileID;

    @ColumnDefault("0")
    @Column(name = "BonusActionBar", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte bonusActionBar;

    @ColumnDefault("0")
    @Column(name = "CombatRoundTime", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT, signed = true)
    private Short combatRoundTime;

    @ColumnDefault("0")
    @Column(name = "DamageVariance", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float damageVariance;

    @ColumnDefault("'0'")
    @Column(name = "MountTypeID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Integer mountTypeID;

    @ColumnDefault("'0'")
    @Column(name = "CreatureDisplayID1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long creatureDisplayID1;

    @ColumnDefault("'0'")
    @Column(name = "CreatureDisplayID2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Long creatureDisplayID2;

    @ColumnDefault("'0'")
    @Column(name = "CreatureDisplayID3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Long creatureDisplayID3;

    @ColumnDefault("'0'")
    @Column(name = "CreatureDisplayID4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Long creatureDisplayID4;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Long presetSpellID1;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Long presetSpellID2;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Long presetSpellID3;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT)
    private Long presetSpellID4;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID5", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT)
    private Long presetSpellID5;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID6", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.INT)
    private Long presetSpellID6;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID7", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.INT)
    private Long presetSpellID7;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID8", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.INT)
    private Long presetSpellID8;

}