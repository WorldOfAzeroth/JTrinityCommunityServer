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
@Table(name = "artifact")
public class Artifact {
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
    @Column(name = "UiTextureKitID", columnDefinition = "smallint UNSIGNED not null")
    private Integer uiTextureKitID;

    @ColumnDefault("0")
    @Column(name = "UiNameColor", nullable = false)
    private Integer uiNameColor;

    @ColumnDefault("0")
    @Column(name = "UiBarOverlayColor", nullable = false)
    private Integer uiBarOverlayColor;

    @ColumnDefault("0")
    @Column(name = "UiBarBackgroundColor", nullable = false)
    private Integer uiBarBackgroundColor;

    @ColumnDefault("'0'")
    @Column(name = "ChrSpecializationID", columnDefinition = "smallint UNSIGNED not null")
    private Integer chrSpecializationID;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "ArtifactCategoryID", columnDefinition = "tinyint UNSIGNED not null")
    private Short artifactCategoryID;

    @ColumnDefault("'0'")
    @Column(name = "UiModelSceneID", columnDefinition = "int UNSIGNED not null")
    private Long uiModelSceneID;

    @ColumnDefault("'0'")
    @Column(name = "SpellVisualKitID", columnDefinition = "int UNSIGNED not null")
    private Long spellVisualKitID;

}