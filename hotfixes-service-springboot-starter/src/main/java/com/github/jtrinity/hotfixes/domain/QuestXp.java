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
@Table(name = "quest_xp")
public class QuestXp {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Difficulty1", nullable = false)
    private Integer difficulty1;

    @ColumnDefault("0")
    @Column(name = "Difficulty2", nullable = false)
    private Integer difficulty2;

    @ColumnDefault("0")
    @Column(name = "Difficulty3", nullable = false)
    private Integer difficulty3;

    @ColumnDefault("0")
    @Column(name = "Difficulty4", nullable = false)
    private Integer difficulty4;

    @ColumnDefault("0")
    @Column(name = "Difficulty5", nullable = false)
    private Integer difficulty5;

    @ColumnDefault("0")
    @Column(name = "Difficulty6", nullable = false)
    private Integer difficulty6;

    @ColumnDefault("0")
    @Column(name = "Difficulty7", nullable = false)
    private Integer difficulty7;

    @ColumnDefault("0")
    @Column(name = "Difficulty8", nullable = false)
    private Integer difficulty8;

    @ColumnDefault("0")
    @Column(name = "Difficulty9", nullable = false)
    private Integer difficulty9;

    @ColumnDefault("0")
    @Column(name = "Difficulty10", nullable = false)
    private Integer difficulty10;

}