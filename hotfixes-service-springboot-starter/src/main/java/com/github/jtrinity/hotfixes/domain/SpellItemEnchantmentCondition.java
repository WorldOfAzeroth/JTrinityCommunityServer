package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Table(name = "spell_item_enchantment_condition")
@Db2File(name = "SpellItemEnchantmentCondition.db2", fileDataId = 1121834, layoutHash = 0xC1340327)
public class SpellItemEnchantmentCondition {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "LtOperandType1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short ltOperandType1;

    @ColumnDefault("'0'")
    @Column(name = "LtOperandType2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Short ltOperandType2;

    @ColumnDefault("'0'")
    @Column(name = "LtOperandType3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short ltOperandType3;

    @ColumnDefault("'0'")
    @Column(name = "LtOperandType4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Short ltOperandType4;

    @ColumnDefault("'0'")
    @Column(name = "LtOperandType5", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Short ltOperandType5;

    @ColumnDefault("'0'")
    @Column(name = "LtOperand1", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Long ltOperand1;

    @ColumnDefault("'0'")
    @Column(name = "LtOperand2", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long ltOperand2;

    @ColumnDefault("'0'")
    @Column(name = "LtOperand3", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Long ltOperand3;

    @ColumnDefault("'0'")
    @Column(name = "LtOperand4", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Long ltOperand4;

    @ColumnDefault("'0'")
    @Column(name = "LtOperand5", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long ltOperand5;

    @ColumnDefault("'0'")
    @Column(name = "Operator1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE)
    private Short operator1;

    @ColumnDefault("'0'")
    @Column(name = "Operator2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE)
    private Short operator2;

    @ColumnDefault("'0'")
    @Column(name = "Operator3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE)
    private Short operator3;

    @ColumnDefault("'0'")
    @Column(name = "Operator4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE)
    private Short operator4;

    @ColumnDefault("'0'")
    @Column(name = "Operator5", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Short operator5;

    @ColumnDefault("'0'")
    @Column(name = "RtOperandType1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.BYTE)
    private Short rtOperandType1;

    @ColumnDefault("'0'")
    @Column(name = "RtOperandType2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE)
    private Short rtOperandType2;

    @ColumnDefault("'0'")
    @Column(name = "RtOperandType3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Short rtOperandType3;

    @ColumnDefault("'0'")
    @Column(name = "RtOperandType4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Short rtOperandType4;

    @ColumnDefault("'0'")
    @Column(name = "RtOperandType5", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Short rtOperandType5;

    @ColumnDefault("'0'")
    @Column(name = "RtOperand1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Short rtOperand1;

    @ColumnDefault("'0'")
    @Column(name = "RtOperand2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Short rtOperand2;

    @ColumnDefault("'0'")
    @Column(name = "RtOperand3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Short rtOperand3;

    @ColumnDefault("'0'")
    @Column(name = "RtOperand4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Short rtOperand4;

    @ColumnDefault("'0'")
    @Column(name = "RtOperand5", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Short rtOperand5;

    @ColumnDefault("'0'")
    @Column(name = "Logic1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE)
    private Short logic1;

    @ColumnDefault("'0'")
    @Column(name = "Logic2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 27, type = Db2Type.BYTE)
    private Short logic2;

    @ColumnDefault("'0'")
    @Column(name = "Logic3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 28, type = Db2Type.BYTE)
    private Short logic3;

    @ColumnDefault("'0'")
    @Column(name = "Logic4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 29, type = Db2Type.BYTE)
    private Short logic4;

    @ColumnDefault("'0'")
    @Column(name = "Logic5", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 30, type = Db2Type.BYTE)
    private Short logic5;

}