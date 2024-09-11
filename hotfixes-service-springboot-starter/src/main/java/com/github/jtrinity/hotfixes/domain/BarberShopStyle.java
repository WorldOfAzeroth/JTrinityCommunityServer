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
@Table(name = "barber_shop_style")
public class BarberShopStyle {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "DisplayName")
    private String displayName;

    @Lob
    @Column(name = "Description")
    private String description;

    @ColumnDefault("'0'")
    @Column(name = "Type", columnDefinition = "tinyint UNSIGNED not null")
    private Short type;

    @ColumnDefault("0")
    @Column(name = "CostModifier", nullable = false)
    private Float costModifier;

    @ColumnDefault("'0'")
    @Column(name = "Race", columnDefinition = "tinyint UNSIGNED not null")
    private Short race;

    @ColumnDefault("'0'")
    @Column(name = "Sex", columnDefinition = "tinyint UNSIGNED not null")
    private Short sex;

    @ColumnDefault("'0'")
    @Column(name = "Data", columnDefinition = "tinyint UNSIGNED not null")
    private Short data;

}