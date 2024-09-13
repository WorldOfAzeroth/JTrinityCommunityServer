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
@Table(name = "cinematic_camera")
@Db2File(name = "CinematicCamera.db2", fileDataId = 1294214, layoutHash = 0x744B99BC)
public class CinematicCamera {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "OriginX", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float originX;

    @ColumnDefault("0")
    @Column(name = "OriginY", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float originY;

    @ColumnDefault("0")
    @Column(name = "OriginZ", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float originZ;

    @ColumnDefault("'0'")
    @Column(name = "SoundID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Long soundID;

    @ColumnDefault("0")
    @Column(name = "OriginFacing", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float originFacing;

    @ColumnDefault("'0'")
    @Column(name = "FileDataID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Long fileDataID;

}