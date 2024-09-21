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
@Table(name = "auction_house")
@Db2File(name = "AuctionHouse.db2", layoutHash = 0x51CFEEFF)
public class AuctionHouse implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "FactionID")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short factionID;


    @Column(name = "DepositRate")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte depositRate;


    @Column(name = "ConsignmentRate")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte consignmentRate;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
