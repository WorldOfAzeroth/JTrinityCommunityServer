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
@Table(name = "transport_animation")
@Db2File(name = "TransportAnimation.db2", layoutHash = 0x099987ED, parentIndexField = 3)
public class TransportAnimation implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "TimeIndex")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer timeIndex;


    @Column(name = "PosX")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float posX;


    @Column(name = "PosY")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float posY;


    @Column(name = "PosZ")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float posZ;


    @Column(name = "SequenceID")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte sequenceID;


    @Column(name = "TransportID")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer transportID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
