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
@Table(name = "specialization_spells")
@Db2File(name = "SpecializationSpells.db2", layoutHash = 0xAE3436F3, indexField = 5, parentIndexField = 3)
public class SpecializationSpell implements DbcEntity {

    @Column(name = "Description")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spellID;


    @Column(name = "OverridesSpellID")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer overridesSpellID;


    @Column(name = "SpecID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short specID;


    @Column(name = "DisplayOrder")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte displayOrder;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
