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
@Table(name = "conversation_line")
@Db2File(name = "ConversationLine.db2", layoutHash = 0x032B137B)
public class ConversationLine implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "BroadcastTextID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Integer broadcastTextID;


    @Column(name = "SpellVisualKitID")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Integer spellVisualKitID;


    @Column(name = "AdditionalDuration")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer additionalDuration;


    @Column(name = "NextConversationLineID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short nextConversationLineID;


    @Column(name = "AnimKitID")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short animKitID;


    @Column(name = "SpeechType")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Byte speechType;


    @Column(name = "StartAnimation")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte startAnimation;


    @Column(name = "EndAnimation")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Byte endAnimation;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
