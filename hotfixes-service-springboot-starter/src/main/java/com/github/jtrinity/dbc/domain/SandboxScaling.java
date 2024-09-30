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
@Table(name = "sandbox_scaling")
@Db2DataBind(name = "SandboxScaling.db2", layoutHash = 0x5200B7F5, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "minLevel", type = Db2Type.INT, signed = true),
        @Db2Field(name = "maxLevel", type = Db2Type.INT, signed = true),
        @Db2Field(name = "flags", type = Db2Type.INT, signed = true)
})
public class SandboxScaling implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "MinLevel")
    private Integer minLevel;

    @Column(name = "MaxLevel")
    private Integer maxLevel;

    @Column(name = "Flags")
    private Integer flags;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
