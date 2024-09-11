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
@Table(name = "trait_definition_effect_points")
public class TraitDefinitionEffectPoint {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "TraitDefinitionID", columnDefinition = "int UNSIGNED not null")
    private Long traitDefinitionID;

    @ColumnDefault("0")
    @Column(name = "EffectIndex", nullable = false)
    private Integer effectIndex;

    @ColumnDefault("0")
    @Column(name = "OperationType", nullable = false)
    private Integer operationType;

    @ColumnDefault("0")
    @Column(name = "CurveID", nullable = false)
    private Integer curveID;

}