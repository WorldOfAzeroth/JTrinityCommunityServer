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
@Table(name = "area_trigger")
@Db2File(name = "AreaTrigger.db2", fileDataId = 1354401, layoutHash = 0x0D7E8ED2, indexField = 2, parentIndexField = 3)
public class AreaTrigger {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Message")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private String message;

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
    @Column(name = "ContinentID", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT, signed = true)
    private Short continentID;

    @ColumnDefault("0")
    @Column(name = "PhaseUseFlags", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer phaseUseFlags;

    @ColumnDefault("0")
    @Column(name = "PhaseID", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT, signed = true)
    private Short phaseID;

    @ColumnDefault("0")
    @Column(name = "PhaseGroupID", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT, signed = true)
    private Short phaseGroupID;

    @ColumnDefault("0")
    @Column(name = "Radius", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float radius;

    @ColumnDefault("0")
    @Column(name = "BoxLength", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float boxLength;

    @ColumnDefault("0")
    @Column(name = "BoxWidth", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float boxWidth;

    @ColumnDefault("0")
    @Column(name = "BoxHeight", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.FLOAT)
    private Float boxHeight;

    @ColumnDefault("0")
    @Column(name = "BoxYaw", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.FLOAT)
    private Float boxYaw;

    @ColumnDefault("0")
    @Column(name = "ShapeType", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.BYTE, signed = true)
    private Byte shapeType;

    @ColumnDefault("0")
    @Column(name = "ShapeID", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT, signed = true)
    private Short shapeID;

    @ColumnDefault("0")
    @Column(name = "AreaTriggerActionSetID", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT, signed = true)
    private Short areaTriggerActionSetID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.BYTE, signed = true)
    private Byte flags;

}