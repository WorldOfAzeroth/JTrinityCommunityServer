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
@Table(name = "criteria_tree")
public class CriteriaTree {
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

    @ColumnDefault("'0'")
    @Column(name = "Parent", columnDefinition = "int UNSIGNED not null")
    private Long parent;

    @ColumnDefault("'0'")
    @Column(name = "Amount", columnDefinition = "int UNSIGNED not null")
    private Long amount;

    @ColumnDefault("0")
    @Column(name = "Operator", nullable = false)
    private Integer operator;

    @ColumnDefault("'0'")
    @Column(name = "CriteriaID", columnDefinition = "int UNSIGNED not null")
    private Long criteriaID;

    @ColumnDefault("0")
    @Column(name = "OrderIndex", nullable = false)
    private Integer orderIndex;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

}