package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Db2File(name = "CurrencyContainer.db2", fileDataId = 1934603, layoutHash = 0x43B60080, parentIndexField = 7)
public class CurrencyContainer {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "ContainerName")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String containerName;

    @Lob
    @Column(name = "ContainerDescription")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String containerDescription;

    @ColumnDefault("0")
    @Column(name = "MinAmount", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer minAmount;

    @ColumnDefault("0")
    @Column(name = "MaxAmount", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer maxAmount;

    @ColumnDefault("0")
    @Column(name = "ContainerIconID", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer containerIconID;

    @ColumnDefault("0")
    @Column(name = "ContainerQuality", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.INT, signed = true)
    private Integer containerQuality;

    @ColumnDefault("0")
    @Column(name = "OnLootSpellVisualKitID", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer onLootSpellVisualKitID;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyTypesID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 8, type = Db2Type.INT)
    private Long currencyTypesID;

}