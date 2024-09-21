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
@Table(name = "spell_visual_kit")
@Db2File(name = "SpellVisualKit.db2", layoutHash = 0xDC04F488)
public class SpellVisualKit implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer flags;


    @Column(name = "FallbackPriority")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE, signed = true)
    private Byte fallbackPriority;


    @Column(name = "FallbackSpellVisualKitId")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer fallbackSpellVisualKitId;


    @Column(name = "DelayMin")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short delayMin;


    @Column(name = "DelayMax")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Short delayMax;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
