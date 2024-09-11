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
@Table(name = "achievement")
public class Achievement {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Description")
    private String description;

    @Lob
    @Column(name = "Title")
    private String title;

    @Lob
    @Column(name = "Reward")
    private String reward;

    @ColumnDefault("0")
    @Column(name = "InstanceID", nullable = false)
    private Short instanceID;

    @ColumnDefault("0")
    @Column(name = "Faction", nullable = false)
    private Byte faction;

    @ColumnDefault("0")
    @Column(name = "Supercedes", nullable = false)
    private Short supercedes;

    @ColumnDefault("0")
    @Column(name = "Category", nullable = false)
    private Short category;

    @ColumnDefault("0")
    @Column(name = "MinimumCriteria", nullable = false)
    private Byte minimumCriteria;

    @ColumnDefault("0")
    @Column(name = "Points", nullable = false)
    private Byte points;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "UiOrder", nullable = false)
    private Short uiOrder;

    @ColumnDefault("0")
    @Column(name = "IconFileID", nullable = false)
    private Integer iconFileID;

    @ColumnDefault("'0'")
    @Column(name = "CriteriaTree", columnDefinition = "int UNSIGNED not null")
    private Long criteriaTree;

    @ColumnDefault("0")
    @Column(name = "SharesCriteria", nullable = false)
    private Short sharesCriteria;

}