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
@Table(name = "spell_visual_effect_name")
@Db2File(name = "SpellVisualEffectName.db2", layoutHash = 0xB930A934)
public class SpellVisualEffectName implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "EffectRadius")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float effectRadius;


    @Column(name = "BaseMissileSpeed")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float baseMissileSpeed;


    @Column(name = "Scale")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float scale;


    @Column(name = "MinAllowedScale")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float minAllowedScale;


    @Column(name = "MaxAllowedScale")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float maxAllowedScale;


    @Column(name = "Alpha")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float alpha;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer flags;


    @Column(name = "GenericID")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer genericID;


    @Column(name = "TextureFileDataID")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer textureFileDataID;


    @Column(name = "Type")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Byte type;


    @Column(name = "ModelFileDataID")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer modelFileDataID;


    @Column(name = "RibbonQualityID")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Integer ribbonQualityID;


    @Column(name = "DissolveEffectID")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer dissolveEffectID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
