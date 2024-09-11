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
@Table(name = "curve_point")
public class CurvePoint {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "PosX", nullable = false)
    private Float posX;

    @ColumnDefault("0")
    @Column(name = "PosY", nullable = false)
    private Float posY;

    @ColumnDefault("0")
    @Column(name = "PreSLSquishPosX", nullable = false)
    private Float preSLSquishPosX;

    @ColumnDefault("0")
    @Column(name = "PreSLSquishPosY", nullable = false)
    private Float preSLSquishPosY;

    @ColumnDefault("'0'")
    @Column(name = "CurveID", columnDefinition = "int UNSIGNED not null")
    private Long curveID;

    @ColumnDefault("'0'")
    @Column(name = "OrderIndex", columnDefinition = "tinyint UNSIGNED not null")
    private Short orderIndex;

}