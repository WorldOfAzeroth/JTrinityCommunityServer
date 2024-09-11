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
@Table(name = "item_child_equipment")
public class ItemChildEquipment {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ChildItemID", nullable = false)
    private Integer childItemID;

    @ColumnDefault("'0'")
    @Column(name = "ChildItemEquipSlot", columnDefinition = "tinyint UNSIGNED not null")
    private Short childItemEquipSlot;

    @ColumnDefault("'0'")
    @Column(name = "ParentItemID", columnDefinition = "int UNSIGNED not null")
    private Long parentItemID;

}