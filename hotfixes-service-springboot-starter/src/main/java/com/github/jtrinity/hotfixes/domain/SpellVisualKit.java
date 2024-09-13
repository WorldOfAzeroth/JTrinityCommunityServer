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
@Table(name = "spell_visual_kit")
@Db2File(name = "SpellVisualKit.db2", fileDataId = 897949, layoutHash = 0xB08DAE10)
public class SpellVisualKit {
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
    @Column(name = "FallbackSpellVisualKitId", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT)
    private Long fallbackSpellVisualKitId;

    @ColumnDefault("'0'")
    @Column(name = "DelayMin", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Integer delayMin;

    @ColumnDefault("'0'")
    @Column(name = "DelayMax", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Integer delayMax;

    @ColumnDefault("0")
    @Column(name = "FallbackPriority", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float fallbackPriority;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer flags2;

}