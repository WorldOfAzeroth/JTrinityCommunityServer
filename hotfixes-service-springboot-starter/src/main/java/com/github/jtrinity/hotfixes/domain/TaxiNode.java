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
@Table(name = "taxi_nodes")
@Db2File(name = "TaxiNodes.db2", fileDataId = 1068100, layoutHash = 0x609F20BF, indexField = 4, parentIndexField = 5)
public class TaxiNode {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
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
    @Column(name = "PosX", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float posX;

    @ColumnDefault("0")
    @Column(name = "PosY", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float posY;

    @ColumnDefault("0")
    @Column(name = "PosZ", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float posZ;

    @ColumnDefault("0")
    @Column(name = "MapOffsetX", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float mapOffsetX;

    @ColumnDefault("0")
    @Column(name = "MapOffsetY", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float mapOffsetY;

    @ColumnDefault("0")
    @Column(name = "FlightMapOffsetX", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float flightMapOffsetX;

    @ColumnDefault("0")
    @Column(name = "FlightMapOffsetY", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float flightMapOffsetY;

    @ColumnDefault("'0'")
    @Column(name = "ContinentID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Long continentID;

    @ColumnDefault("'0'")
    @Column(name = "ConditionID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long conditionID;

    @ColumnDefault("'0'")
    @Column(name = "CharacterBitNumber", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT)
    private Integer characterBitNumber;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "UiTextureKitID", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer uiTextureKitID;

    @ColumnDefault("0")
    @Column(name = "Facing", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.FLOAT)
    private Float facing;

    @ColumnDefault("'0'")
    @Column(name = "SpecialIconConditionID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Long specialIconConditionID;

    @ColumnDefault("'0'")
    @Column(name = "VisibilityConditionID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Long visibilityConditionID;

    @ColumnDefault("0")
    @Column(name = "MountCreatureID1", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.INT, signed = true)
    private Integer mountCreatureID1;

    @ColumnDefault("0")
    @Column(name = "MountCreatureID2", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.INT, signed = true)
    private Integer mountCreatureID2;

}