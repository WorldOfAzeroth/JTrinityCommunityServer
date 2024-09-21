package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2File;
import com.github.jtrinity.dbc.db2.Db2Type;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString
@IdClass(DB2Id.class)
@Entity
@Table(name = "journal_encounter")
@Db2File(name = "JournalEncounter.db2", layoutHash = 0x2935A0FD)
public class JournalEncounter implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "Map_1")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float map_1;


    @Column(name = "Map_2")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float map_2;


    @Column(name = "DungeonMapID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short dungeonMapID;


    @Column(name = "WorldMapAreaID")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short worldMapAreaID;


    @Column(name = "FirstSectionID")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Short firstSectionID;


    @Column(name = "JournalInstanceID")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Short journalInstanceID;


    @Column(name = "DifficultyMask")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Byte difficultyMask;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "OrderIndex")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Integer orderIndex;


    @Column(name = "MapDisplayConditionID")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Integer mapDisplayConditionID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
