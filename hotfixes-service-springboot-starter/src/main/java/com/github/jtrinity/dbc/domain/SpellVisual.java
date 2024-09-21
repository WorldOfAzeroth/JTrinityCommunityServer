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
@Table(name = "spell_visual")
@Db2File(name = "SpellVisual.db2", layoutHash = 0x1C1301D2)
public class SpellVisual implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "MissileCastOffset1")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float missileCastOffset1;


    @Column(name = "MissileCastOffset2")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float missileCastOffset2;


    @Column(name = "MissileCastOffset3")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float missileCastOffset3;


    @Column(name = "MissileImpactOffset1")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float missileImpactOffset1;


    @Column(name = "MissileImpactOffset2")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float missileImpactOffset2;


    @Column(name = "MissileImpactOffset3")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float missileImpactOffset3;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer flags;


    @Column(name = "SpellVisualMissileSetID")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Short spellVisualMissileSetID;


    @Column(name = "MissileDestinationAttachment")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte missileDestinationAttachment;


    @Column(name = "MissileAttachment")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE, signed = true)
    private Byte missileAttachment;


    @Column(name = "MissileCastPositionerID")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Integer missileCastPositionerID;


    @Column(name = "MissileImpactPositionerID")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Integer missileImpactPositionerID;


    @Column(name = "MissileTargetingKit")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer missileTargetingKit;


    @Column(name = "AnimEventSoundID")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer animEventSoundID;


    @Column(name = "DamageNumberDelay")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Short damageNumberDelay;


    @Column(name = "HostileSpellVisualID")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer hostileSpellVisualID;


    @Column(name = "CasterSpellVisualID")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT, signed = true)
    private Integer casterSpellVisualID;


    @Column(name = "LowViolenceSpellVisualID")
    @Db2Field(fieldIndex = 18, type = Db2Type.INT, signed = true)
    private Integer lowViolenceSpellVisualID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
