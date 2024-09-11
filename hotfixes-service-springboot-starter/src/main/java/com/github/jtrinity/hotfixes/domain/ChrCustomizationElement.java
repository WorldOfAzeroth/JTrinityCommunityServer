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
@Table(name = "chr_customization_element")
public class ChrCustomizationElement {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationChoiceID", nullable = false)
    private Integer chrCustomizationChoiceID;

    @ColumnDefault("0")
    @Column(name = "RelatedChrCustomizationChoiceID", nullable = false)
    private Integer relatedChrCustomizationChoiceID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationGeosetID", nullable = false)
    private Integer chrCustomizationGeosetID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationSkinnedModelID", nullable = false)
    private Integer chrCustomizationSkinnedModelID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationMaterialID", nullable = false)
    private Integer chrCustomizationMaterialID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationBoneSetID", nullable = false)
    private Integer chrCustomizationBoneSetID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationCondModelID", nullable = false)
    private Integer chrCustomizationCondModelID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationDisplayInfoID", nullable = false)
    private Integer chrCustomizationDisplayInfoID;

    @ColumnDefault("0")
    @Column(name = "ChrCustItemGeoModifyID", nullable = false)
    private Integer chrCustItemGeoModifyID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationVoiceID", nullable = false)
    private Integer chrCustomizationVoiceID;

    @ColumnDefault("0")
    @Column(name = "AnimKitID", nullable = false)
    private Integer animKitID;

    @ColumnDefault("0")
    @Column(name = "ParticleColorID", nullable = false)
    private Integer particleColorID;

    @ColumnDefault("0")
    @Column(name = "ChrCustGeoComponentLinkID", nullable = false)
    private Integer chrCustGeoComponentLinkID;

}