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
@Table(name = "chr_classes_x_power_types")
@Db2DataBind(name = "ChrClassesXPowerTypes.db2", layoutHash = 0xAF977B23, parentIndexField = 1, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "powerType", type = Db2Type.BYTE),
        @Db2Field(name = "classID", type = Db2Type.BYTE)
})
public class ChrClassesXPowerType implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "PowerType")
    private Byte powerType;

    @Column(name = "ClassID")
    private Byte classID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
