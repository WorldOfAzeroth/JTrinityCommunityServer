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
@Table(name = "pvp_season")
public class PvpSeason {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "MilestoneSeason", nullable = false)
    private Integer milestoneSeason;

    @ColumnDefault("0")
    @Column(name = "AllianceAchievementID", nullable = false)
    private Integer allianceAchievementID;

    @ColumnDefault("0")
    @Column(name = "HordeAchievementID", nullable = false)
    private Integer hordeAchievementID;

}