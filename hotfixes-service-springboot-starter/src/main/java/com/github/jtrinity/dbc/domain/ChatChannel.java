package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2File;
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
@Db2File(name = "ChatChannels.db2", layoutHash = 0x1A325E80)
public class ChatChannel implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "Shortcut")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString shortcut;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer flags;


    @Column(name = "FactionGroup")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE, signed = true)
    private Byte factionGroup;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
