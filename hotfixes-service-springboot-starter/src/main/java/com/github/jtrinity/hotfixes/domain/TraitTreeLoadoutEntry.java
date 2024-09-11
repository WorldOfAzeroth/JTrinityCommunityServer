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
@Table(name = "trait_tree_loadout_entry")
public class TraitTreeLoadoutEntry {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "TraitTreeLoadoutID", columnDefinition = "int UNSIGNED not null")
    private Long traitTreeLoadoutID;

    @ColumnDefault("0")
    @Column(name = "SelectedTraitNodeID", nullable = false)
    private Integer selectedTraitNodeID;

    @ColumnDefault("0")
    @Column(name = "SelectedTraitNodeEntryID", nullable = false)
    private Integer selectedTraitNodeEntryID;

    @ColumnDefault("0")
    @Column(name = "NumPoints", nullable = false)
    private Integer numPoints;

    @ColumnDefault("0")
    @Column(name = "OrderIndex", nullable = false)
    private Integer orderIndex;

}