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
@Table(name = "trait_node_group_x_trait_node")
public class TraitNodeGroupXTraitNode {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "TraitNodeGroupID", columnDefinition = "int UNSIGNED not null")
    private Long traitNodeGroupID;

    @ColumnDefault("0")
    @Column(name = "TraitNodeID", nullable = false)
    private Integer traitNodeID;

    @ColumnDefault("0")
    @Column(name = "`Index`", nullable = false)
    private Integer index;

}