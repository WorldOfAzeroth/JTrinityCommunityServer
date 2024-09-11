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
@Table(name = "item_level_selector")
public class ItemLevelSelector {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "MinItemLevel", columnDefinition = "smallint UNSIGNED not null")
    private Integer minItemLevel;

    @ColumnDefault("'0'")
    @Column(name = "ItemLevelSelectorQualitySetID", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemLevelSelectorQualitySetID;

}