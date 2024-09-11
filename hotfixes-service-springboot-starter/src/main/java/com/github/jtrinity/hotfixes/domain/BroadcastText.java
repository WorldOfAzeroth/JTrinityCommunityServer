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
@Table(name = "broadcast_text")
public class BroadcastText {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Text")
    private String text;

    @Lob
    @Column(name = "Text1")
    private String text1;

    @ColumnDefault("0")
    @Column(name = "LanguageID", nullable = false)
    private Integer languageID;

    @ColumnDefault("0")
    @Column(name = "ConditionID", nullable = false)
    private Integer conditionID;

    @ColumnDefault("'0'")
    @Column(name = "EmotesID", columnDefinition = "smallint UNSIGNED not null")
    private Integer emotesID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "ChatBubbleDurationMs", columnDefinition = "int UNSIGNED not null")
    private Long chatBubbleDurationMs;

    @ColumnDefault("0")
    @Column(name = "VoiceOverPriorityID", nullable = false)
    private Integer voiceOverPriorityID;

    @ColumnDefault("'0'")
    @Column(name = "SoundKitID1", columnDefinition = "int UNSIGNED not null")
    private Long soundKitID1;

    @ColumnDefault("'0'")
    @Column(name = "SoundKitID2", columnDefinition = "int UNSIGNED not null")
    private Long soundKitID2;

    @ColumnDefault("'0'")
    @Column(name = "EmoteID1", columnDefinition = "smallint UNSIGNED not null")
    private Integer emoteID1;

    @ColumnDefault("'0'")
    @Column(name = "EmoteID2", columnDefinition = "smallint UNSIGNED not null")
    private Integer emoteID2;

    @ColumnDefault("'0'")
    @Column(name = "EmoteID3", columnDefinition = "smallint UNSIGNED not null")
    private Integer emoteID3;

    @ColumnDefault("'0'")
    @Column(name = "EmoteDelay1", columnDefinition = "smallint UNSIGNED not null")
    private Integer emoteDelay1;

    @ColumnDefault("'0'")
    @Column(name = "EmoteDelay2", columnDefinition = "smallint UNSIGNED not null")
    private Integer emoteDelay2;

    @ColumnDefault("'0'")
    @Column(name = "EmoteDelay3", columnDefinition = "smallint UNSIGNED not null")
    private Integer emoteDelay3;

}