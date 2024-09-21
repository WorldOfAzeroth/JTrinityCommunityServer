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
@Table(name = "transmog_set")
@Db2File(name = "TransmogSet.db2", layoutHash = 0xBEDFD7D1, indexField = 4, parentIndexField = 1)
public class TransmogSet implements DbcEntity {

    @Column(name = "Name")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "ParentTransmogSetID")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Short parentTransmogSetID;


    @Column(name = "UiOrder")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short uiOrder;


    @Column(name = "ExpansionID")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte expansionID;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer flags;


    @Column(name = "TrackingQuestID")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer trackingQuestID;


    @Column(name = "ClassMask")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer classMask;


    @Column(name = "ItemNameDescriptionID")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer itemNameDescriptionID;


    @Column(name = "TransmogSetGroupID")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Integer transmogSetGroupID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
