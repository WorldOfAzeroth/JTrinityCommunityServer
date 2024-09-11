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
@Table(name = "conversation_line")
public class ConversationLine {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "BroadcastTextID", columnDefinition = "int UNSIGNED not null")
    private Long broadcastTextID;

    @ColumnDefault("'0'")
    @Column(name = "SpellVisualKitID", columnDefinition = "int UNSIGNED not null")
    private Long spellVisualKitID;

    @ColumnDefault("0")
    @Column(name = "AdditionalDuration", nullable = false)
    private Integer additionalDuration;

    @ColumnDefault("'0'")
    @Column(name = "NextConversationLineID", columnDefinition = "smallint UNSIGNED not null")
    private Integer nextConversationLineID;

    @ColumnDefault("'0'")
    @Column(name = "AnimKitID", columnDefinition = "smallint UNSIGNED not null")
    private Integer animKitID;

    @ColumnDefault("'0'")
    @Column(name = "SpeechType", columnDefinition = "tinyint UNSIGNED not null")
    private Short speechType;

    @ColumnDefault("'0'")
    @Column(name = "StartAnimation", columnDefinition = "tinyint UNSIGNED not null")
    private Short startAnimation;

    @ColumnDefault("'0'")
    @Column(name = "EndAnimation", columnDefinition = "tinyint UNSIGNED not null")
    private Short endAnimation;

}