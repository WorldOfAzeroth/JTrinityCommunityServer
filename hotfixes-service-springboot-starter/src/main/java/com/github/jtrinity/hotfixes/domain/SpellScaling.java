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
@Table(name = "spell_scaling")
public class SpellScaling {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    private Integer spellID;

    @ColumnDefault("0")
    @Column(name = "Class", nullable = false)
    private Integer classField;

    @ColumnDefault("'0'")
    @Column(name = "MinScalingLevel", columnDefinition = "int UNSIGNED not null")
    private Long minScalingLevel;

    @ColumnDefault("'0'")
    @Column(name = "MaxScalingLevel", columnDefinition = "int UNSIGNED not null")
    private Long maxScalingLevel;

    @ColumnDefault("0")
    @Column(name = "ScalesFromItemLevel", nullable = false)
    private Short scalesFromItemLevel;

    @ColumnDefault("0")
    @Column(name = "CastTimeMin", nullable = false)
    private Integer castTimeMin;

    @ColumnDefault("0")
    @Column(name = "CastTimeMax", nullable = false)
    private Integer castTimeMax;

    @ColumnDefault("0")
    @Column(name = "CastTimeMaxLevel", nullable = false)
    private Integer castTimeMaxLevel;

    @ColumnDefault("0")
    @Column(name = "NerfFactor", nullable = false)
    private Float nerfFactor;

    @ColumnDefault("0")
    @Column(name = "NerfMaxLevel", nullable = false)
    private Integer nerfMaxLevel;

}