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
@Table(name = "achievement")
@Db2File(name = "Achievement.db2", fileDataId = 1260179, layoutHash = 0xB885355D, indexField = 3, parentIndexField = 11)
public class Achievement {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Description")
    @Db2Field(fieldIndex = 0, type = Db2Type.STRING)
    private String description;

    @Lob
    @Column(name = "Title")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String title;

    @Lob
    @Column(name = "Reward")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private String reward;

    @ColumnDefault("0")
    @Column(name = "InstanceID", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.SHORT, signed = true)
    private Short instanceID;

    @ColumnDefault("0")
    @Column(name = "Faction", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE, signed = true)
    private Byte faction;

    @ColumnDefault("0")
    @Column(name = "Supercedes", nullable = false)
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT, signed = true)
    private Short supercedes;

    @ColumnDefault("0")
    @Column(name = "Category", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.SHORT, signed = true)
    private Short category;

    @ColumnDefault("0")
    @Column(name = "MinimumCriteria", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.BYTE, signed = true)
    private Byte minimumCriteria;

    @ColumnDefault("0")
    @Column(name = "Points", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.BYTE, signed = true)
    private Byte points;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "UiOrder", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.SHORT, signed = true)
    private Short uiOrder;

    @ColumnDefault("0")
    @Column(name = "IconFileID", nullable = false)
    @Db2Field(fieldIndex = 12, type = Db2Type.INT, signed = true)
    private Integer iconFileID;

    @ColumnDefault("'0'")
    @Column(name = "CriteriaTree", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 13, type = Db2Type.INT)
    private Long criteriaTree;

    @ColumnDefault("0")
    @Column(name = "SharesCriteria", nullable = false)
    @Db2Field(fieldIndex = 14, type = Db2Type.SHORT, signed = true)
    private Short sharesCriteria;

}