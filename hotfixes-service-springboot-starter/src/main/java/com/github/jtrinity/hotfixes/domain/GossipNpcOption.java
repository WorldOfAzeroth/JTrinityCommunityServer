package com.github.jtrinity.hotfixes.domain;

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
public class GossipNpcOption {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "GossipNpcOption", nullable = false)
    private Integer gossipNpcOption;

    @ColumnDefault("0")
    @Column(name = "LFGDungeonsID", nullable = false)
    private Integer lFGDungeonsID;

    @ColumnDefault("0")
    @Column(name = "TrainerID", nullable = false)
    private Integer trainerID;

    @ColumnDefault("0")
    @Column(name = "Unk341_1", nullable = false)
    private Integer unk341_1;

    @ColumnDefault("0")
    @Column(name = "Unk341_2", nullable = false)
    private Integer unk341_2;

    @ColumnDefault("0")
    @Column(name = "Unk341_3", nullable = false)
    private Integer unk341_3;

    @ColumnDefault("0")
    @Column(name = "Unk341_4", nullable = false)
    private Integer unk341_4;

    @ColumnDefault("0")
    @Column(name = "Unk341_5", nullable = false)
    private Integer unk341_5;

    @ColumnDefault("0")
    @Column(name = "Unk341_6", nullable = false)
    private Integer unk341_6;

    @ColumnDefault("0")
    @Column(name = "Unk341_7", nullable = false)
    private Integer unk341_7;

    @ColumnDefault("0")
    @Column(name = "Unk341_8", nullable = false)
    private Integer unk341_8;

    @ColumnDefault("0")
    @Column(name = "GossipOptionID", nullable = false)
    private Integer gossipOptionID;

}