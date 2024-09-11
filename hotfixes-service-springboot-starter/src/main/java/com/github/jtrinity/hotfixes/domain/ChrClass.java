package com.github.jtrinity.hotfixes.domain;

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
public class ChrClass {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @Lob
    @Column(name = "Filename")
    private String filename;

    @Lob
    @Column(name = "NameMale")
    private String nameMale;

    @Lob
    @Column(name = "NameFemale")
    private String nameFemale;

    @Lob
    @Column(name = "PetNameToken")
    private String petNameToken;

    @ColumnDefault("'0'")
    @Column(name = "CreateScreenFileDataID", columnDefinition = "int UNSIGNED not null")
    private Long createScreenFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "SelectScreenFileDataID", columnDefinition = "int UNSIGNED not null")
    private Long selectScreenFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "IconFileDataID", columnDefinition = "int UNSIGNED not null")
    private Long iconFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "LowResScreenFileDataID", columnDefinition = "int UNSIGNED not null")
    private Long lowResScreenFileDataID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "StartingLevel", nullable = false)
    private Integer startingLevel;

    @ColumnDefault("'0'")
    @Column(name = "ArmorTypeMask", columnDefinition = "int UNSIGNED not null")
    private Long armorTypeMask;

    @ColumnDefault("'0'")
    @Column(name = "CinematicSequenceID", columnDefinition = "smallint UNSIGNED not null")
    private Integer cinematicSequenceID;

    @ColumnDefault("'0'")
    @Column(name = "DefaultSpec", columnDefinition = "smallint UNSIGNED not null")
    private Integer defaultSpec;

    @ColumnDefault("'0'")
    @Column(name = "HasStrengthAttackBonus", columnDefinition = "tinyint UNSIGNED not null")
    private Short hasStrengthAttackBonus;

    @ColumnDefault("'0'")
    @Column(name = "PrimaryStatPriority", columnDefinition = "tinyint UNSIGNED not null")
    private Short primaryStatPriority;

    @ColumnDefault("'0'")
    @Column(name = "DisplayPower", columnDefinition = "tinyint UNSIGNED not null")
    private Short displayPower;

    @ColumnDefault("'0'")
    @Column(name = "RangedAttackPowerPerAgility", columnDefinition = "tinyint UNSIGNED not null")
    private Short rangedAttackPowerPerAgility;

    @ColumnDefault("'0'")
    @Column(name = "AttackPowerPerAgility", columnDefinition = "tinyint UNSIGNED not null")
    private Short attackPowerPerAgility;

    @ColumnDefault("'0'")
    @Column(name = "AttackPowerPerStrength", columnDefinition = "tinyint UNSIGNED not null")
    private Short attackPowerPerStrength;

    @ColumnDefault("'0'")
    @Column(name = "SpellClassSet", columnDefinition = "tinyint UNSIGNED not null")
    private Short spellClassSet;

    @ColumnDefault("'0'")
    @Column(name = "RolesMask", columnDefinition = "tinyint UNSIGNED not null")
    private Short rolesMask;

    @ColumnDefault("'0'")
    @Column(name = "DamageBonusStat", columnDefinition = "tinyint UNSIGNED not null")
    private Short damageBonusStat;

    @ColumnDefault("'0'")
    @Column(name = "HasRelicSlot", columnDefinition = "tinyint UNSIGNED not null")
    private Short hasRelicSlot;

}