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
@Table(name = "item_bonus_list_group_entry")
public class ItemBonusListGroupEntry {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ItemBonusListGroupID", nullable = false)
    private Integer itemBonusListGroupID;

    @ColumnDefault("0")
    @Column(name = "ItemBonusListID", nullable = false)
    private Integer itemBonusListID;

    @ColumnDefault("0")
    @Column(name = "ItemLevelSelectorID", nullable = false)
    private Integer itemLevelSelectorID;

    @ColumnDefault("0")
    @Column(name = "SequenceValue", nullable = false)
    private Integer sequenceValue;

    @ColumnDefault("0")
    @Column(name = "ItemExtendedCostID", nullable = false)
    private Integer itemExtendedCostID;

    @ColumnDefault("0")
    @Column(name = "PlayerConditionID", nullable = false)
    private Integer playerConditionID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "ItemLogicalCostGroupID", nullable = false)
    private Integer itemLogicalCostGroupID;

}