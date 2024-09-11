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
@Table(name = "spell_visual_missile")
public class SpellVisualMissile {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "CastOffset1", nullable = false)
    private Float castOffset1;

    @ColumnDefault("0")
    @Column(name = "CastOffset2", nullable = false)
    private Float castOffset2;

    @ColumnDefault("0")
    @Column(name = "CastOffset3", nullable = false)
    private Float castOffset3;

    @ColumnDefault("0")
    @Column(name = "ImpactOffset1", nullable = false)
    private Float impactOffset1;

    @ColumnDefault("0")
    @Column(name = "ImpactOffset2", nullable = false)
    private Float impactOffset2;

    @ColumnDefault("0")
    @Column(name = "ImpactOffset3", nullable = false)
    private Float impactOffset3;

    @ColumnDefault("'0'")
    @Column(name = "SpellVisualEffectNameID", columnDefinition = "smallint UNSIGNED not null")
    private Integer spellVisualEffectNameID;

    @ColumnDefault("'0'")
    @Column(name = "SoundEntriesID", columnDefinition = "int UNSIGNED not null")
    private Long soundEntriesID;

    @ColumnDefault("0")
    @Column(name = "Attachment", nullable = false)
    private Byte attachment;

    @ColumnDefault("0")
    @Column(name = "DestinationAttachment", nullable = false)
    private Byte destinationAttachment;

    @ColumnDefault("'0'")
    @Column(name = "CastPositionerID", columnDefinition = "smallint UNSIGNED not null")
    private Integer castPositionerID;

    @ColumnDefault("'0'")
    @Column(name = "ImpactPositionerID", columnDefinition = "smallint UNSIGNED not null")
    private Integer impactPositionerID;

    @ColumnDefault("0")
    @Column(name = "FollowGroundHeight", nullable = false)
    private Integer followGroundHeight;

    @ColumnDefault("'0'")
    @Column(name = "FollowGroundDropSpeed", columnDefinition = "int UNSIGNED not null")
    private Long followGroundDropSpeed;

    @ColumnDefault("'0'")
    @Column(name = "FollowGroundApproach", columnDefinition = "smallint UNSIGNED not null")
    private Integer followGroundApproach;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "int UNSIGNED not null")
    private Long flags;

    @ColumnDefault("'0'")
    @Column(name = "SpellMissileMotionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer spellMissileMotionID;

    @ColumnDefault("'0'")
    @Column(name = "AnimKitID", columnDefinition = "int UNSIGNED not null")
    private Long animKitID;

    @ColumnDefault("'0'")
    @Column(name = "SpellVisualMissileSetID", columnDefinition = "int UNSIGNED not null")
    private Long spellVisualMissileSetID;

}