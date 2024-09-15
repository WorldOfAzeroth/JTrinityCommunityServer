package com.github.jtrinity.dbc.domain;

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
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2Id.class)
@Entity
@Table(name = "gossip_npc_option")
@Db2File(name = "GossipNPCOption.db2", layoutHash = 0x30CA59EB)
public class GossipNpcOption implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "GossipNpcOption", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer gossipNpcOption;

    @ColumnDefault("0")
    @Column(name = "LFGDungeonsID", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer lFGDungeonsID;

    @ColumnDefault("0")
    @Column(name = "TrainerID", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer trainerID;

    @ColumnDefault("0")
    @Column(name = "Unk341_1", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer unk341_1;

    @ColumnDefault("0")
    @Column(name = "Unk341_2", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer unk341_2;

    @ColumnDefault("0")
    @Column(name = "Unk341_3", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer unk341_3;

    @ColumnDefault("0")
    @Column(name = "Unk341_4", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer unk341_4;

    @ColumnDefault("0")
    @Column(name = "Unk341_5", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer unk341_5;

    @ColumnDefault("0")
    @Column(name = "Unk341_6", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer unk341_6;

    @ColumnDefault("0")
    @Column(name = "Unk341_7", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer unk341_7;

    @ColumnDefault("0")
    @Column(name = "Unk341_8", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.INT, signed = true)
    private Integer unk341_8;

    @ColumnDefault("0")
    @Column(name = "GossipOptionID", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer gossipOptionID;

}