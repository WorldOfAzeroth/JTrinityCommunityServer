package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Db2File(name = "JournalEncounterSection.db2", fileDataId = 1134413, layoutHash = 0xF617A4B5)
public class JournalEncounterSection {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Title")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String title;

    @Lob
    @Column(name = "BodyText")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String bodyText;

    @ColumnDefault("'0'")
    @Column(name = "JournalEncounterID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Integer journalEncounterID;

    @ColumnDefault("'0'")
    @Column(name = "OrderIndex", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Short orderIndex;

    @ColumnDefault("'0'")
    @Column(name = "ParentSectionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Integer parentSectionID;

    @ColumnDefault("'0'")
    @Column(name = "FirstChildSectionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Integer firstChildSectionID;

    @ColumnDefault("'0'")
    @Column(name = "NextSiblingSectionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Integer nextSiblingSectionID;

    @ColumnDefault("0")
    @Column(name = "Type", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte type;

    @ColumnDefault("'0'")
    @Column(name = "IconCreatureDisplayInfoID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Long iconCreatureDisplayInfoID;

    @ColumnDefault("0")
    @Column(name = "UiModelSceneID", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer uiModelSceneID;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @ColumnDefault("0")
    @Column(name = "IconFileDataID", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer iconFileDataID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "IconFlags", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer iconFlags;

    @ColumnDefault("0")
    @Column(name = "DifficultyMask", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE, signed = true)
    private Byte difficultyMask;

}