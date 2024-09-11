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
@Table(name = "item_reforge")
public class ItemReforge {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "SourceStat", columnDefinition = "smallint UNSIGNED not null")
    private Integer sourceStat;

    @ColumnDefault("0")
    @Column(name = "SourceMultiplier", nullable = false)
    private Float sourceMultiplier;

    @ColumnDefault("'0'")
    @Column(name = "TargetStat", columnDefinition = "smallint UNSIGNED not null")
    private Integer targetStat;

    @ColumnDefault("0")
    @Column(name = "TargetMultiplier", nullable = false)
    private Float targetMultiplier;

    @ColumnDefault("'0'")
    @Column(name = "LegacyItemReforgeID", columnDefinition = "smallint UNSIGNED not null")
    private Integer legacyItemReforgeID;

}