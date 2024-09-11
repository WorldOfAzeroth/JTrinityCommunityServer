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
@Table(name = "pvp_difficulty")
public class PvpDifficulty {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "RangeIndex", columnDefinition = "tinyint UNSIGNED not null")
    private Short rangeIndex;

    @ColumnDefault("'0'")
    @Column(name = "MinLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short minLevel;

    @ColumnDefault("'0'")
    @Column(name = "MaxLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short maxLevel;

    @ColumnDefault("'0'")
    @Column(name = "MapID", columnDefinition = "int UNSIGNED not null")
    private Long mapID;

}