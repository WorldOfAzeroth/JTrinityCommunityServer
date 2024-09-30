package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
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
@Table(name = "conversation_line")
@Db2DataBind(name = "ConversationLine.db2", layoutHash = 0x032B137B, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "broadcastTextID", type = Db2Type.INT),
        @Db2Field(name = "spellVisualKitID", type = Db2Type.INT),
        @Db2Field(name = "additionalDuration", type = Db2Type.INT, signed = true),
        @Db2Field(name = "nextConversationLineID", type = Db2Type.SHORT),
        @Db2Field(name = "animKitID", type = Db2Type.SHORT),
        @Db2Field(name = "speechType", type = Db2Type.BYTE),
        @Db2Field(name = "startAnimation", type = Db2Type.BYTE),
        @Db2Field(name = "endAnimation", type = Db2Type.BYTE)
})
public class ConversationLine implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "BroadcastTextID")
    private Integer broadcastTextID;

    @Column(name = "SpellVisualKitID")
    private Integer spellVisualKitID;

    @Column(name = "AdditionalDuration")
    private Integer additionalDuration;

    @Column(name = "NextConversationLineID")
    private Short nextConversationLineID;

    @Column(name = "AnimKitID")
    private Short animKitID;

    @Column(name = "SpeechType")
    private Byte speechType;

    @Column(name = "StartAnimation")
    private Byte startAnimation;

    @Column(name = "EndAnimation")
    private Byte endAnimation;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
