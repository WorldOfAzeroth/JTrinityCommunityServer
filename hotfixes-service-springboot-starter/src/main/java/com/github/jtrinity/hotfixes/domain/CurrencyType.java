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
@Table(name = "currency_types")
public class CurrencyType {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @Lob
    @Column(name = "Description")
    private String description;

    @ColumnDefault("'0'")
    @Column(name = "CategoryID", columnDefinition = "tinyint UNSIGNED not null")
    private Short categoryID;

    @ColumnDefault("0")
    @Column(name = "InventoryIconFileID", nullable = false)
    private Integer inventoryIconFileID;

    @ColumnDefault("'0'")
    @Column(name = "SpellWeight", columnDefinition = "int UNSIGNED not null")
    private Long spellWeight;

    @ColumnDefault("'0'")
    @Column(name = "SpellCategory", columnDefinition = "tinyint UNSIGNED not null")
    private Short spellCategory;

    @ColumnDefault("'0'")
    @Column(name = "MaxQty", columnDefinition = "int UNSIGNED not null")
    private Long maxQty;

    @ColumnDefault("'0'")
    @Column(name = "MaxEarnablePerWeek", columnDefinition = "int UNSIGNED not null")
    private Long maxEarnablePerWeek;

    @ColumnDefault("0")
    @Column(name = "Quality", nullable = false)
    private Byte quality;

    @ColumnDefault("0")
    @Column(name = "FactionID", nullable = false)
    private Integer factionID;

    @ColumnDefault("0")
    @Column(name = "AwardConditionID", nullable = false)
    private Integer awardConditionID;

    @ColumnDefault("0")
    @Column(name = "MaxQtyWorldStateID", nullable = false)
    private Integer maxQtyWorldStateID;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    private Integer flags2;

}