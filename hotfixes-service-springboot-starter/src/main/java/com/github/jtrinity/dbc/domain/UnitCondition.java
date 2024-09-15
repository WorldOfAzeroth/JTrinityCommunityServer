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
@Table(name = "unit_condition")
@Db2File(name = "UnitCondition.db2", layoutHash = 0x383D75FD)
public class UnitCondition implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private  Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "Variable1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Short variable1;

    @ColumnDefault("'0'")
    @Column(name = "Variable2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short variable2;

    @ColumnDefault("'0'")
    @Column(name = "Variable3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Short variable3;

    @ColumnDefault("'0'")
    @Column(name = "Variable4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Short variable4;

    @ColumnDefault("'0'")
    @Column(name = "Variable5", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short variable5;

    @ColumnDefault("'0'")
    @Column(name = "Variable6", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Short variable6;

    @ColumnDefault("'0'")
    @Column(name = "Variable7", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Short variable7;

    @ColumnDefault("'0'")
    @Column(name = "Variable8", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Short variable8;

    @ColumnDefault("0")
    @Column(name = "Op1", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE, signed = true)
    private Byte op1;

    @ColumnDefault("0")
    @Column(name = "Op2", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE, signed = true)
    private Byte op2;

    @ColumnDefault("0")
    @Column(name = "Op3", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE, signed = true)
    private Byte op3;

    @ColumnDefault("0")
    @Column(name = "Op4", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE, signed = true)
    private Byte op4;

    @ColumnDefault("0")
    @Column(name = "Op5", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE, signed = true)
    private Byte op5;

    @ColumnDefault("0")
    @Column(name = "Op6", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE, signed = true)
    private Byte op6;

    @ColumnDefault("0")
    @Column(name = "Op7", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE, signed = true)
    private Byte op7;

    @ColumnDefault("0")
    @Column(name = "Op8", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE, signed = true)
    private Byte op8;

    @ColumnDefault("0")
    @Column(name = "Value1", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.INT, signed = true)
    private Integer value1;

    @ColumnDefault("0")
    @Column(name = "Value2", nullable = false)
    @Db2Field(fieldIndex = 19, type = Db2Type.INT, signed = true)
    private Integer value2;

    @ColumnDefault("0")
    @Column(name = "Value3", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.INT, signed = true)
    private Integer value3;

    @ColumnDefault("0")
    @Column(name = "Value4", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.INT, signed = true)
    private Integer value4;

    @ColumnDefault("0")
    @Column(name = "Value5", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer value5;

    @ColumnDefault("0")
    @Column(name = "Value6", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer value6;

    @ColumnDefault("0")
    @Column(name = "Value7", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.INT, signed = true)
    private Integer value7;

    @ColumnDefault("0")
    @Column(name = "Value8", nullable = false)
    @Db2Field(fieldIndex = 25, type = Db2Type.INT, signed = true)
    private Integer value8;

}