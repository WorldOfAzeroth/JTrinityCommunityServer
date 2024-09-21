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
@Table(name = "reward_pack")
@Db2File(name = "RewardPack.db2", layoutHash = 0xDB6CC0AB)
public class RewardPack implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Money")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer money;


    @Column(name = "ArtifactXPMultiplier")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float artifactXPMultiplier;


    @Column(name = "ArtifactXPDifficulty")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE, signed = true)
    private Byte artifactXPDifficulty;


    @Column(name = "ArtifactXPCategoryID")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte artifactXPCategoryID;


    @Column(name = "CharTitleID")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer charTitleID;


    @Column(name = "TreasurePickerID")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer treasurePickerID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
