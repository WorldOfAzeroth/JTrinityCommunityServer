package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2File;
import com.github.jtrinity.dbc.db2.Db2Type;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString
@IdClass(DB2Id.class)
@Entity
@Table(name = "armor_location")
@Db2File(name = "ArmorLocation.db2", layoutHash = 0xCCFBD16E)
public class ArmorLocation implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Clothmodifier")
    @Db2Field(fieldIndex = 1, type = Db2Type.FLOAT)
    private Float clothModifier;


    @Column(name = "Leathermodifier")
    @Db2Field(fieldIndex = 2, type = Db2Type.FLOAT)
    private Float leatherModifier;


    @Column(name = "Chainmodifier")
    @Db2Field(fieldIndex = 3, type = Db2Type.FLOAT)
    private Float chainModifier;


    @Column(name = "Platemodifier")
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float plateModifier;


    @Column(name = "Modifier")
    @Db2Field(fieldIndex = 5, type = Db2Type.FLOAT)
    private Float Modifier;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
