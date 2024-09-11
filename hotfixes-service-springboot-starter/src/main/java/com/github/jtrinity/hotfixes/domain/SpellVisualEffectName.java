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
@Table(name = "spell_visual_effect_name")
public class SpellVisualEffectName {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ModelFileDataID", nullable = false)
    private Integer modelFileDataID;

    @ColumnDefault("0")
    @Column(name = "BaseMissileSpeed", nullable = false)
    private Float baseMissileSpeed;

    @ColumnDefault("0")
    @Column(name = "Scale", nullable = false)
    private Float scale;

    @ColumnDefault("0")
    @Column(name = "MinAllowedScale", nullable = false)
    private Float minAllowedScale;

    @ColumnDefault("0")
    @Column(name = "MaxAllowedScale", nullable = false)
    private Float maxAllowedScale;

    @ColumnDefault("0")
    @Column(name = "Alpha", nullable = false)
    private Float alpha;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "int UNSIGNED not null")
    private Long flags;

    @ColumnDefault("0")
    @Column(name = "TextureFileDataID", nullable = false)
    private Integer textureFileDataID;

    @ColumnDefault("0")
    @Column(name = "EffectRadius", nullable = false)
    private Float effectRadius;

    @ColumnDefault("'0'")
    @Column(name = "Type", columnDefinition = "int UNSIGNED not null")
    private Long type;

    @ColumnDefault("0")
    @Column(name = "GenericID", nullable = false)
    private Integer genericID;

    @ColumnDefault("'0'")
    @Column(name = "RibbonQualityID", columnDefinition = "int UNSIGNED not null")
    private Long ribbonQualityID;

    @ColumnDefault("0")
    @Column(name = "DissolveEffectID", nullable = false)
    private Integer dissolveEffectID;

    @ColumnDefault("0")
    @Column(name = "ModelPosition", nullable = false)
    private Integer modelPosition;

}