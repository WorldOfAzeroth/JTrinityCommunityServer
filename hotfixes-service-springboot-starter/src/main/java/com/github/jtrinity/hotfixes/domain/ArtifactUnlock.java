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
@Table(name = "artifact_unlock")
public class ArtifactUnlock {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "PowerID", columnDefinition = "int UNSIGNED not null")
    private Long powerID;

    @ColumnDefault("'0'")
    @Column(name = "PowerRank", columnDefinition = "tinyint UNSIGNED not null")
    private Short powerRank;

    @ColumnDefault("'0'")
    @Column(name = "ItemBonusListID", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemBonusListID;

    @ColumnDefault("'0'")
    @Column(name = "PlayerConditionID", columnDefinition = "int UNSIGNED not null")
    private Long playerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "ArtifactID", columnDefinition = "int UNSIGNED not null")
    private Long artifactID;

}