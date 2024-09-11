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
@Table(name = "spell_shapeshift_form")
public class SpellShapeshiftForm {
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

    @ColumnDefault("'0'")
    @Column(name = "Field115052124002", columnDefinition = "int UNSIGNED not null")
    private Long field115052124002;

    @ColumnDefault("0")
    @Column(name = "CreatureType", nullable = false)
    private Byte creatureType;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "AttackIconFileID", nullable = false)
    private Integer attackIconFileID;

    @ColumnDefault("0")
    @Column(name = "BonusActionBar", nullable = false)
    private Byte bonusActionBar;

    @ColumnDefault("0")
    @Column(name = "CombatRoundTime", nullable = false)
    private Short combatRoundTime;

    @ColumnDefault("0")
    @Column(name = "DamageVariance", nullable = false)
    private Float damageVariance;

    @ColumnDefault("'0'")
    @Column(name = "MountTypeID", columnDefinition = "smallint UNSIGNED not null")
    private Integer mountTypeID;

    @ColumnDefault("'0'")
    @Column(name = "CreatureDisplayID1", columnDefinition = "int UNSIGNED not null")
    private Long creatureDisplayID1;

    @ColumnDefault("'0'")
    @Column(name = "CreatureDisplayID2", columnDefinition = "int UNSIGNED not null")
    private Long creatureDisplayID2;

    @ColumnDefault("'0'")
    @Column(name = "CreatureDisplayID3", columnDefinition = "int UNSIGNED not null")
    private Long creatureDisplayID3;

    @ColumnDefault("'0'")
    @Column(name = "CreatureDisplayID4", columnDefinition = "int UNSIGNED not null")
    private Long creatureDisplayID4;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID1", columnDefinition = "int UNSIGNED not null")
    private Long presetSpellID1;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID2", columnDefinition = "int UNSIGNED not null")
    private Long presetSpellID2;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID3", columnDefinition = "int UNSIGNED not null")
    private Long presetSpellID3;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID4", columnDefinition = "int UNSIGNED not null")
    private Long presetSpellID4;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID5", columnDefinition = "int UNSIGNED not null")
    private Long presetSpellID5;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID6", columnDefinition = "int UNSIGNED not null")
    private Long presetSpellID6;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID7", columnDefinition = "int UNSIGNED not null")
    private Long presetSpellID7;

    @ColumnDefault("'0'")
    @Column(name = "PresetSpellID8", columnDefinition = "int UNSIGNED not null")
    private Long presetSpellID8;

}