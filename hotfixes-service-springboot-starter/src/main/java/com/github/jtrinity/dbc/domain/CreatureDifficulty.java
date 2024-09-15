package com.github.jtrinity.dbc.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "creature_difficulty")
public class CreatureDifficulty {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", nullable = false)
    private Integer id;

    @ColumnDefault("'0'")
    @Column(name = "CreatureID", nullable = false)
    private Integer creatureID;

    @ColumnDefault("'0'")
    @Column(name = "Flags1", columnDefinition = "int UNSIGNED not null")
    private Long flags1;

    @ColumnDefault("'0'")
    @Column(name = "Flags2", columnDefinition = "int UNSIGNED not null")
    private Long flags2;

    @ColumnDefault("'0'")
    @Column(name = "Flags3", columnDefinition = "int UNSIGNED not null")
    private Long flags3;

    @ColumnDefault("'0'")
    @Column(name = "Flags4", columnDefinition = "int UNSIGNED not null")
    private Long flags4;

    @ColumnDefault("'0'")
    @Column(name = "Flags5", columnDefinition = "int UNSIGNED not null")
    private Long flags5;

    @ColumnDefault("'0'")
    @Column(name = "Flags6", columnDefinition = "int UNSIGNED not null")
    private Long flags6;

    @ColumnDefault("'0'")
    @Column(name = "Flags7", columnDefinition = "int UNSIGNED not null")
    private Long flags7;

    @ColumnDefault("'0'")
    @Column(name = "FactionTemplateID", columnDefinition = "smallint UNSIGNED not null")
    private Integer factionTemplateID;

    @ColumnDefault("0")
    @Column(name = "Expansion", nullable = false)
    private Byte expansion;

    @ColumnDefault("0")
    @Column(name = "MinLevel", nullable = false)
    private Byte minLevel;

    @ColumnDefault("0")
    @Column(name = "MaxLevel", nullable = false)
    private Byte maxLevel;

    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}