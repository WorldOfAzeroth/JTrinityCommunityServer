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
@Table(name = "item_disenchant_loot")
public class ItemDisenchantLoot {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Subclass", nullable = false)
    private Byte subclass;

    @ColumnDefault("'0'")
    @Column(name = "Quality", columnDefinition = "tinyint UNSIGNED not null")
    private Short quality;

    @ColumnDefault("'0'")
    @Column(name = "MinLevel", columnDefinition = "smallint UNSIGNED not null")
    private Integer minLevel;

    @ColumnDefault("'0'")
    @Column(name = "MaxLevel", columnDefinition = "smallint UNSIGNED not null")
    private Integer maxLevel;

    @ColumnDefault("'0'")
    @Column(name = "SkillRequired", columnDefinition = "smallint UNSIGNED not null")
    private Integer skillRequired;

    @ColumnDefault("0")
    @Column(name = "ExpansionID", nullable = false)
    private Byte expansionID;

    @ColumnDefault("'0'")
    @Column(name = "Class", columnDefinition = "int UNSIGNED not null")
    private Long classField;

}