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
@Table(name = "reward_pack_x_currency_type")
public class RewardPackXCurrencyType {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyTypeID", columnDefinition = "int UNSIGNED not null")
    private Long currencyTypeID;

    @ColumnDefault("0")
    @Column(name = "Quantity", nullable = false)
    private Integer quantity;

    @ColumnDefault("'0'")
    @Column(name = "RewardPackID", columnDefinition = "int UNSIGNED not null")
    private Long rewardPackID;

}