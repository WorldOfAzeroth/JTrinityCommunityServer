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
@Table(name = "barber_shop_style")
@Db2File(name = "BarberShopStyle.db2", layoutHash = 0x670C71AE, indexField = 7)
public class BarberShopStyle implements DbcEntity {

    @Column(name = "DisplayName")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString displayName;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "CostModifier")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float costModifier;


    @Column(name = "Type")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte type;


    @Column(name = "Race")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte race;


    @Column(name = "Sex")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte sex;


    @Column(name = "Data")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte data;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
