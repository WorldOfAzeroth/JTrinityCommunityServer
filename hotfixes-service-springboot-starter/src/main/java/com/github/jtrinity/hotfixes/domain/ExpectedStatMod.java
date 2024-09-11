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
@Table(name = "expected_stat_mod")
public class ExpectedStatMod {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "CreatureHealthMod", nullable = false)
    private Float creatureHealthMod;

    @ColumnDefault("0")
    @Column(name = "PlayerHealthMod", nullable = false)
    private Float playerHealthMod;

    @ColumnDefault("0")
    @Column(name = "CreatureAutoAttackDPSMod", nullable = false)
    private Float creatureAutoAttackDPSMod;

    @ColumnDefault("0")
    @Column(name = "CreatureArmorMod", nullable = false)
    private Float creatureArmorMod;

    @ColumnDefault("0")
    @Column(name = "PlayerManaMod", nullable = false)
    private Float playerManaMod;

    @ColumnDefault("0")
    @Column(name = "PlayerPrimaryStatMod", nullable = false)
    private Float playerPrimaryStatMod;

    @ColumnDefault("0")
    @Column(name = "PlayerSecondaryStatMod", nullable = false)
    private Float playerSecondaryStatMod;

    @ColumnDefault("0")
    @Column(name = "ArmorConstantMod", nullable = false)
    private Float armorConstantMod;

    @ColumnDefault("0")
    @Column(name = "CreatureSpellDamageMod", nullable = false)
    private Float creatureSpellDamageMod;

}