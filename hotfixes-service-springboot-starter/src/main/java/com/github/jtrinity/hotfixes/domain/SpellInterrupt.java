package com.github.jtrinity.hotfixes.domain;

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
public class SpellInterrupt {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "DifficultyID", columnDefinition = "tinyint UNSIGNED not null")
    private Short difficultyID;

    @ColumnDefault("0")
    @Column(name = "InterruptFlags", nullable = false)
    private Short interruptFlags;

    @ColumnDefault("0")
    @Column(name = "AuraInterruptFlags1", nullable = false)
    private Integer auraInterruptFlags1;

    @ColumnDefault("0")
    @Column(name = "AuraInterruptFlags2", nullable = false)
    private Integer auraInterruptFlags2;

    @ColumnDefault("0")
    @Column(name = "ChannelInterruptFlags1", nullable = false)
    private Integer channelInterruptFlags1;

    @ColumnDefault("0")
    @Column(name = "ChannelInterruptFlags2", nullable = false)
    private Integer channelInterruptFlags2;

    @ColumnDefault("'0'")
    @Column(name = "SpellID", columnDefinition = "int UNSIGNED not null")
    private Long spellID;

}