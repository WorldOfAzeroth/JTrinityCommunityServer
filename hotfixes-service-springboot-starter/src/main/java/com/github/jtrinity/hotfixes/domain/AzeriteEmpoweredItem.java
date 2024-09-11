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
@Table(name = "azerite_empowered_item")
public class AzeriteEmpoweredItem {
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

    @ColumnDefault("'0'")
    @Column(name = "AzeriteTierUnlockSetID", columnDefinition = "int UNSIGNED not null")
    private Long azeriteTierUnlockSetID;

    @ColumnDefault("'0'")
    @Column(name = "AzeritePowerSetID", columnDefinition = "int UNSIGNED not null")
    private Long azeritePowerSetID;

}