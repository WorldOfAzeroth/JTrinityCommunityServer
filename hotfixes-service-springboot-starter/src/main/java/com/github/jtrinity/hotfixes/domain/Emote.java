package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "emotes")
@Db2File(name = "Emotes.db2", fileDataId = 1343602, layoutHash = 0xC2B2FDD1)
public class Emote {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "RaceMask", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.LONG, signed = true)
    private Long raceMask;

    @Lob
    @Column(name = "EmoteSlashCommand")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING_NOT_LOCALIZED)
    private String emoteSlashCommand;

    @ColumnDefault("0")
    @Column(name = "AnimID", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer animID;

    @ColumnDefault("'0'")
    @Column(name = "EmoteFlags", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Long emoteFlags;

    @ColumnDefault("'0'")
    @Column(name = "EmoteSpecProc", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Short emoteSpecProc;

    @ColumnDefault("'0'")
    @Column(name = "EmoteSpecProcParam", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Long emoteSpecProcParam;

    @ColumnDefault("'0'")
    @Column(name = "EventSoundID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long eventSoundID;

    @ColumnDefault("'0'")
    @Column(name = "SpellVisualKitID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Long spellVisualKitID;

    @ColumnDefault("0")
    @Column(name = "ClassMask", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer classMask;

}