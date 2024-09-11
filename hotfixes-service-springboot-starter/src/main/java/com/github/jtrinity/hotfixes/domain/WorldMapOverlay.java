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
@Table(name = "world_map_overlay")
public class WorldMapOverlay {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "UiMapArtID", columnDefinition = "int UNSIGNED not null")
    private Long uiMapArtID;

    @ColumnDefault("'0'")
    @Column(name = "TextureWidth", columnDefinition = "smallint UNSIGNED not null")
    private Integer textureWidth;

    @ColumnDefault("'0'")
    @Column(name = "TextureHeight", columnDefinition = "smallint UNSIGNED not null")
    private Integer textureHeight;

    @ColumnDefault("0")
    @Column(name = "OffsetX", nullable = false)
    private Integer offsetX;

    @ColumnDefault("0")
    @Column(name = "OffsetY", nullable = false)
    private Integer offsetY;

    @ColumnDefault("0")
    @Column(name = "HitRectTop", nullable = false)
    private Integer hitRectTop;

    @ColumnDefault("0")
    @Column(name = "HitRectBottom", nullable = false)
    private Integer hitRectBottom;

    @ColumnDefault("0")
    @Column(name = "HitRectLeft", nullable = false)
    private Integer hitRectLeft;

    @ColumnDefault("0")
    @Column(name = "HitRectRight", nullable = false)
    private Integer hitRectRight;

    @ColumnDefault("'0'")
    @Column(name = "PlayerConditionID", columnDefinition = "int UNSIGNED not null")
    private Long playerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "int UNSIGNED not null")
    private Long flags;

    @ColumnDefault("'0'")
    @Column(name = "AreaID1", columnDefinition = "int UNSIGNED not null")
    private Long areaID1;

    @ColumnDefault("'0'")
    @Column(name = "AreaID2", columnDefinition = "int UNSIGNED not null")
    private Long areaID2;

    @ColumnDefault("'0'")
    @Column(name = "AreaID3", columnDefinition = "int UNSIGNED not null")
    private Long areaID3;

    @ColumnDefault("'0'")
    @Column(name = "AreaID4", columnDefinition = "int UNSIGNED not null")
    private Long areaID4;

}