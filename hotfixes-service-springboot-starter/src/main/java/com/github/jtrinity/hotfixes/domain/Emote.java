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
@Table(name = "emotes")
public class Emote {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "RaceMask", nullable = false)
    private Long raceMask;

    @Lob
    @Column(name = "EmoteSlashCommand")
    private String emoteSlashCommand;

    @ColumnDefault("0")
    @Column(name = "AnimID", nullable = false)
    private Integer animID;

    @ColumnDefault("'0'")
    @Column(name = "EmoteFlags", columnDefinition = "int UNSIGNED not null")
    private Long emoteFlags;

    @ColumnDefault("'0'")
    @Column(name = "EmoteSpecProc", columnDefinition = "tinyint UNSIGNED not null")
    private Short emoteSpecProc;

    @ColumnDefault("'0'")
    @Column(name = "EmoteSpecProcParam", columnDefinition = "int UNSIGNED not null")
    private Long emoteSpecProcParam;

    @ColumnDefault("'0'")
    @Column(name = "EventSoundID", columnDefinition = "int UNSIGNED not null")
    private Long eventSoundID;

    @ColumnDefault("'0'")
    @Column(name = "SpellVisualKitID", columnDefinition = "int UNSIGNED not null")
    private Long spellVisualKitID;

    @ColumnDefault("0")
    @Column(name = "ClassMask", nullable = false)
    private Integer classMask;

}