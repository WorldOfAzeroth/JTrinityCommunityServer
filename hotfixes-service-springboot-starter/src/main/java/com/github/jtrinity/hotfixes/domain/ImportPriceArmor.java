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
@Table(name = "import_price_armor")
public class ImportPriceArmor {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "ClothModifier", nullable = false)
    private Float clothModifier;

    @ColumnDefault("0")
    @Column(name = "LeatherModifier", nullable = false)
    private Float leatherModifier;

    @ColumnDefault("0")
    @Column(name = "ChainModifier", nullable = false)
    private Float chainModifier;

    @ColumnDefault("0")
    @Column(name = "PlateModifier", nullable = false)
    private Float plateModifier;

}