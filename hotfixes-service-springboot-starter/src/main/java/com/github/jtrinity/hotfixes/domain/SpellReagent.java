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
@Table(name = "spell_reagents")
public class SpellReagent {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    private Integer spellID;

    @ColumnDefault("0")
    @Column(name = "Reagent1", nullable = false)
    private Integer reagent1;

    @ColumnDefault("0")
    @Column(name = "Reagent2", nullable = false)
    private Integer reagent2;

    @ColumnDefault("0")
    @Column(name = "Reagent3", nullable = false)
    private Integer reagent3;

    @ColumnDefault("0")
    @Column(name = "Reagent4", nullable = false)
    private Integer reagent4;

    @ColumnDefault("0")
    @Column(name = "Reagent5", nullable = false)
    private Integer reagent5;

    @ColumnDefault("0")
    @Column(name = "Reagent6", nullable = false)
    private Integer reagent6;

    @ColumnDefault("0")
    @Column(name = "Reagent7", nullable = false)
    private Integer reagent7;

    @ColumnDefault("0")
    @Column(name = "Reagent8", nullable = false)
    private Integer reagent8;

    @ColumnDefault("0")
    @Column(name = "ReagentCount1", nullable = false)
    private Short reagentCount1;

    @ColumnDefault("0")
    @Column(name = "ReagentCount2", nullable = false)
    private Short reagentCount2;

    @ColumnDefault("0")
    @Column(name = "ReagentCount3", nullable = false)
    private Short reagentCount3;

    @ColumnDefault("0")
    @Column(name = "ReagentCount4", nullable = false)
    private Short reagentCount4;

    @ColumnDefault("0")
    @Column(name = "ReagentCount5", nullable = false)
    private Short reagentCount5;

    @ColumnDefault("0")
    @Column(name = "ReagentCount6", nullable = false)
    private Short reagentCount6;

    @ColumnDefault("0")
    @Column(name = "ReagentCount7", nullable = false)
    private Short reagentCount7;

    @ColumnDefault("0")
    @Column(name = "ReagentCount8", nullable = false)
    private Short reagentCount8;

}