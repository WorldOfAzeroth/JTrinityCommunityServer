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
@Table(name = "achievement")
@Db2File(name = "Achievement.db2", layoutHash = 0x2C4BE18C, indexField = 12, parentIndexField = 7)
public class Achievement implements DbcEntity {

    @Column(name = "Title")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private LocalizedString title;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "Reward")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString reward;


    @Column(name = "Flags")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer flags;


    @Column(name = "InstanceID")
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT, signed = true)
    private Short instanceID;


    @Column(name = "Supercedes")
    @Db2Field(fieldIndex = 5, type = Db2Type.SHORT, signed = true)
    private Short supercedes;


    @Column(name = "Category")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT, signed = true)
    private Short category;


    @Column(name = "UiOrder")
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT, signed = true)
    private Short uiOrder;


    @Column(name = "SharesCriteria")
    @Db2Field(fieldIndex = 8, type = Db2Type.SHORT, signed = true)
    private Short sharesCriteria;


    @Column(name = "Faction")
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte faction;


    @Column(name = "Points")
    @Db2Field(fieldIndex = 10, type = Db2Type.BYTE, signed = true)
    private Byte points;


    @Column(name = "MinimumCriteria")
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE, signed = true)
    private Byte minimumCriteria;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 12, type = Db2Type.INT)
    private Integer id;


    @Column(name = "IconFileID")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT, signed = true)
    private Integer iconFileID;


    @Column(name = "CriteriaTree")
    @Db2Field(fieldIndex = 14, type = Db2Type.INT)
    private Integer criteriaTree;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
