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
@Table(name = "rand_prop_points")
@Db2File(name = "RandPropPoints.db2", layoutHash = 0x16C5E260)
public class RandPropPoint implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "DamageReplaceStat", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer damageReplaceStat;

    @ColumnDefault("'0'")
    @Column(name = "Epic1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Long epic1;

    @ColumnDefault("'0'")
    @Column(name = "Epic2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long epic2;

    @ColumnDefault("'0'")
    @Column(name = "Epic3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Long epic3;

    @ColumnDefault("'0'")
    @Column(name = "Epic4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Long epic4;

    @ColumnDefault("'0'")
    @Column(name = "Epic5", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Long epic5;

    @ColumnDefault("'0'")
    @Column(name = "Superior1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long superior1;

    @ColumnDefault("'0'")
    @Column(name = "Superior2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Long superior2;

    @ColumnDefault("'0'")
    @Column(name = "Superior3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Long superior3;

    @ColumnDefault("'0'")
    @Column(name = "Superior4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long superior4;

    @ColumnDefault("'0'")
    @Column(name = "Superior5", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Long superior5;

    @ColumnDefault("'0'")
    @Column(name = "Good1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Long good1;

    @ColumnDefault("'0'")
    @Column(name = "Good2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Long good2;

    @ColumnDefault("'0'")
    @Column(name = "Good3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Long good3;

    @ColumnDefault("'0'")
    @Column(name = "Good4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Long good4;

    @ColumnDefault("'0'")
    @Column(name = "Good5", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Long good5;

}