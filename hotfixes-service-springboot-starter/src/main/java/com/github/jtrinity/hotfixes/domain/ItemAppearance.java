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
@Table(name = "item_appearance")
public class ItemAppearance {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "DisplayType", columnDefinition = "tinyint UNSIGNED not null")
    private Short displayType;

    @ColumnDefault("0")
    @Column(name = "ItemDisplayInfoID", nullable = false)
    private Integer itemDisplayInfoID;

    @ColumnDefault("0")
    @Column(name = "DefaultIconFileDataID", nullable = false)
    private Integer defaultIconFileDataID;

    @ColumnDefault("0")
    @Column(name = "UiOrder", nullable = false)
    private Integer uiOrder;

}