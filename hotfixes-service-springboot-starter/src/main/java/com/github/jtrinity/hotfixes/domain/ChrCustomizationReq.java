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
@Table(name = "chr_customization_req")
public class ChrCustomizationReq {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "RaceMask", nullable = false)
    private Long raceMask;

    @Lob
    @Column(name = "ReqSource")
    private String reqSource;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "ClassMask", nullable = false)
    private Integer classMask;

    @ColumnDefault("0")
    @Column(name = "AchievementID", nullable = false)
    private Integer achievementID;

    @ColumnDefault("0")
    @Column(name = "QuestID", nullable = false)
    private Integer questID;

    @ColumnDefault("0")
    @Column(name = "OverrideArchive", nullable = false)
    private Integer overrideArchive;

    @ColumnDefault("0")
    @Column(name = "ItemModifiedAppearanceID", nullable = false)
    private Integer itemModifiedAppearanceID;

}