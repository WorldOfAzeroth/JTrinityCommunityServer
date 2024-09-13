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
@Table(name = "map_difficulty_x_condition")
@Db2File(name = "MapDifficultyXCondition.db2", fileDataId = 1375435, layoutHash = 0x08E872DB, parentIndexField = 3)
public class MapDifficultyXCondition {
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
    @Column(name = "FailureDescription")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private String failureDescription;

    @ColumnDefault("'0'")
    @Column(name = "PlayerConditionID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Long playerConditionID;

    @ColumnDefault("0")
    @Column(name = "OrderIndex", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer orderIndex;

    @ColumnDefault("'0'")
    @Column(name = "MapDifficultyID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Long mapDifficultyID;

}