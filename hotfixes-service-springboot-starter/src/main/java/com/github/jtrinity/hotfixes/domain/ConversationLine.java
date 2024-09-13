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
@Table(name = "conversation_line")
@Db2File(name = "ConversationLine.db2", fileDataId = 1260801, layoutHash = 0x9EE67C1B)
public class ConversationLine {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "BroadcastTextID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Long broadcastTextID;

    @ColumnDefault("'0'")
    @Column(name = "SpellVisualKitID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Long spellVisualKitID;

    @ColumnDefault("0")
    @Column(name = "AdditionalDuration", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer additionalDuration;

    @ColumnDefault("'0'")
    @Column(name = "NextConversationLineID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Integer nextConversationLineID;

    @ColumnDefault("'0'")
    @Column(name = "AnimKitID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Integer animKitID;

    @ColumnDefault("'0'")
    @Column(name = "SpeechType", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short speechType;

    @ColumnDefault("'0'")
    @Column(name = "StartAnimation", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Short startAnimation;

    @ColumnDefault("'0'")
    @Column(name = "EndAnimation", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE)
    private Short endAnimation;

}