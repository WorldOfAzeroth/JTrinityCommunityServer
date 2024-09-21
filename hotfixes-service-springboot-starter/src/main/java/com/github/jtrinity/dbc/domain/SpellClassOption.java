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
@Table(name = "spell_class_options")
@Db2File(name = "SpellClassOptions.db2", layoutHash = 0x80FBD67A)
public class SpellClassOption implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spellID;


    @Column(name = "SpellClassMask1")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer spellClassMask1;


    @Column(name = "SpellClassMask2")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer spellClassMask2;


    @Column(name = "SpellClassMask3")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer spellClassMask3;


    @Column(name = "SpellClassMask4")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer spellClassMask4;


    @Column(name = "SpellClassSet")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte spellClassSet;


    @Column(name = "ModalNextSpell")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer modalNextSpell;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
