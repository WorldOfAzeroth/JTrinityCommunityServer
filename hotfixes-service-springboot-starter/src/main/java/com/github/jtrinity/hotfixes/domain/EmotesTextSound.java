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
@Table(name = "emotes_text_sound")
public class EmotesTextSound {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "RaceID", columnDefinition = "tinyint UNSIGNED not null")
    private Short raceID;

    @ColumnDefault("'0'")
    @Column(name = "ClassID", columnDefinition = "tinyint UNSIGNED not null")
    private Short classID;

    @ColumnDefault("'0'")
    @Column(name = "SexID", columnDefinition = "tinyint UNSIGNED not null")
    private Short sexID;

    @ColumnDefault("'0'")
    @Column(name = "SoundID", columnDefinition = "int UNSIGNED not null")
    private Long soundID;

    @ColumnDefault("'0'")
    @Column(name = "EmotesTextID", columnDefinition = "int UNSIGNED not null")
    private Long emotesTextID;

}