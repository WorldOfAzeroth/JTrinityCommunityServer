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
@Table(name = "conditional_content_tuning")
@Db2File(name = "ConditionalContentTuning.db2", fileDataId = 3501965, layoutHash = 0x8DF8B6EC, parentIndexField = 3)
public class ConditionalContentTuning {
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
    @Column(name = "OrderIndex", nullable = false)
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer orderIndex;

    @ColumnDefault("0")
    @Column(name = "RedirectContentTuningID", nullable = false)
    @Db2Field(fieldIndex = 2, type = Db2Type.INT, signed = true)
    private Integer redirectContentTuningID;

    @ColumnDefault("0")
    @Column(name = "RedirectFlag", nullable = false)
    @Db2Field(fieldIndex = 3, type = Db2Type.INT, signed = true)
    private Integer redirectFlag;

    @ColumnDefault("'0'")
    @Column(name = "ParentContentTuningID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 4, type = Db2Type.INT)
    private Long parentContentTuningID;

}