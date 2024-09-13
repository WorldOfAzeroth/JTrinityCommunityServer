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
@Table(name = "durability_costs")
@Db2File(name = "DurabilityCosts.db2", fileDataId = 1283019, layoutHash = 0x3DBDFDD1)
public class DurabilityCost {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Integer weaponSubClassCost1;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Integer weaponSubClassCost2;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Integer weaponSubClassCost3;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Integer weaponSubClassCost4;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost5", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Integer weaponSubClassCost5;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost6", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Integer weaponSubClassCost6;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost7", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Integer weaponSubClassCost7;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost8", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Integer weaponSubClassCost8;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost9", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Integer weaponSubClassCost9;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost10", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Integer weaponSubClassCost10;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost11", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Integer weaponSubClassCost11;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost12", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Integer weaponSubClassCost12;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost13", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Integer weaponSubClassCost13;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost14", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Integer weaponSubClassCost14;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost15", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Integer weaponSubClassCost15;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost16", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Integer weaponSubClassCost16;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost17", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Integer weaponSubClassCost17;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost18", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT)
    private Integer weaponSubClassCost18;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost19", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT)
    private Integer weaponSubClassCost19;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost20", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT)
    private Integer weaponSubClassCost20;

    @ColumnDefault("'0'")
    @Column(name = "WeaponSubClassCost21", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT)
    private Integer weaponSubClassCost21;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 22, type = Db2Type.SHORT)
    private Integer armorSubClassCost1;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 23, type = Db2Type.SHORT)
    private Integer armorSubClassCost2;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 24, type = Db2Type.SHORT)
    private Integer armorSubClassCost3;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 25, type = Db2Type.SHORT)
    private Integer armorSubClassCost4;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost5", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 26, type = Db2Type.SHORT)
    private Integer armorSubClassCost5;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost6", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 27, type = Db2Type.SHORT)
    private Integer armorSubClassCost6;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost7", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 28, type = Db2Type.SHORT)
    private Integer armorSubClassCost7;

    @ColumnDefault("'0'")
    @Column(name = "ArmorSubClassCost8", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 29, type = Db2Type.SHORT)
    private Integer armorSubClassCost8;

}