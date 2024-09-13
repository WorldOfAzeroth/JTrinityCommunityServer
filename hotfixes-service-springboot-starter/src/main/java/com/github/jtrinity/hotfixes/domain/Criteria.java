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
@Table(name = "criteria")
@Db2File(name = "Criteria.db2", fileDataId = 1263817, layoutHash = 0x2C87F5ED)
public class Criteria {
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
    @Column(name = "Type", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT, signed = true)
    private Short type;

    @ColumnDefault("0")
    @Column(name = "Asset", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer asset;

    @ColumnDefault("'0'")
    @Column(name = "ModifierTreeId", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long modifierTreeId;

    @ColumnDefault("0")
    @Column(name = "StartEvent", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer startEvent;

    @ColumnDefault("0")
    @Column(name = "StartAsset", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer startAsset;

    @ColumnDefault("'0'")
    @Column(name = "StartTimer", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.SHORT)
    private Integer startTimer;

    @ColumnDefault("0")
    @Column(name = "FailEvent", nullable = false)
    @Db2Field(fieldIndex = 7, type = Db2Type.INT, signed = true)
    private Integer failEvent;

    @ColumnDefault("0")
    @Column(name = "FailAsset", nullable = false)
    @Db2Field(fieldIndex = 8, type = Db2Type.INT, signed = true)
    private Integer failAsset;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    @Db2Field(fieldIndex = 9, type = Db2Type.INT, signed = true)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "EligibilityWorldStateID", nullable = false)
    @Db2Field(fieldIndex = 10, type = Db2Type.SHORT, signed = true)
    private Short eligibilityWorldStateID;

    @ColumnDefault("0")
    @Column(name = "EligibilityWorldStateValue", nullable = false)
    @Db2Field(fieldIndex = 11, type = Db2Type.BYTE, signed = true)
    private Byte eligibilityWorldStateValue;

}