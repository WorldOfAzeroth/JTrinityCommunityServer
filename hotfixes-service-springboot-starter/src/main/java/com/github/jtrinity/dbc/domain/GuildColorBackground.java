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
@Table(name = "guild_color_background")
@Db2DataBind(name = "GuildColorBackground.db2", layoutHash = 0xCC0CEFF1, fields = {
        @Db2Field(name = "red", type = Db2Type.BYTE),
        @Db2Field(name = "green", type = Db2Type.BYTE),
        @Db2Field(name = "blue", type = Db2Type.BYTE)
})
public class GuildColorBackground implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Red")
    private Short red;

    @Column(name = "Green")
    private Short green;

    @Column(name = "Blue")
    private Short blue;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
