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
@Table(name = "chr_specialization")
@Db2File(name = "ChrSpecialization.db2", layoutHash = 0x3D86B8F7, indexField = 9, parentIndexField = 4)
public class ChrSpecialization implements DbcEntity {

    @Column(name = "Name")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "FemaleName")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString femaleName;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "MasterySpellID1")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer masterySpellID1;


    @Column(name = "MasterySpellID2")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer masterySpellID2;


    @Column(name = "ClassID")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte classID;


    @Column(name = "OrderIndex")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte orderIndex;


    @Column(name = "PetTalentType")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte petTalentType;


    @Column(name = "Role")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte role;


    @Column(name = "PrimaryStatPriority")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte primaryStatPriority;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SpellIconFileID")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer spellIconFileID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Integer flags;


    @Column(name = "AnimReplacements")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer animReplacements;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
