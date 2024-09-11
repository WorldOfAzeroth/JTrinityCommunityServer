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
@Table(name = "cinematic_camera")
public class CinematicCamera {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "OriginX", nullable = false)
    private Float originX;

    @ColumnDefault("0")
    @Column(name = "OriginY", nullable = false)
    private Float originY;

    @ColumnDefault("0")
    @Column(name = "OriginZ", nullable = false)
    private Float originZ;

    @ColumnDefault("'0'")
    @Column(name = "SoundID", columnDefinition = "int UNSIGNED not null")
    private Long soundID;

    @ColumnDefault("0")
    @Column(name = "OriginFacing", nullable = false)
    private Float originFacing;

    @ColumnDefault("'0'")
    @Column(name = "FileDataID", columnDefinition = "int UNSIGNED not null")
    private Long fileDataID;

}