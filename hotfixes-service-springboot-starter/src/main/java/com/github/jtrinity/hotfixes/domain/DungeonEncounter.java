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
@Table(name = "dungeon_encounter")
public class DungeonEncounter {
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
    @Column(name = "MapID", nullable = false)
    private Short mapID;

    @ColumnDefault("0")
    @Column(name = "DifficultyID", nullable = false)
    private Integer difficultyID;

    @ColumnDefault("0")
    @Column(name = "OrderIndex", nullable = false)
    private Integer orderIndex;

    @ColumnDefault("0")
    @Column(name = "CompleteWorldStateID", nullable = false)
    private Integer completeWorldStateID;

    @ColumnDefault("0")
    @Column(name = "Bit", nullable = false)
    private Byte bit;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "SpellIconFileID", nullable = false)
    private Integer spellIconFileID;

    @ColumnDefault("0")
    @Column(name = "Faction", nullable = false)
    private Integer faction;

}