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
@Table(name = "ui_map")
@Db2File(name = "UiMap.db2", fileDataId = 1957206, layoutHash = 0x8B3C7011, indexField = 1, parentIndexField = 2)
public class UiMap {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private String name;

    @ColumnDefault("0")
    @Column(name = "ParentUiMapID", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer parentUiMapID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "System", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE, signed = true)
    private Byte system;

    @ColumnDefault("'0'")
    @Column(name = "Type", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Short type;

    @ColumnDefault("0")
    @Column(name = "BountySetID", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer bountySetID;

    @ColumnDefault("'0'")
    @Column(name = "BountyDisplayLocation", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long bountyDisplayLocation;

    @ColumnDefault("0")
    @Column(name = "VisibilityPlayerConditionID2", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer visibilityPlayerConditionID2;

    @ColumnDefault("0")
    @Column(name = "VisibilityPlayerConditionID", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer visibilityPlayerConditionID;

    @ColumnDefault("0")
    @Column(name = "HelpTextPosition", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE, signed = true)
    private Byte helpTextPosition;

    @ColumnDefault("0")
    @Column(name = "BkgAtlasID", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer bkgAtlasID;

    @ColumnDefault("'0'")
    @Column(name = "AlternateUiMapGroup", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Long alternateUiMapGroup;

    @ColumnDefault("'0'")
    @Column(name = "ContentTuningID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Long contentTuningID;

}