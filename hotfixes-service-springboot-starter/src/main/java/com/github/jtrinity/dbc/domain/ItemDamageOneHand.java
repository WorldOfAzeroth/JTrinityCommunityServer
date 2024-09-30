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
@Table(name = "item_damage_one_hand")
@Db2DataBind(name = "ItemDamageOneHand.db2", layoutHash = 0xC2186F95, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = {"quality1", "quality2", "quality3", "quality4", "quality5", "quality6", "quality7"}, type = Db2Type.FLOAT),
        @Db2Field(name = "itemLevel", type = Db2Type.SHORT)
})
public class ItemDamageOneHand implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Quality1")
    private Float quality1;

    @Column(name = "Quality2")
    private Float quality2;

    @Column(name = "Quality3")
    private Float quality3;

    @Column(name = "Quality4")
    private Float quality4;

    @Column(name = "Quality5")
    private Float quality5;

    @Column(name = "Quality6")
    private Float quality6;

    @Column(name = "Quality7")
    private Float quality7;

    @Column(name = "ItemLevel")
    private Short itemLevel;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
