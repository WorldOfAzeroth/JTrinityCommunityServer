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
@Table(name = "chr_classes")
@Db2File(name = "ChrClasses.db2", layoutHash = 0x6F7AB8E7, indexField = 19)
public class ChrClass implements DbcEntity {

    @Column(name = "PetNameToken")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING_NOT_LOCALIZED)
    private String petNameToken;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "NameFemale")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString nameFemale;


    @Column(name = "NameMale")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private LocalizedString nameMale;


    @Column(name = "Filename")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING_NOT_LOCALIZED)
    private String filename;


    @Column(name = "CreateScreenFileDataID")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer createScreenFileDataID;


    @Column(name = "SelectScreenFileDataID")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer selectScreenFileDataID;


    @Column(name = "LowResScreenFileDataID")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer lowResScreenFileDataID;


    @Column(name = "IconFileDataID")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer iconFileDataID;


    @Column(name = "StartingLevel")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer startingLevel;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short flags;


    @Column(name = "CinematicSequenceID")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Short cinematicSequenceID;


    @Column(name = "DefaultSpec")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Short defaultSpec;


    @Column(name = "DisplayPower")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE)
    private Byte displayPower;


    @Column(name = "SpellClassSet")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE)
    private Byte spellClassSet;


    @Column(name = "AttackPowerPerStrength")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Byte attackPowerPerStrength;


    @Column(name = "AttackPowerPerAgility")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE)
    private Byte attackPowerPerAgility;


    @Column(name = "RangedAttackPowerPerAgility")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Byte rangedAttackPowerPerAgility;


    @Column(name = "PrimaryStatPriority")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Byte primaryStatPriority;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
