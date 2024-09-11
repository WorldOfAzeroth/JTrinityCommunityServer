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
@Table(name = "spell_item_enchantment_condition")
public class SpellItemEnchantmentCondition {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "LtOperandType1", columnDefinition = "tinyint UNSIGNED not null")
    private Short ltOperandType1;

    @ColumnDefault("'0'")
    @Column(name = "LtOperandType2", columnDefinition = "tinyint UNSIGNED not null")
    private Short ltOperandType2;

    @ColumnDefault("'0'")
    @Column(name = "LtOperandType3", columnDefinition = "tinyint UNSIGNED not null")
    private Short ltOperandType3;

    @ColumnDefault("'0'")
    @Column(name = "LtOperandType4", columnDefinition = "tinyint UNSIGNED not null")
    private Short ltOperandType4;

    @ColumnDefault("'0'")
    @Column(name = "LtOperandType5", columnDefinition = "tinyint UNSIGNED not null")
    private Short ltOperandType5;

    @ColumnDefault("'0'")
    @Column(name = "LtOperand1", columnDefinition = "int UNSIGNED not null")
    private Long ltOperand1;

    @ColumnDefault("'0'")
    @Column(name = "LtOperand2", columnDefinition = "int UNSIGNED not null")
    private Long ltOperand2;

    @ColumnDefault("'0'")
    @Column(name = "LtOperand3", columnDefinition = "int UNSIGNED not null")
    private Long ltOperand3;

    @ColumnDefault("'0'")
    @Column(name = "LtOperand4", columnDefinition = "int UNSIGNED not null")
    private Long ltOperand4;

    @ColumnDefault("'0'")
    @Column(name = "LtOperand5", columnDefinition = "int UNSIGNED not null")
    private Long ltOperand5;

    @ColumnDefault("'0'")
    @Column(name = "Operator1", columnDefinition = "tinyint UNSIGNED not null")
    private Short operator1;

    @ColumnDefault("'0'")
    @Column(name = "Operator2", columnDefinition = "tinyint UNSIGNED not null")
    private Short operator2;

    @ColumnDefault("'0'")
    @Column(name = "Operator3", columnDefinition = "tinyint UNSIGNED not null")
    private Short operator3;

    @ColumnDefault("'0'")
    @Column(name = "Operator4", columnDefinition = "tinyint UNSIGNED not null")
    private Short operator4;

    @ColumnDefault("'0'")
    @Column(name = "Operator5", columnDefinition = "tinyint UNSIGNED not null")
    private Short operator5;

    @ColumnDefault("'0'")
    @Column(name = "RtOperandType1", columnDefinition = "tinyint UNSIGNED not null")
    private Short rtOperandType1;

    @ColumnDefault("'0'")
    @Column(name = "RtOperandType2", columnDefinition = "tinyint UNSIGNED not null")
    private Short rtOperandType2;

    @ColumnDefault("'0'")
    @Column(name = "RtOperandType3", columnDefinition = "tinyint UNSIGNED not null")
    private Short rtOperandType3;

    @ColumnDefault("'0'")
    @Column(name = "RtOperandType4", columnDefinition = "tinyint UNSIGNED not null")
    private Short rtOperandType4;

    @ColumnDefault("'0'")
    @Column(name = "RtOperandType5", columnDefinition = "tinyint UNSIGNED not null")
    private Short rtOperandType5;

    @ColumnDefault("'0'")
    @Column(name = "RtOperand1", columnDefinition = "tinyint UNSIGNED not null")
    private Short rtOperand1;

    @ColumnDefault("'0'")
    @Column(name = "RtOperand2", columnDefinition = "tinyint UNSIGNED not null")
    private Short rtOperand2;

    @ColumnDefault("'0'")
    @Column(name = "RtOperand3", columnDefinition = "tinyint UNSIGNED not null")
    private Short rtOperand3;

    @ColumnDefault("'0'")
    @Column(name = "RtOperand4", columnDefinition = "tinyint UNSIGNED not null")
    private Short rtOperand4;

    @ColumnDefault("'0'")
    @Column(name = "RtOperand5", columnDefinition = "tinyint UNSIGNED not null")
    private Short rtOperand5;

    @ColumnDefault("'0'")
    @Column(name = "Logic1", columnDefinition = "tinyint UNSIGNED not null")
    private Short logic1;

    @ColumnDefault("'0'")
    @Column(name = "Logic2", columnDefinition = "tinyint UNSIGNED not null")
    private Short logic2;

    @ColumnDefault("'0'")
    @Column(name = "Logic3", columnDefinition = "tinyint UNSIGNED not null")
    private Short logic3;

    @ColumnDefault("'0'")
    @Column(name = "Logic4", columnDefinition = "tinyint UNSIGNED not null")
    private Short logic4;

    @ColumnDefault("'0'")
    @Column(name = "Logic5", columnDefinition = "tinyint UNSIGNED not null")
    private Short logic5;

}