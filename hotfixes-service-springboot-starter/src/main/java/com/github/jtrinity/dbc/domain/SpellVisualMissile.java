package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2File;
import com.github.jtrinity.dbc.db2.Db2Type;

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
@Db2File(name = "SpellVisualMissile.db2", layoutHash = 0xC15741C9, indexField = 2, parentIndexField = 15)
public class SpellVisualMissile implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private  Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "CastOffset1", nullable = false)
    @Db2Field(fieldIndex = 0, type = Db2Type.FLOAT)
    private Float castOffset1;

    @ColumnDefault("0")
    @Column(name = "CastOffset2", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float castOffset2;

    @ColumnDefault("0")
    @Column(name = "CastOffset3", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float castOffset3;

    @ColumnDefault("0")
    @Column(name = "ImpactOffset1", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float impactOffset1;

    @ColumnDefault("0")
    @Column(name = "ImpactOffset2", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float impactOffset2;

    @ColumnDefault("0")
    @Column(name = "ImpactOffset3", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float impactOffset3;

    @ColumnDefault("'0'")
    @Column(name = "SpellVisualEffectNameID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Integer spellVisualEffectNameID;

    @ColumnDefault("'0'")
    @Column(name = "SoundEntriesID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Long soundEntriesID;

    @ColumnDefault("0")
    @Column(name = "Attachment", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte attachment;

    @ColumnDefault("0")
    @Column(name = "DestinationAttachment", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE, signed = true)
    private Byte destinationAttachment;

    @ColumnDefault("'0'")
    @Column(name = "CastPositionerID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Integer castPositionerID;

    @ColumnDefault("'0'")
    @Column(name = "ImpactPositionerID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Integer impactPositionerID;

    @ColumnDefault("0")
    @Column(name = "FollowGroundHeight", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer followGroundHeight;

    @ColumnDefault("'0'")
    @Column(name = "FollowGroundDropSpeed", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Long followGroundDropSpeed;

    @ColumnDefault("'0'")
    @Column(name = "FollowGroundApproach", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Integer followGroundApproach;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Long flags;

    @ColumnDefault("'0'")
    @Column(name = "SpellMissileMotionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Integer spellMissileMotionID;

    @ColumnDefault("'0'")
    @Column(name = "AnimKitID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT)
    private Long animKitID;

    @ColumnDefault("'0'")
    @Column(name = "SpellVisualMissileSetID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.INT)
    private Long spellVisualMissileSetID;

}