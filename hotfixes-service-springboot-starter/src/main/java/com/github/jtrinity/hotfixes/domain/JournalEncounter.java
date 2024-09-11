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
@Table(name = "journal_encounter")
public class JournalEncounter {
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

    @Lob
    @Column(name = "Description")
    private String description;

    @ColumnDefault("0")
    @Column(name = "MapX", nullable = false)
    private Float mapX;

    @ColumnDefault("0")
    @Column(name = "MapY", nullable = false)
    private Float mapY;

    @ColumnDefault("'0'")
    @Column(name = "JournalInstanceID", columnDefinition = "smallint UNSIGNED not null")
    private Integer journalInstanceID;

    @ColumnDefault("'0'")
    @Column(name = "DungeonEncounterID", columnDefinition = "smallint UNSIGNED not null")
    private Integer dungeonEncounterID;

    @ColumnDefault("'0'")
    @Column(name = "OrderIndex", columnDefinition = "int UNSIGNED not null")
    private Long orderIndex;

    @ColumnDefault("'0'")
    @Column(name = "FirstSectionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer firstSectionID;

    @ColumnDefault("'0'")
    @Column(name = "UiMapID", columnDefinition = "smallint UNSIGNED not null")
    private Integer uiMapID;

    @ColumnDefault("'0'")
    @Column(name = "MapDisplayConditionID", columnDefinition = "int UNSIGNED not null")
    private Long mapDisplayConditionID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "DifficultyMask", nullable = false)
    private Byte difficultyMask;

}