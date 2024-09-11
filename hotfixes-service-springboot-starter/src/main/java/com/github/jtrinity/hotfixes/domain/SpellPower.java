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
@Table(name = "spell_power")
public class SpellPower {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "OrderIndex", columnDefinition = "tinyint UNSIGNED not null")
    private Short orderIndex;

    @ColumnDefault("0")
    @Column(name = "ManaCost", nullable = false)
    private Integer manaCost;

    @ColumnDefault("0")
    @Column(name = "ManaCostPerLevel", nullable = false)
    private Integer manaCostPerLevel;

    @ColumnDefault("0")
    @Column(name = "ManaPerSecond", nullable = false)
    private Integer manaPerSecond;

    @ColumnDefault("'0'")
    @Column(name = "PowerDisplayID", columnDefinition = "int UNSIGNED not null")
    private Long powerDisplayID;

    @ColumnDefault("0")
    @Column(name = "AltPowerBarID", nullable = false)
    private Integer altPowerBarID;

    @ColumnDefault("0")
    @Column(name = "PowerCostPct", nullable = false)
    private Float powerCostPct;

    @ColumnDefault("0")
    @Column(name = "PowerCostMaxPct", nullable = false)
    private Float powerCostMaxPct;

    @ColumnDefault("0")
    @Column(name = "PowerPctPerSecond", nullable = false)
    private Float powerPctPerSecond;

    @ColumnDefault("0")
    @Column(name = "PowerType", nullable = false)
    private Byte powerType;

    @ColumnDefault("0")
    @Column(name = "RequiredAuraSpellID", nullable = false)
    private Integer requiredAuraSpellID;

    @ColumnDefault("'0'")
    @Column(name = "OptionalCost", columnDefinition = "int UNSIGNED not null")
    private Long optionalCost;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

}