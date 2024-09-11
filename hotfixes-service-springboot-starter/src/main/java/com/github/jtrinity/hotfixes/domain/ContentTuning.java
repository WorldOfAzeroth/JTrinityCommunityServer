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
@Table(name = "content_tuning")
public class ContentTuning {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "MinLevel", nullable = false)
    private Integer minLevel;

    @ColumnDefault("0")
    @Column(name = "MaxLevel", nullable = false)
    private Integer maxLevel;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "ExpectedStatModID", nullable = false)
    private Integer expectedStatModID;

    @ColumnDefault("0")
    @Column(name = "DifficultyESMID", nullable = false)
    private Integer difficultyESMID;

}