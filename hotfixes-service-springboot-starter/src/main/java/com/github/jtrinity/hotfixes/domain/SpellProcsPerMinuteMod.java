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
@Table(name = "spell_procs_per_minute_mod")
@Db2File(name = "SpellProcsPerMinuteMod.db2", fileDataId = 1133525, layoutHash = 0x4BFCB147, parentIndexField = 3)
public class SpellProcsPerMinuteMod {
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
    @Column(name = "Type", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short type;

    @ColumnDefault("0")
    @Column(name = "Param", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT, signed = true)
    private Short param;

    @ColumnDefault("0")
    @Column(name = "Coeff", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float coeff;

    @ColumnDefault("'0'")
    @Column(name = "SpellProcsPerMinuteID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Long spellProcsPerMinuteID;

}