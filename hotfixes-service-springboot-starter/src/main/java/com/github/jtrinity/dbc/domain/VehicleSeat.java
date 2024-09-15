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
@Table(name = "vehicle_seat")
@Db2File(name = "VehicleSeat.db2", layoutHash = 0x0BE4B80B)
public class VehicleSeat implements DbcEntity {
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
    @Column(name = "AttachmentOffsetX", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float attachmentOffsetX;

    @ColumnDefault("0")
    @Column(name = "AttachmentOffsetY", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float attachmentOffsetY;

    @ColumnDefault("0")
    @Column(name = "AttachmentOffsetZ", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float attachmentOffsetZ;

    @ColumnDefault("0")
    @Column(name = "CameraOffsetX", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float cameraOffsetX;

    @ColumnDefault("0")
    @Column(name = "CameraOffsetY", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float cameraOffsetY;

    @ColumnDefault("0")
    @Column(name = "CameraOffsetZ", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float cameraOffsetZ;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "FlagsB", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer flagsB;

    @ColumnDefault("0")
    @Column(name = "FlagsC", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer flagsC;

    @ColumnDefault("0")
    @Column(name = "AttachmentID", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE, signed = true)
    private Byte attachmentID;

    @ColumnDefault("0")
    @Column(name = "EnterPreDelay", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float enterPreDelay;

    @ColumnDefault("0")
    @Column(name = "EnterSpeed", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.FLOAT)
    private Float enterSpeed;

    @ColumnDefault("0")
    @Column(name = "EnterGravity", nullable = false)
    @Db2Field(fieldIndex = 13, type = Db2Type.FLOAT)
    private Float enterGravity;

    @ColumnDefault("0")
    @Column(name = "EnterMinDuration", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.FLOAT)
    private Float enterMinDuration;

    @ColumnDefault("0")
    @Column(name = "EnterMaxDuration", nullable = false)
    @Db2Field(fieldIndex = 15, type = Db2Type.FLOAT)
    private Float enterMaxDuration;

    @ColumnDefault("0")
    @Column(name = "EnterMinArcHeight", nullable = false)
    @Db2Field(fieldIndex = 16, type = Db2Type.FLOAT)
    private Float enterMinArcHeight;

    @ColumnDefault("0")
    @Column(name = "EnterMaxArcHeight", nullable = false)
    @Db2Field(fieldIndex = 17, type = Db2Type.FLOAT)
    private Float enterMaxArcHeight;

    @ColumnDefault("0")
    @Column(name = "EnterAnimStart", nullable = false)
    @Db2Field(fieldIndex = 18, type = Db2Type.INT, signed = true)
    private Integer enterAnimStart;

    @ColumnDefault("0")
    @Column(name = "EnterAnimLoop", nullable = false)
    @Db2Field(fieldIndex = 19, type = Db2Type.INT, signed = true)
    private Integer enterAnimLoop;

    @ColumnDefault("0")
    @Column(name = "RideAnimStart", nullable = false)
    @Db2Field(fieldIndex = 20, type = Db2Type.INT, signed = true)
    private Integer rideAnimStart;

    @ColumnDefault("0")
    @Column(name = "RideAnimLoop", nullable = false)
    @Db2Field(fieldIndex = 21, type = Db2Type.INT, signed = true)
    private Integer rideAnimLoop;

    @ColumnDefault("0")
    @Column(name = "RideUpperAnimStart", nullable = false)
    @Db2Field(fieldIndex = 22, type = Db2Type.INT, signed = true)
    private Integer rideUpperAnimStart;

    @ColumnDefault("0")
    @Column(name = "RideUpperAnimLoop", nullable = false)
    @Db2Field(fieldIndex = 23, type = Db2Type.INT, signed = true)
    private Integer rideUpperAnimLoop;

    @ColumnDefault("0")
    @Column(name = "ExitPreDelay", nullable = false)
    @Db2Field(fieldIndex = 24, type = Db2Type.FLOAT)
    private Float exitPreDelay;

    @ColumnDefault("0")
    @Column(name = "ExitSpeed", nullable = false)
    @Db2Field(fieldIndex = 25, type = Db2Type.FLOAT)
    private Float exitSpeed;

    @ColumnDefault("0")
    @Column(name = "ExitGravity", nullable = false)
    @Db2Field(fieldIndex = 26, type = Db2Type.FLOAT)
    private Float exitGravity;

    @ColumnDefault("0")
    @Column(name = "ExitMinDuration", nullable = false)
    @Db2Field(fieldIndex = 27, type = Db2Type.FLOAT)
    private Float exitMinDuration;

    @ColumnDefault("0")
    @Column(name = "ExitMaxDuration", nullable = false)
    @Db2Field(fieldIndex = 28, type = Db2Type.FLOAT)
    private Float exitMaxDuration;

    @ColumnDefault("0")
    @Column(name = "ExitMinArcHeight", nullable = false)
    @Db2Field(fieldIndex = 29, type = Db2Type.FLOAT)
    private Float exitMinArcHeight;

    @ColumnDefault("0")
    @Column(name = "ExitMaxArcHeight", nullable = false)
    @Db2Field(fieldIndex = 30, type = Db2Type.FLOAT)
    private Float exitMaxArcHeight;

    @ColumnDefault("0")
    @Column(name = "ExitAnimStart", nullable = false)
    @Db2Field(fieldIndex = 31, type = Db2Type.INT, signed = true)
    private Integer exitAnimStart;

    @ColumnDefault("0")
    @Column(name = "ExitAnimLoop", nullable = false)
    @Db2Field(fieldIndex = 32, type = Db2Type.INT, signed = true)
    private Integer exitAnimLoop;

    @ColumnDefault("0")
    @Column(name = "ExitAnimEnd", nullable = false)
    @Db2Field(fieldIndex = 33, type = Db2Type.INT, signed = true)
    private Integer exitAnimEnd;

    @ColumnDefault("0")
    @Column(name = "VehicleEnterAnim", nullable = false)
    @Db2Field(fieldIndex = 34, type = Db2Type.SHORT, signed = true)
    private Short vehicleEnterAnim;

    @ColumnDefault("0")
    @Column(name = "VehicleEnterAnimBone", nullable = false)
    @Db2Field(fieldIndex = 35, type = Db2Type.BYTE, signed = true)
    private Byte vehicleEnterAnimBone;

    @ColumnDefault("0")
    @Column(name = "VehicleExitAnim", nullable = false)
    @Db2Field(fieldIndex = 36, type = Db2Type.SHORT, signed = true)
    private Short vehicleExitAnim;

    @ColumnDefault("0")
    @Column(name = "VehicleExitAnimBone", nullable = false)
    @Db2Field(fieldIndex = 37, type = Db2Type.BYTE, signed = true)
    private Byte vehicleExitAnimBone;

    @ColumnDefault("0")
    @Column(name = "VehicleRideAnimLoop", nullable = false)
    @Db2Field(fieldIndex = 38, type = Db2Type.SHORT, signed = true)
    private Short vehicleRideAnimLoop;

    @ColumnDefault("0")
    @Column(name = "VehicleRideAnimLoopBone", nullable = false)
    @Db2Field(fieldIndex = 39, type = Db2Type.BYTE, signed = true)
    private Byte vehicleRideAnimLoopBone;

    @ColumnDefault("0")
    @Column(name = "PassengerAttachmentID", nullable = false)
    @Db2Field(fieldIndex = 40, type = Db2Type.BYTE, signed = true)
    private Byte passengerAttachmentID;

    @ColumnDefault("0")
    @Column(name = "PassengerYaw", nullable = false)
    @Db2Field(fieldIndex = 41, type = Db2Type.FLOAT)
    private Float passengerYaw;

    @ColumnDefault("0")
    @Column(name = "PassengerPitch", nullable = false)
    @Db2Field(fieldIndex = 42, type = Db2Type.FLOAT)
    private Float passengerPitch;

    @ColumnDefault("0")
    @Column(name = "PassengerRoll", nullable = false)
    @Db2Field(fieldIndex = 43, type = Db2Type.FLOAT)
    private Float passengerRoll;

    @ColumnDefault("0")
    @Column(name = "VehicleEnterAnimDelay", nullable = false)
    @Db2Field(fieldIndex = 44, type = Db2Type.FLOAT)
    private Float vehicleEnterAnimDelay;

    @ColumnDefault("0")
    @Column(name = "VehicleExitAnimDelay", nullable = false)
    @Db2Field(fieldIndex = 45, type = Db2Type.FLOAT)
    private Float vehicleExitAnimDelay;

    @ColumnDefault("0")
    @Column(name = "VehicleAbilityDisplay", nullable = false)
    @Db2Field(fieldIndex = 46, type = Db2Type.BYTE, signed = true)
    private Byte vehicleAbilityDisplay;

    @ColumnDefault("'0'")
    @Column(name = "EnterUISoundID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 47, type = Db2Type.INT)
    private Long enterUISoundID;

    @ColumnDefault("'0'")
    @Column(name = "ExitUISoundID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 48, type = Db2Type.INT)
    private Long exitUISoundID;

    @ColumnDefault("0")
    @Column(name = "UiSkinFileDataID", nullable = false)
    @Db2Field(fieldIndex = 49, type = Db2Type.INT, signed = true)
    private Integer uiSkinFileDataID;

    @ColumnDefault("0")
    @Column(name = "UiSkin", nullable = false)
    @Db2Field(fieldIndex = 50, type = Db2Type.INT, signed = true)
    private Integer uiSkin;

    @ColumnDefault("0")
    @Column(name = "CameraEnteringDelay", nullable = false)
    @Db2Field(fieldIndex = 51, type = Db2Type.FLOAT)
    private Float cameraEnteringDelay;

    @ColumnDefault("0")
    @Column(name = "CameraEnteringDuration", nullable = false)
    @Db2Field(fieldIndex = 52, type = Db2Type.FLOAT)
    private Float cameraEnteringDuration;

    @ColumnDefault("0")
    @Column(name = "CameraExitingDelay", nullable = false)
    @Db2Field(fieldIndex = 53, type = Db2Type.FLOAT)
    private Float cameraExitingDelay;

    @ColumnDefault("0")
    @Column(name = "CameraExitingDuration", nullable = false)
    @Db2Field(fieldIndex = 54, type = Db2Type.FLOAT)
    private Float cameraExitingDuration;

    @ColumnDefault("0")
    @Column(name = "CameraPosChaseRate", nullable = false)
    @Db2Field(fieldIndex = 55, type = Db2Type.FLOAT)
    private Float cameraPosChaseRate;

    @ColumnDefault("0")
    @Column(name = "CameraFacingChaseRate", nullable = false)
    @Db2Field(fieldIndex = 56, type = Db2Type.FLOAT)
    private Float cameraFacingChaseRate;

    @ColumnDefault("0")
    @Column(name = "CameraEnteringZoom", nullable = false)
    @Db2Field(fieldIndex = 57, type = Db2Type.FLOAT)
    private Float cameraEnteringZoom;

    @ColumnDefault("0")
    @Column(name = "CameraSeatZoomMin", nullable = false)
    @Db2Field(fieldIndex = 58, type = Db2Type.FLOAT)
    private Float cameraSeatZoomMin;

    @ColumnDefault("0")
    @Column(name = "CameraSeatZoomMax", nullable = false)
    @Db2Field(fieldIndex = 59, type = Db2Type.FLOAT)
    private Float cameraSeatZoomMax;

    @ColumnDefault("0")
    @Column(name = "EnterAnimKitID", nullable = false)
    @Db2Field(fieldIndex = 60, type = Db2Type.SHORT, signed = true)
    private Short enterAnimKitID;

    @ColumnDefault("0")
    @Column(name = "RideAnimKitID", nullable = false)
    @Db2Field(fieldIndex = 61, type = Db2Type.SHORT, signed = true)
    private Short rideAnimKitID;

    @ColumnDefault("0")
    @Column(name = "ExitAnimKitID", nullable = false)
    @Db2Field(fieldIndex = 62, type = Db2Type.SHORT, signed = true)
    private Short exitAnimKitID;

    @ColumnDefault("0")
    @Column(name = "VehicleEnterAnimKitID", nullable = false)
    @Db2Field(fieldIndex = 63, type = Db2Type.SHORT, signed = true)
    private Short vehicleEnterAnimKitID;

    @ColumnDefault("0")
    @Column(name = "VehicleRideAnimKitID", nullable = false)
    @Db2Field(fieldIndex = 64, type = Db2Type.SHORT, signed = true)
    private Short vehicleRideAnimKitID;

    @ColumnDefault("0")
    @Column(name = "VehicleExitAnimKitID", nullable = false)
    @Db2Field(fieldIndex = 65, type = Db2Type.SHORT, signed = true)
    private Short vehicleExitAnimKitID;

    @ColumnDefault("0")
    @Column(name = "CameraModeID", nullable = false)
    @Db2Field(fieldIndex = 66, type = Db2Type.SHORT, signed = true)
    private Short cameraModeID;

}