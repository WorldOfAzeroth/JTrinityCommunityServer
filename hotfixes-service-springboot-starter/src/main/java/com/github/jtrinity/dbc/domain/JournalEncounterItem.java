package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2DataBind;
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
@Db2DataBind(name = "JournalEncounterItem.db2", layoutHash = 0x39230FF9, indexField = 5, parentIndexField = 1, fields = {
        @Db2Field(name = "itemID", type = Db2Type.INT),
        @Db2Field(name = "journalEncounterID", type = Db2Type.SHORT),
        @Db2Field(name = "difficultyMask", type = Db2Type.BYTE, signed = true),
        @Db2Field(name = "factionMask", type = Db2Type.BYTE, signed = true),
        @Db2Field(name = "flags", type = Db2Type.BYTE),
        @Db2Field(name = "id", type = Db2Type.INT)
})
public class JournalEncounterItem implements DbcEntity {
    @Column(name = "ItemID")
    private Integer itemID;

    @Column(name = "JournalEncounterID")
    private Short journalEncounterID;

    @Column(name = "DifficultyMask")
    private Byte difficultyMask;

    @Column(name = "FactionMask")
    private Byte factionMask;

    @Column(name = "Flags")
    private Byte flags;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
