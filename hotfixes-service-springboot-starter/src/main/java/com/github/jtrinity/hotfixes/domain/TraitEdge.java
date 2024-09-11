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
@Table(name = "trait_edge")
public class TraitEdge {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "VisualStyle", nullable = false)
    private Integer visualStyle;

    @ColumnDefault("'0'")
    @Column(name = "LeftTraitNodeID", columnDefinition = "int UNSIGNED not null")
    private Long leftTraitNodeID;

    @ColumnDefault("0")
    @Column(name = "RightTraitNodeID", nullable = false)
    private Integer rightTraitNodeID;

    @ColumnDefault("0")
    @Column(name = "Type", nullable = false)
    private Integer type;

}