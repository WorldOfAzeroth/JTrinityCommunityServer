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
@Table(name = "spell_category")
public class SpellCategory {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "UsesPerWeek", columnDefinition = "tinyint UNSIGNED not null")
    private Short usesPerWeek;

    @ColumnDefault("0")
    @Column(name = "MaxCharges", nullable = false)
    private Byte maxCharges;

    @ColumnDefault("0")
    @Column(name = "ChargeRecoveryTime", nullable = false)
    private Integer chargeRecoveryTime;

    @ColumnDefault("0")
    @Column(name = "TypeMask", nullable = false)
    private Integer typeMask;

}