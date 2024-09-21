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
@Table(name = "spell_interrupts")
@Db2File(name = "SpellInterrupts.db2", layoutHash = 0x2FA8EA94, parentIndexField = 4)
public class SpellInterrupt implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "DifficultyID")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Byte difficultyID;


    @Column(name = "InterruptFlags")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short interruptFlags;


    @Column(name = "AuraInterruptFlags1")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer auraInterruptFlags1;


    @Column(name = "AuraInterruptFlags2")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer auraInterruptFlags2;


    @Column(name = "ChannelInterruptFlags1")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer channelInterruptFlags1;


    @Column(name = "ChannelInterruptFlags2")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer channelInterruptFlags2;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
