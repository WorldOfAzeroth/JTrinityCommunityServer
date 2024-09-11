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
@Table(name = "item_bonus_tree_node")
public class ItemBonusTreeNode {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "ItemContext", columnDefinition = "tinyint UNSIGNED not null")
    private Short itemContext;

    @ColumnDefault("'0'")
    @Column(name = "ChildItemBonusTreeID", columnDefinition = "smallint UNSIGNED not null")
    private Integer childItemBonusTreeID;

    @ColumnDefault("'0'")
    @Column(name = "ChildItemBonusListID", columnDefinition = "smallint UNSIGNED not null")
    private Integer childItemBonusListID;

    @ColumnDefault("'0'")
    @Column(name = "ChildItemLevelSelectorID", columnDefinition = "smallint UNSIGNED not null")
    private Integer childItemLevelSelectorID;

    @ColumnDefault("0")
    @Column(name = "ChildItemBonusListGroupID", nullable = false)
    private Integer childItemBonusListGroupID;

    @ColumnDefault("0")
    @Column(name = "IblGroupPointsModSetID", nullable = false)
    private Integer iblGroupPointsModSetID;

    @ColumnDefault("0")
    @Column(name = "MinMythicPlusLevel", nullable = false)
    private Integer minMythicPlusLevel;

    @ColumnDefault("0")
    @Column(name = "MaxMythicPlusLevel", nullable = false)
    private Integer maxMythicPlusLevel;

    @ColumnDefault("'0'")
    @Column(name = "ParentItemBonusTreeID", columnDefinition = "int UNSIGNED not null")
    private Long parentItemBonusTreeID;

}