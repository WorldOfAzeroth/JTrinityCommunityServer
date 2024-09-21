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
@Table(name = "spell_cooldowns")
@Db2File(name = "SpellCooldowns.db2", layoutHash = 0xCA8D8B3C, parentIndexField = 4)
public class SpellCooldown implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "CategoryRecoveryTime")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer categoryRecoveryTime;


    @Column(name = "RecoveryTime")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer recoveryTime;


    @Column(name = "StartRecoveryTime")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer startRecoveryTime;


    @Column(name = "DifficultyID")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte difficultyID;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
