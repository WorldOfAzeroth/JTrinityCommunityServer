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
@Table(name = "azerite_essence_power")
public class AzeriteEssencePower {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "SourceAlliance")
    private String sourceAlliance;

    @Lob
    @Column(name = "SourceHorde")
    private String sourceHorde;

    @ColumnDefault("0")
    @Column(name = "AzeriteEssenceID", nullable = false)
    private Integer azeriteEssenceID;

    @ColumnDefault("'0'")
    @Column(name = "Tier", columnDefinition = "tinyint UNSIGNED not null")
    private Short tier;

    @ColumnDefault("0")
    @Column(name = "MajorPowerDescription", nullable = false)
    private Integer majorPowerDescription;

    @ColumnDefault("0")
    @Column(name = "MinorPowerDescription", nullable = false)
    private Integer minorPowerDescription;

    @ColumnDefault("0")
    @Column(name = "MajorPowerActual", nullable = false)
    private Integer majorPowerActual;

    @ColumnDefault("0")
    @Column(name = "MinorPowerActual", nullable = false)
    private Integer minorPowerActual;

}