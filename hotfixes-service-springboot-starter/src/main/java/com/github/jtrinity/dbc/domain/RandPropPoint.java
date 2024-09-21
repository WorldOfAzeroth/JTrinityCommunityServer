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
@Table(name = "rand_prop_points")
@Db2File(name = "RandPropPoints.db2", layoutHash = 0x4E2C0BCC)
public class RandPropPoint implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Epic1")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer epic1;


    @Column(name = "Epic2")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer epic2;


    @Column(name = "Epic3")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer epic3;


    @Column(name = "Epic4")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer epic4;


    @Column(name = "Epic5")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer epic5;


    @Column(name = "Superior1")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer superior1;


    @Column(name = "Superior2")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer superior2;


    @Column(name = "Superior3")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer superior3;


    @Column(name = "Superior4")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Integer superior4;


    @Column(name = "Superior5")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Integer superior5;


    @Column(name = "Good1")
    @Db2Field(fieldIndex = 11, type = Db2Type.INT)
    private Integer good1;


    @Column(name = "Good2")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Integer good2;


    @Column(name = "Good3")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Integer good3;


    @Column(name = "Good4")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Integer good4;


    @Column(name = "Good5")
    @Db2Field(fieldIndex = 15, type = Db2Type.INT)
    private Integer good5;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
