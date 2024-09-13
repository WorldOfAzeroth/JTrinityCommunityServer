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
@Table(name = "transmog_set")
@Db2File(name = "TransmogSet.db2", fileDataId = 1376213, layoutHash = 0x12BC4D7F, indexField = 1, parentIndexField = 7)
public class TransmogSet {
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
    @Column(name = "ClassMask", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer classMask;

    @ColumnDefault("'0'")
    @Column(name = "TrackingQuestID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long trackingQuestID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "TransmogSetGroupID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Long transmogSetGroupID;

    @ColumnDefault("0")
    @Column(name = "ItemNameDescriptionID", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer itemNameDescriptionID;

    @ColumnDefault("'0'")
    @Column(name = "ParentTransmogSetID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Integer parentTransmogSetID;

    @ColumnDefault("'0'")
    @Column(name = "ExpansionID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Short expansionID;

    @ColumnDefault("0")
    @Column(name = "UiOrder", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT, signed = true)
    private Short uiOrder;

}