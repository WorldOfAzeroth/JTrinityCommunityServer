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
@Table(name = "location")
@Db2File(name = "Location.db2", fileDataId = 801707, layoutHash = 0xB0561808)
public class Location {
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
    @Column(name = "PosX", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float posX;

    @ColumnDefault("0")
    @Column(name = "PosY", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float posY;

    @ColumnDefault("0")
    @Column(name = "PosZ", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float posZ;

    @ColumnDefault("0")
    @Column(name = "Rot1", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float rot1;

    @ColumnDefault("0")
    @Column(name = "Rot2", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float rot2;

    @ColumnDefault("0")
    @Column(name = "Rot3", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float rot3;

}