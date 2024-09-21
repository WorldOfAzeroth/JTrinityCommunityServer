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
@Table(name = "spell_aura_restrictions")
@Db2File(name = "SpellAuraRestrictions.db2", layoutHash = 0x7CDF3311, parentIndexField = 9)
public class SpellAuraRestriction implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "CasterAuraSpell")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer casterAuraSpell;


    @Column(name = "TargetAuraSpell")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer targetAuraSpell;


    @Column(name = "ExcludeCasterAuraSpell")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer excludeCasterAuraSpell;


    @Column(name = "ExcludeTargetAuraSpell")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer excludeTargetAuraSpell;


    @Column(name = "DifficultyID")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte difficultyID;


    @Column(name = "CasterAuraState")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte casterAuraState;


    @Column(name = "TargetAuraState")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte targetAuraState;


    @Column(name = "ExcludeCasterAuraState")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte excludeCasterAuraState;


    @Column(name = "ExcludeTargetAuraState")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Byte excludeTargetAuraState;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
