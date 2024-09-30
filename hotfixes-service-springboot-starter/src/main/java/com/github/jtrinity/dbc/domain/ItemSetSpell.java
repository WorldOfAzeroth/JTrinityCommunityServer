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
@Table(name = "item_set_spell")
@Db2DataBind(name = "ItemSetSpell.db2", layoutHash = 0xF65D0AF8, parentIndexField = 3, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "spellID", type = Db2Type.INT),
        @Db2Field(name = "chrSpecID", type = Db2Type.SHORT),
        @Db2Field(name = "threshold", type = Db2Type.BYTE),
        @Db2Field(name = "itemSetID", type = Db2Type.SHORT)
})
public class ItemSetSpell implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "SpellID")
    private Integer spellID;

    @Column(name = "ChrSpecID")
    private Short chrSpecID;

    @Column(name = "Threshold")
    private Byte threshold;

    @Column(name = "ItemSetID")
    private Short itemSetID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
