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
@Table(name = "liquid_type")
@Db2File(name = "LiquidType.db2", layoutHash = 0xAFFFC9E0)
public class LiquidType implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String name;

    @Lob
    @Column(name = "Texture1")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING_NOT_LOCALIZED)
    private String texture1;

    @Lob
    @Column(name = "Texture2")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING_NOT_LOCALIZED)
    private String texture2;

    @Lob
    @Column(name = "Texture3")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING_NOT_LOCALIZED)
    private String texture3;

    @Lob
    @Column(name = "Texture4")
    @Db2Field(fieldIndex = 5, type = Db2Type.STRING_NOT_LOCALIZED)
    private String texture4;

    @Lob
    @Column(name = "Texture5")
    @Db2Field(fieldIndex = 6, type = Db2Type.STRING_NOT_LOCALIZED)
    private String texture5;

    @Lob
    @Column(name = "Texture6")
    @Db2Field(fieldIndex = 7, type = Db2Type.STRING_NOT_LOCALIZED)
    private String texture6;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "SoundBank", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Short soundBank;

    @ColumnDefault("'0'")
    @Column(name = "SoundID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long soundID;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Long spellID;

    @ColumnDefault("0")
    @Column(name = "MaxDarkenDepth", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.FLOAT)
    private Float maxDarkenDepth;

    @ColumnDefault("0")
    @Column(name = "FogDarkenIntensity", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.FLOAT)
    private Float fogDarkenIntensity;

    @ColumnDefault("0")
    @Column(name = "AmbDarkenIntensity", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.FLOAT)
    private Float ambDarkenIntensity;

    @ColumnDefault("0")
    @Column(name = "DirDarkenIntensity", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.FLOAT)
    private Float dirDarkenIntensity;

    @ColumnDefault("'0'")
    @Column(name = "LightID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Integer lightID;

    @ColumnDefault("0")
    @Column(name = "ParticleScale", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.FLOAT)
    private Float particleScale;

    @ColumnDefault("'0'")
    @Column(name = "ParticleMovement", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.BYTE)
    private Short particleMovement;

    @ColumnDefault("'0'")
    @Column(name = "ParticleTexSlots", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.BYTE)
    private Short particleTexSlots;

    @ColumnDefault("'0'")
    @Column(name = "MaterialID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.BYTE)
    private Short materialID;

    @ColumnDefault("0")
    @Column(name = "MinimapStaticCol", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.INT, signed = true)
    private Integer minimapStaticCol;

    @ColumnDefault("'0'")
    @Column(name = "FrameCountTexture1", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Short frameCountTexture1;

    @ColumnDefault("'0'")
    @Column(name = "FrameCountTexture2", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 23, type = Db2Type.BYTE)
    private Short frameCountTexture2;

    @ColumnDefault("'0'")
    @Column(name = "FrameCountTexture3", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 24, type = Db2Type.BYTE)
    private Short frameCountTexture3;

    @ColumnDefault("'0'")
    @Column(name = "FrameCountTexture4", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Short frameCountTexture4;

    @ColumnDefault("'0'")
    @Column(name = "FrameCountTexture5", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE)
    private Short frameCountTexture5;

    @ColumnDefault("'0'")
    @Column(name = "FrameCountTexture6", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 27, type = Db2Type.BYTE)
    private Short frameCountTexture6;

    @ColumnDefault("0")
    @Column(name = "Color1", nullable = false)
    @Db2Field(fieldIndex = 28, type = Db2Type.INT, signed = true)
    private Integer color1;

    @ColumnDefault("0")
    @Column(name = "Color2", nullable = false)
    @Db2Field(fieldIndex = 29, type = Db2Type.INT, signed = true)
    private Integer color2;

    @ColumnDefault("0")
    @Column(name = "Float1", nullable = false)
    @Db2Field(fieldIndex = 30, type = Db2Type.FLOAT)
    private Float float1;

    @ColumnDefault("0")
    @Column(name = "Float2", nullable = false)
    @Db2Field(fieldIndex = 31, type = Db2Type.FLOAT)
    private Float float2;

    @ColumnDefault("0")
    @Column(name = "Float3", nullable = false)
    @Db2Field(fieldIndex = 32, type = Db2Type.FLOAT)
    private Float float3;

    @ColumnDefault("0")
    @Column(name = "`Float4`", nullable = false)
    @Db2Field(fieldIndex = 33, type = Db2Type.FLOAT)
    private Float float4;

    @ColumnDefault("0")
    @Column(name = "Float5", nullable = false)
    @Db2Field(fieldIndex = 34, type = Db2Type.FLOAT)
    private Float float5;

    @ColumnDefault("0")
    @Column(name = "Float6", nullable = false)
    @Db2Field(fieldIndex = 35, type = Db2Type.FLOAT)
    private Float float6;

    @ColumnDefault("0")
    @Column(name = "Float7", nullable = false)
    @Db2Field(fieldIndex = 36, type = Db2Type.FLOAT)
    private Float float7;

    @ColumnDefault("0")
    @Column(name = "`Float8`", nullable = false)
    @Db2Field(fieldIndex = 37, type = Db2Type.FLOAT)
    private Float float8;

    @ColumnDefault("0")
    @Column(name = "Float9", nullable = false)
    @Db2Field(fieldIndex = 38, type = Db2Type.FLOAT)
    private Float float9;

    @ColumnDefault("0")
    @Column(name = "Float10", nullable = false)
    @Db2Field(fieldIndex = 39, type = Db2Type.FLOAT)
    private Float float10;

    @ColumnDefault("0")
    @Column(name = "Float11", nullable = false)
    @Db2Field(fieldIndex = 40, type = Db2Type.FLOAT)
    private Float float11;

    @ColumnDefault("0")
    @Column(name = "Float12", nullable = false)
    @Db2Field(fieldIndex = 41, type = Db2Type.FLOAT)
    private Float float12;

    @ColumnDefault("0")
    @Column(name = "Float13", nullable = false)
    @Db2Field(fieldIndex = 42, type = Db2Type.FLOAT)
    private Float float13;

    @ColumnDefault("0")
    @Column(name = "Float14", nullable = false)
    @Db2Field(fieldIndex = 43, type = Db2Type.FLOAT)
    private Float float14;

    @ColumnDefault("0")
    @Column(name = "Float15", nullable = false)
    @Db2Field(fieldIndex = 44, type = Db2Type.FLOAT)
    private Float float15;

    @ColumnDefault("0")
    @Column(name = "Float16", nullable = false)
    @Db2Field(fieldIndex = 45, type = Db2Type.FLOAT)
    private Float float16;

    @ColumnDefault("0")
    @Column(name = "Float17", nullable = false)
    @Db2Field(fieldIndex = 46, type = Db2Type.FLOAT)
    private Float float17;

    @ColumnDefault("0")
    @Column(name = "Float18", nullable = false)
    @Db2Field(fieldIndex = 47, type = Db2Type.FLOAT)
    private Float float18;

    @ColumnDefault("'0'")
    @Column(name = "`Int1`", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 48, type = Db2Type.INT)
    private Long int1;

    @ColumnDefault("'0'")
    @Column(name = "`Int2`", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 49, type = Db2Type.INT)
    private Long int2;

    @ColumnDefault("'0'")
    @Column(name = "`Int3`", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 50, type = Db2Type.INT)
    private Long int3;

    @ColumnDefault("'0'")
    @Column(name = "`Int4`", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 51, type = Db2Type.INT)
    private Long int4;

    @ColumnDefault("0")
    @Column(name = "Coefficient1", nullable = false)
    @Db2Field(fieldIndex = 52, type = Db2Type.FLOAT)
    private Float coefficient1;

    @ColumnDefault("0")
    @Column(name = "Coefficient2", nullable = false)
    @Db2Field(fieldIndex = 53, type = Db2Type.FLOAT)
    private Float coefficient2;

    @ColumnDefault("0")
    @Column(name = "Coefficient3", nullable = false)
    @Db2Field(fieldIndex = 54, type = Db2Type.FLOAT)
    private Float coefficient3;

    @ColumnDefault("0")
    @Column(name = "Coefficient4", nullable = false)
    @Db2Field(fieldIndex = 55, type = Db2Type.FLOAT)
    private Float coefficient4;

}