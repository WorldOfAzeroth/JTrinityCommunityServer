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
@Table(name = "modifier_tree")
public class ModifierTree {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "Parent", columnDefinition = "int UNSIGNED not null")
    private Long parent;

    @ColumnDefault("0")
    @Column(name = "Operator", nullable = false)
    private Byte operator;

    @ColumnDefault("0")
    @Column(name = "Amount", nullable = false)
    private Byte amount;

    @ColumnDefault("0")
    @Column(name = "Type", nullable = false)
    private Integer type;

    @ColumnDefault("0")
    @Column(name = "Asset", nullable = false)
    private Integer asset;

    @ColumnDefault("0")
    @Column(name = "SecondaryAsset", nullable = false)
    private Integer secondaryAsset;

    @ColumnDefault("0")
    @Column(name = "TertiaryAsset", nullable = false)
    private Byte tertiaryAsset;

}