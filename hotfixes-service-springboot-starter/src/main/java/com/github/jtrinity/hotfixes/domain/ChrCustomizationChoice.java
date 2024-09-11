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
@Table(name = "chr_customization_choice")
public class ChrCustomizationChoice {
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

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationOptionID", nullable = false)
    private Integer chrCustomizationOptionID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationReqID", nullable = false)
    private Integer chrCustomizationReqID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationVisReqID", nullable = false)
    private Integer chrCustomizationVisReqID;

    @ColumnDefault("'0'")
    @Column(name = "SortOrder", columnDefinition = "smallint UNSIGNED not null")
    private Integer sortOrder;

    @ColumnDefault("'0'")
    @Column(name = "UiOrderIndex", columnDefinition = "smallint UNSIGNED not null")
    private Integer uiOrderIndex;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "AddedInPatch", nullable = false)
    private Integer addedInPatch;

    @ColumnDefault("0")
    @Column(name = "SoundKitID", nullable = false)
    private Integer soundKitID;

    @ColumnDefault("0")
    @Column(name = "SwatchColor1", nullable = false)
    private Integer swatchColor1;

    @ColumnDefault("0")
    @Column(name = "SwatchColor2", nullable = false)
    private Integer swatchColor2;

}