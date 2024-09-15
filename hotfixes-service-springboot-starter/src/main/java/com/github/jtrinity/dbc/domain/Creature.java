package com.github.jtrinity.dbc.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "creature")
public class Creature {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", nullable = false)
    private Integer id;

    @ColumnDefault("'0'")
    @Column(name = "ItemID1", nullable = false)
    private Integer itemID1;

    @ColumnDefault("'0'")
    @Column(name = "ItemID2", nullable = false)
    private Integer itemID2;

    @ColumnDefault("'0'")
    @Column(name = "ItemID3", nullable = false)
    private Integer itemID3;

    @ColumnDefault("'0'")
    @Column(name = "Mount", nullable = false)
    private Integer mount;

    @ColumnDefault("'0'")
    @Column(name = "DisplayID1", nullable = false)
    private Integer displayID1;

    @ColumnDefault("'0'")
    @Column(name = "DisplayID2", nullable = false)
    private Integer displayID2;

    @ColumnDefault("'0'")
    @Column(name = "DisplayID3", nullable = false)
    private Integer displayID3;

    @ColumnDefault("'0'")
    @Column(name = "DisplayID4", nullable = false)
    private Integer displayID4;

    @ColumnDefault("0")
    @Column(name = "DisplayIDProbability1", nullable = false)
    private Float displayIDProbability1;

    @ColumnDefault("0")
    @Column(name = "DisplayIDProbability2", nullable = false)
    private Float displayIDProbability2;

    @ColumnDefault("0")
    @Column(name = "DisplayIDProbability3", nullable = false)
    private Float displayIDProbability3;

    @ColumnDefault("0")
    @Column(name = "DisplayIDProbability4", nullable = false)
    private Float displayIDProbability4;

    @Lob
    @Column(name = "Name", nullable = false)
    private String name;

    @Lob
    @Column(name = "FemaleName", nullable = false)
    private String femaleName;

    @Lob
    @Column(name = "SubName", nullable = false)
    private String subName;

    @Lob
    @Column(name = "FemaleSubName", nullable = false)
    private String femaleSubName;

    @ColumnDefault("'0'")
    @Column(name = "Type", nullable = false)
    private Integer type;

    @ColumnDefault("'0'")
    @Column(name = "Family", columnDefinition = "tinyint UNSIGNED not null")
    private Short family;

    @ColumnDefault("'0'")
    @Column(name = "Classification", columnDefinition = "tinyint UNSIGNED not null")
    private Short classification;

    @ColumnDefault("'0'")
    @Column(name = "InhabitType", columnDefinition = "tinyint UNSIGNED not null")
    private Short inhabitType;

    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}