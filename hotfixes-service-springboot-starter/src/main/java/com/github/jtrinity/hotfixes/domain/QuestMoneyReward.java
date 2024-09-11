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
@Table(name = "quest_money_reward")
public class QuestMoneyReward {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "Difficulty1", columnDefinition = "int UNSIGNED not null")
    private Long difficulty1;

    @ColumnDefault("'0'")
    @Column(name = "Difficulty2", columnDefinition = "int UNSIGNED not null")
    private Long difficulty2;

    @ColumnDefault("'0'")
    @Column(name = "Difficulty3", columnDefinition = "int UNSIGNED not null")
    private Long difficulty3;

    @ColumnDefault("'0'")
    @Column(name = "Difficulty4", columnDefinition = "int UNSIGNED not null")
    private Long difficulty4;

    @ColumnDefault("'0'")
    @Column(name = "Difficulty5", columnDefinition = "int UNSIGNED not null")
    private Long difficulty5;

    @ColumnDefault("'0'")
    @Column(name = "Difficulty6", columnDefinition = "int UNSIGNED not null")
    private Long difficulty6;

    @ColumnDefault("'0'")
    @Column(name = "Difficulty7", columnDefinition = "int UNSIGNED not null")
    private Long difficulty7;

    @ColumnDefault("'0'")
    @Column(name = "Difficulty8", columnDefinition = "int UNSIGNED not null")
    private Long difficulty8;

    @ColumnDefault("'0'")
    @Column(name = "Difficulty9", columnDefinition = "int UNSIGNED not null")
    private Long difficulty9;

    @ColumnDefault("'0'")
    @Column(name = "Difficulty10", columnDefinition = "int UNSIGNED not null")
    private Long difficulty10;

}