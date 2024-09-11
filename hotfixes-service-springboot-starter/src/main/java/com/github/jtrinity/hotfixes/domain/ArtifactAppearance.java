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
@Table(name = "artifact_appearance")
public class ArtifactAppearance {
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

    @ColumnDefault("'0'")
    @Column(name = "ArtifactAppearanceSetID", columnDefinition = "smallint UNSIGNED not null")
    private Integer artifactAppearanceSetID;

    @ColumnDefault("'0'")
    @Column(name = "DisplayIndex", columnDefinition = "tinyint UNSIGNED not null")
    private Short displayIndex;

    @ColumnDefault("'0'")
    @Column(name = "UnlockPlayerConditionID", columnDefinition = "int UNSIGNED not null")
    private Long unlockPlayerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "ItemAppearanceModifierID", columnDefinition = "tinyint UNSIGNED not null")
    private Short itemAppearanceModifierID;

    @ColumnDefault("0")
    @Column(name = "UiSwatchColor", nullable = false)
    private Integer uiSwatchColor;

    @ColumnDefault("0")
    @Column(name = "UiModelSaturation", nullable = false)
    private Float uiModelSaturation;

    @ColumnDefault("0")
    @Column(name = "UiModelOpacity", nullable = false)
    private Float uiModelOpacity;

    @ColumnDefault("'0'")
    @Column(name = "OverrideShapeshiftFormID", columnDefinition = "tinyint UNSIGNED not null")
    private Short overrideShapeshiftFormID;

    @ColumnDefault("'0'")
    @Column(name = "OverrideShapeshiftDisplayID", columnDefinition = "int UNSIGNED not null")
    private Long overrideShapeshiftDisplayID;

    @ColumnDefault("'0'")
    @Column(name = "UiItemAppearanceID", columnDefinition = "int UNSIGNED not null")
    private Long uiItemAppearanceID;

    @ColumnDefault("'0'")
    @Column(name = "UiAltItemAppearanceID", columnDefinition = "int UNSIGNED not null")
    private Long uiAltItemAppearanceID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "UiCameraID", columnDefinition = "smallint UNSIGNED not null")
    private Integer uiCameraID;

}