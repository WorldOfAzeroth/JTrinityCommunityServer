package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Db2File(name = "SpellVisual.db2", fileDataId = 897952, layoutHash = 0xBAA2E3FD)
public class SpellVisual {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "MissileCastOffset1", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float missileCastOffset1;

    @ColumnDefault("0")
    @Column(name = "MissileCastOffset2", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float missileCastOffset2;

    @ColumnDefault("0")
    @Column(name = "MissileCastOffset3", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float missileCastOffset3;

    @ColumnDefault("0")
    @Column(name = "MissileImpactOffset1", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float missileImpactOffset1;

    @ColumnDefault("0")
    @Column(name = "MissileImpactOffset2", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float missileImpactOffset2;

    @ColumnDefault("0")
    @Column(name = "MissileImpactOffset3", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float missileImpactOffset3;

    @ColumnDefault("'0'")
    @Column(name = "AnimEventSoundID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long animEventSoundID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "MissileAttachment", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte missileAttachment;

    @ColumnDefault("0")
    @Column(name = "MissileDestinationAttachment", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE, signed = true)
    private Byte missileDestinationAttachment;

    @ColumnDefault("'0'")
    @Column(name = "MissileCastPositionerID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Long missileCastPositionerID;

    @ColumnDefault("'0'")
    @Column(name = "MissileImpactPositionerID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Long missileImpactPositionerID;

    @ColumnDefault("0")
    @Column(name = "MissileTargetingKit", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer missileTargetingKit;

    @ColumnDefault("'0'")
    @Column(name = "HostileSpellVisualID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Long hostileSpellVisualID;

    @ColumnDefault("'0'")
    @Column(name = "CasterSpellVisualID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Long casterSpellVisualID;

    @ColumnDefault("'0'")
    @Column(name = "SpellVisualMissileSetID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Integer spellVisualMissileSetID;

    @ColumnDefault("'0'")
    @Column(name = "DamageNumberDelay", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Integer damageNumberDelay;

    @ColumnDefault("'0'")
    @Column(name = "LowViolenceSpellVisualID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT)
    private Long lowViolenceSpellVisualID;

    @ColumnDefault("'0'")
    @Column(name = "RaidSpellVisualMissileSetID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.INT)
    private Long raidSpellVisualMissileSetID;

    @ColumnDefault("0")
    @Column(name = "ReducedUnexpectedCameraMovementSpellVisualID", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.INT, signed = true)
    private Integer reducedUnexpectedCameraMovementSpellVisualID;

    @ColumnDefault("'0'")
    @Column(name = "AreaModel", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT)
    private Integer areaModel;

    @ColumnDefault("0")
    @Column(name = "HasMissile", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE, signed = true)
    private Byte hasMissile;

}