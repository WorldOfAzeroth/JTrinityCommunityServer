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
@Table(name = "artifact_power_link")
@Db2DataBind(name = "ArtifactPowerLink.db2", layoutHash = 0xE179618C, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "powerA", type = Db2Type.SHORT),
        @Db2Field(name = "powerB", type = Db2Type.SHORT)
})
public class ArtifactPowerLink implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "PowerA")
    private Short powerA;

    @Column(name = "PowerB")
    private Short powerB;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
