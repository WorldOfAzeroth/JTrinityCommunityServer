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
@Table(name = "power_type")
public class PowerType {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "NameGlobalStringTag")
    private String nameGlobalStringTag;

    @Lob
    @Column(name = "CostGlobalStringTag")
    private String costGlobalStringTag;

    @ColumnDefault("0")
    @Column(name = "PowerTypeEnum", nullable = false)
    private Byte powerTypeEnum;

    @ColumnDefault("0")
    @Column(name = "MinPower", nullable = false)
    private Integer minPower;

    @ColumnDefault("0")
    @Column(name = "MaxBasePower", nullable = false)
    private Integer maxBasePower;

    @ColumnDefault("0")
    @Column(name = "CenterPower", nullable = false)
    private Integer centerPower;

    @ColumnDefault("0")
    @Column(name = "DefaultPower", nullable = false)
    private Integer defaultPower;

    @ColumnDefault("0")
    @Column(name = "DisplayModifier", nullable = false)
    private Integer displayModifier;

    @ColumnDefault("0")
    @Column(name = "RegenInterruptTimeMS", nullable = false)
    private Integer regenInterruptTimeMS;

    @ColumnDefault("0")
    @Column(name = "RegenPeace", nullable = false)
    private Float regenPeace;

    @ColumnDefault("0")
    @Column(name = "RegenCombat", nullable = false)
    private Float regenCombat;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Short flags;

}