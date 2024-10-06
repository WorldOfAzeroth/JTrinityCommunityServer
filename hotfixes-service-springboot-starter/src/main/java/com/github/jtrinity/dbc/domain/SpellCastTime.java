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
@Table(name = "spell_cast_times")
@Db2DataBind(name = "SpellCastTimes.db2", layoutHash = 0x4129C6A4, fields = {
        @Db2Field(name = "base", type = Db2Type.INT, signed = true),
        @Db2Field(name = "minimum", type = Db2Type.INT, signed = true),
        @Db2Field(name = "perLevel", type = Db2Type.SHORT, signed = true)
})
public class SpellCastTime implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Base")
    private Integer base;

    @Column(name = "Minimum")
    private Integer minimum;

    @Column(name = "PerLevel")
    private Short perLevel;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
