package com.github.jtrinity.dbc.domain;

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
@Table(name = "chr_specialization")
public class ChrSpecialization {
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
    @Column(name = "FemaleName")
    private String femaleName;

    @Lob
    @Column(name = "Description")
    private String description;

    @ColumnDefault("'0'")
    @Column(name = "ClassID", columnDefinition = "tinyint UNSIGNED not null")
    private Short classID;

    @ColumnDefault("0")
    @Column(name = "OrderIndex", nullable = false)
    private Byte orderIndex;

    @ColumnDefault("0")
    @Column(name = "PetTalentType", nullable = false)
    private Byte petTalentType;

    @ColumnDefault("0")
    @Column(name = "Role", nullable = false)
    private Byte role;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "int UNSIGNED not null")
    private Long flags;

    @ColumnDefault("0")
    @Column(name = "SpellIconFileID", nullable = false)
    private Integer spellIconFileID;

    @ColumnDefault("0")
    @Column(name = "PrimaryStatPriority", nullable = false)
    private Byte primaryStatPriority;

    @ColumnDefault("0")
    @Column(name = "AnimReplacements", nullable = false)
    private Integer animReplacements;

    @ColumnDefault("0")
    @Column(name = "MasterySpellID1", nullable = false)
    private Integer masterySpellID1;

    @ColumnDefault("0")
    @Column(name = "MasterySpellID2", nullable = false)
    private Integer masterySpellID2;

}