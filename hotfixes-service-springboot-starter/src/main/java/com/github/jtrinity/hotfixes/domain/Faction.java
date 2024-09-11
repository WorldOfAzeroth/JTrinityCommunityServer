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
@Table(name = "faction")
public class Faction {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ReputationRaceMask1", nullable = false)
    private Long reputationRaceMask1;

    @ColumnDefault("0")
    @Column(name = "ReputationRaceMask2", nullable = false)
    private Long reputationRaceMask2;

    @ColumnDefault("0")
    @Column(name = "ReputationRaceMask3", nullable = false)
    private Long reputationRaceMask3;

    @ColumnDefault("0")
    @Column(name = "ReputationRaceMask4", nullable = false)
    private Long reputationRaceMask4;

    @Lob
    @Column(name = "Name")
    private String name;

    @Lob
    @Column(name = "Description")
    private String description;

    @ColumnDefault("0")
    @Column(name = "ReputationIndex", nullable = false)
    private Short reputationIndex;

    @ColumnDefault("'0'")
    @Column(name = "ParentFactionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer parentFactionID;

    @ColumnDefault("'0'")
    @Column(name = "Expansion", columnDefinition = "tinyint UNSIGNED not null")
    private Short expansion;

    @ColumnDefault("'0'")
    @Column(name = "FriendshipRepID", columnDefinition = "tinyint UNSIGNED not null")
    private Short friendshipRepID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "ParagonFactionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer paragonFactionID;

    @ColumnDefault("0")
    @Column(name = "RenownFactionID", nullable = false)
    private Integer renownFactionID;

    @ColumnDefault("0")
    @Column(name = "RenownCurrencyID", nullable = false)
    private Integer renownCurrencyID;

    @ColumnDefault("0")
    @Column(name = "ReputationClassMask1", nullable = false)
    private Short reputationClassMask1;

    @ColumnDefault("0")
    @Column(name = "ReputationClassMask2", nullable = false)
    private Short reputationClassMask2;

    @ColumnDefault("0")
    @Column(name = "ReputationClassMask3", nullable = false)
    private Short reputationClassMask3;

    @ColumnDefault("0")
    @Column(name = "ReputationClassMask4", nullable = false)
    private Short reputationClassMask4;

    @ColumnDefault("'0'")
    @Column(name = "ReputationFlags1", columnDefinition = "smallint UNSIGNED not null")
    private Integer reputationFlags1;

    @ColumnDefault("'0'")
    @Column(name = "ReputationFlags2", columnDefinition = "smallint UNSIGNED not null")
    private Integer reputationFlags2;

    @ColumnDefault("'0'")
    @Column(name = "ReputationFlags3", columnDefinition = "smallint UNSIGNED not null")
    private Integer reputationFlags3;

    @ColumnDefault("'0'")
    @Column(name = "ReputationFlags4", columnDefinition = "smallint UNSIGNED not null")
    private Integer reputationFlags4;

    @ColumnDefault("0")
    @Column(name = "ReputationBase1", nullable = false)
    private Integer reputationBase1;

    @ColumnDefault("0")
    @Column(name = "ReputationBase2", nullable = false)
    private Integer reputationBase2;

    @ColumnDefault("0")
    @Column(name = "ReputationBase3", nullable = false)
    private Integer reputationBase3;

    @ColumnDefault("0")
    @Column(name = "ReputationBase4", nullable = false)
    private Integer reputationBase4;

    @ColumnDefault("0")
    @Column(name = "ReputationMax1", nullable = false)
    private Integer reputationMax1;

    @ColumnDefault("0")
    @Column(name = "ReputationMax2", nullable = false)
    private Integer reputationMax2;

    @ColumnDefault("0")
    @Column(name = "ReputationMax3", nullable = false)
    private Integer reputationMax3;

    @ColumnDefault("0")
    @Column(name = "ReputationMax4", nullable = false)
    private Integer reputationMax4;

    @ColumnDefault("0")
    @Column(name = "ParentFactionMod1", nullable = false)
    private Float parentFactionMod1;

    @ColumnDefault("0")
    @Column(name = "ParentFactionMod2", nullable = false)
    private Float parentFactionMod2;

    @ColumnDefault("'0'")
    @Column(name = "ParentFactionCap1", columnDefinition = "tinyint UNSIGNED not null")
    private Short parentFactionCap1;

    @ColumnDefault("'0'")
    @Column(name = "ParentFactionCap2", columnDefinition = "tinyint UNSIGNED not null")
    private Short parentFactionCap2;

}