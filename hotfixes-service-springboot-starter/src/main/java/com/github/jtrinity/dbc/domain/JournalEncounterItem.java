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
@Table(name = "journal_encounter_item")
@Db2File(name = "JournalEncounterItem.db2", layoutHash = 0x39230FF9, indexField = 5, parentIndexField = 1)
public class JournalEncounterItem implements DbcEntity {

    @Column(name = "ItemID")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer itemID;


    @Column(name = "JournalEncounterID")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Short journalEncounterID;


    @Column(name = "DifficultyMask")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Byte difficultyMask;


    @Column(name = "FactionMask")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte factionMask;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte flags;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
