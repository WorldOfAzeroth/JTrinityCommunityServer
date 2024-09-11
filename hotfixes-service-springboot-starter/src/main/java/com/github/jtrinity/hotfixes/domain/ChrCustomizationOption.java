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
@Table(name = "chr_customization_option")
public class ChrCustomizationOption {
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
    @Column(name = "SecondaryID", columnDefinition = "smallint UNSIGNED not null")
    private Integer secondaryID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "ChrRacesID", columnDefinition = "int UNSIGNED not null")
    private Long chrRacesID;

    @ColumnDefault("0")
    @Column(name = "Sex", nullable = false)
    private Integer sex;

    @ColumnDefault("0")
    @Column(name = "ChrModelID", nullable = false)
    private Integer chrModelID;

    @ColumnDefault("0")
    @Column(name = "SortIndex", nullable = false)
    private Integer sortIndex;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationCategoryID", nullable = false)
    private Integer chrCustomizationCategoryID;

    @ColumnDefault("0")
    @Column(name = "OptionType", nullable = false)
    private Integer optionType;

    @ColumnDefault("0")
    @Column(name = "BarberShopCostModifier", nullable = false)
    private Float barberShopCostModifier;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationID", nullable = false)
    private Integer chrCustomizationID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationReqID", nullable = false)
    private Integer chrCustomizationReqID;

    @ColumnDefault("0")
    @Column(name = "UiOrderIndex", nullable = false)
    private Integer uiOrderIndex;

}