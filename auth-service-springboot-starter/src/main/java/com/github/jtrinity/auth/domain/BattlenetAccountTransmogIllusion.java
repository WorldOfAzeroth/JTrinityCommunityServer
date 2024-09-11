package com.github.jtrinity.auth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "battlenet_account_transmog_illusions")
public class BattlenetAccountTransmogIllusion {
    @EmbeddedId
    private BattlenetAccountTransmogIllusionId id;

    @MapsId("battlenetAccountId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "battlenetAccountId", nullable = false)
    private BattlenetAccount battlenetAccount;

    @ColumnDefault("'0'")
    @Column(name = "illusionMask", columnDefinition = "int UNSIGNED not null")
    private Long illusionMask;

}