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
@Table(name = "vehicle_seat")
@Db2File(name = "VehicleSeat.db2", layoutHash = 0x242E0ECD)
public class VehicleSeat implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer flags;


    @Column(name = "FlagsB")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer flagsB;


    @Column(name = "FlagsC")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer flagsC;


    @Column(name = "AttachmentOffsetX")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float attachmentOffsetX;


    @Column(name = "AttachmentOffsetY")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float attachmentOffsetY;


    @Column(name = "AttachmentOffsetZ")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float attachmentOffsetZ;


    @Column(name = "EnterPreDelay")
    @Db2Field(fieldIndex = 7, type = Db2Type.FLOAT)
    private Float enterPreDelay;


    @Column(name = "EnterSpeed")
    @Db2Field(fieldIndex = 8, type = Db2Type.FLOAT)
    private Float enterSpeed;


    @Column(name = "EnterGravity")
    @Db2Field(fieldIndex = 9, type = Db2Type.FLOAT)
    private Float enterGravity;


    @Column(name = "EnterMinDuration")
    @Db2Field(fieldIndex = 10, type = Db2Type.FLOAT)
    private Float enterMinDuration;


    @Column(name = "EnterMaxDuration")
    @Db2Field(fieldIndex = 11, type = Db2Type.FLOAT)
    private Float enterMaxDuration;


    @Column(name = "EnterMinArcHeight")
    @Db2Field(fieldIndex = 12, type = Db2Type.FLOAT)
    private Float enterMinArcHeight;


    @Column(name = "EnterMaxArcHeight")
    @Db2Field(fieldIndex = 13, type = Db2Type.FLOAT)
    private Float enterMaxArcHeight;


    @Column(name = "ExitPreDelay")
    @Db2Field(fieldIndex = 14, type = Db2Type.FLOAT)
    private Float exitPreDelay;


    @Column(name = "ExitSpeed")
    @Db2Field(fieldIndex = 15, type = Db2Type.FLOAT)
    private Float exitSpeed;


    @Column(name = "ExitGravity")
    @Db2Field(fieldIndex = 16, type = Db2Type.FLOAT)
    private Float exitGravity;


    @Column(name = "ExitMinDuration")
    @Db2Field(fieldIndex = 17, type = Db2Type.FLOAT)
    private Float exitMinDuration;


    @Column(name = "ExitMaxDuration")
    @Db2Field(fieldIndex = 18, type = Db2Type.FLOAT)
    private Float exitMaxDuration;


    @Column(name = "ExitMinArcHeight")
    @Db2Field(fieldIndex = 19, type = Db2Type.FLOAT)
    private Float exitMinArcHeight;


    @Column(name = "ExitMaxArcHeight")
    @Db2Field(fieldIndex = 20, type = Db2Type.FLOAT)
    private Float exitMaxArcHeight;


    @Column(name = "PassengerYaw")
    @Db2Field(fieldIndex = 21, type = Db2Type.FLOAT)
    private Float passengerYaw;


    @Column(name = "PassengerPitch")
    @Db2Field(fieldIndex = 22, type = Db2Type.FLOAT)
    private Float passengerPitch;


    @Column(name = "PassengerRoll")
    @Db2Field(fieldIndex = 23, type = Db2Type.FLOAT)
    private Float passengerRoll;


    @Column(name = "VehicleEnterAnimDelay")
    @Db2Field(fieldIndex = 24, type = Db2Type.FLOAT)
    private Float vehicleEnterAnimDelay;


    @Column(name = "VehicleExitAnimDelay")
    @Db2Field(fieldIndex = 25, type = Db2Type.FLOAT)
    private Float vehicleExitAnimDelay;


    @Column(name = "CameraEnteringDelay")
    @Db2Field(fieldIndex = 26, type = Db2Type.FLOAT)
    private Float cameraEnteringDelay;


    @Column(name = "CameraEnteringDuration")
    @Db2Field(fieldIndex = 27, type = Db2Type.FLOAT)
    private Float cameraEnteringDuration;


    @Column(name = "CameraExitingDelay")
    @Db2Field(fieldIndex = 28, type = Db2Type.FLOAT)
    private Float cameraExitingDelay;


    @Column(name = "CameraExitingDuration")
    @Db2Field(fieldIndex = 29, type = Db2Type.FLOAT)
    private Float cameraExitingDuration;


    @Column(name = "CameraOffsetX")
    @Db2Field(fieldIndex = 30, type = Db2Type.FLOAT)
    private Float cameraOffsetX;


    @Column(name = "CameraOffsetY")
    @Db2Field(fieldIndex = 31, type = Db2Type.FLOAT)
    private Float cameraOffsetY;


    @Column(name = "CameraOffsetZ")
    @Db2Field(fieldIndex = 32, type = Db2Type.FLOAT)
    private Float cameraOffsetZ;


    @Column(name = "CameraPosChaseRate")
    @Db2Field(fieldIndex = 33, type = Db2Type.FLOAT)
    private Float cameraPosChaseRate;


    @Column(name = "CameraFacingChaseRate")
    @Db2Field(fieldIndex = 34, type = Db2Type.FLOAT)
    private Float cameraFacingChaseRate;


    @Column(name = "CameraEnteringZoom")
    @Db2Field(fieldIndex = 35, type = Db2Type.FLOAT)
    private Float cameraEnteringZoom;


    @Column(name = "CameraSeatZoomMin")
    @Db2Field(fieldIndex = 36, type = Db2Type.FLOAT)
    private Float cameraSeatZoomMin;


    @Column(name = "CameraSeatZoomMax")
    @Db2Field(fieldIndex = 37, type = Db2Type.FLOAT)
    private Float cameraSeatZoomMax;


    @Column(name = "UiSkinFileDataID")
    @Db2Field(fieldIndex = 38, type = Db2Type.INT, signed = true)
    private Integer uiSkinFileDataID;


    @Column(name = "EnterAnimStart")
    @Db2Field(fieldIndex = 39, type = Db2Type.SHORT, signed = true)
    private Short enterAnimStart;


    @Column(name = "EnterAnimLoop")
    @Db2Field(fieldIndex = 40, type = Db2Type.SHORT, signed = true)
    private Short enterAnimLoop;


    @Column(name = "RideAnimStart")
    @Db2Field(fieldIndex = 41, type = Db2Type.SHORT, signed = true)
    private Short rideAnimStart;


    @Column(name = "RideAnimLoop")
    @Db2Field(fieldIndex = 42, type = Db2Type.SHORT, signed = true)
    private Short rideAnimLoop;


    @Column(name = "RideUpperAnimStart")
    @Db2Field(fieldIndex = 43, type = Db2Type.SHORT, signed = true)
    private Short rideUpperAnimStart;


    @Column(name = "RideUpperAnimLoop")
    @Db2Field(fieldIndex = 44, type = Db2Type.SHORT, signed = true)
    private Short rideUpperAnimLoop;


    @Column(name = "ExitAnimStart")
    @Db2Field(fieldIndex = 45, type = Db2Type.SHORT, signed = true)
    private Short exitAnimStart;


    @Column(name = "ExitAnimLoop")
    @Db2Field(fieldIndex = 46, type = Db2Type.SHORT, signed = true)
    private Short exitAnimLoop;


    @Column(name = "ExitAnimEnd")
    @Db2Field(fieldIndex = 47, type = Db2Type.SHORT, signed = true)
    private Short exitAnimEnd;


    @Column(name = "VehicleEnterAnim")
    @Db2Field(fieldIndex = 48, type = Db2Type.SHORT, signed = true)
    private Short vehicleEnterAnim;


    @Column(name = "VehicleExitAnim")
    @Db2Field(fieldIndex = 49, type = Db2Type.SHORT, signed = true)
    private Short vehicleExitAnim;


    @Column(name = "VehicleRideAnimLoop")
    @Db2Field(fieldIndex = 50, type = Db2Type.SHORT, signed = true)
    private Short vehicleRideAnimLoop;


    @Column(name = "EnterAnimKitID")
    @Db2Field(fieldIndex = 51, type = Db2Type.SHORT, signed = true)
    private Short enterAnimKitID;


    @Column(name = "RideAnimKitID")
    @Db2Field(fieldIndex = 52, type = Db2Type.SHORT, signed = true)
    private Short rideAnimKitID;


    @Column(name = "ExitAnimKitID")
    @Db2Field(fieldIndex = 53, type = Db2Type.SHORT, signed = true)
    private Short exitAnimKitID;


    @Column(name = "VehicleEnterAnimKitID")
    @Db2Field(fieldIndex = 54, type = Db2Type.SHORT, signed = true)
    private Short vehicleEnterAnimKitID;


    @Column(name = "VehicleRideAnimKitID")
    @Db2Field(fieldIndex = 55, type = Db2Type.SHORT, signed = true)
    private Short vehicleRideAnimKitID;


    @Column(name = "VehicleExitAnimKitID")
    @Db2Field(fieldIndex = 56, type = Db2Type.SHORT, signed = true)
    private Short vehicleExitAnimKitID;


    @Column(name = "CameraModeID")
    @Db2Field(fieldIndex = 57, type = Db2Type.SHORT, signed = true)
    private Short cameraModeID;


    @Column(name = "AttachmentID")
    @Db2Field(fieldIndex = 58, type = Db2Type.BYTE, signed = true)
    private Byte attachmentID;


    @Column(name = "PassengerAttachmentID")
    @Db2Field(fieldIndex = 59, type = Db2Type.BYTE, signed = true)
    private Byte passengerAttachmentID;


    @Column(name = "VehicleEnterAnimBone")
    @Db2Field(fieldIndex = 60, type = Db2Type.BYTE, signed = true)
    private Byte vehicleEnterAnimBone;


    @Column(name = "VehicleExitAnimBone")
    @Db2Field(fieldIndex = 61, type = Db2Type.BYTE, signed = true)
    private Byte vehicleExitAnimBone;


    @Column(name = "VehicleRideAnimLoopBone")
    @Db2Field(fieldIndex = 62, type = Db2Type.BYTE, signed = true)
    private Byte vehicleRideAnimLoopBone;


    @Column(name = "VehicleAbilityDisplay")
    @Db2Field(fieldIndex = 63, type = Db2Type.BYTE, signed = true)
    private Byte vehicleAbilityDisplay;


    @Column(name = "EnterUISoundID")
    @Db2Field(fieldIndex = 64, type = Db2Type.INT)
    private Integer enterUISoundID;


    @Column(name = "ExitUISoundID")
    @Db2Field(fieldIndex = 65, type = Db2Type.INT)
    private Integer exitUISoundID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
