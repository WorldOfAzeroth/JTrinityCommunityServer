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
@Table(name = "spell_scaling")
@Db2File(name = "SpellScaling.db2", layoutHash = 0xF67A5719)
public class SpellScaling implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spellID;


    @Column(name = "ScalesFromItemLevel")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short scalesFromItemLevel;


    @Column(name = "Class")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer klass;


    @Column(name = "MinScalingLevel")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer minScalingLevel;


    @Column(name = "MaxScalingLevel")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer maxScalingLevel;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
