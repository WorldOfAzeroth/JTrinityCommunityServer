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
@Table(name = "criteria_tree")
@Db2File(name = "CriteriaTree.db2", layoutHash = 0x0A1B99C2)
public class CriteriaTree implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "Amount")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer amount;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT, signed = true)
    private Short flags;


    @Column(name = "Operator")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE, signed = true)
    private Byte operator;


    @Column(name = "CriteriaID")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer criteriaID;


    @Column(name = "Parent")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer parent;


    @Column(name = "OrderIndex")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer orderIndex;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
