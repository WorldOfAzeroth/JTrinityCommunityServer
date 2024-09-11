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
@Table(name = "item_search_name")
public class ItemSearchName {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "AllowableRace", nullable = false)
    private Long allowableRace;

    @Lob
    @Column(name = "Display")
    private String display;

    @ColumnDefault("'0'")
    @Column(name = "OverallQualityID", columnDefinition = "tinyint UNSIGNED not null")
    private Short overallQualityID;

    @ColumnDefault("0")
    @Column(name = "ExpansionID", nullable = false)
    private Byte expansionID;

    @ColumnDefault("'0'")
    @Column(name = "MinFactionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer minFactionID;

    @ColumnDefault("0")
    @Column(name = "MinReputation", nullable = false)
    private Integer minReputation;

    @ColumnDefault("0")
    @Column(name = "AllowableClass", nullable = false)
    private Integer allowableClass;

    @ColumnDefault("0")
    @Column(name = "RequiredLevel", nullable = false)
    private Byte requiredLevel;

    @ColumnDefault("'0'")
    @Column(name = "RequiredSkill", columnDefinition = "smallint UNSIGNED not null")
    private Integer requiredSkill;

    @ColumnDefault("'0'")
    @Column(name = "RequiredSkillRank", columnDefinition = "smallint UNSIGNED not null")
    private Integer requiredSkillRank;

    @ColumnDefault("'0'")
    @Column(name = "RequiredAbility", columnDefinition = "int UNSIGNED not null")
    private Long requiredAbility;

    @ColumnDefault("'0'")
    @Column(name = "ItemLevel", columnDefinition = "smallint UNSIGNED not null")
    private Integer itemLevel;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    private Integer flags2;

    @ColumnDefault("0")
    @Column(name = "Flags3", nullable = false)
    private Integer flags3;

    @ColumnDefault("0")
    @Column(name = "Flags4", nullable = false)
    private Integer flags4;

}