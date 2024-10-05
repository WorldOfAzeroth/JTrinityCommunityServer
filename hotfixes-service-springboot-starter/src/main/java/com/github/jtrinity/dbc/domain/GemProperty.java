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
@Table(name = "gem_properties")
@Db2DataBind(name = "GemProperties.db2", layoutHash = 0x84558CAB, fields = {
        @Db2Field(name = "type", type = Db2Type.INT),
        @Db2Field(name = "enchantId", type = Db2Type.SHORT),
        @Db2Field(name = "minItemLevel", type = Db2Type.SHORT)
})
public class GemProperty implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Type")
    private Integer type;

    @Column(name = "EnchantId")
    private Short enchantId;

    @Column(name = "MinItemLevel")
    private Short minItemLevel;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
