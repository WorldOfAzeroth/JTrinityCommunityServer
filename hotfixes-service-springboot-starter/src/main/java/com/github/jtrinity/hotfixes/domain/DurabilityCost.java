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
@Table(name = "durability_costs")
public class DurabilityCost {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost1", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost1;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost2", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost2;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost3", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost3;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost4", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost4;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost5", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost5;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost6", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost6;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost7", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost7;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost8", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost8;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost9", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost9;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost10", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost10;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost11", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost11;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost12", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost12;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost13", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost13;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost14", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost14;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost15", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost15;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost16", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost16;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost17", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost17;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost18", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost18;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost19", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost19;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost20", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost20;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost21", columnDefinition = "smallint UNSIGNED not null")
    private Integer weaponSubClassCost21;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost1", columnDefinition = "smallint UNSIGNED not null")
    private Integer armorSubClassCost1;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost2", columnDefinition = "smallint UNSIGNED not null")
    private Integer armorSubClassCost2;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost3", columnDefinition = "smallint UNSIGNED not null")
    private Integer armorSubClassCost3;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost4", columnDefinition = "smallint UNSIGNED not null")
    private Integer armorSubClassCost4;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost5", columnDefinition = "smallint UNSIGNED not null")
    private Integer armorSubClassCost5;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost6", columnDefinition = "smallint UNSIGNED not null")
    private Integer armorSubClassCost6;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost7", columnDefinition = "smallint UNSIGNED not null")
    private Integer armorSubClassCost7;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost8", columnDefinition = "smallint UNSIGNED not null")
    private Integer armorSubClassCost8;

}