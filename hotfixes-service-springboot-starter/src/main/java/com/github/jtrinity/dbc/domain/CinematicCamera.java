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
@Table(name = "cinematic_camera")
@Db2File(name = "CinematicCamera.db2", layoutHash = 0x0062B0F4)
public class CinematicCamera implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SoundID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer soundID;


    @Column(name = "OriginX")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float originX;


    @Column(name = "OriginY")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float originY;


    @Column(name = "OriginZ")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float originZ;


    @Column(name = "OriginFacing")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float originFacing;


    @Column(name = "FileDataID")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer fileDataID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
