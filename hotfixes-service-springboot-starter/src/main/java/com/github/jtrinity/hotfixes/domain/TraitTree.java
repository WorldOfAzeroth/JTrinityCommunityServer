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
@Table(name = "trait_tree")
public class TraitTree {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "TraitSystemID", columnDefinition = "int UNSIGNED not null")
    private Long traitSystemID;

    @ColumnDefault("0")
    @Column(name = "TraitTreeID", nullable = false)
    private Integer traitTreeID;

    @ColumnDefault("0")
    @Column(name = "FirstTraitNodeID", nullable = false)
    private Integer firstTraitNodeID;

    @ColumnDefault("0")
    @Column(name = "PlayerConditionID", nullable = false)
    private Integer playerConditionID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "Unused1000_2", nullable = false)
    private Float unused10002;

    @ColumnDefault("0")
    @Column(name = "Unused1000_3", nullable = false)
    private Float unused10003;

}