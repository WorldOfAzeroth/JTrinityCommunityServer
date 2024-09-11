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
@Table(name = "trait_tree_x_trait_currency")
public class TraitTreeXTraitCurrency {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "`Index`", nullable = false)
    private Integer index;

    @ColumnDefault("'0'")
    @Column(name = "TraitTreeID", columnDefinition = "int UNSIGNED not null")
    private Long traitTreeID;

    @ColumnDefault("0")
    @Column(name = "TraitCurrencyID", nullable = false)
    private Integer traitCurrencyID;

}