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
@Table(name = "item_effect")
public class ItemEffect {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "LegacySlotIndex", columnDefinition = "tinyint UNSIGNED not null")
    private Short legacySlotIndex;

    @ColumnDefault("0")
    @Column(name = "TriggerType", nullable = false)
    private Byte triggerType;

    @ColumnDefault("0")
    @Column(name = "Charges", nullable = false)
    private Short charges;

    @ColumnDefault("0")
    @Column(name = "CoolDownMSec", nullable = false)
    private Integer coolDownMSec;

    @ColumnDefault("0")
    @Column(name = "CategoryCoolDownMSec", nullable = false)
    private Integer categoryCoolDownMSec;

    @ColumnDefault("'0'")
    @Column(name = "SpellCategoryID", columnDefinition = "smallint UNSIGNED not null")
    private Integer spellCategoryID;

    @ColumnDefault("0")
    @Column(name = "SpellID", nullable = false)
    private Integer spellID;

    @ColumnDefault("'0'")
    @Column(name = "ChrSpecializationID", columnDefinition = "smallint UNSIGNED not null")
    private Integer chrSpecializationID;

    @ColumnDefault("'0'")
    @Column(name = "ParentItemID", columnDefinition = "int UNSIGNED not null")
    private Long parentItemID;

}