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
@Table(name = "cinematic_sequences")
public class CinematicSequence {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "SoundID", columnDefinition = "int UNSIGNED not null")
    private Long soundID;

    @ColumnDefault("'0'")
    @Column(name = "Camera1", columnDefinition = "smallint UNSIGNED not null")
    private Integer camera1;

    @ColumnDefault("'0'")
    @Column(name = "Camera2", columnDefinition = "smallint UNSIGNED not null")
    private Integer camera2;

    @ColumnDefault("'0'")
    @Column(name = "Camera3", columnDefinition = "smallint UNSIGNED not null")
    private Integer camera3;

    @ColumnDefault("'0'")
    @Column(name = "Camera4", columnDefinition = "smallint UNSIGNED not null")
    private Integer camera4;

    @ColumnDefault("'0'")
    @Column(name = "Camera5", columnDefinition = "smallint UNSIGNED not null")
    private Integer camera5;

    @ColumnDefault("'0'")
    @Column(name = "Camera6", columnDefinition = "smallint UNSIGNED not null")
    private Integer camera6;

    @ColumnDefault("'0'")
    @Column(name = "Camera7", columnDefinition = "smallint UNSIGNED not null")
    private Integer camera7;

    @ColumnDefault("'0'")
    @Column(name = "Camera8", columnDefinition = "smallint UNSIGNED not null")
    private Integer camera8;

}