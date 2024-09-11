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
@Table(name = "trait_node_entry")
public class TraitNodeEntry {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "TraitDefinitionID", nullable = false)
    private Integer traitDefinitionID;

    @ColumnDefault("0")
    @Column(name = "MaxRanks", nullable = false)
    private Integer maxRanks;

    @ColumnDefault("'0'")
    @Column(name = "NodeEntryType", columnDefinition = "tinyint UNSIGNED not null")
    private Short nodeEntryType;

}