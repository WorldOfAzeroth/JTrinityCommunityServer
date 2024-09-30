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
@Table(name = "pvp_reward")
@Db2DataBind(name = "PvpReward.db2", layoutHash = 0x72F4C016, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "honorLevel", type = Db2Type.INT, signed = true),
        @Db2Field(name = "prestigeLevel", type = Db2Type.INT, signed = true),
        @Db2Field(name = "rewardPackID", type = Db2Type.INT, signed = true)
})
public class PvpReward implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "HonorLevel")
    private Integer honorLevel;

    @Column(name = "PrestigeLevel")
    private Integer prestigeLevel;

    @Column(name = "RewardPackID")
    private Integer rewardPackID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
