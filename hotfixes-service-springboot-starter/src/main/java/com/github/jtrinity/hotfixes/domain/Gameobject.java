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
@Table(name = "gameobjects")
@Db2File(name = "GameObjects.db2", fileDataId = 3565753, layoutHash = 0x375C3387, parentIndexField = 0)
public class Gameobject {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
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
    @Column(name = "Rot1", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float rot1;

    @ColumnDefault("0")
    @Column(name = "Rot2", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float rot2;

    @ColumnDefault("0")
    @Column(name = "Rot3", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float rot3;

    @ColumnDefault("0")
    @Column(name = "Rot4", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float rot4;

    @ColumnDefault("'0'")
    @Column(name = "OwnerID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Integer ownerID;

    @ColumnDefault("'0'")
    @Column(name = "DisplayID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Long displayID;

    @ColumnDefault("0")
    @Column(name = "Scale", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float scale;

    @ColumnDefault("'0'")
    @Column(name = "TypeID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.BYTE)
    private Short typeID;

    @ColumnDefault("0")
    @Column(name = "PhaseUseFlags", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer phaseUseFlags;

    @ColumnDefault("'0'")
    @Column(name = "PhaseID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Integer phaseID;

    @ColumnDefault("'0'")
    @Column(name = "PhaseGroupID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Integer phaseGroupID;

    @ColumnDefault("0")
    @Column(name = "PropValue1", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.INT, signed = true)
    private Integer propValue1;

    @ColumnDefault("0")
    @Column(name = "PropValue2", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.INT, signed = true)
    private Integer propValue2;

    @ColumnDefault("0")
    @Column(name = "PropValue3", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.INT, signed = true)
    private Integer propValue3;

    @ColumnDefault("0")
    @Column(name = "PropValue4", nullable = false)
    @Db2Field(fieldIndex = 19, type = Db2Type.INT, signed = true)
    private Integer propValue4;

    @ColumnDefault("0")
    @Column(name = "PropValue5", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.INT, signed = true)
    private Integer propValue5;

    @ColumnDefault("0")
    @Column(name = "PropValue6", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.INT, signed = true)
    private Integer propValue6;

    @ColumnDefault("0")
    @Column(name = "PropValue7", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer propValue7;

    @ColumnDefault("0")
    @Column(name = "PropValue8", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer propValue8;

}