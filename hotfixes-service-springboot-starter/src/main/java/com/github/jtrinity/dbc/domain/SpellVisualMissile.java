package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
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
@ToString
@IdClass(DB2Id.class)
@Entity
@Table(name = "spell_visual_missile")
@Db2File(name = "SpellVisualMissile.db2", layoutHash = 0x00BA67A5, indexField = 12, parentIndexField = 15)
public class SpellVisualMissile implements DbcEntity {

    @Column(name = "FollowGroundHeight")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT, signed = true)
    private Integer followGroundHeight;


    @Column(name = "FollowGroundDropSpeed")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer followGroundDropSpeed;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer flags;


    @Column(name = "CastOffset1")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float castOffset1;


    @Column(name = "CastOffset2")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float castOffset2;


    @Column(name = "CastOffset3")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float castOffset3;


    @Column(name = "ImpactOffset1")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float impactOffset1;


    @Column(name = "ImpactOffset2")
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float impactOffset2;


    @Column(name = "ImpactOffset3")
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float impactOffset3;


    @Column(name = "SpellVisualEffectNameID")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short spellVisualEffectNameID;


    @Column(name = "CastPositionerID")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT)
    private Short castPositionerID;


    @Column(name = "ImpactPositionerID")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Short impactPositionerID;


    @Column(name = "FollowGroundApproach")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Short followGroundApproach;


    @Column(name = "SpellMissileMotionID")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short spellMissileMotionID;


    @Column(name = "Attachment")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE, signed = true)
    private Byte attachment;


    @Column(name = "DestinationAttachment")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE, signed = true)
    private Byte destinationAttachment;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SoundEntriesID")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT)
    private Integer soundEntriesID;


    @Column(name = "AnimKitID")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT)
    private Integer animKitID;


    @Column(name = "SpellVisualMissileSetID")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT)
    private Short spellVisualMissileSetID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
