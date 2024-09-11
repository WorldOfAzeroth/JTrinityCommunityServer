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
@Table(name = "garr_ability")
public class GarrAbility {
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

    @Lob
    @Column(name = "Description")
    private String description;

    @ColumnDefault("'0'")
    @Column(name = "GarrAbilityCategoryID", columnDefinition = "tinyint UNSIGNED not null")
    private Short garrAbilityCategoryID;

    @ColumnDefault("'0'")
    @Column(name = "GarrFollowerTypeID", columnDefinition = "tinyint UNSIGNED not null")
    private Short garrFollowerTypeID;

    @ColumnDefault("0")
    @Column(name = "IconFileDataID", nullable = false)
    private Integer iconFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "FactionChangeGarrAbilityID", columnDefinition = "smallint UNSIGNED not null")
    private Integer factionChangeGarrAbilityID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "smallint UNSIGNED not null")
    private Integer flags;

}