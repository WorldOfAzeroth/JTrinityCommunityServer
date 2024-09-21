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
@Table(name = "spell_radius")
@Db2File(name = "SpellRadius.db2", layoutHash = 0xC12E5C90)
public class SpellRadius implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Radius")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float radius;


    @Column(name = "RadiusPerLevel")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float radiusPerLevel;


    @Column(name = "RadiusMin")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float radiusMin;


    @Column(name = "RadiusMax")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float radiusMax;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
