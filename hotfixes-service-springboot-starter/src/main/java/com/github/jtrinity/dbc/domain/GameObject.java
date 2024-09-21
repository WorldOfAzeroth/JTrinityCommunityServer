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
@Table(name = "gameobjects")
@Db2File(name = "GameObjects.db2", layoutHash = 0x597E8643, indexField = 11, parentIndexField = 5)
public class GameObject implements DbcEntity {

    @Column(name = "Name")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "PosX")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float posX;


    @Column(name = "PosY")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float posY;


    @Column(name = "PosZ")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float posZ;


    @Column(name = "Rot1")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float rot1;


    @Column(name = "Rot2")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float rot2;


    @Column(name = "Rot3")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float rot3;


    @Column(name = "Rot4")
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float rot4;


    @Column(name = "Scale")
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float scale;


    @Column(name = "PropValue1")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer propValue1;


    @Column(name = "PropValue2")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer propValue2;


    @Column(name = "PropValue3")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer propValue3;


    @Column(name = "PropValue4")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer propValue4;


    @Column(name = "PropValue5")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer propValue5;


    @Column(name = "PropValue6")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT, signed = true)
    private Integer propValue6;


    @Column(name = "PropValue7")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer propValue7;


    @Column(name = "PropValue8")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer propValue8;


    @Column(name = "OwnerID")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Short ownerID;


    @Column(name = "DisplayID")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT)
    private Short displayID;


    @Column(name = "PhaseID")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT)
    private Short phaseID;


    @Column(name = "PhaseGroupID")
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT)
    private Short phaseGroupID;


    @Column(name = "PhaseUseFlags")
    @Db2Field(fieldIndex = 21, type = Db2Type.BYTE)
    private Byte phaseUseFlags;


    @Column(name = "TypeID")
    @Db2Field(fieldIndex = 22, type = Db2Type.BYTE)
    private Byte typeID;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 23, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
