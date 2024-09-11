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
@Table(name = "spell_reagents_currency")
public class SpellReagentsCurrency {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyTypesID", columnDefinition = "smallint UNSIGNED not null")
    private Integer currencyTypesID;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyCount", columnDefinition = "smallint UNSIGNED not null")
    private Integer currencyCount;

}