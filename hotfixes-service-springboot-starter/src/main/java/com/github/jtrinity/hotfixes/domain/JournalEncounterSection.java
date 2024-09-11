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
@Table(name = "journal_encounter_section")
public class JournalEncounterSection {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Title")
    private String title;

    @Lob
    @Column(name = "BodyText")
    private String bodyText;

    @ColumnDefault("'0'")
    @Column(name = "JournalEncounterID", columnDefinition = "smallint UNSIGNED not null")
    private Integer journalEncounterID;

    @ColumnDefault("'0'")
    @Column(name = "OrderIndex", columnDefinition = "tinyint UNSIGNED not null")
    private Short orderIndex;

    @ColumnDefault("'0'")
    @Column(name = "ParentSectionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer parentSectionID;

    @ColumnDefault("'0'")
    @Column(name = "FirstChildSectionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer firstChildSectionID;

    @ColumnDefault("'0'")
    @Column(name = "NextSiblingSectionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer nextSiblingSectionID;

    @ColumnDefault("0")
    @Column(name = "Type", nullable = false)
    private Byte type;

    @ColumnDefault("'0'")
    @Column(name = "IconCreatureDisplayInfoID", columnDefinition = "int UNSIGNED not null")
    private Long iconCreatureDisplayInfoID;

    @ColumnDefault("0")
    @Column(name = "UiModelSceneID", nullable = false)
    private Integer uiModelSceneID;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    private Integer spellID;

    @ColumnDefault("0")
    @Column(name = "IconFileDataID", nullable = false)
    private Integer iconFileDataID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "IconFlags", nullable = false)
    private Integer iconFlags;

    @ColumnDefault("0")
    @Column(name = "DifficultyMask", nullable = false)
    private Byte difficultyMask;

}