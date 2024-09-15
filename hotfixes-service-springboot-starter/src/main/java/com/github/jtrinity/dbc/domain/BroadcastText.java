package com.github.jtrinity.dbc.domain;

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
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "broadcast_text")
@Db2File(name = "BroadcastText.db2", layoutHash = 0x4CCDE707, indexField = 2)
public class BroadcastText implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Text")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private String text;

    @Lob
    @Column(name = "Text1")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String text1;

    @ColumnDefault("0")
    @Column(name = "LanguageID", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer languageID;

    @ColumnDefault("0")
    @Column(name = "ConditionID", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer conditionID;

    @ColumnDefault("'0'")
    @Column(name = "EmotesID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Integer emotesID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "ChatBubbleDurationMs", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long chatBubbleDurationMs;

    @ColumnDefault("0")
    @Column(name = "VoiceOverPriorityID", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer voiceOverPriorityID;

    @ColumnDefault("'0'")
    @Column(name = "SoundKitID1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Long soundKitID1;

    @ColumnDefault("'0'")
    @Column(name = "SoundKitID2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long soundKitID2;

    @ColumnDefault("'0'")
    @Column(name = "EmoteID1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Integer emoteID1;

    @ColumnDefault("'0'")
    @Column(name = "EmoteID2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Integer emoteID2;

    @ColumnDefault("'0'")
    @Column(name = "EmoteID3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Integer emoteID3;

    @ColumnDefault("'0'")
    @Column(name = "EmoteDelay1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Integer emoteDelay1;

    @ColumnDefault("'0'")
    @Column(name = "EmoteDelay2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Integer emoteDelay2;

    @ColumnDefault("'0'")
    @Column(name = "EmoteDelay3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Integer emoteDelay3;

}