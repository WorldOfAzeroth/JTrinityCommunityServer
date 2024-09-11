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
@Table(name = "item_spec")
public class ItemSpec {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "MinLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short minLevel;

    @ColumnDefault("'0'")
    @Column(name = "MaxLevel", columnDefinition = "tinyint UNSIGNED not null")
    private Short maxLevel;

    @ColumnDefault("'0'")
    @Column(name = "ItemType", columnDefinition = "tinyint UNSIGNED not null")
    private Short itemType;

    @ColumnDefault("'0'")
    @Column(name = "PrimaryStat", columnDefinition = "tinyint UNSIGNED not null")
    private Short primaryStat;

    @ColumnDefault("'0'")
    @Column(name = "SecondaryStat", columnDefinition = "tinyint UNSIGNED not null")
    private Short secondaryStat;

    @ColumnDefault("'0'")
    @Column(name = "SpecializationID", columnDefinition = "smallint UNSIGNED not null")
    private Integer specializationID;

}