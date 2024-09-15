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
@Table(name = "expected_stat")
@Db2File(name = "ExpectedStat.db2", layoutHash = 0xD0570787, parentIndexField = 10)
public class ExpectedStat implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ExpansionID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer expansionID;

    @ColumnDefault("0")
    @Column(name = "CreatureHealth", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float creatureHealth;

    @ColumnDefault("0")
    @Column(name = "PlayerHealth", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float playerHealth;

    @ColumnDefault("0")
    @Column(name = "CreatureAutoAttackDps", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float creatureAutoAttackDps;

    @ColumnDefault("0")
    @Column(name = "CreatureArmor", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float creatureArmor;

    @ColumnDefault("0")
    @Column(name = "PlayerMana", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float playerMana;

    @ColumnDefault("0")
    @Column(name = "PlayerPrimaryStat", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float playerPrimaryStat;

    @ColumnDefault("0")
    @Column(name = "PlayerSecondaryStat", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float playerSecondaryStat;

    @ColumnDefault("0")
    @Column(name = "ArmorConstant", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float armorConstant;

    @ColumnDefault("0")
    @Column(name = "CreatureSpellDamage", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float creatureSpellDamage;

    @ColumnDefault("'0'")
    @Column(name = "Lvl", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Long lvl;

}