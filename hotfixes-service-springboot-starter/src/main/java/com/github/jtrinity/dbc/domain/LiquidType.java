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
@Table(name = "liquid_type")
@Db2File(name = "LiquidType.db2", layoutHash = 0x3313BBF3)
public class LiquidType implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String name;


    @Column(name = "Texture1")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING_NOT_LOCALIZED)
    private String texture1;


    @Column(name = "Texture2")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING_NOT_LOCALIZED)
    private String texture2;


    @Column(name = "Texture3")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING_NOT_LOCALIZED)
    private String texture3;


    @Column(name = "Texture4")
    @Db2Field(fieldIndex = 5, type = Db2Type.STRING_NOT_LOCALIZED)
    private String texture4;


    @Column(name = "Texture5")
    @Db2Field(fieldIndex = 6, type = Db2Type.STRING_NOT_LOCALIZED)
    private String texture5;


    @Column(name = "Texture6")
    @Db2Field(fieldIndex = 7, type = Db2Type.STRING_NOT_LOCALIZED)
    private String texture6;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer spellID;


    @Column(name = "MaxDarkenDepth")
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float maxDarkenDepth;


    @Column(name = "FogDarkenIntensity")
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float fogDarkenIntensity;


    @Column(name = "AmbDarkenIntensity")
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float ambDarkenIntensity;


    @Column(name = "DirDarkenIntensity")
    @Db2Field(fieldIndex = 12, type = Db2Type.FLOAT)
    private Float dirDarkenIntensity;


    @Column(name = "ParticleScale")
    @Db2Field(fieldIndex = 13, type = Db2Type.FLOAT)
    private Float particleScale;


    @Column(name = "Color1")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer color1;


    @Column(name = "Color2")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer color2;


    @Column(name = "Float1")
    @Db2Field(fieldIndex = 16, type = Db2Type.FLOAT)
    private Float float1;


    @Column(name = "Float2")
    @Db2Field(fieldIndex = 17, type = Db2Type.FLOAT)
    private Float float2;


    @Column(name = "Float3")
    @Db2Field(fieldIndex = 18, type = Db2Type.FLOAT)
    private Float float3;


    @Column(name = "Float4")
    @Db2Field(fieldIndex = 19, type = Db2Type.FLOAT)
    private Float float4;


    @Column(name = "Float5")
    @Db2Field(fieldIndex = 20, type = Db2Type.FLOAT)
    private Float float5;


    @Column(name = "Float6")
    @Db2Field(fieldIndex = 21, type = Db2Type.FLOAT)
    private Float float6;


    @Column(name = "Float7")
    @Db2Field(fieldIndex = 22, type = Db2Type.FLOAT)
    private Float float7;


    @Column(name = "Float8")
    @Db2Field(fieldIndex = 23, type = Db2Type.FLOAT)
    private Float float8;


    @Column(name = "Float9")
    @Db2Field(fieldIndex = 24, type = Db2Type.FLOAT)
    private Float float9;


    @Column(name = "Float10")
    @Db2Field(fieldIndex = 25, type = Db2Type.FLOAT)
    private Float float10;


    @Column(name = "Float11")
    @Db2Field(fieldIndex = 26, type = Db2Type.FLOAT)
    private Float float11;


    @Column(name = "Float12")
    @Db2Field(fieldIndex = 27, type = Db2Type.FLOAT)
    private Float float12;


    @Column(name = "Float13")
    @Db2Field(fieldIndex = 28, type = Db2Type.FLOAT)
    private Float float13;


    @Column(name = "Float14")
    @Db2Field(fieldIndex = 29, type = Db2Type.FLOAT)
    private Float float14;


    @Column(name = "Float15")
    @Db2Field(fieldIndex = 30, type = Db2Type.FLOAT)
    private Float float15;


    @Column(name = "Float16")
    @Db2Field(fieldIndex = 31, type = Db2Type.FLOAT)
    private Float float16;


    @Column(name = "Float17")
    @Db2Field(fieldIndex = 32, type = Db2Type.FLOAT)
    private Float float17;


    @Column(name = "Float18")
    @Db2Field(fieldIndex = 33, type = Db2Type.FLOAT)
    private Float float18;


    @Column(name = "Int1")
    @Db2Field(fieldIndex = 34, type = Db2Type.INT)
    private Integer int1;


    @Column(name = "Int2")
    @Db2Field(fieldIndex = 35, type = Db2Type.INT)
    private Integer int2;


    @Column(name = "Int3")
    @Db2Field(fieldIndex = 36, type = Db2Type.INT)
    private Integer int3;


    @Column(name = "Int4")
    @Db2Field(fieldIndex = 37, type = Db2Type.INT)
    private Integer int4;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 38, type = Db2Type.SHORT)
    private Short flags;


    @Column(name = "LightID")
    @Db2Field(fieldIndex = 39, type = Db2Type.SHORT)
    private Short lightID;


    @Column(name = "SoundBank")
    @Db2Field(fieldIndex = 40, type = Db2Type.BYTE)
    private Byte soundBank;


    @Column(name = "ParticleMovement")
    @Db2Field(fieldIndex = 41, type = Db2Type.BYTE)
    private Byte particleMovement;


    @Column(name = "ParticleTexSlots")
    @Db2Field(fieldIndex = 42, type = Db2Type.BYTE)
    private Byte particleTexSlots;


    @Column(name = "MaterialID")
    @Db2Field(fieldIndex = 43, type = Db2Type.BYTE)
    private Byte materialID;


    @Column(name = "FrameCountTexture1")
    @Db2Field(fieldIndex = 44, type = Db2Type.BYTE)
    private Byte frameCountTexture1;


    @Column(name = "FrameCountTexture2")
    @Db2Field(fieldIndex = 45, type = Db2Type.BYTE)
    private Byte frameCountTexture2;


    @Column(name = "FrameCountTexture3")
    @Db2Field(fieldIndex = 46, type = Db2Type.BYTE)
    private Byte frameCountTexture3;


    @Column(name = "FrameCountTexture4")
    @Db2Field(fieldIndex = 47, type = Db2Type.BYTE)
    private Byte frameCountTexture4;


    @Column(name = "FrameCountTexture5")
    @Db2Field(fieldIndex = 48, type = Db2Type.BYTE)
    private Byte frameCountTexture5;


    @Column(name = "FrameCountTexture6")
    @Db2Field(fieldIndex = 49, type = Db2Type.BYTE)
    private Byte frameCountTexture6;


    @Column(name = "SoundID")
    @Db2Field(fieldIndex = 50, type = Db2Type.INT)
    private Integer soundID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
