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
@Table(name = "spell_procs_per_minute_mod")
@Db2File(name = "SpellProcsPerMinuteMod.db2", layoutHash = 0x2503C18B, parentIndexField = 3)
public class SpellProcsPerMinuteMod implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Coeff")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float coeff;


    @Column(name = "Param")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short param;


    @Column(name = "Type")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte type;


    @Column(name = "SpellProcsPerMinuteID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT)
    private Short spellProcsPerMinuteID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
