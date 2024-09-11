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
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "FlagsB", nullable = false)
    private Integer flagsB;

    @ColumnDefault("0")
    @Column(name = "TurnSpeed", nullable = false)
    private Float turnSpeed;

    @ColumnDefault("0")
    @Column(name = "PitchSpeed", nullable = false)
    private Float pitchSpeed;

    @ColumnDefault("0")
    @Column(name = "PitchMin", nullable = false)
    private Float pitchMin;

    @ColumnDefault("0")
    @Column(name = "PitchMax", nullable = false)
    private Float pitchMax;

    @ColumnDefault("0")
    @Column(name = "MouseLookOffsetPitch", nullable = false)
    private Float mouseLookOffsetPitch;

    @ColumnDefault("0")
    @Column(name = "CameraFadeDistScalarMin", nullable = false)
    private Float cameraFadeDistScalarMin;

    @ColumnDefault("0")
    @Column(name = "CameraFadeDistScalarMax", nullable = false)
    private Float cameraFadeDistScalarMax;

    @ColumnDefault("0")
    @Column(name = "CameraPitchOffset", nullable = false)
    private Float cameraPitchOffset;

    @ColumnDefault("0")
    @Column(name = "FacingLimitRight", nullable = false)
    private Float facingLimitRight;

    @ColumnDefault("0")
    @Column(name = "FacingLimitLeft", nullable = false)
    private Float facingLimitLeft;

    @ColumnDefault("0")
    @Column(name = "CameraYawOffset", nullable = false)
    private Float cameraYawOffset;

    @ColumnDefault("'0'")
    @Column(name = "VehicleUIIndicatorID", columnDefinition = "smallint UNSIGNED not null")
    private Integer vehicleUIIndicatorID;

    @ColumnDefault("0")
    @Column(name = "MissileTargetingID", nullable = false)
    private Integer missileTargetingID;

    @ColumnDefault("'0'")
    @Column(name = "VehiclePOITypeID", columnDefinition = "smallint UNSIGNED not null")
    private Integer vehiclePOITypeID;

    @ColumnDefault("0")
    @Column(name = "UiLocomotionType", nullable = false)
    private Integer uiLocomotionType;

    @ColumnDefault("'0'")
    @Column(name = "SeatID1", columnDefinition = "smallint UNSIGNED not null")
    private Integer seatID1;

    @ColumnDefault("'0'")
    @Column(name = "SeatID2", columnDefinition = "smallint UNSIGNED not null")
    private Integer seatID2;

    @ColumnDefault("'0'")
    @Column(name = "SeatID3", columnDefinition = "smallint UNSIGNED not null")
    private Integer seatID3;

    @ColumnDefault("'0'")
    @Column(name = "SeatID4", columnDefinition = "smallint UNSIGNED not null")
    private Integer seatID4;

    @ColumnDefault("'0'")
    @Column(name = "SeatID5", columnDefinition = "smallint UNSIGNED not null")
    private Integer seatID5;

    @ColumnDefault("'0'")
    @Column(name = "SeatID6", columnDefinition = "smallint UNSIGNED not null")
    private Integer seatID6;

    @ColumnDefault("'0'")
    @Column(name = "SeatID7", columnDefinition = "smallint UNSIGNED not null")
    private Integer seatID7;

    @ColumnDefault("'0'")
    @Column(name = "SeatID8", columnDefinition = "smallint UNSIGNED not null")
    private Integer seatID8;

    @ColumnDefault("'0'")
    @Column(name = "PowerDisplayID1", columnDefinition = "smallint UNSIGNED not null")
    private Integer powerDisplayID1;

    @ColumnDefault("'0'")
    @Column(name = "PowerDisplayID2", columnDefinition = "smallint UNSIGNED not null")
    private Integer powerDisplayID2;

    @ColumnDefault("'0'")
    @Column(name = "PowerDisplayID3", columnDefinition = "smallint UNSIGNED not null")
    private Integer powerDisplayID3;

}