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
@Table(name = "curve_point")
@Db2File(name = "CurvePoint.db2", layoutHash = 0xF36752EB)
public class CurvePoint implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "PosX")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float posX;


    @Column(name = "PosY")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float posY;


    @Column(name = "CurveID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short curveID;


    @Column(name = "OrderIndex")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte orderIndex;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
