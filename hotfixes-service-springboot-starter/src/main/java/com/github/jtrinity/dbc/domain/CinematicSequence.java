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
@Table(name = "cinematic_sequences")
@Db2File(name = "CinematicSequences.db2", layoutHash = 0x470FDA8C)
public class CinematicSequence implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SoundID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer soundID;


    @Column(name = "Camera1")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short camera1;


    @Column(name = "Camera2")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short camera2;


    @Column(name = "Camera3")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short camera3;


    @Column(name = "Camera4")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short camera4;


    @Column(name = "Camera5")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short camera5;


    @Column(name = "Camera6")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Short camera6;


    @Column(name = "Camera7")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT)
    private Short camera7;


    @Column(name = "Camera8")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short camera8;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
