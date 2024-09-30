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
@Table(name = "spell_power_difficulty")
@Db2DataBind(name = "SpellPowerDifficulty.db2", layoutHash = 0x74714FF7, indexField = 2, fields = {
        @Db2Field(name = "difficultyID", type = Db2Type.BYTE),
        @Db2Field(name = "orderIndex", type = Db2Type.BYTE),
        @Db2Field(name = "id", type = Db2Type.INT)
})
public class SpellPowerDifficulty implements DbcEntity {
    @Column(name = "DifficultyID")
    private Byte difficultyID;

    @Column(name = "OrderIndex")
    private Byte orderIndex;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
