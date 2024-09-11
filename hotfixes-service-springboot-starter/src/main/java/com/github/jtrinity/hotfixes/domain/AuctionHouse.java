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
@Table(name = "auction_house")
public class AuctionHouse {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @ColumnDefault("'0'")
    @Column(name = "FactionID", columnDefinition = "smallint UNSIGNED not null")
    private Integer factionID;

    @ColumnDefault("'0'")
    @Column(name = "DepositRate", columnDefinition = "tinyint UNSIGNED not null")
    private Short depositRate;

    @ColumnDefault("'0'")
    @Column(name = "ConsignmentRate", columnDefinition = "tinyint UNSIGNED not null")
    private Short consignmentRate;

}