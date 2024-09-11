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
@Table(name = "paragon_reputation")
public class ParagonReputation {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "FactionID", nullable = false)
    private Integer factionID;

    @ColumnDefault("0")
    @Column(name = "LevelThreshold", nullable = false)
    private Integer levelThreshold;

    @ColumnDefault("0")
    @Column(name = "QuestID", nullable = false)
    private Integer questID;

}