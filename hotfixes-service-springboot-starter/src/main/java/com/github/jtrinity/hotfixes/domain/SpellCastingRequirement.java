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
@Table(name = "spell_casting_requirements")
@Db2File(name = "SpellCastingRequirements.db2", fileDataId = 1002166, layoutHash = 0x76B9E4FB)
public class SpellCastingRequirement {
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
    @Column(name = "SpellID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spellID;

    @ColumnDefault("'0'")
    @Column(name = "FacingCasterFlags", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Short facingCasterFlags;

    @ColumnDefault("'0'")
    @Column(name = "MinFactionID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Integer minFactionID;

    @ColumnDefault("0")
    @Column(name = "MinReputation", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer minReputation;

    @ColumnDefault("'0'")
    @Column(name = "RequiredAreasID", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT)
    private Integer requiredAreasID;

    @ColumnDefault("'0'")
    @Column(name = "RequiredAuraVision", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE)
    private Short requiredAuraVision;

    @ColumnDefault("'0'")
    @Column(name = "RequiresSpellFocus", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT)
    private Integer requiresSpellFocus;

}