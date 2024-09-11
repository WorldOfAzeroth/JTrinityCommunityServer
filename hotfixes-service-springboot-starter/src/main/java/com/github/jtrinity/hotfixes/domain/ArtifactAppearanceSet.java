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
@Table(name = "artifact_appearance_set")
public class ArtifactAppearanceSet {
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
    @Column(name = "Description")
    private String description;

    @ColumnDefault("'0'")
    @Column(name = "DisplayIndex", columnDefinition = "tinyint UNSIGNED not null")
    private Short displayIndex;

    @ColumnDefault("'0'")
    @Column(name = "UiCameraID", columnDefinition = "smallint UNSIGNED not null")
    private Integer uiCameraID;

    @ColumnDefault("'0'")
    @Column(name = "AltHandUICameraID", columnDefinition = "smallint UNSIGNED not null")
    private Integer altHandUICameraID;

    @ColumnDefault("0")
    @Column(name = "ForgeAttachmentOverride", nullable = false)
    private Byte forgeAttachmentOverride;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("'0'")
    @Column(name = "ArtifactID", columnDefinition = "int UNSIGNED not null")
    private Long artifactID;

}