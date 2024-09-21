package com.github.jtrinity.dbc.domain;

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
@Table(name = "summon_properties")
@Db2File(name = "SummonProperties.db2", layoutHash = 0xFB8338FC)
public class SummonProperty implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer flags;


    @Column(name = "Control")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer control;


    @Column(name = "Faction")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer faction;


    @Column(name = "Title")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer title;


    @Column(name = "Slot")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer slot;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
