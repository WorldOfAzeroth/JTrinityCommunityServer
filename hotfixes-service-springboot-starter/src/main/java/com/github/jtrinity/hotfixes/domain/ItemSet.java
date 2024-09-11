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
@Table(name = "item_set")
public class ItemSet {
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

    @ColumnDefault("'0'")
    @Column(name = "SetFlags", columnDefinition = "int UNSIGNED not null")
    private Long setFlags;

    @ColumnDefault("'0'")
    @Column(name = "RequiredSkill", columnDefinition = "int UNSIGNED not null")
    private Long requiredSkill;

    @ColumnDefault("'0'")
    @Column(name = "RequiredSkillRank", columnDefinition = "smallint UNSIGNED not null")
    private Integer requiredSkillRank;

    @ColumnDefault("'0'")
    @Column(name = "ItemID1", columnDefinition = "int UNSIGNED not null")
    private Long itemID1;

    @ColumnDefault("'0'")
    @Column(name = "ItemID2", columnDefinition = "int UNSIGNED not null")
    private Long itemID2;

    @ColumnDefault("'0'")
    @Column(name = "ItemID3", columnDefinition = "int UNSIGNED not null")
    private Long itemID3;

    @ColumnDefault("'0'")
    @Column(name = "ItemID4", columnDefinition = "int UNSIGNED not null")
    private Long itemID4;

    @ColumnDefault("'0'")
    @Column(name = "ItemID5", columnDefinition = "int UNSIGNED not null")
    private Long itemID5;

    @ColumnDefault("'0'")
    @Column(name = "ItemID6", columnDefinition = "int UNSIGNED not null")
    private Long itemID6;

    @ColumnDefault("'0'")
    @Column(name = "ItemID7", columnDefinition = "int UNSIGNED not null")
    private Long itemID7;

    @ColumnDefault("'0'")
    @Column(name = "ItemID8", columnDefinition = "int UNSIGNED not null")
    private Long itemID8;

    @ColumnDefault("'0'")
    @Column(name = "ItemID9", columnDefinition = "int UNSIGNED not null")
    private Long itemID9;

    @ColumnDefault("'0'")
    @Column(name = "ItemID10", columnDefinition = "int UNSIGNED not null")
    private Long itemID10;

    @ColumnDefault("'0'")
    @Column(name = "ItemID11", columnDefinition = "int UNSIGNED not null")
    private Long itemID11;

    @ColumnDefault("'0'")
    @Column(name = "ItemID12", columnDefinition = "int UNSIGNED not null")
    private Long itemID12;

    @ColumnDefault("'0'")
    @Column(name = "ItemID13", columnDefinition = "int UNSIGNED not null")
    private Long itemID13;

    @ColumnDefault("'0'")
    @Column(name = "ItemID14", columnDefinition = "int UNSIGNED not null")
    private Long itemID14;

    @ColumnDefault("'0'")
    @Column(name = "ItemID15", columnDefinition = "int UNSIGNED not null")
    private Long itemID15;

    @ColumnDefault("'0'")
    @Column(name = "ItemID16", columnDefinition = "int UNSIGNED not null")
    private Long itemID16;

    @ColumnDefault("'0'")
    @Column(name = "ItemID17", columnDefinition = "int UNSIGNED not null")
    private Long itemID17;

}