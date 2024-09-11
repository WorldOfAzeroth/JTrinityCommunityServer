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
@Table(name = "rand_prop_points")
public class RandPropPoint {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "DamageReplaceStat", nullable = false)
    private Integer damageReplaceStat;

    @ColumnDefault("'0'")
    @Column(name = "Epic1", columnDefinition = "int UNSIGNED not null")
    private Long epic1;

    @ColumnDefault("'0'")
    @Column(name = "Epic2", columnDefinition = "int UNSIGNED not null")
    private Long epic2;

    @ColumnDefault("'0'")
    @Column(name = "Epic3", columnDefinition = "int UNSIGNED not null")
    private Long epic3;

    @ColumnDefault("'0'")
    @Column(name = "Epic4", columnDefinition = "int UNSIGNED not null")
    private Long epic4;

    @ColumnDefault("'0'")
    @Column(name = "Epic5", columnDefinition = "int UNSIGNED not null")
    private Long epic5;

    @ColumnDefault("'0'")
    @Column(name = "Superior1", columnDefinition = "int UNSIGNED not null")
    private Long superior1;

    @ColumnDefault("'0'")
    @Column(name = "Superior2", columnDefinition = "int UNSIGNED not null")
    private Long superior2;

    @ColumnDefault("'0'")
    @Column(name = "Superior3", columnDefinition = "int UNSIGNED not null")
    private Long superior3;

    @ColumnDefault("'0'")
    @Column(name = "Superior4", columnDefinition = "int UNSIGNED not null")
    private Long superior4;

    @ColumnDefault("'0'")
    @Column(name = "Superior5", columnDefinition = "int UNSIGNED not null")
    private Long superior5;

    @ColumnDefault("'0'")
    @Column(name = "Good1", columnDefinition = "int UNSIGNED not null")
    private Long good1;

    @ColumnDefault("'0'")
    @Column(name = "Good2", columnDefinition = "int UNSIGNED not null")
    private Long good2;

    @ColumnDefault("'0'")
    @Column(name = "Good3", columnDefinition = "int UNSIGNED not null")
    private Long good3;

    @ColumnDefault("'0'")
    @Column(name = "Good4", columnDefinition = "int UNSIGNED not null")
    private Long good4;

    @ColumnDefault("'0'")
    @Column(name = "Good5", columnDefinition = "int UNSIGNED not null")
    private Long good5;

}