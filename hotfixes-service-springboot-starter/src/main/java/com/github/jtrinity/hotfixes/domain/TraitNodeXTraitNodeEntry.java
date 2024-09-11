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
@Table(name = "trait_node_x_trait_node_entry")
public class TraitNodeXTraitNodeEntry {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "TraitNodeID", columnDefinition = "int UNSIGNED not null")
    private Long traitNodeID;

    @ColumnDefault("0")
    @Column(name = "TraitNodeEntryID", nullable = false)
    private Integer traitNodeEntryID;

    @ColumnDefault("0")
    @Column(name = "`Index`", nullable = false)
    private Integer index;

}