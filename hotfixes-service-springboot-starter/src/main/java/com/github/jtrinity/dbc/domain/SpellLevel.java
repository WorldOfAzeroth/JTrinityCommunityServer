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
@Table(name = "spell_levels")
@Db2File(name = "SpellLevels.db2", layoutHash = 0x1045DB60, parentIndexField = 5)
public class SpellLevel implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private  Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "DifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short difficultyID;

    @ColumnDefault("0")
    @Column(name = "BaseLevel", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short baseLevel;

    @ColumnDefault("0")
    @Column(name = "MaxLevel", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT, signed = true)
    private Short maxLevel;

    @ColumnDefault("0")
    @Column(name = "SpellLevel", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT, signed = true)
    private Short spellLevel;

    @ColumnDefault("'0'")
    @Column(name = "MaxPassiveAuraLevel", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Short maxPassiveAuraLevel;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Long spellID;

}