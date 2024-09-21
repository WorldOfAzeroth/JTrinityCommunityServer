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
@Table(name = "artifact_appearance_set")
@Db2File(name = "ArtifactAppearanceSet.db2", layoutHash = 0x53DFED74, indexField = 7, parentIndexField = 8)
public class ArtifactAppearanceSet implements DbcEntity {

    @Column(name = "Name")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "UiCameraID")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short uiCameraID;


    @Column(name = "AltHandUICameraID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short altHandUICameraID;


    @Column(name = "DisplayIndex")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte displayIndex;


    @Column(name = "ForgeAttachmentOverride")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte forgeAttachmentOverride;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte flags;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer id;


    @Column(name = "ArtifactID")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte artifactID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
