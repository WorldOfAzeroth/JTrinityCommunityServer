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
@Table(name = "reward_pack_x_item")
@Db2File(name = "RewardPackXItem.db2", layoutHash = 0x219E3F5D, parentIndexField = 2)
public class RewardPackXItem implements DbcEntity {
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
    @Column(name = "ItemID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer itemID;

    @ColumnDefault("0")
    @Column(name = "ItemQuantity", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer itemQuantity;

    @ColumnDefault("'0'")
    @Column(name = "RewardPackID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long rewardPackID;

}