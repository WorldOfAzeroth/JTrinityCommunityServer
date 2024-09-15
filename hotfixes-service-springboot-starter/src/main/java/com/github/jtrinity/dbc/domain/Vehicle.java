package com.github.jtrinity.dbc.domain;

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
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "vehicle")
@Db2File(name = "Vehicle.db2", layoutHash = 0x57BE2AC6)
public class Vehicle implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private  Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "FlagsB", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer flagsB;

    @ColumnDefault("0")
    @Column(name = "TurnSpeed", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float turnSpeed;

    @ColumnDefault("0")
    @Column(name = "PitchSpeed", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float pitchSpeed;

    @ColumnDefault("0")
    @Column(name = "PitchMin", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float pitchMin;

    @ColumnDefault("0")
    @Column(name = "PitchMax", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float pitchMax;

    @ColumnDefault("0")
    @Column(name = "MouseLookOffsetPitch", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float mouseLookOffsetPitch;

    @ColumnDefault("0")
    @Column(name = "CameraFadeDistScalarMin", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float cameraFadeDistScalarMin;

    @ColumnDefault("0")
    @Column(name = "CameraFadeDistScalarMax", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float cameraFadeDistScalarMax;

    @ColumnDefault("0")
    @Column(name = "CameraPitchOffset", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float cameraPitchOffset;

    @ColumnDefault("0")
    @Column(name = "FacingLimitRight", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float facingLimitRight;

    @ColumnDefault("0")
    @Column(name = "FacingLimitLeft", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.FLOAT)
    private Float facingLimitLeft;

    @ColumnDefault("0")
    @Column(name = "CameraYawOffset", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.FLOAT)
    private Float cameraYawOffset;

    @ColumnDefault("'0'")
    @Column(name = "VehicleUIIndicatorID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Integer vehicleUIIndicatorID;

    @ColumnDefault("0")
    @Column(name = "MissileTargetingID", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.INT, signed = true)
    private Integer missileTargetingID;

    @ColumnDefault("'0'")
    @Column(name = "VehiclePOITypeID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Integer vehiclePOITypeID;

    @ColumnDefault("0")
    @Column(name = "UiLocomotionType", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.INT, signed = true)
    private Integer uiLocomotionType;

    @ColumnDefault("'0'")
    @Column(name = "SeatID1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT)
    private Integer seatID1;

    @ColumnDefault("'0'")
    @Column(name = "SeatID2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT)
    private Integer seatID2;

    @ColumnDefault("'0'")
    @Column(name = "SeatID3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT)
    private Integer seatID3;

    @ColumnDefault("'0'")
    @Column(name = "SeatID4", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT)
    private Integer seatID4;

    @ColumnDefault("'0'")
    @Column(name = "SeatID5", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 22, type = Db2Type.SHORT)
    private Integer seatID5;

    @ColumnDefault("'0'")
    @Column(name = "SeatID6", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 23, type = Db2Type.SHORT)
    private Integer seatID6;

    @ColumnDefault("'0'")
    @Column(name = "SeatID7", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 24, type = Db2Type.SHORT)
    private Integer seatID7;

    @ColumnDefault("'0'")
    @Column(name = "SeatID8", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 25, type = Db2Type.SHORT)
    private Integer seatID8;

    @ColumnDefault("'0'")
    @Column(name = "PowerDisplayID1", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 26, type = Db2Type.SHORT)
    private Integer powerDisplayID1;

    @ColumnDefault("'0'")
    @Column(name = "PowerDisplayID2", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 27, type = Db2Type.SHORT)
    private Integer powerDisplayID2;

    @ColumnDefault("'0'")
    @Column(name = "PowerDisplayID3", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 28, type = Db2Type.SHORT)
    private Integer powerDisplayID3;

}