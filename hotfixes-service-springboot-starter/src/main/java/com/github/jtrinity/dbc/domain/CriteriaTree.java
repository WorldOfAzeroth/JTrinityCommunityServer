package com.github.jtrinity.dbc.domain;

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
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "criteria_tree")
@Db2File(name = "CriteriaTree.db2", layoutHash = 0xFDD54C23)
public class CriteriaTree implements DbcEntity {
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

    @ColumnDefault("'0'")
    @Column(name = "Parent", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Long parent;

    @ColumnDefault("'0'")
    @Column(name = "Amount", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long amount;

    @ColumnDefault("0")
    @Column(name = "Operator", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer operator;

    @ColumnDefault("'0'")
    @Column(name = "CriteriaID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Long criteriaID;

    @ColumnDefault("0")
    @Column(name = "OrderIndex", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer orderIndex;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer flags;

}