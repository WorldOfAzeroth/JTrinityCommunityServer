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
@Table(name = "artifact_power")
public class ArtifactPower {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "DisplayPosX", nullable = false)
    private Float displayPosX;

    @ColumnDefault("0")
    @Column(name = "DisplayPosY", nullable = false)
    private Float displayPosY;

    @ColumnDefault("'0'")
    @Column(name = "ArtifactID", columnDefinition = "tinyint UNSIGNED not null")
    private Short artifactID;

    @ColumnDefault("'0'")
    @Column(name = "MaxPurchasableRank", columnDefinition = "tinyint UNSIGNED not null")
    private Short maxPurchasableRank;

    @ColumnDefault("0")
    @Column(name = "Label", nullable = false)
    private Integer label;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "Tier", columnDefinition = "tinyint UNSIGNED not null")
    private Short tier;

}