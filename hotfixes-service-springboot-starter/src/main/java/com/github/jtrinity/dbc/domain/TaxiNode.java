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
@Table(name = "taxi_nodes")
@Db2File(name = "TaxiNodes.db2", layoutHash = 0xB46C6A8B)
public class TaxiNode implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "PosX")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float posX;


    @Column(name = "PosY")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float posY;


    @Column(name = "PosZ")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float posZ;


    @Column(name = "MountCreatureID1")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer mountCreatureID1;


    @Column(name = "MountCreatureID2")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer mountCreatureID2;


    @Column(name = "MapOffsetX")
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float mapOffsetX;


    @Column(name = "MapOffsetY")
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float mapOffsetY;


    @Column(name = "Facing")
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float facing;


    @Column(name = "FlightMapOffsetX")
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float flightMapOffsetX;


    @Column(name = "FlightMapOffsetY")
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float flightMapOffsetY;


    @Column(name = "ContinentID")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT)
    private Short continentID;


    @Column(name = "ConditionID")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short conditionID;


    @Column(name = "CharacterBitNumber")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short characterBitNumber;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "UiTextureKitID")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer uiTextureKitID;


    @Column(name = "SpecialIconConditionID")
    @Db2Field(fieldIndex = 17, type = Db2Type.INT)
    private Integer specialIconConditionID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
