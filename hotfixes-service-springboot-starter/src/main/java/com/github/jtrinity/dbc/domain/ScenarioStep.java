package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2File;
import com.github.jtrinity.dbc.db2.Db2Type;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString
@IdClass(DB2Id.class)
@Entity
@Table(name = "scenario_step")
@Db2File(name = "ScenarioStep.db2", layoutHash = 0x201B0EFC, parentIndexField = 2)
public class ScenarioStep implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "Title")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString title;


    @Column(name = "ScenarioID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short scenarioID;


    @Column(name = "Supersedes")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short supersedes;


    @Column(name = "RewardQuestID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short rewardQuestID;


    @Column(name = "OrderIndex")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte orderIndex;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "Criteriatreeid")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer criteriatreeid;


    @Column(name = "RelatedStep")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer relatedStep;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
