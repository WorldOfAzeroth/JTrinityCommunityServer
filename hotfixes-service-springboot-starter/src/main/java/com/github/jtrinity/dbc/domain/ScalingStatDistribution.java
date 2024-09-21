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
@Table(name = "scaling_stat_distribution")
@Db2File(name = "ScalingStatDistribution.db2", layoutHash = 0xDED48286)
public class ScalingStatDistribution implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "PlayerLevelToItemLevelCurveID")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Short playerLevelToItemLevelCurveID;


    @Column(name = "MinLevel")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer minLevel;


    @Column(name = "MaxLevel")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer maxLevel;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
