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
@Table(name = "cfg_regions")
public class CfgRegion {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Tag")
    private String tag;

    @ColumnDefault("'0'")
    @Column(name = "RegionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer regionID;

    @ColumnDefault("'0'")
    @Column(name = "Raidorigin", columnDefinition = "int UNSIGNED not null")
    private Long raidorigin;

    @ColumnDefault("'0'")
    @Column(name = "RegionGroupMask", columnDefinition = "tinyint UNSIGNED not null")
    private Short regionGroupMask;

    @ColumnDefault("'0'")
    @Column(name = "ChallengeOrigin", columnDefinition = "int UNSIGNED not null")
    private Long challengeOrigin;

}