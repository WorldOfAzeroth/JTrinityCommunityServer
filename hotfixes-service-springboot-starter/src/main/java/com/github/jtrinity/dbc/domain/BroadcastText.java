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
@Table(name = "broadcast_text")
@Db2File(name = "BroadcastText.db2", layoutHash = 0x51BF0C33)
public class BroadcastText implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Text")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString text;
    
    @Lob
    @Column(name = "Text1")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString text1;


    @Column(name = "EmoteID1")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short emoteID1;


    @Column(name = "EmoteID2")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short emoteID2;


    @Column(name = "EmoteID3")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short emoteID3;


    @Column(name = "EmoteDelay1")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short emoteDelay1;


    @Column(name = "EmoteDelay2")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Short emoteDelay2;


    @Column(name = "EmoteDelay3")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Short emoteDelay3;


    @Column(name = "EmotesID")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short emotesID;


    @Column(name = "LanguageID")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Byte languageID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "ConditionID")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer conditionID;


    @Column(name = "SoundEntriesID1")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Integer soundEntriesID1;


    @Column(name = "SoundEntriesID2")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Integer soundEntriesID2;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
