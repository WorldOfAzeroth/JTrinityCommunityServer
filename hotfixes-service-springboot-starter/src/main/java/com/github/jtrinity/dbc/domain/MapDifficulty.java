package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.common.LocalizedString;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2DataBind;
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
@Db2DataBind(name = "MapDifficulty.db2", layoutHash = 0x2B3B759E, parentIndexField = 8, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "message", type = Db2Type.STRING),
        @Db2Field(name = "difficultyID", type = Db2Type.BYTE),
        @Db2Field(name = "resetInterval", type = Db2Type.BYTE),
        @Db2Field(name = "maxPlayers", type = Db2Type.BYTE),
        @Db2Field(name = "lockID", type = Db2Type.BYTE),
        @Db2Field(name = "flags", type = Db2Type.BYTE),
        @Db2Field(name = "itemContext", type = Db2Type.BYTE),
        @Db2Field(name = "itemContextPickerID", type = Db2Type.INT),
        @Db2Field(name = "mapID", type = Db2Type.SHORT)
})
public class MapDifficulty implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Message")
    private LocalizedString message;

    @Column(name = "DifficultyID")
    private Byte difficultyID;

    @Column(name = "ResetInterval")
    private Byte resetInterval;

    @Column(name = "MaxPlayers")
    private Byte maxPlayers;

    @Column(name = "LockID")
    private Byte lockID;

    @Column(name = "Flags")
    private Byte flags;

    @Column(name = "ItemContext")
    private Byte itemContext;

    @Column(name = "ItemContextPickerID")
    private Integer itemContextPickerID;

    @Column(name = "MapID")
    private Short mapID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
