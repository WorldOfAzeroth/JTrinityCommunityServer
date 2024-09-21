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
@Table(name = "emotes")
@Db2File(name = "Emotes.db2", layoutHash = 0x14467F27)
public class Emote implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "RaceMask")
    @Db2Field(fieldIndex = 1, type = Db2Type.LONG, signed = true)
    private Long raceMask;


    @Column(name = "EmoteSlashCommand")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING_NOT_LOCALIZED)
    private String emoteSlashCommand;


    @Column(name = "EmoteFlags")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer emoteFlags;


    @Column(name = "SpellVisualKitID")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Integer spellVisualKitID;


    @Column(name = "AnimID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT, signed = true)
    private Short animID;


    @Column(name = "EmoteSpecProc")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte emoteSpecProc;


    @Column(name = "ClassMask")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer classMask;


    @Column(name = "EmoteSpecProcParam")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Integer emoteSpecProcParam;


    @Column(name = "EventSoundID")
    @Db2Field(fieldIndex = 9, type = Db2Type.INT)
    private Integer eventSoundID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
