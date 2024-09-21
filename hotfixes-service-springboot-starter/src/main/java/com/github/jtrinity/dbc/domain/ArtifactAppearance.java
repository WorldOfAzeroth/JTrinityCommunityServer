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
@Table(name = "artifact_appearance")
@Db2File(name = "ArtifactAppearance.db2", layoutHash = 0xAEED7395, indexField = 11, parentIndexField = 5)
public class ArtifactAppearance implements DbcEntity {

    @Column(name = "Name")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "UiSwatchColor")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer uiSwatchColor;


    @Column(name = "UiModelSaturation")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float uiModelSaturation;


    @Column(name = "UiModelOpacity")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float uiModelOpacity;


    @Column(name = "OverrideShapeshiftDisplayID")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer overrideShapeshiftDisplayID;


    @Column(name = "ArtifactAppearanceSetID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short artifactAppearanceSetID;


    @Column(name = "UiCameraID")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short uiCameraID;


    @Column(name = "DisplayIndex")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte displayIndex;


    @Column(name = "ItemAppearanceModifierID")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte itemAppearanceModifierID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "OverrideShapeshiftFormID")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE)
    private Byte overrideShapeshiftFormID;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Integer id;


    @Column(name = "UnlockPlayerConditionID")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Integer unlockPlayerConditionID;


    @Column(name = "UiItemAppearanceID")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Integer uiItemAppearanceID;


    @Column(name = "UiAltItemAppearanceID")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Integer uiAltItemAppearanceID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
