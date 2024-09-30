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
@Table(name = "chat_channels")
@Db2DataBind(name = "ChatChannels.db2", layoutHash = 0x1A325E80, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "name", type = Db2Type.STRING),
        @Db2Field(name = "shortcut", type = Db2Type.STRING),
        @Db2Field(name = "flags", type = Db2Type.INT, signed = true),
        @Db2Field(name = "factionGroup", type = Db2Type.BYTE, signed = true)
})
public class ChatChannel implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Name")
    private LocalizedString name;

    @Column(name = "Shortcut")
    private LocalizedString shortcut;

    @Column(name = "Flags")
    private Integer flags;

    @Column(name = "FactionGroup")
    private Byte factionGroup;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
