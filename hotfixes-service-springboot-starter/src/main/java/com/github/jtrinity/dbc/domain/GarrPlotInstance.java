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
@Table(name = "garr_plot_instance")
@Db2DataBind(name = "GarrPlotInstance.db2", layoutHash = 0xB708BB37, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "name", type = Db2Type.STRING_NOT_LOCALIZED),
        @Db2Field(name = "garrPlotID", type = Db2Type.BYTE)
})
public class GarrPlotInstance implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "GarrPlotID")
    private Byte garrPlotID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
