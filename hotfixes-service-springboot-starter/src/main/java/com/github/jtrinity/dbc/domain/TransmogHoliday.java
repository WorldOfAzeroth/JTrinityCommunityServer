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
@Table(name = "transmog_holiday")
@Db2DataBind(name = "TransmogHoliday.db2", layoutHash = 0xB420EB18, indexField = 0, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "requiredTransmogHoliday", type = Db2Type.INT, signed = true)
})
public class TransmogHoliday implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "RequiredTransmogHoliday")
    private Integer requiredTransmogHoliday;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
