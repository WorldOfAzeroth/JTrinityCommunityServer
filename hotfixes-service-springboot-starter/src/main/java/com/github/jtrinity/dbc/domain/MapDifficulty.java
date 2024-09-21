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
@Table(name = "map_difficulty")
@Db2File(name = "MapDifficulty.db2", layoutHash = 0x2B3B759E, parentIndexField = 8)
public class MapDifficulty implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Message")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString message;


    @Column(name = "DifficultyID")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Byte difficultyID;


    @Column(name = "ResetInterval")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte resetInterval;


    @Column(name = "MaxPlayers")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte maxPlayers;


    @Column(name = "LockID")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte lockID;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte flags;


    @Column(name = "ItemContext")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte itemContext;


    @Column(name = "ItemContextPickerID")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer itemContextPickerID;


    @Column(name = "MapID")
    @Db2Field(fieldIndex = 9, type = Db2Type.SHORT)
    private Short mapID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
