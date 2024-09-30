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
@Table(name = "spell_label")
@Db2DataBind(name = "SpellLabel.db2", layoutHash = 0x68E44736, parentIndexField = 1, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "labelID", type = Db2Type.INT),
        @Db2Field(name = "spellID", type = Db2Type.INT, signed = true)
})
public class SpellLabel implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "LabelID")
    private Integer labelID;

    @Column(name = "SpellID")
    private Integer spellID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
