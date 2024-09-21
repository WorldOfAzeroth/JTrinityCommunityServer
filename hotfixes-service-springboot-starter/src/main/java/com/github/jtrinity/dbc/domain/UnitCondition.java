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
@Table(name = "unit_condition")
@Db2File(name = "UnitCondition.db2", layoutHash = 0x62802D9C)
public class UnitCondition implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Value1")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer value1;


    @Column(name = "Value2")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer value2;


    @Column(name = "Value3")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer value3;


    @Column(name = "Value4")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer value4;


    @Column(name = "Value5")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer value5;


    @Column(name = "Value6")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer value6;


    @Column(name = "Value7")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer value7;


    @Column(name = "Value8")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer value8;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "Variable1")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Byte variable1;


    @Column(name = "Variable2")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Byte variable2;


    @Column(name = "Variable3")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE)
    private Byte variable3;


    @Column(name = "Variable4")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE)
    private Byte variable4;


    @Column(name = "Variable5")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE)
    private Byte variable5;


    @Column(name = "Variable6")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Byte variable6;


    @Column(name = "Variable7")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE)
    private Byte variable7;


    @Column(name = "Variable8")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Byte variable8;


    @Column(name = "Op1")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Byte op1;


    @Column(name = "Op2")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Byte op2;


    @Column(name = "Op3")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Byte op3;


    @Column(name = "Op4")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Byte op4;


    @Column(name = "Op5")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Byte op5;


    @Column(name = "Op6")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Byte op6;


    @Column(name = "Op7")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Byte op7;


    @Column(name = "Op8")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Byte op8;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
