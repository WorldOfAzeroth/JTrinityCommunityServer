package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.common.LocalizedString;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2DataBind;
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
@Db2DataBind(name = "ArtifactAppearanceSet.db2", layoutHash = 0x53DFED74, indexField = 7, parentIndexField = 8, fields = {
        @Db2Field(name = "name", type = Db2Type.STRING),
        @Db2Field(name = "description", type = Db2Type.STRING),
        @Db2Field(name = "uiCameraID", type = Db2Type.SHORT),
        @Db2Field(name = "altHandUICameraID", type = Db2Type.SHORT),
        @Db2Field(name = "displayIndex", type = Db2Type.BYTE),
        @Db2Field(name = "forgeAttachmentOverride", type = Db2Type.BYTE, signed = true),
        @Db2Field(name = "flags", type = Db2Type.BYTE),
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "artifactID", type = Db2Type.BYTE)
})
public class ArtifactAppearanceSet implements DbcEntity {
    @Column(name = "Name")
    private LocalizedString name;

    @Column(name = "Description")
    private LocalizedString description;

    @Column(name = "UiCameraID")
    private Short uiCameraID;

    @Column(name = "AltHandUICameraID")
    private Short altHandUICameraID;

    @Column(name = "DisplayIndex")
    private Byte displayIndex;

    @Column(name = "ForgeAttachmentOverride")
    private Byte forgeAttachmentOverride;

    @Column(name = "Flags")
    private Byte flags;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "ArtifactID")
    private Short artifactID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
