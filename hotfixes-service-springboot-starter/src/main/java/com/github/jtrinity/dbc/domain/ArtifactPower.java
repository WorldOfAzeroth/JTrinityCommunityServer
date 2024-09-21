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
@Table(name = "artifact_power")
@Db2File(name = "ArtifactPower.db2", layoutHash = 0x45240818, indexField = 5, parentIndexField = 1)
public class ArtifactPower implements DbcEntity {

    @Column(name = "PosX")
    @Db2Field(fieldIndex = 0, type = Db2Type.FLOAT)
    private Float posX;


    @Column(name = "PosY")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float posY;


    @Column(name = "ArtifactID")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Byte artifactID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "MaxPurchasableRank")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte maxPurchasableRank;


    @Column(name = "Tier")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte tier;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Label")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer label;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
