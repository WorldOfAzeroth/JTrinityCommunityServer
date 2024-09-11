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
@Table(name = "gameobject_art_kit")
public class GameobjectArtKit {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "AttachModelFileID", nullable = false)
    private Integer attachModelFileID;

    @ColumnDefault("0")
    @Column(name = "TextureVariationFileID1", nullable = false)
    private Integer textureVariationFileID1;

    @ColumnDefault("0")
    @Column(name = "TextureVariationFileID2", nullable = false)
    private Integer textureVariationFileID2;

    @ColumnDefault("0")
    @Column(name = "TextureVariationFileID3", nullable = false)
    private Integer textureVariationFileID3;

}