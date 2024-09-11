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
@Table(name = "mythic_plus_season")
public class MythicPlusSeason {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "MilestoneSeason", nullable = false)
    private Integer milestoneSeason;

    @ColumnDefault("0")
    @Column(name = "ExpansionLevel", nullable = false)
    private Integer expansionLevel;

    @ColumnDefault("0")
    @Column(name = "HeroicLFGDungeonMinGear", nullable = false)
    private Integer heroicLFGDungeonMinGear;

}