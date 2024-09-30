package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2DataBind;
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
@Db2DataBind(name = "CurvePoint.db2", layoutHash = 0xF36752EB, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "posX", type = Db2Type.FLOAT),
        @Db2Field(name = "posY", type = Db2Type.FLOAT),
        @Db2Field(name = "curveID", type = Db2Type.SHORT),
        @Db2Field(name = "orderIndex", type = Db2Type.BYTE)
})
public class CurvePoint implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "PosX")
    private Float posX;

    @Column(name = "PosY")
    private Float posY;

    @Column(name = "CurveID")
    private Short curveID;

    @Column(name = "OrderIndex")
    private Byte orderIndex;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
