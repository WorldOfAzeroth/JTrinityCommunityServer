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
@Table(name = "scenario_step")
public class ScenarioStep {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Description")
    private String description;

    @Lob
    @Column(name = "Title")
    private String title;

    @ColumnDefault("'0'")
    @Column(name = "ScenarioID", columnDefinition = "smallint UNSIGNED not null")
    private Integer scenarioID;

    @ColumnDefault("'0'")
    @Column(name = "Criteriatreeid", columnDefinition = "int UNSIGNED not null")
    private Long criteriatreeid;

    @ColumnDefault("'0'")
    @Column(name = "RewardQuestID", columnDefinition = "int UNSIGNED not null")
    private Long rewardQuestID;

    @ColumnDefault("0")
    @Column(name = "RelatedStep", nullable = false)
    private Integer relatedStep;

    @ColumnDefault("'0'")
    @Column(name = "Supersedes", columnDefinition = "smallint UNSIGNED not null")
    private Integer supersedes;

    @ColumnDefault("'0'")
    @Column(name = "OrderIndex", columnDefinition = "tinyint UNSIGNED not null")
    private Short orderIndex;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "VisibilityPlayerConditionID", columnDefinition = "int UNSIGNED not null")
    private Long visibilityPlayerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "WidgetSetID", columnDefinition = "smallint UNSIGNED not null")
    private Integer widgetSetID;

}