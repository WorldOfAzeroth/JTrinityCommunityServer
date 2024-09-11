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
@Table(name = "azerite_tier_unlock")
public class AzeriteTierUnlock {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "ItemCreationContext", columnDefinition = "tinyint UNSIGNED not null")
    private Short itemCreationContext;

    @ColumnDefault("'0'")
    @Column(name = "Tier", columnDefinition = "tinyint UNSIGNED not null")
    private Short tier;

    @ColumnDefault("'0'")
    @Column(name = "AzeriteLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short azeriteLevel;

    @ColumnDefault("'0'")
    @Column(name = "AzeriteTierUnlockSetID", columnDefinition = "int UNSIGNED not null")
    private Long azeriteTierUnlockSetID;

}