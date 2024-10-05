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
@Table(name = "faction_template")
@Db2DataBind(name = "FactionTemplate.db2", layoutHash = 0x6F1D2135, fields = {
        @Db2Field(name = "faction", type = Db2Type.SHORT),
        @Db2Field(name = "flags", type = Db2Type.SHORT),
        @Db2Field(name = {"enemies1", "enemies2", "enemies3", "enemies4"}, type = Db2Type.SHORT),
        @Db2Field(name = {"friend1", "friend2", "friend3", "friend4"}, type = Db2Type.SHORT),
        @Db2Field(name = "factionGroup", type = Db2Type.BYTE),
        @Db2Field(name = "friendGroup", type = Db2Type.BYTE),
        @Db2Field(name = "enemyGroup", type = Db2Type.BYTE)
})
public class FactionTemplate implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Faction")
    private Short faction;

    @Column(name = "Flags")
    private Short flags;

    @Column(name = "Enemies1")
    private Short enemies1;

    @Column(name = "Enemies2")
    private Short enemies2;

    @Column(name = "Enemies3")
    private Short enemies3;

    @Column(name = "Enemies4")
    private Short enemies4;

    @Column(name = "Friend1")
    private Short friend1;

    @Column(name = "Friend2")
    private Short friend2;

    @Column(name = "Friend3")
    private Short friend3;

    @Column(name = "Friend4")
    private Short friend4;

    @Column(name = "FactionGroup")
    private Byte factionGroup;

    @Column(name = "FriendGroup")
    private Byte friendGroup;

    @Column(name = "EnemyGroup")
    private Byte enemyGroup;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
