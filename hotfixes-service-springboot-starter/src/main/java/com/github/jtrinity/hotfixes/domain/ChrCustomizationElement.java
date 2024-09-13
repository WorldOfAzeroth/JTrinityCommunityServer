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
@Table(name = "chr_customization_element")
@Db2File(name = "ChrCustomizationElement.db2", fileDataId = 3512765, layoutHash = 0xE5D5E59C, indexField = 0)
public class ChrCustomizationElement {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationChoiceID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer chrCustomizationChoiceID;

    @ColumnDefault("0")
    @Column(name = "RelatedChrCustomizationChoiceID", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer relatedChrCustomizationChoiceID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationGeosetID", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer chrCustomizationGeosetID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationSkinnedModelID", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer chrCustomizationSkinnedModelID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationMaterialID", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer chrCustomizationMaterialID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationBoneSetID", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer chrCustomizationBoneSetID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationCondModelID", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer chrCustomizationCondModelID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationDisplayInfoID", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer chrCustomizationDisplayInfoID;

    @ColumnDefault("0")
    @Column(name = "ChrCustItemGeoModifyID", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer chrCustItemGeoModifyID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationVoiceID", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer chrCustomizationVoiceID;

    @ColumnDefault("0")
    @Column(name = "AnimKitID", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer animKitID;

    @ColumnDefault("0")
    @Column(name = "ParticleColorID", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer particleColorID;

    @ColumnDefault("0")
    @Column(name = "ChrCustGeoComponentLinkID", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer chrCustGeoComponentLinkID;

}