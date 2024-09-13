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
@Table(name = "reward_pack")
@Db2File(name = "RewardPack.db2", fileDataId = 1307156, layoutHash = 0x214B9595)
public class RewardPack {
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
    @Column(name = "CharTitleID", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer charTitleID;

    @ColumnDefault("'0'")
    @Column(name = "Money", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Long money;

    @ColumnDefault("0")
    @Column(name = "ArtifactXPDifficulty", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE, signed = true)
    private Byte artifactXPDifficulty;

    @ColumnDefault("0")
    @Column(name = "ArtifactXPMultiplier", nullable = false)
    @Db2Field(fieldIndex = 4, type = Db2Type.FLOAT)
    private Float artifactXPMultiplier;

    @ColumnDefault("'0'")
    @Column(name = "ArtifactXPCategoryID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 5, type = Db2Type.BYTE)
    private Short artifactXPCategoryID;

    @ColumnDefault("'0'")
    @Column(name = "TreasurePickerID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Long treasurePickerID;

}