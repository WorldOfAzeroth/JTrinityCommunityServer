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
@Table(name = "durability_costs")
@Db2File(name = "DurabilityCosts.db2", layoutHash = 0x8447966A)
public class DurabilityCost implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "WeaponSubClassCost1")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Short weaponSubClassCost1;


    @Column(name = "WeaponSubClassCost2")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short weaponSubClassCost2;


    @Column(name = "WeaponSubClassCost3")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short weaponSubClassCost3;


    @Column(name = "WeaponSubClassCost4")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short weaponSubClassCost4;


    @Column(name = "WeaponSubClassCost5")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short weaponSubClassCost5;


    @Column(name = "WeaponSubClassCost6")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short weaponSubClassCost6;


    @Column(name = "WeaponSubClassCost7")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Short weaponSubClassCost7;


    @Column(name = "WeaponSubClassCost8")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Short weaponSubClassCost8;


    @Column(name = "WeaponSubClassCost9")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short weaponSubClassCost9;


    @Column(name = "WeaponSubClassCost10")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short weaponSubClassCost10;


    @Column(name = "WeaponSubClassCost11")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Short weaponSubClassCost11;


    @Column(name = "WeaponSubClassCost12")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Short weaponSubClassCost12;


    @Column(name = "WeaponSubClassCost13")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short weaponSubClassCost13;


    @Column(name = "WeaponSubClassCost14")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short weaponSubClassCost14;


    @Column(name = "WeaponSubClassCost15")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Short weaponSubClassCost15;


    @Column(name = "WeaponSubClassCost16")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Short weaponSubClassCost16;


    @Column(name = "WeaponSubClassCost17")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Short weaponSubClassCost17;


    @Column(name = "WeaponSubClassCost18")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT)
    private Short weaponSubClassCost18;


    @Column(name = "WeaponSubClassCost19")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT)
    private Short weaponSubClassCost19;


    @Column(name = "WeaponSubClassCost20")
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT)
    private Short weaponSubClassCost20;


    @Column(name = "WeaponSubClassCost21")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT)
    private Short weaponSubClassCost21;


    @Column(name = "ArmorSubClassCost1")
    @Db2Field(fieldIndex = 22, type = Db2Type.SHORT)
    private Short armorSubClassCost1;


    @Column(name = "ArmorSubClassCost2")
    @Db2Field(fieldIndex = 23, type = Db2Type.SHORT)
    private Short armorSubClassCost2;


    @Column(name = "ArmorSubClassCost3")
    @Db2Field(fieldIndex = 24, type = Db2Type.SHORT)
    private Short armorSubClassCost3;


    @Column(name = "ArmorSubClassCost4")
    @Db2Field(fieldIndex = 25, type = Db2Type.SHORT)
    private Short armorSubClassCost4;


    @Column(name = "ArmorSubClassCost5")
    @Db2Field(fieldIndex = 26, type = Db2Type.SHORT)
    private Short armorSubClassCost5;


    @Column(name = "ArmorSubClassCost6")
    @Db2Field(fieldIndex = 27, type = Db2Type.SHORT)
    private Short armorSubClassCost6;


    @Column(name = "ArmorSubClassCost7")
    @Db2Field(fieldIndex = 28, type = Db2Type.SHORT)
    private Short armorSubClassCost7;


    @Column(name = "ArmorSubClassCost8")
    @Db2Field(fieldIndex = 29, type = Db2Type.SHORT)
    private Short armorSubClassCost8;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
