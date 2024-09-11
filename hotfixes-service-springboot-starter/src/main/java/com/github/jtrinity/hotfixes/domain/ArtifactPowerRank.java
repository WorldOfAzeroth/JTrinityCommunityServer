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
@Table(name = "artifact_power_rank")
public class ArtifactPowerRank {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "RankIndex", columnDefinition = "tinyint UNSIGNED not null")
    private Short rankIndex;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    private Integer spellID;

    @ColumnDefault("'0'")
    @Column(name = "ItemBonusListID", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemBonusListID;

    @ColumnDefault("0")
    @Column(name = "AuraPointsOverride", nullable = false)
    private Float auraPointsOverride;

    @ColumnDefault("'0'")
    @Column(name = "ArtifactPowerID", columnDefinition = "int UNSIGNED not null")
    private Long artifactPowerID;

}