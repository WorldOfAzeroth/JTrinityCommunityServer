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
@Table(name = "expected_stat_mod")
@Db2File(name = "ExpectedStatMod.db2", layoutHash = 0x462D65F2)
public class ExpectedStatMod implements DbcEntity {
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
    @Column(name = "CreatureHealthMod", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float creatureHealthMod;

    @ColumnDefault("0")
    @Column(name = "PlayerHealthMod", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float playerHealthMod;

    @ColumnDefault("0")
    @Column(name = "CreatureAutoAttackDPSMod", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float creatureAutoAttackDPSMod;

    @ColumnDefault("0")
    @Column(name = "CreatureArmorMod", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float creatureArmorMod;

    @ColumnDefault("0")
    @Column(name = "PlayerManaMod", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float playerManaMod;

    @ColumnDefault("0")
    @Column(name = "PlayerPrimaryStatMod", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float playerPrimaryStatMod;

    @ColumnDefault("0")
    @Column(name = "PlayerSecondaryStatMod", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float playerSecondaryStatMod;

    @ColumnDefault("0")
    @Column(name = "ArmorConstantMod", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float armorConstantMod;

    @ColumnDefault("0")
    @Column(name = "CreatureSpellDamageMod", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float creatureSpellDamageMod;

}