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
@Table(name = "curve_point")
@Db2File(name = "CurvePoint.db2", fileDataId = 892586, layoutHash = 0x861A11A0, indexField = 2, parentIndexField = 3)
public class CurvePoint {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "PosX", nullable = false)
    @Db2Field(fieldIndex = 0, type = Db2Type.FLOAT)
    private Float posX;

    @ColumnDefault("0")
    @Column(name = "PosY", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float posY;

    @ColumnDefault("0")
    @Column(name = "PreSLSquishPosX", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float preSLSquishPosX;

    @ColumnDefault("0")
    @Column(name = "PreSLSquishPosY", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float preSLSquishPosY;

    @ColumnDefault("'0'")
    @Column(name = "CurveID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Long curveID;

    @ColumnDefault("'0'")
    @Column(name = "OrderIndex", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short orderIndex;

}