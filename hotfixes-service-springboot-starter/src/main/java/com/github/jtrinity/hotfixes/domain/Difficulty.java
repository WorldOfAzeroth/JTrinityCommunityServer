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
@Table(name = "difficulty")
public class Difficulty {
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

    @ColumnDefault("'0'")
    @Column(name = "InstanceType", columnDefinition = "tinyint UNSIGNED not null")
    private Short instanceType;

    @ColumnDefault("'0'")
    @Column(name = "OrderIndex", columnDefinition = "tinyint UNSIGNED not null")
    private Short orderIndex;

    @ColumnDefault("0")
    @Column(name = "OldEnumValue", nullable = false)
    private Byte oldEnumValue;

    @ColumnDefault("'0'")
    @Column(name = "FallbackDifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    private Short fallbackDifficultyID;

    @ColumnDefault("'0'")
    @Column(name = "MinPlayers", columnDefinition = "tinyint UNSIGNED not null")
    private Short minPlayers;

    @ColumnDefault("'0'")
    @Column(name = "MaxPlayers", columnDefinition = "tinyint UNSIGNED not null")
    private Short maxPlayers;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "ItemContext", columnDefinition = "tinyint UNSIGNED not null")
    private Short itemContext;

    @ColumnDefault("'0'")
    @Column(name = "ToggleDifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    private Short toggleDifficultyID;

    @ColumnDefault("'0'")
    @Column(name = "GroupSizeHealthCurveID", columnDefinition = "smallint UNSIGNED not null")
    private Integer groupSizeHealthCurveID;

    @ColumnDefault("'0'")
    @Column(name = "GroupSizeDmgCurveID", columnDefinition = "smallint UNSIGNED not null")
    private Integer groupSizeDmgCurveID;

    @ColumnDefault("'0'")
    @Column(name = "GroupSizeSpellPointsCurveID", columnDefinition = "smallint UNSIGNED not null")
    private Integer groupSizeSpellPointsCurveID;

}