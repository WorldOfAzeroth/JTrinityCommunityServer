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
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "path")
@Db2DataBind(name = "Path.db2", layoutHash = 0xAB4D8ED6, fields = {
        @Db2Field(name = "Type", type = Db2Type.BYTE),
        @Db2Field(name = "SplineType", type = Db2Type.BYTE),
        @Db2Field(name = "Red", type = Db2Type.BYTE),
        @Db2Field(name = "Green", type = Db2Type.BYTE),
        @Db2Field(name = "Blue", type = Db2Type.BYTE),
        @Db2Field(name = "Alpha", type = Db2Type.BYTE),
        @Db2Field(name = "Flags", type = Db2Type.BYTE)
})
public class Path implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "Type", columnDefinition = "tinyint UNSIGNED not null")
    private Short type;

    @ColumnDefault("'0'")
    @Column(name = "SplineType", columnDefinition = "tinyint UNSIGNED not null")
    private Short splineType;

    @ColumnDefault("'0'")
    @Column(name = "Red", columnDefinition = "tinyint UNSIGNED not null")
    private Short red;

    @ColumnDefault("'0'")
    @Column(name = "Green", columnDefinition = "tinyint UNSIGNED not null")
    private Short green;

    @ColumnDefault("'0'")
    @Column(name = "Blue", columnDefinition = "tinyint UNSIGNED not null")
    private Short blue;

    @ColumnDefault("'0'")
    @Column(name = "Alpha", columnDefinition = "tinyint UNSIGNED not null")
    private Short alpha;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

}