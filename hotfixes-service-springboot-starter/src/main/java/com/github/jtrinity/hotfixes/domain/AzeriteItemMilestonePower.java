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
@Table(name = "azerite_item_milestone_power")
public class AzeriteItemMilestonePower {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "RequiredLevel", nullable = false)
    private Integer requiredLevel;

    @ColumnDefault("0")
    @Column(name = "AzeritePowerID", nullable = false)
    private Integer azeritePowerID;

    @ColumnDefault("0")
    @Column(name = "Type", nullable = false)
    private Integer type;

    @ColumnDefault("0")
    @Column(name = "AutoUnlock", nullable = false)
    private Integer autoUnlock;

}