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
@IdClass(DB2LocaleId.class)
@Entity
@Table(name = "armor_location")
@Db2File(name = "ArmorLocation.db2", fileDataId = 1284818, layoutHash = 0x6FA608FB)
public class ArmorLocation {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Clothmodifier", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float clothmodifier;

    @ColumnDefault("0")
    @Column(name = "Leathermodifier", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float leathermodifier;

    @ColumnDefault("0")
    @Column(name = "Chainmodifier", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float chainmodifier;

    @ColumnDefault("0")
    @Column(name = "Platemodifier", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float platemodifier;

    @ColumnDefault("0")
    @Column(name = "Modifier", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float modifier;

}