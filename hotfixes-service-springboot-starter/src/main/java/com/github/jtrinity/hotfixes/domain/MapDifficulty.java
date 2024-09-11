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
@Table(name = "map_difficulty")
public class MapDifficulty {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Message")
    private String message;

    @ColumnDefault("'0'")
    @Column(name = "ItemContextPickerID", columnDefinition = "int UNSIGNED not null")
    private Long itemContextPickerID;

    @ColumnDefault("0")
    @Column(name = "ContentTuningID", nullable = false)
    private Integer contentTuningID;

    @ColumnDefault("0")
    @Column(name = "ItemContext", nullable = false)
    private Integer itemContext;

    @ColumnDefault("'0'")
    @Column(name = "DifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    private Short difficultyID;

    @ColumnDefault("'0'")
    @Column(name = "LockID", columnDefinition = "tinyint UNSIGNED not null")
    private Short lockID;

    @ColumnDefault("'0'")
    @Column(name = "ResetInterval", columnDefinition = "tinyint UNSIGNED not null")
    private Short resetInterval;

    @ColumnDefault("'0'")
    @Column(name = "MaxPlayers", columnDefinition = "tinyint UNSIGNED not null")
    private Short maxPlayers;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "MapID", columnDefinition = "int UNSIGNED not null")
    private Long mapID;

}