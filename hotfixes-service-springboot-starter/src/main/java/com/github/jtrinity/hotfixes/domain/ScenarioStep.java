package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Db2File(name = "ScenarioStep.db2", fileDataId = 1132761, layoutHash = 0xFAB5BD3A, parentIndexField = 2)
public class ScenarioStep {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Description")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String description;

    @Lob
    @Column(name = "Title")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String title;

    @ColumnDefault("'0'")
    @Column(name = "ScenarioID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Integer scenarioID;

    @ColumnDefault("'0'")
    @Column(name = "Criteriatreeid", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Long criteriatreeid;

    @ColumnDefault("'0'")
    @Column(name = "RewardQuestID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Long rewardQuestID;

    @ColumnDefault("0")
    @Column(name = "RelatedStep", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer relatedStep;

    @ColumnDefault("'0'")
    @Column(name = "Supersedes", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Integer supersedes;

    @ColumnDefault("'0'")
    @Column(name = "OrderIndex", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Short orderIndex;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "VisibilityPlayerConditionID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long visibilityPlayerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "WidgetSetID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Integer widgetSetID;

}