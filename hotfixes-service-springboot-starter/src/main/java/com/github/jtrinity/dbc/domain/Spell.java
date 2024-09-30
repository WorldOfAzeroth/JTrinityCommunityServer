package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.common.LocalizedString;
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
@Table(name = "spell")
@Db2DataBind(name = "Spell.db2", layoutHash = 0x2273DFFF, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "name", type = Db2Type.STRING),
        @Db2Field(name = "nameSubtext", type = Db2Type.STRING),
        @Db2Field(name = "description", type = Db2Type.STRING),
        @Db2Field(name = "auraDescription", type = Db2Type.STRING)
})
public class Spell implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Name")
    private LocalizedString name;

    @Column(name = "NameSubtext")
    private LocalizedString nameSubtext;

    @Column(name = "Description")
    private LocalizedString description;

    @Column(name = "AuraDescription")
    private LocalizedString auraDescription;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
