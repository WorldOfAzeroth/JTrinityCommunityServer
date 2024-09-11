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
@Table(name = "unit_condition")
public class UnitCondition {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "Variable1", columnDefinition = "tinyint UNSIGNED not null")
    private Short variable1;

    @ColumnDefault("'0'")
    @Column(name = "Variable2", columnDefinition = "tinyint UNSIGNED not null")
    private Short variable2;

    @ColumnDefault("'0'")
    @Column(name = "Variable3", columnDefinition = "tinyint UNSIGNED not null")
    private Short variable3;

    @ColumnDefault("'0'")
    @Column(name = "Variable4", columnDefinition = "tinyint UNSIGNED not null")
    private Short variable4;

    @ColumnDefault("'0'")
    @Column(name = "Variable5", columnDefinition = "tinyint UNSIGNED not null")
    private Short variable5;

    @ColumnDefault("'0'")
    @Column(name = "Variable6", columnDefinition = "tinyint UNSIGNED not null")
    private Short variable6;

    @ColumnDefault("'0'")
    @Column(name = "Variable7", columnDefinition = "tinyint UNSIGNED not null")
    private Short variable7;

    @ColumnDefault("'0'")
    @Column(name = "Variable8", columnDefinition = "tinyint UNSIGNED not null")
    private Short variable8;

    @ColumnDefault("0")
    @Column(name = "Op1", nullable = false)
    private Byte op1;

    @ColumnDefault("0")
    @Column(name = "Op2", nullable = false)
    private Byte op2;

    @ColumnDefault("0")
    @Column(name = "Op3", nullable = false)
    private Byte op3;

    @ColumnDefault("0")
    @Column(name = "Op4", nullable = false)
    private Byte op4;

    @ColumnDefault("0")
    @Column(name = "Op5", nullable = false)
    private Byte op5;

    @ColumnDefault("0")
    @Column(name = "Op6", nullable = false)
    private Byte op6;

    @ColumnDefault("0")
    @Column(name = "Op7", nullable = false)
    private Byte op7;

    @ColumnDefault("0")
    @Column(name = "Op8", nullable = false)
    private Byte op8;

    @ColumnDefault("0")
    @Column(name = "Value1", nullable = false)
    private Integer value1;

    @ColumnDefault("0")
    @Column(name = "Value2", nullable = false)
    private Integer value2;

    @ColumnDefault("0")
    @Column(name = "Value3", nullable = false)
    private Integer value3;

    @ColumnDefault("0")
    @Column(name = "Value4", nullable = false)
    private Integer value4;

    @ColumnDefault("0")
    @Column(name = "Value5", nullable = false)
    private Integer value5;

    @ColumnDefault("0")
    @Column(name = "Value6", nullable = false)
    private Integer value6;

    @ColumnDefault("0")
    @Column(name = "Value7", nullable = false)
    private Integer value7;

    @ColumnDefault("0")
    @Column(name = "Value8", nullable = false)
    private Integer value8;

}