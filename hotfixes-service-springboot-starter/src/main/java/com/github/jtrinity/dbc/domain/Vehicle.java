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
@Table(name = "vehicle")
@Db2File(name = "Vehicle.db2", layoutHash = 0x1606C582)
public class Vehicle implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer flags;


    @Column(name = "TurnSpeed")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float turnSpeed;


    @Column(name = "PitchSpeed")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float pitchSpeed;


    @Column(name = "PitchMin")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float pitchMin;


    @Column(name = "PitchMax")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float pitchMax;


    @Column(name = "MouseLookOffsetPitch")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float mouseLookOffsetPitch;


    @Column(name = "CameraFadeDistScalarMin")
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float cameraFadeDistScalarMin;


    @Column(name = "CameraFadeDistScalarMax")
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float cameraFadeDistScalarMax;


    @Column(name = "CameraPitchOffset")
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float cameraPitchOffset;


    @Column(name = "FacingLimitRight")
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float facingLimitRight;


    @Column(name = "FacingLimitLeft")
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float facingLimitLeft;


    @Column(name = "CameraYawOffset")
    @Db2Field(fieldIndex = 12, type = Db2Type.FLOAT)
    private Float cameraYawOffset;


    @Column(name = "SeatID1")
    @Db2Field(fieldIndex = 13, type = Db2Type.SHORT)
    private Short seatID1;


    @Column(name = "SeatID2")
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT)
    private Short seatID2;


    @Column(name = "SeatID3")
    @Db2Field(fieldIndex = 15, type = Db2Type.SHORT)
    private Short seatID3;


    @Column(name = "SeatID4")
    @Db2Field(fieldIndex = 16, type = Db2Type.SHORT)
    private Short seatID4;


    @Column(name = "SeatID5")
    @Db2Field(fieldIndex = 17, type = Db2Type.SHORT)
    private Short seatID5;


    @Column(name = "SeatID6")
    @Db2Field(fieldIndex = 18, type = Db2Type.SHORT)
    private Short seatID6;


    @Column(name = "SeatID7")
    @Db2Field(fieldIndex = 19, type = Db2Type.SHORT)
    private Short seatID7;


    @Column(name = "SeatID8")
    @Db2Field(fieldIndex = 20, type = Db2Type.SHORT)
    private Short seatID8;


    @Column(name = "VehicleUIIndicatorID")
    @Db2Field(fieldIndex = 21, type = Db2Type.SHORT)
    private Short vehicleUIIndicatorID;


    @Column(name = "PowerDisplayID1")
    @Db2Field(fieldIndex = 22, type = Db2Type.SHORT)
    private Short powerDisplayID1;


    @Column(name = "PowerDisplayID2")
    @Db2Field(fieldIndex = 23, type = Db2Type.SHORT)
    private Short powerDisplayID2;


    @Column(name = "PowerDisplayID3")
    @Db2Field(fieldIndex = 24, type = Db2Type.SHORT)
    private Short powerDisplayID3;


    @Column(name = "FlagsB")
    @Db2Field(fieldIndex = 25, type = Db2Type.BYTE)
    private Byte flagsB;


    @Column(name = "UiLocomotionType")
    @Db2Field(fieldIndex = 26, type = Db2Type.BYTE)
    private Byte uiLocomotionType;


    @Column(name = "MissileTargetingID")
    @Db2Field(fieldIndex = 27, type = Db2Type.INT, signed = true)
    private Integer missileTargetingID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
