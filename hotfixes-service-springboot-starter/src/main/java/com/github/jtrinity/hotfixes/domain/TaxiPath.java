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
@Table(name = "taxi_path")
public class TaxiPath {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "FromTaxiNode", columnDefinition = "smallint UNSIGNED not null")
    private Integer fromTaxiNode;

    @ColumnDefault("'0'")
    @Column(name = "ToTaxiNode", columnDefinition = "smallint UNSIGNED not null")
    private Integer toTaxiNode;

    @ColumnDefault("'0'")
    @Column(name = "Cost", columnDefinition = "int UNSIGNED not null")
    private Long cost;

}