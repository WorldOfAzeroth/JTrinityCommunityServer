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
@Table(name = "currency_container")
public class CurrencyContainer {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "ContainerName")
    private String containerName;

    @Lob
    @Column(name = "ContainerDescription")
    private String containerDescription;

    @ColumnDefault("0")
    @Column(name = "MinAmount", nullable = false)
    private Integer minAmount;

    @ColumnDefault("0")
    @Column(name = "MaxAmount", nullable = false)
    private Integer maxAmount;

    @ColumnDefault("0")
    @Column(name = "ContainerIconID", nullable = false)
    private Integer containerIconID;

    @ColumnDefault("0")
    @Column(name = "ContainerQuality", nullable = false)
    private Integer containerQuality;

    @ColumnDefault("0")
    @Column(name = "OnLootSpellVisualKitID", nullable = false)
    private Integer onLootSpellVisualKitID;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyTypesID", columnDefinition = "int UNSIGNED not null")
    private Long currencyTypesID;

}