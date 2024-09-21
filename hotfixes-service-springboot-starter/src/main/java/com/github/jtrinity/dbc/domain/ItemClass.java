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
@Table(name = "item_class")
@Db2File(name = "ItemClass.db2", layoutHash = 0xA1E4663C)
public class ItemClass implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "ClassName")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString className;


    @Column(name = "PriceModifier")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float priceModifier;


    @Column(name = "ClassID")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE, signed = true)
    private Byte classID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte flags;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
