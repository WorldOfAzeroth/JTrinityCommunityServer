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
@Table(name = "transport_rotation")
@Db2File(name = "TransportRotation.db2", fileDataId = 1140687, layoutHash = 0xC1124B6A, parentIndexField = 2)
public class TransportRotation {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Rot1", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float rot1;

    @ColumnDefault("0")
    @Column(name = "Rot2", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float rot2;

    @ColumnDefault("0")
    @Column(name = "Rot3", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float rot3;

    @ColumnDefault("0")
    @Column(name = "Rot4", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float rot4;

    @ColumnDefault("'0'")
    @Column(name = "TimeIndex", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Long timeIndex;

    @ColumnDefault("'0'")
    @Column(name = "GameObjectsID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Long gameObjectsID;

}