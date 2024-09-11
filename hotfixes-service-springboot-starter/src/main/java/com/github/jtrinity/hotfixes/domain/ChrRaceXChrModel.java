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
@Table(name = "chr_race_x_chr_model")
public class ChrRaceXChrModel {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ChrRacesID", nullable = false)
    private Integer chrRacesID;

    @ColumnDefault("0")
    @Column(name = "ChrModelID", nullable = false)
    private Integer chrModelID;

    @ColumnDefault("0")
    @Column(name = "Sex", nullable = false)
    private Integer sex;

    @ColumnDefault("0")
    @Column(name = "AllowedTransmogSlots", nullable = false)
    private Integer allowedTransmogSlots;

}