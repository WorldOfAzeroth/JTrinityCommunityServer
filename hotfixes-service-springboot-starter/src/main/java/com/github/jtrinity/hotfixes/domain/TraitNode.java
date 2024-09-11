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
@Table(name = "trait_node")
public class TraitNode {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "TraitTreeID", columnDefinition = "int UNSIGNED not null")
    private Long traitTreeID;

    @ColumnDefault("0")
    @Column(name = "PosX", nullable = false)
    private Integer posX;

    @ColumnDefault("0")
    @Column(name = "PosY", nullable = false)
    private Integer posY;

    @ColumnDefault("'0'")
    @Column(name = "Type", columnDefinition = "tinyint UNSIGNED not null")
    private Short type;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

}