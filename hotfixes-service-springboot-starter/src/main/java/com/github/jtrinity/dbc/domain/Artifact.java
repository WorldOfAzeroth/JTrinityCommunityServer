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
@Table(name = "artifact")
@Db2File(name = "Artifact.db2", layoutHash = 0x76CF31A8)
public class Artifact implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "UiBarOverlayColor")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer uiBarOverlayColor;


    @Column(name = "UiBarBackgroundColor")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer uiBarBackgroundColor;


    @Column(name = "UiNameColor")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer uiNameColor;


    @Column(name = "UiTextureKitID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short uiTextureKitID;


    @Column(name = "ChrSpecializationID")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short chrSpecializationID;


    @Column(name = "ArtifactCategoryID")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte artifactCategoryID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "UiModelSceneID")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Integer uiModelSceneID;


    @Column(name = "SpellVisualKitID")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Integer spellVisualKitID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
