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
@Table(name = "chr_classes")
@Db2File(name = "ChrClasses.db2", layoutHash = 0x3F74F8D7, indexField = 5)
public class ChrClass implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private String name;

    @Lob
    @Column(name = "Filename")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String filename;

    @Lob
    @Column(name = "NameMale")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String nameMale;

    @Lob
    @Column(name = "NameFemale")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private String nameFemale;

    @Lob
    @Column(name = "PetNameToken")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING_NOT_LOCALIZED)
    private String petNameToken;

    @ColumnDefault("'0'")
    @Column(name = "CreateScreenFileDataID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Long createScreenFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "SelectScreenFileDataID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long selectScreenFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "IconFileDataID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Long iconFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "LowResScreenFileDataID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Long lowResScreenFileDataID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "StartingLevel", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer startingLevel;

    @ColumnDefault("'0'")
    @Column(name = "ArmorTypeMask", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Long armorTypeMask;

    @ColumnDefault("'0'")
    @Column(name = "CinematicSequenceID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Integer cinematicSequenceID;

    @ColumnDefault("'0'")
    @Column(name = "DefaultSpec", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Integer defaultSpec;

    @ColumnDefault("'0'")
    @Column(name = "HasStrengthAttackBonus", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Short hasStrengthAttackBonus;

    @ColumnDefault("'0'")
    @Column(name = "PrimaryStatPriority", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE)
    private Short primaryStatPriority;

    @ColumnDefault("'0'")
    @Column(name = "DisplayPower", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Short displayPower;

    @ColumnDefault("'0'")
    @Column(name = "RangedAttackPowerPerAgility", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Short rangedAttackPowerPerAgility;

    @ColumnDefault("'0'")
    @Column(name = "AttackPowerPerAgility", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Short attackPowerPerAgility;

    @ColumnDefault("'0'")
    @Column(name = "AttackPowerPerStrength", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Short attackPowerPerStrength;

    @ColumnDefault("'0'")
    @Column(name = "SpellClassSet", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Short spellClassSet;

    @ColumnDefault("'0'")
    @Column(name = "RolesMask", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Short rolesMask;

    @ColumnDefault("'0'")
    @Column(name = "DamageBonusStat", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Short damageBonusStat;

    @ColumnDefault("'0'")
    @Column(name = "HasRelicSlot", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Short hasRelicSlot;

}