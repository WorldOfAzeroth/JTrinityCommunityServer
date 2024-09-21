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
@Table(name = "toy")
@Db2File(name = "Toy.db2", layoutHash = 0x5409C5EA, indexField = 4)
public class Toy implements DbcEntity {

    @Column(name = "SourceText")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString sourceText;


    @Column(name = "ItemID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer itemID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "SourceTypeEnum")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE, signed = true)
    private Byte sourceTypeEnum;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
