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
@Table(name = "spell_power")
@Db2File(name = "SpellPower.db2", fileDataId = 982806, layoutHash = 0xD61F566E, indexField = 0, parentIndexField = 13)
public class SpellPower {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "OrderIndex", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short orderIndex;

    @ColumnDefault("0")
    @Column(name = "ManaCost", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer manaCost;

    @ColumnDefault("0")
    @Column(name = "ManaCostPerLevel", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer manaCostPerLevel;

    @ColumnDefault("0")
    @Column(name = "ManaPerSecond", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer manaPerSecond;

    @ColumnDefault("'0'")
    @Column(name = "PowerDisplayID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Long powerDisplayID;

    @ColumnDefault("0")
    @Column(name = "AltPowerBarID", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer altPowerBarID;

    @ColumnDefault("0")
    @Column(name = "PowerCostPct", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float powerCostPct;

    @ColumnDefault("0")
    @Column(name = "PowerCostMaxPct", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float powerCostMaxPct;

    @ColumnDefault("0")
    @Column(name = "PowerPctPerSecond", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float powerPctPerSecond;

    @ColumnDefault("0")
    @Column(name = "PowerType", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE, signed = true)
    private Byte powerType;

    @ColumnDefault("0")
    @Column(name = "RequiredAuraSpellID", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer requiredAuraSpellID;

    @ColumnDefault("'0'")
    @Column(name = "OptionalCost", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Long optionalCost;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Long spellID;

}