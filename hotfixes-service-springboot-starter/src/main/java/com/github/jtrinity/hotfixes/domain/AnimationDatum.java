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
@Table(name = "animation_data")
@Db2File(name = "AnimationData.db2", fileDataId = 1375431, layoutHash = 0xE4D647E7)
public class AnimationDatum {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "Fallback", columnDefinition = "smallint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.SHORT)
    private Integer fallback;

    @ColumnDefault("'0'")
    @Column(name = "BehaviorTier", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Short behaviorTier;

    @ColumnDefault("0")
    @Column(name = "BehaviorID", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer behaviorID;

    @ColumnDefault("0")
    @Column(name = "Flags1", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.INT, signed = true)
    private Integer flags1;

    @ColumnDefault("0")
    @Column(name = "Flags2", nullable = false)
    @Db2Field(fieldIndex = 5, type = Db2Type.INT, signed = true)
    private Integer flags2;

}