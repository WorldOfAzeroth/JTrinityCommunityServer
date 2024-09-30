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
@Table(name = "artifact_category")
@Db2DataBind(name = "ArtifactCategory.db2", layoutHash = 0x21328475, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "xpMultCurrencyID", type = Db2Type.SHORT, signed = true),
        @Db2Field(name = "xpMultCurveID", type = Db2Type.SHORT, signed = true)
})
public class ArtifactCategory implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "XpMultCurrencyID")
    private Short xpMultCurrencyID;

    @Column(name = "XpMultCurveID")
    private Short xpMultCurveID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
