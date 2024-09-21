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
@ToString
@IdClass(DB2Id.class)
@Entity
@Table(name = "spell_categories")
@Db2File(name = "SpellCategories.db2", layoutHash = 0x14E916CC, parentIndexField = 8)
public class SpellCategories implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Category")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT, signed = true)
    private Short category;


    @Column(name = "StartRecoveryCategory")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short startRecoveryCategory;


    @Column(name = "ChargeCategory")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT, signed = true)
    private Short chargeCategory;


    @Column(name = "DifficultyID")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte difficultyID;


    @Column(name = "DefenseType")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte defenseType;


    @Column(name = "DispelType")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte dispelType;


    @Column(name = "Mechanic")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte mechanic;


    @Column(name = "PreventionType")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte preventionType;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
