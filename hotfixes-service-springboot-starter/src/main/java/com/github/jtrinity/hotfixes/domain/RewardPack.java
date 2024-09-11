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
@Table(name = "reward_pack")
public class RewardPack {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "CharTitleID", nullable = false)
    private Integer charTitleID;

    @ColumnDefault("'0'")
    @Column(name = "Money", columnDefinition = "int UNSIGNED not null")
    private Long money;

    @ColumnDefault("0")
    @Column(name = "ArtifactXPDifficulty", nullable = false)
    private Byte artifactXPDifficulty;

    @ColumnDefault("0")
    @Column(name = "ArtifactXPMultiplier", nullable = false)
    private Float artifactXPMultiplier;

    @ColumnDefault("'0'")
    @Column(name = "ArtifactXPCategoryID", columnDefinition = "tinyint UNSIGNED not null")
    private Short artifactXPCategoryID;

    @ColumnDefault("'0'")
    @Column(name = "TreasurePickerID", columnDefinition = "int UNSIGNED not null")
    private Long treasurePickerID;

}