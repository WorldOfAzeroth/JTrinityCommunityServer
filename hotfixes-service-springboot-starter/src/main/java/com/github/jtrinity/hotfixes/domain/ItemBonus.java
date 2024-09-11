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
@Table(name = "item_bonus")
public class ItemBonus {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Value1", nullable = false)
    private Integer value1;

    @ColumnDefault("0")
    @Column(name = "Value2", nullable = false)
    private Integer value2;

    @ColumnDefault("0")
    @Column(name = "Value3", nullable = false)
    private Integer value3;

    @ColumnDefault("0")
    @Column(name = "Value4", nullable = false)
    private Integer value4;

    @ColumnDefault("'0'")
    @Column(name = "ParentItemBonusListID", columnDefinition = "smallint UNSIGNED not null")
    private Integer parentItemBonusListID;

    @ColumnDefault("'0'")
    @Column(name = "Type", columnDefinition = "tinyint UNSIGNED not null")
    private Short type;

    @ColumnDefault("'0'")
    @Column(name = "OrderIndex", columnDefinition = "tinyint UNSIGNED not null")
    private Short orderIndex;

}