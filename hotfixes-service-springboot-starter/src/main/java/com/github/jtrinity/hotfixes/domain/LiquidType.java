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
@Table(name = "liquid_type")
public class LiquidType {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @Lob
    @Column(name = "Texture1")
    private String texture1;

    @Lob
    @Column(name = "Texture2")
    private String texture2;

    @Lob
    @Column(name = "Texture3")
    private String texture3;

    @Lob
    @Column(name = "Texture4")
    private String texture4;

    @Lob
    @Column(name = "Texture5")
    private String texture5;

    @Lob
    @Column(name = "Texture6")
    private String texture6;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "smallint UNSIGNED not null")
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "SoundBank", columnDefinition = "tinyint UNSIGNED not null")
    private Short soundBank;

    @ColumnDefault("'0'")
    @Column(name = "SoundID", columnDefinition = "int UNSIGNED not null")
    private Long soundID;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

    @ColumnDefault("0")
    @Column(name = "MaxDarkenDepth", nullable = false)
    private Float maxDarkenDepth;

    @ColumnDefault("0")
    @Column(name = "FogDarkenIntensity", nullable = false)
    private Float fogDarkenIntensity;

    @ColumnDefault("0")
    @Column(name = "AmbDarkenIntensity", nullable = false)
    private Float ambDarkenIntensity;

    @ColumnDefault("0")
    @Column(name = "DirDarkenIntensity", nullable = false)
    private Float dirDarkenIntensity;

    @ColumnDefault("'0'")
    @Column(name = "LightID", columnDefinition = "smallint UNSIGNED not null")
    private Integer lightID;

    @ColumnDefault("0")
    @Column(name = "ParticleScale", nullable = false)
    private Float particleScale;

    @ColumnDefault("'0'")
    @Column(name = "ParticleMovement", columnDefinition = "tinyint UNSIGNED not null")
    private Short particleMovement;

    @ColumnDefault("'0'")
    @Column(name = "ParticleTexSlots", columnDefinition = "tinyint UNSIGNED not null")
    private Short particleTexSlots;

    @ColumnDefault("'0'")
    @Column(name = "MaterialID", columnDefinition = "tinyint UNSIGNED not null")
    private Short materialID;

    @ColumnDefault("0")
    @Column(name = "MinimapStaticCol", nullable = false)
    private Integer minimapStaticCol;

    @ColumnDefault("'0'")
    @Column(name = "FrameCountTexture1", columnDefinition = "tinyint UNSIGNED not null")
    private Short frameCountTexture1;

    @ColumnDefault("'0'")
    @Column(name = "FrameCountTexture2", columnDefinition = "tinyint UNSIGNED not null")
    private Short frameCountTexture2;

    @ColumnDefault("'0'")
    @Column(name = "FrameCountTexture3", columnDefinition = "tinyint UNSIGNED not null")
    private Short frameCountTexture3;

    @ColumnDefault("'0'")
    @Column(name = "FrameCountTexture4", columnDefinition = "tinyint UNSIGNED not null")
    private Short frameCountTexture4;

    @ColumnDefault("'0'")
    @Column(name = "FrameCountTexture5", columnDefinition = "tinyint UNSIGNED not null")
    private Short frameCountTexture5;

    @ColumnDefault("'0'")
    @Column(name = "FrameCountTexture6", columnDefinition = "tinyint UNSIGNED not null")
    private Short frameCountTexture6;

    @ColumnDefault("0")
    @Column(name = "Color1", nullable = false)
    private Integer color1;

    @ColumnDefault("0")
    @Column(name = "Color2", nullable = false)
    private Integer color2;

    @ColumnDefault("0")
    @Column(name = "Float1", nullable = false)
    private Float float1;

    @ColumnDefault("0")
    @Column(name = "Float2", nullable = false)
    private Float float2;

    @ColumnDefault("0")
    @Column(name = "Float3", nullable = false)
    private Float float3;

    @ColumnDefault("0")
    @Column(name = "`Float4`", nullable = false)
    private Float float4;

    @ColumnDefault("0")
    @Column(name = "Float5", nullable = false)
    private Float float5;

    @ColumnDefault("0")
    @Column(name = "Float6", nullable = false)
    private Float float6;

    @ColumnDefault("0")
    @Column(name = "Float7", nullable = false)
    private Float float7;

    @ColumnDefault("0")
    @Column(name = "`Float8`", nullable = false)
    private Float float8;

    @ColumnDefault("0")
    @Column(name = "Float9", nullable = false)
    private Float float9;

    @ColumnDefault("0")
    @Column(name = "Float10", nullable = false)
    private Float float10;

    @ColumnDefault("0")
    @Column(name = "Float11", nullable = false)
    private Float float11;

    @ColumnDefault("0")
    @Column(name = "Float12", nullable = false)
    private Float float12;

    @ColumnDefault("0")
    @Column(name = "Float13", nullable = false)
    private Float float13;

    @ColumnDefault("0")
    @Column(name = "Float14", nullable = false)
    private Float float14;

    @ColumnDefault("0")
    @Column(name = "Float15", nullable = false)
    private Float float15;

    @ColumnDefault("0")
    @Column(name = "Float16", nullable = false)
    private Float float16;

    @ColumnDefault("0")
    @Column(name = "Float17", nullable = false)
    private Float float17;

    @ColumnDefault("0")
    @Column(name = "Float18", nullable = false)
    private Float float18;

    @ColumnDefault("'0'")
    @Column(name = "`Int1`", columnDefinition = "int UNSIGNED not null")
    private Long int1;

    @ColumnDefault("'0'")
    @Column(name = "`Int2`", columnDefinition = "int UNSIGNED not null")
    private Long int2;

    @ColumnDefault("'0'")
    @Column(name = "`Int3`", columnDefinition = "int UNSIGNED not null")
    private Long int3;

    @ColumnDefault("'0'")
    @Column(name = "`Int4`", columnDefinition = "int UNSIGNED not null")
    private Long int4;

    @ColumnDefault("0")
    @Column(name = "Coefficient1", nullable = false)
    private Float coefficient1;

    @ColumnDefault("0")
    @Column(name = "Coefficient2", nullable = false)
    private Float coefficient2;

    @ColumnDefault("0")
    @Column(name = "Coefficient3", nullable = false)
    private Float coefficient3;

    @ColumnDefault("0")
    @Column(name = "Coefficient4", nullable = false)
    private Float coefficient4;

}