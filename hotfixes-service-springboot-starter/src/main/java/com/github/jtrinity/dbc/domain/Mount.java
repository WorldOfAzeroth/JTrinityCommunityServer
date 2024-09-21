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
@Table(name = "mount")
@Db2File(name = "Mount.db2", layoutHash = 0x4D812F19, indexField = 8)
public class Mount implements DbcEntity {

    @Column(name = "Name")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "SourceText")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString sourceText;


    @Column(name = "SourceSpellID")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer sourceSpellID;


    @Column(name = "MountFlyRideHeight")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float mountFlyRideHeight;


    @Column(name = "MountTypeID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short mountTypeID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Short flags;


    @Column(name = "SourceTypeEnum")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE, signed = true)
    private Byte sourceTypeEnum;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer id;


    @Column(name = "PlayerConditionID")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Integer playerConditionID;


    @Column(name = "UiModelSceneID")
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer uiModelSceneID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
