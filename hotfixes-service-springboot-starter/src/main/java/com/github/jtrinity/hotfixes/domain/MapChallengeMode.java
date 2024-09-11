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
@Table(name = "map_challenge_mode")
public class MapChallengeMode {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @ColumnDefault("'0'")
    @Column(name = "MapID", columnDefinition = "smallint UNSIGNED not null")
    private Integer mapID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "ExpansionLevel", columnDefinition = "int UNSIGNED not null")
    private Long expansionLevel;

    @ColumnDefault("0")
    @Column(name = "RequiredWorldStateID", nullable = false)
    private Integer requiredWorldStateID;

    @ColumnDefault("0")
    @Column(name = "CriteriaCount1", nullable = false)
    private Short criteriaCount1;

    @ColumnDefault("0")
    @Column(name = "CriteriaCount2", nullable = false)
    private Short criteriaCount2;

    @ColumnDefault("0")
    @Column(name = "CriteriaCount3", nullable = false)
    private Short criteriaCount3;

}