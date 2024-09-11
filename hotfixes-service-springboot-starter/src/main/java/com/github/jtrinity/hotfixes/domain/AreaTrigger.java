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
@Table(name = "area_trigger")
public class AreaTrigger {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Message")
    private String message;

    @ColumnDefault("0")
    @Column(name = "PosX", nullable = false)
    private Float posX;

    @ColumnDefault("0")
    @Column(name = "PosY", nullable = false)
    private Float posY;

    @ColumnDefault("0")
    @Column(name = "PosZ", nullable = false)
    private Float posZ;

    @ColumnDefault("0")
    @Column(name = "ContinentID", nullable = false)
    private Short continentID;

    @ColumnDefault("0")
    @Column(name = "PhaseUseFlags", nullable = false)
    private Integer phaseUseFlags;

    @ColumnDefault("0")
    @Column(name = "PhaseID", nullable = false)
    private Short phaseID;

    @ColumnDefault("0")
    @Column(name = "PhaseGroupID", nullable = false)
    private Short phaseGroupID;

    @ColumnDefault("0")
    @Column(name = "Radius", nullable = false)
    private Float radius;

    @ColumnDefault("0")
    @Column(name = "BoxLength", nullable = false)
    private Float boxLength;

    @ColumnDefault("0")
    @Column(name = "BoxWidth", nullable = false)
    private Float boxWidth;

    @ColumnDefault("0")
    @Column(name = "BoxHeight", nullable = false)
    private Float boxHeight;

    @ColumnDefault("0")
    @Column(name = "BoxYaw", nullable = false)
    private Float boxYaw;

    @ColumnDefault("0")
    @Column(name = "ShapeType", nullable = false)
    private Byte shapeType;

    @ColumnDefault("0")
    @Column(name = "ShapeID", nullable = false)
    private Short shapeID;

    @ColumnDefault("0")
    @Column(name = "AreaTriggerActionSetID", nullable = false)
    private Short areaTriggerActionSetID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Byte flags;

}