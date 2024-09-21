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
@Table(name = "area_trigger")
@Db2File(name = "AreaTrigger.db2", layoutHash = 0x378573E8, indexField = 14, parentIndexField = 6)
public class AreaTrigger implements DbcEntity {

    @Column(name = "PosX")
    @Db2Field(fieldIndex = 0, type = Db2Type.FLOAT)
    private Float posX;


    @Column(name = "PosY")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float posY;


    @Column(name = "PosZ")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float posZ;


    @Column(name = "Radius")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float radius;


    @Column(name = "BoxLength")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float boxLength;


    @Column(name = "BoxWidth")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float boxWidth;


    @Column(name = "BoxHeight")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float boxHeight;


    @Column(name = "BoxYaw")
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float boxYaw;


    @Column(name = "ContinentID")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT, signed = true)
    private Short continentID;


    @Column(name = "PhaseID")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT, signed = true)
    private Short phaseID;


    @Column(name = "PhaseGroupID")
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT, signed = true)
    private Short phaseGroupID;


    @Column(name = "ShapeID")
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT, signed = true)
    private Short shapeID;


    @Column(name = "AreaTriggerActionSetID")
    @Db2Field(fieldIndex = 12, type = Db2Type.SHORT, signed = true)
    private Short areaTriggerActionSetID;


    @Column(name = "PhaseUseFlags")
    @Db2Field(fieldIndex = 13, type = Db2Type.BYTE, signed = true)
    private Byte phaseUseFlags;


    @Column(name = "ShapeType")
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE, signed = true)
    private Byte shapeType;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 15, type = Db2Type.BYTE, signed = true)
    private Byte flags;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
