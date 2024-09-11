package com.github.jtrinity.hotfixes.domain;

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
public class VehicleSeat {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "AttachmentOffsetX", nullable = false)
    private Float attachmentOffsetX;

    @ColumnDefault("0")
    @Column(name = "AttachmentOffsetY", nullable = false)
    private Float attachmentOffsetY;

    @ColumnDefault("0")
    @Column(name = "AttachmentOffsetZ", nullable = false)
    private Float attachmentOffsetZ;

    @ColumnDefault("0")
    @Column(name = "CameraOffsetX", nullable = false)
    private Float cameraOffsetX;

    @ColumnDefault("0")
    @Column(name = "CameraOffsetY", nullable = false)
    private Float cameraOffsetY;

    @ColumnDefault("0")
    @Column(name = "CameraOffsetZ", nullable = false)
    private Float cameraOffsetZ;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "FlagsB", nullable = false)
    private Integer flagsB;

    @ColumnDefault("0")
    @Column(name = "FlagsC", nullable = false)
    private Integer flagsC;

    @ColumnDefault("0")
    @Column(name = "AttachmentID", nullable = false)
    private Byte attachmentID;

    @ColumnDefault("0")
    @Column(name = "EnterPreDelay", nullable = false)
    private Float enterPreDelay;

    @ColumnDefault("0")
    @Column(name = "EnterSpeed", nullable = false)
    private Float enterSpeed;

    @ColumnDefault("0")
    @Column(name = "EnterGravity", nullable = false)
    private Float enterGravity;

    @ColumnDefault("0")
    @Column(name = "EnterMinDuration", nullable = false)
    private Float enterMinDuration;

    @ColumnDefault("0")
    @Column(name = "EnterMaxDuration", nullable = false)
    private Float enterMaxDuration;

    @ColumnDefault("0")
    @Column(name = "EnterMinArcHeight", nullable = false)
    private Float enterMinArcHeight;

    @ColumnDefault("0")
    @Column(name = "EnterMaxArcHeight", nullable = false)
    private Float enterMaxArcHeight;

    @ColumnDefault("0")
    @Column(name = "EnterAnimStart", nullable = false)
    private Integer enterAnimStart;

    @ColumnDefault("0")
    @Column(name = "EnterAnimLoop", nullable = false)
    private Integer enterAnimLoop;

    @ColumnDefault("0")
    @Column(name = "RideAnimStart", nullable = false)
    private Integer rideAnimStart;

    @ColumnDefault("0")
    @Column(name = "RideAnimLoop", nullable = false)
    private Integer rideAnimLoop;

    @ColumnDefault("0")
    @Column(name = "RideUpperAnimStart", nullable = false)
    private Integer rideUpperAnimStart;

    @ColumnDefault("0")
    @Column(name = "RideUpperAnimLoop", nullable = false)
    private Integer rideUpperAnimLoop;

    @ColumnDefault("0")
    @Column(name = "ExitPreDelay", nullable = false)
    private Float exitPreDelay;

    @ColumnDefault("0")
    @Column(name = "ExitSpeed", nullable = false)
    private Float exitSpeed;

    @ColumnDefault("0")
    @Column(name = "ExitGravity", nullable = false)
    private Float exitGravity;

    @ColumnDefault("0")
    @Column(name = "ExitMinDuration", nullable = false)
    private Float exitMinDuration;

    @ColumnDefault("0")
    @Column(name = "ExitMaxDuration", nullable = false)
    private Float exitMaxDuration;

    @ColumnDefault("0")
    @Column(name = "ExitMinArcHeight", nullable = false)
    private Float exitMinArcHeight;

    @ColumnDefault("0")
    @Column(name = "ExitMaxArcHeight", nullable = false)
    private Float exitMaxArcHeight;

    @ColumnDefault("0")
    @Column(name = "ExitAnimStart", nullable = false)
    private Integer exitAnimStart;

    @ColumnDefault("0")
    @Column(name = "ExitAnimLoop", nullable = false)
    private Integer exitAnimLoop;

    @ColumnDefault("0")
    @Column(name = "ExitAnimEnd", nullable = false)
    private Integer exitAnimEnd;

    @ColumnDefault("0")
    @Column(name = "VehicleEnterAnim", nullable = false)
    private Short vehicleEnterAnim;

    @ColumnDefault("0")
    @Column(name = "VehicleEnterAnimBone", nullable = false)
    private Byte vehicleEnterAnimBone;

    @ColumnDefault("0")
    @Column(name = "VehicleExitAnim", nullable = false)
    private Short vehicleExitAnim;

    @ColumnDefault("0")
    @Column(name = "VehicleExitAnimBone", nullable = false)
    private Byte vehicleExitAnimBone;

    @ColumnDefault("0")
    @Column(name = "VehicleRideAnimLoop", nullable = false)
    private Short vehicleRideAnimLoop;

    @ColumnDefault("0")
    @Column(name = "VehicleRideAnimLoopBone", nullable = false)
    private Byte vehicleRideAnimLoopBone;

    @ColumnDefault("0")
    @Column(name = "PassengerAttachmentID", nullable = false)
    private Byte passengerAttachmentID;

    @ColumnDefault("0")
    @Column(name = "PassengerYaw", nullable = false)
    private Float passengerYaw;

    @ColumnDefault("0")
    @Column(name = "PassengerPitch", nullable = false)
    private Float passengerPitch;

    @ColumnDefault("0")
    @Column(name = "PassengerRoll", nullable = false)
    private Float passengerRoll;

    @ColumnDefault("0")
    @Column(name = "VehicleEnterAnimDelay", nullable = false)
    private Float vehicleEnterAnimDelay;

    @ColumnDefault("0")
    @Column(name = "VehicleExitAnimDelay", nullable = false)
    private Float vehicleExitAnimDelay;

    @ColumnDefault("0")
    @Column(name = "VehicleAbilityDisplay", nullable = false)
    private Byte vehicleAbilityDisplay;

    @ColumnDefault("'0'")
    @Column(name = "EnterUISoundID", columnDefinition = "int UNSIGNED not null")
    private Long enterUISoundID;

    @ColumnDefault("'0'")
    @Column(name = "ExitUISoundID", columnDefinition = "int UNSIGNED not null")
    private Long exitUISoundID;

    @ColumnDefault("0")
    @Column(name = "UiSkinFileDataID", nullable = false)
    private Integer uiSkinFileDataID;

    @ColumnDefault("0")
    @Column(name = "UiSkin", nullable = false)
    private Integer uiSkin;

    @ColumnDefault("0")
    @Column(name = "CameraEnteringDelay", nullable = false)
    private Float cameraEnteringDelay;

    @ColumnDefault("0")
    @Column(name = "CameraEnteringDuration", nullable = false)
    private Float cameraEnteringDuration;

    @ColumnDefault("0")
    @Column(name = "CameraExitingDelay", nullable = false)
    private Float cameraExitingDelay;

    @ColumnDefault("0")
    @Column(name = "CameraExitingDuration", nullable = false)
    private Float cameraExitingDuration;

    @ColumnDefault("0")
    @Column(name = "CameraPosChaseRate", nullable = false)
    private Float cameraPosChaseRate;

    @ColumnDefault("0")
    @Column(name = "CameraFacingChaseRate", nullable = false)
    private Float cameraFacingChaseRate;

    @ColumnDefault("0")
    @Column(name = "CameraEnteringZoom", nullable = false)
    private Float cameraEnteringZoom;

    @ColumnDefault("0")
    @Column(name = "CameraSeatZoomMin", nullable = false)
    private Float cameraSeatZoomMin;

    @ColumnDefault("0")
    @Column(name = "CameraSeatZoomMax", nullable = false)
    private Float cameraSeatZoomMax;

    @ColumnDefault("0")
    @Column(name = "EnterAnimKitID", nullable = false)
    private Short enterAnimKitID;

    @ColumnDefault("0")
    @Column(name = "RideAnimKitID", nullable = false)
    private Short rideAnimKitID;

    @ColumnDefault("0")
    @Column(name = "ExitAnimKitID", nullable = false)
    private Short exitAnimKitID;

    @ColumnDefault("0")
    @Column(name = "VehicleEnterAnimKitID", nullable = false)
    private Short vehicleEnterAnimKitID;

    @ColumnDefault("0")
    @Column(name = "VehicleRideAnimKitID", nullable = false)
    private Short vehicleRideAnimKitID;

    @ColumnDefault("0")
    @Column(name = "VehicleExitAnimKitID", nullable = false)
    private Short vehicleExitAnimKitID;

    @ColumnDefault("0")
    @Column(name = "CameraModeID", nullable = false)
    private Short cameraModeID;

}