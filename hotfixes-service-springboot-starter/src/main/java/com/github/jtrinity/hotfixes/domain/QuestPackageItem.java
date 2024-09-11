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
@Table(name = "quest_package_item")
public class QuestPackageItem {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "PackageID", columnDefinition = "smallint UNSIGNED not null")
    private Integer packageID;

    @ColumnDefault("0")
    @Column(name = "ItemID", nullable = false)
    private Integer itemID;

    @ColumnDefault("'0'")
    @Column(name = "ItemQuantity", columnDefinition = "int UNSIGNED not null")
    private Long itemQuantity;

    @ColumnDefault("'0'")
    @Column(name = "DisplayType", columnDefinition = "tinyint UNSIGNED not null")
    private Short displayType;

}