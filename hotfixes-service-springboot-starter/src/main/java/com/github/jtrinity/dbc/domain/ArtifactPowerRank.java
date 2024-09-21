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
@Table(name = "artifact_power_rank")
@Db2File(name = "ArtifactPowerRank.db2", layoutHash = 0xA87EACC4, parentIndexField = 4)
public class ArtifactPowerRank implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spellID;


    @Column(name = "AuraPointsOverride")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float auraPointsOverride;


    @Column(name = "ItemBonusListID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short itemBonusListID;


    @Column(name = "RankIndex")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte rankIndex;


    @Column(name = "ArtifactPowerID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short artifactPowerID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
