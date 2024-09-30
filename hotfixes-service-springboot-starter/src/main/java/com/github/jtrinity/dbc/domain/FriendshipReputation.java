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
@Table(name = "friendship_reputation")
@Db2DataBind(name = "FriendshipReputation.db2", layoutHash = 0x406EE0AB, indexField = 3, fields = {
        @Db2Field(name = "description", type = Db2Type.STRING),
        @Db2Field(name = "textureFileID", type = Db2Type.INT, signed = true),
        @Db2Field(name = "factionID", type = Db2Type.SHORT),
        @Db2Field(name = "id", type = Db2Type.INT, signed = true)
})
public class FriendshipReputation implements DbcEntity {
    @Column(name = "Description")
    private LocalizedString description;

    @Column(name = "TextureFileID")
    private Integer textureFileID;

    @Column(name = "FactionID")
    private Short factionID;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
