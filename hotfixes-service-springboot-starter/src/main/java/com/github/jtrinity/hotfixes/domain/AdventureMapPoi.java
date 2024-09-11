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
@Table(name = "adventure_map_poi")
public class AdventureMapPoi {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Title")
    private String title;

    @Lob
    @Column(name = "Description")
    private String description;

    @ColumnDefault("0")
    @Column(name = "WorldPositionX", nullable = false)
    private Float worldPositionX;

    @ColumnDefault("0")
    @Column(name = "WorldPositionY", nullable = false)
    private Float worldPositionY;

    @ColumnDefault("0")
    @Column(name = "Type", nullable = false)
    private Byte type;

    @ColumnDefault("'0'")
    @Column(name = "PlayerConditionID", columnDefinition = "int UNSIGNED not null")
    private Long playerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "QuestID", columnDefinition = "int UNSIGNED not null")
    private Long questID;

    @ColumnDefault("'0'")
    @Column(name = "LfgDungeonID", columnDefinition = "int UNSIGNED not null")
    private Long lfgDungeonID;

    @ColumnDefault("0")
    @Column(name = "RewardItemID", nullable = false)
    private Integer rewardItemID;

    @ColumnDefault("'0'")
    @Column(name = "UiTextureAtlasMemberID", columnDefinition = "int UNSIGNED not null")
    private Long uiTextureAtlasMemberID;

    @ColumnDefault("'0'")
    @Column(name = "UiTextureKitID", columnDefinition = "int UNSIGNED not null")
    private Long uiTextureKitID;

    @ColumnDefault("0")
    @Column(name = "MapID", nullable = false)
    private Integer mapID;

    @ColumnDefault("'0'")
    @Column(name = "AreaTableID", columnDefinition = "int UNSIGNED not null")
    private Long areaTableID;

}