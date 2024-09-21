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
@Table(name = "gameobject_art_kit")
@Db2File(name = "GameObjectArtKit.db2", layoutHash = 0x6F65BC41)
public class GameObjectArtKit implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "AttachModelFileID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer attachModelFileID;


    @Column(name = "TextureVariationFileID1")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer textureVariationFileID1;


    @Column(name = "TextureVariationFileID2")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer textureVariationFileID2;


    @Column(name = "TextureVariationFileID3")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer textureVariationFileID3;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
