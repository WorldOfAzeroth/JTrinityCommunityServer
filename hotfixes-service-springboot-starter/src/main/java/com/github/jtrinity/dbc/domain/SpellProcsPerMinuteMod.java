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
@Table(name = "spell_procs_per_minute_mod")
@Db2DataBind(name = "SpellProcsPerMinuteMod.db2", layoutHash = 0x2503C18B, parentIndexField = 3, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "coeff", type = Db2Type.FLOAT),
        @Db2Field(name = "param", type = Db2Type.SHORT, signed = true),
        @Db2Field(name = "type", type = Db2Type.BYTE),
        @Db2Field(name = "spellProcsPerMinuteID", type = Db2Type.SHORT)
})
public class SpellProcsPerMinuteMod implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Coeff")
    private Float coeff;

    @Column(name = "Param")
    private Short param;

    @Column(name = "Type")
    private Byte type;

    @Column(name = "SpellProcsPerMinuteID")
    private Short spellProcsPerMinuteID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
