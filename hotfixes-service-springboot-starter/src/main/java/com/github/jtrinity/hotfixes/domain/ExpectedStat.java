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
@Table(name = "expected_stat")
public class ExpectedStat {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ExpansionID", nullable = false)
    private Integer expansionID;

    @ColumnDefault("0")
    @Column(name = "CreatureHealth", nullable = false)
    private Float creatureHealth;

    @ColumnDefault("0")
    @Column(name = "PlayerHealth", nullable = false)
    private Float playerHealth;

    @ColumnDefault("0")
    @Column(name = "CreatureAutoAttackDps", nullable = false)
    private Float creatureAutoAttackDps;

    @ColumnDefault("0")
    @Column(name = "CreatureArmor", nullable = false)
    private Float creatureArmor;

    @ColumnDefault("0")
    @Column(name = "PlayerMana", nullable = false)
    private Float playerMana;

    @ColumnDefault("0")
    @Column(name = "PlayerPrimaryStat", nullable = false)
    private Float playerPrimaryStat;

    @ColumnDefault("0")
    @Column(name = "PlayerSecondaryStat", nullable = false)
    private Float playerSecondaryStat;

    @ColumnDefault("0")
    @Column(name = "ArmorConstant", nullable = false)
    private Float armorConstant;

    @ColumnDefault("0")
    @Column(name = "CreatureSpellDamage", nullable = false)
    private Float creatureSpellDamage;

    @ColumnDefault("'0'")
    @Column(name = "Lvl", columnDefinition = "int UNSIGNED not null")
    private Long lvl;

}