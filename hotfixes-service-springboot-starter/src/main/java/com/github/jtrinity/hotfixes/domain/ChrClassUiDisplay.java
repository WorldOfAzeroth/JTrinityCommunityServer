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
@Table(name = "chr_class_ui_display")
@Db2File(name = "ChrClassUIDisplay.db2", fileDataId = 1316515, layoutHash = 0x89E07C1C)
public class ChrClassUiDisplay {
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
    @Column(name = "ChrClassesID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 1, type = Db2Type.BYTE)
    private Short chrClassesID;

    @ColumnDefault("'0'")
    @Column(name = "AdvGuidePlayerConditionID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.INT)
    private Long advGuidePlayerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "SplashPlayerConditionID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.INT)
    private Long splashPlayerConditionID;

}