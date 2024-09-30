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
@Table(name = "power_display")
@Db2DataBind(name = "PowerDisplay.db2", layoutHash = 0xFD152E5B, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "globalStringBaseTag", type = Db2Type.STRING_NOT_LOCALIZED),
        @Db2Field(name = "actualType", type = Db2Type.BYTE),
        @Db2Field(name = "red", type = Db2Type.BYTE),
        @Db2Field(name = "green", type = Db2Type.BYTE),
        @Db2Field(name = "blue", type = Db2Type.BYTE)
})
public class PowerDisplay implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "GlobalStringBaseTag")
    private String globalStringBaseTag;

    @Column(name = "ActualType")
    private Byte actualType;

    @Column(name = "Red")
    private Byte red;

    @Column(name = "Green")
    private Byte green;

    @Column(name = "Blue")
    private Byte blue;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
