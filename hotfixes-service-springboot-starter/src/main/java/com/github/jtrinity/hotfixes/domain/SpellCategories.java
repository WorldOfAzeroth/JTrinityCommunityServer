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
@Table(name = "spell_categories")
public class SpellCategories {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "DifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    private Short difficultyID;

    @ColumnDefault("0")
    @Column(name = "Category", nullable = false)
    private Short category;

    @ColumnDefault("0")
    @Column(name = "DefenseType", nullable = false)
    private Byte defenseType;

    @ColumnDefault("0")
    @Column(name = "DispelType", nullable = false)
    private Byte dispelType;

    @ColumnDefault("0")
    @Column(name = "Mechanic", nullable = false)
    private Byte mechanic;

    @ColumnDefault("0")
    @Column(name = "PreventionType", nullable = false)
    private Byte preventionType;

    @ColumnDefault("0")
    @Column(name = "StartRecoveryCategory", nullable = false)
    private Short startRecoveryCategory;

    @ColumnDefault("0")
    @Column(name = "ChargeCategory", nullable = false)
    private Short chargeCategory;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

}