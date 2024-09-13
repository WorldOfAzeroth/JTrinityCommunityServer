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
@Table(name = "chr_customization_choice")
@Db2File(name = "ChrCustomizationChoice.db2", fileDataId = 3450554, layoutHash = 0xAA548AE1, indexField = 1, parentIndexField = 2)
public class ChrCustomizationChoice {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private String name;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationOptionID", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer chrCustomizationOptionID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationReqID", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer chrCustomizationReqID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationVisReqID", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer chrCustomizationVisReqID;

    @ColumnDefault("'0'")
    @Column(name = "SortOrder", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Integer sortOrder;

    @ColumnDefault("'0'")
    @Column(name = "UiOrderIndex", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Integer uiOrderIndex;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "AddedInPatch", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer addedInPatch;

    @ColumnDefault("0")
    @Column(name = "SoundKitID", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer soundKitID;

    @ColumnDefault("0")
    @Column(name = "SwatchColor1", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer swatchColor1;

    @ColumnDefault("0")
    @Column(name = "SwatchColor2", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer swatchColor2;

}