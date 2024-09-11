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
@Table(name = "faction_template")
public class FactionTemplate {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "Faction", columnDefinition = "smallint UNSIGNED not null")
    private Integer faction;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "smallint UNSIGNED not null")
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "FactionGroup", columnDefinition = "tinyint UNSIGNED not null")
    private Short factionGroup;

    @ColumnDefault("'0'")
    @Column(name = "FriendGroup", columnDefinition = "tinyint UNSIGNED not null")
    private Short friendGroup;

    @ColumnDefault("'0'")
    @Column(name = "EnemyGroup", columnDefinition = "tinyint UNSIGNED not null")
    private Short enemyGroup;

    @ColumnDefault("'0'")
    @Column(name = "Enemies1", columnDefinition = "smallint UNSIGNED not null")
    private Integer enemies1;

    @ColumnDefault("'0'")
    @Column(name = "Enemies2", columnDefinition = "smallint UNSIGNED not null")
    private Integer enemies2;

    @ColumnDefault("'0'")
    @Column(name = "Enemies3", columnDefinition = "smallint UNSIGNED not null")
    private Integer enemies3;

    @ColumnDefault("'0'")
    @Column(name = "Enemies4", columnDefinition = "smallint UNSIGNED not null")
    private Integer enemies4;

    @ColumnDefault("'0'")
    @Column(name = "Enemies5", columnDefinition = "smallint UNSIGNED not null")
    private Integer enemies5;

    @ColumnDefault("'0'")
    @Column(name = "Enemies6", columnDefinition = "smallint UNSIGNED not null")
    private Integer enemies6;

    @ColumnDefault("'0'")
    @Column(name = "Enemies7", columnDefinition = "smallint UNSIGNED not null")
    private Integer enemies7;

    @ColumnDefault("'0'")
    @Column(name = "Enemies8", columnDefinition = "smallint UNSIGNED not null")
    private Integer enemies8;

    @ColumnDefault("'0'")
    @Column(name = "Friend1", columnDefinition = "smallint UNSIGNED not null")
    private Integer friend1;

    @ColumnDefault("'0'")
    @Column(name = "Friend2", columnDefinition = "smallint UNSIGNED not null")
    private Integer friend2;

    @ColumnDefault("'0'")
    @Column(name = "Friend3", columnDefinition = "smallint UNSIGNED not null")
    private Integer friend3;

    @ColumnDefault("'0'")
    @Column(name = "Friend4", columnDefinition = "smallint UNSIGNED not null")
    private Integer friend4;

    @ColumnDefault("'0'")
    @Column(name = "Friend5", columnDefinition = "smallint UNSIGNED not null")
    private Integer friend5;

    @ColumnDefault("'0'")
    @Column(name = "Friend6", columnDefinition = "smallint UNSIGNED not null")
    private Integer friend6;

    @ColumnDefault("'0'")
    @Column(name = "Friend7", columnDefinition = "smallint UNSIGNED not null")
    private Integer friend7;

    @ColumnDefault("'0'")
    @Column(name = "Friend8", columnDefinition = "smallint UNSIGNED not null")
    private Integer friend8;

}