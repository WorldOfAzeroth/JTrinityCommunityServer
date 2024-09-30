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
@Table(name = "spell_learn_spell")
@Db2DataBind(name = "SpellLearnSpell.db2", layoutHash = 0x153EBA26, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "spellID", type = Db2Type.INT, signed = true),
        @Db2Field(name = "learnSpellID", type = Db2Type.INT, signed = true),
        @Db2Field(name = "overridesSpellID", type = Db2Type.INT, signed = true)
})
public class SpellLearnSpell implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "SpellID")
    private Integer spellID;

    @Column(name = "LearnSpellID")
    private Integer learnSpellID;

    @Column(name = "OverridesSpellID")
    private Integer overridesSpellID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
