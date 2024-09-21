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
@Table(name = "spell_item_enchantment_condition")
@Db2File(name = "SpellItemEnchantmentCondition.db2", layoutHash = 0xB9C16961)
public class SpellItemEnchantmentCondition implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "LtOperand1")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer ltOperand1;


    @Column(name = "LtOperand2")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer ltOperand2;


    @Column(name = "LtOperand3")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer ltOperand3;


    @Column(name = "LtOperand4")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer ltOperand4;


    @Column(name = "LtOperand5")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer ltOperand5;


    @Column(name = "LtOperandType1")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte ltOperandType1;


    @Column(name = "LtOperandType2")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte ltOperandType2;


    @Column(name = "LtOperandType3")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte ltOperandType3;


    @Column(name = "LtOperandType4")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Byte ltOperandType4;


    @Column(name = "LtOperandType5")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Byte ltOperandType5;


    @Column(name = "Operator1")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Byte operator1;


    @Column(name = "Operator2")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE)
    private Byte operator2;


    @Column(name = "Operator3")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE)
    private Byte operator3;


    @Column(name = "Operator4")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE)
    private Byte operator4;


    @Column(name = "Operator5")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Byte operator5;


    @Column(name = "RtOperandType1")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE)
    private Byte rtOperandType1;


    @Column(name = "RtOperandType2")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Byte rtOperandType2;


    @Column(name = "RtOperandType3")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Byte rtOperandType3;


    @Column(name = "RtOperandType4")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Byte rtOperandType4;


    @Column(name = "RtOperandType5")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Byte rtOperandType5;


    @Column(name = "RtOperand1")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Byte rtOperand1;


    @Column(name = "RtOperand2")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Byte rtOperand2;


    @Column(name = "RtOperand3")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Byte rtOperand3;


    @Column(name = "RtOperand4")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Byte rtOperand4;


    @Column(name = "RtOperand5")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Byte rtOperand5;


    @Column(name = "Logic1")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE)
    private Byte logic1;


    @Column(name = "Logic2")
    @Db2Field(fieldIndex = 27, type = Db2Type.BYTE)
    private Byte logic2;


    @Column(name = "Logic3")
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE)
    private Byte logic3;


    @Column(name = "Logic4")
    @Db2Field(fieldIndex = 29, type = Db2Type.BYTE)
    private Byte logic4;


    @Column(name = "Logic5")
    @Db2Field(fieldIndex = 30, type = Db2Type.BYTE)
    private Byte logic5;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
