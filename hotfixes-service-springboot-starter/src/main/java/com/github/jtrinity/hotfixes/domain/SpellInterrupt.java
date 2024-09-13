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
@Table(name = "spell_interrupts")
@Db2File(name = "SpellInterrupts.db2", fileDataId = 1139906, layoutHash = 0x15BFA3E0, parentIndexField = 4)
public class SpellInterrupt {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "DifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short difficultyID;

    @ColumnDefault("0")
    @Column(name = "InterruptFlags", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short interruptFlags;

    @ColumnDefault("0")
    @Column(name = "AuraInterruptFlags1", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer auraInterruptFlags1;

    @ColumnDefault("0")
    @Column(name = "AuraInterruptFlags2", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer auraInterruptFlags2;

    @ColumnDefault("0")
    @Column(name = "ChannelInterruptFlags1", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer channelInterruptFlags1;

    @ColumnDefault("0")
    @Column(name = "ChannelInterruptFlags2", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer channelInterruptFlags2;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.INT)
    private Long spellID;

}