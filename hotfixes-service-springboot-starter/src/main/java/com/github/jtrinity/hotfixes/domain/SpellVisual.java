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
@Table(name = "spell_visual")
public class SpellVisual {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "MissileCastOffset1", nullable = false)
    private Float missileCastOffset1;

    @ColumnDefault("0")
    @Column(name = "MissileCastOffset2", nullable = false)
    private Float missileCastOffset2;

    @ColumnDefault("0")
    @Column(name = "MissileCastOffset3", nullable = false)
    private Float missileCastOffset3;

    @ColumnDefault("0")
    @Column(name = "MissileImpactOffset1", nullable = false)
    private Float missileImpactOffset1;

    @ColumnDefault("0")
    @Column(name = "MissileImpactOffset2", nullable = false)
    private Float missileImpactOffset2;

    @ColumnDefault("0")
    @Column(name = "MissileImpactOffset3", nullable = false)
    private Float missileImpactOffset3;

    @ColumnDefault("'0'")
    @Column(name = "AnimEventSoundID", columnDefinition = "int UNSIGNED not null")
    private Long animEventSoundID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "MissileAttachment", nullable = false)
    private Byte missileAttachment;

    @ColumnDefault("0")
    @Column(name = "MissileDestinationAttachment", nullable = false)
    private Byte missileDestinationAttachment;

    @ColumnDefault("'0'")
    @Column(name = "MissileCastPositionerID", columnDefinition = "int UNSIGNED not null")
    private Long missileCastPositionerID;

    @ColumnDefault("'0'")
    @Column(name = "MissileImpactPositionerID", columnDefinition = "int UNSIGNED not null")
    private Long missileImpactPositionerID;

    @ColumnDefault("0")
    @Column(name = "MissileTargetingKit", nullable = false)
    private Integer missileTargetingKit;

    @ColumnDefault("'0'")
    @Column(name = "HostileSpellVisualID", columnDefinition = "int UNSIGNED not null")
    private Long hostileSpellVisualID;

    @ColumnDefault("'0'")
    @Column(name = "CasterSpellVisualID", columnDefinition = "int UNSIGNED not null")
    private Long casterSpellVisualID;

    @ColumnDefault("'0'")
    @Column(name = "SpellVisualMissileSetID", columnDefinition = "smallint UNSIGNED not null")
    private Integer spellVisualMissileSetID;

    @ColumnDefault("'0'")
    @Column(name = "DamageNumberDelay", columnDefinition = "smallint UNSIGNED not null")
    private Integer damageNumberDelay;

    @ColumnDefault("'0'")
    @Column(name = "LowViolenceSpellVisualID", columnDefinition = "int UNSIGNED not null")
    private Long lowViolenceSpellVisualID;

    @ColumnDefault("'0'")
    @Column(name = "RaidSpellVisualMissileSetID", columnDefinition = "int UNSIGNED not null")
    private Long raidSpellVisualMissileSetID;

    @ColumnDefault("0")
    @Column(name = "ReducedUnexpectedCameraMovementSpellVisualID", nullable = false)
    private Integer reducedUnexpectedCameraMovementSpellVisualID;

    @ColumnDefault("'0'")
    @Column(name = "AreaModel", columnDefinition = "smallint UNSIGNED not null")
    private Integer areaModel;

    @ColumnDefault("0")
    @Column(name = "HasMissile", nullable = false)
    private Byte hasMissile;

}