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
@Table(name = "item_level_selector_quality")
public class ItemLevelSelectorQuality {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "QualityItemBonusListID", nullable = false)
    private Integer qualityItemBonusListID;

    @ColumnDefault("0")
    @Column(name = "Quality", nullable = false)
    private Byte quality;

    @ColumnDefault("'0'")
    @Column(name = "ParentILSQualitySetID", columnDefinition = "int UNSIGNED not null")
    private Long parentILSQualitySetID;

}