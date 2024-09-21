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
@Table(name = "item_spec")
@Db2File(name = "ItemSpec.db2", layoutHash = 0xB17B7986, parentIndexField = 3)
public class ItemSpec implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SpecializationID")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Short specializationID;


    @Column(name = "MinLevel")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Byte minLevel;


    @Column(name = "MaxLevel")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte maxLevel;


    @Column(name = "ItemType")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte itemType;


    @Column(name = "PrimaryStat")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte primaryStat;


    @Column(name = "SecondaryStat")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte secondaryStat;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
