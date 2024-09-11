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
@Table(name = "pvp_tier")
public class PvpTier {
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

    @ColumnDefault("0")
    @Column(name = "MinRating", nullable = false)
    private Short minRating;

    @ColumnDefault("0")
    @Column(name = "MaxRating", nullable = false)
    private Short maxRating;

    @ColumnDefault("0")
    @Column(name = "PrevTier", nullable = false)
    private Integer prevTier;

    @ColumnDefault("0")
    @Column(name = "NextTier", nullable = false)
    private Integer nextTier;

    @ColumnDefault("'0'")
    @Column(name = "BracketID", columnDefinition = "tinyint UNSIGNED not null")
    private Short bracketID;

    @ColumnDefault("0")
    @Column(name = "Rank", nullable = false)
    private Byte rank;

    @ColumnDefault("0")
    @Column(name = "RankIconFileDataID", nullable = false)
    private Integer rankIconFileDataID;

}