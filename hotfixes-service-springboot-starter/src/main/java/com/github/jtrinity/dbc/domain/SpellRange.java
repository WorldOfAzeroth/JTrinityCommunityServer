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
@Table(name = "spell_range")
@Db2File(name = "SpellRange.db2", layoutHash = 0xDE2E3F8E)
public class SpellRange implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "DisplayName")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString displayName;


    @Column(name = "DisplayNameShort")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString displayNameShort;


    @Column(name = "RangeMin1")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float rangeMin1;


    @Column(name = "RangeMin2")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float rangeMin2;


    @Column(name = "RangeMax1")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float rangeMax1;


    @Column(name = "RangeMax2")
    @Db2Field(fieldIndex = 6, type = Db2Type.FLOAT)
    private Float rangeMax2;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte flags;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
