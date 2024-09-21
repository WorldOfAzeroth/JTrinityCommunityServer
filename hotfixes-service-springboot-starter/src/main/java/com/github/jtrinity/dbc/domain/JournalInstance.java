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
@Table(name = "journal_instance")
@Db2File(name = "JournalInstance.db2", layoutHash = 0x1691CC3D, indexField = 10)
public class JournalInstance implements DbcEntity {

    @Column(name = "Name")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "ButtonFileDataID")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer buttonFileDataID;


    @Column(name = "ButtonSmallFileDataID")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer buttonSmallFileDataID;


    @Column(name = "BackgroundFileDataID")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer backgroundFileDataID;


    @Column(name = "LoreFileDataID")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer loreFileDataID;


    @Column(name = "MapID")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short mapID;


    @Column(name = "AreaID")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Short areaID;


    @Column(name = "OrderIndex")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte orderIndex;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE)
    private Byte flags;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
