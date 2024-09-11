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
@Table(name = "item_modified_appearance")
public class ItemModifiedAppearance {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ItemID", nullable = false)
    private Integer itemID;

    @ColumnDefault("0")
    @Column(name = "ItemAppearanceModifierID", nullable = false)
    private Integer itemAppearanceModifierID;

    @ColumnDefault("0")
    @Column(name = "ItemAppearanceID", nullable = false)
    private Integer itemAppearanceID;

    @ColumnDefault("0")
    @Column(name = "OrderIndex", nullable = false)
    private Integer orderIndex;

    @ColumnDefault("'0'")
    @Column(name = "TransmogSourceTypeEnum", columnDefinition = "tinyint UNSIGNED not null")
    private Short transmogSourceTypeEnum;

}