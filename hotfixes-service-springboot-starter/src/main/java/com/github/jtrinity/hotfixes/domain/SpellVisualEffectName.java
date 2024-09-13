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
@Table(name = "spell_visual_effect_name")
@Db2File(name = "SpellVisualEffectName.db2", fileDataId = 897948, layoutHash = 0x6F64D3DD)
public class SpellVisualEffectName {
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
    @Column(name = "ModelFileDataID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer modelFileDataID;

    @ColumnDefault("0")
    @Column(name = "BaseMissileSpeed", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float baseMissileSpeed;

    @ColumnDefault("0")
    @Column(name = "Scale", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float scale;

    @ColumnDefault("0")
    @Column(name = "MinAllowedScale", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float minAllowedScale;

    @ColumnDefault("0")
    @Column(name = "MaxAllowedScale", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float maxAllowedScale;

    @ColumnDefault("0")
    @Column(name = "Alpha", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float alpha;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long flags;

    @ColumnDefault("0")
    @Column(name = "TextureFileDataID", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer textureFileDataID;

    @ColumnDefault("0")
    @Column(name = "EffectRadius", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float effectRadius;

    @ColumnDefault("'0'")
    @Column(name = "Type", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long type;

    @ColumnDefault("0")
    @Column(name = "GenericID", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer genericID;

    @ColumnDefault("'0'")
    @Column(name = "RibbonQualityID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Long ribbonQualityID;

    @ColumnDefault("0")
    @Column(name = "DissolveEffectID", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer dissolveEffectID;

    @ColumnDefault("0")
    @Column(name = "ModelPosition", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer modelPosition;

}