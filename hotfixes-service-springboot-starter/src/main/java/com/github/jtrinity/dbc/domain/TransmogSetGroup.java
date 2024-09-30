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
@Table(name = "transmog_set_group")
@Db2DataBind(name = "TransmogSetGroup.db2", layoutHash = 0xCD072FE5, indexField = 1, fields = {
        @Db2Field(name = "name", type = Db2Type.STRING),
        @Db2Field(name = "id", type = Db2Type.INT)
})
public class TransmogSetGroup implements DbcEntity {
    @Column(name = "Name")
    private LocalizedString name;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
