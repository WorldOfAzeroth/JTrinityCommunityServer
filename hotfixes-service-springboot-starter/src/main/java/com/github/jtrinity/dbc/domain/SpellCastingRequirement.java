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
@Table(name = "spell_casting_requirements")
@Db2File(name = "SpellCastingRequirements.db2", layoutHash = 0xD8B56E5D)
public class SpellCastingRequirement implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "SpellID")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer spellID;


    @Column(name = "MinFactionID")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short minFactionID;


    @Column(name = "RequiredAreasID")
    @Db2Field(fieldIndex = 3, type = Db2Type.SHORT)
    private Short requiredAreasID;


    @Column(name = "RequiresSpellFocus")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short requiresSpellFocus;


    @Column(name = "FacingCasterFlags")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Byte facingCasterFlags;


    @Column(name = "MinReputation")
    @Db2Field(fieldIndex = 6, type = Db2Type.BYTE, signed = true)
    private Byte minReputation;


    @Column(name = "RequiredAuraVision")
    @Db2Field(fieldIndex = 7, type = Db2Type.BYTE)
    private Byte requiredAuraVision;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
