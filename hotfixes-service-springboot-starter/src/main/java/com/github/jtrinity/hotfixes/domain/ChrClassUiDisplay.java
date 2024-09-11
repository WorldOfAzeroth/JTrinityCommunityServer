package com.github.jtrinity.hotfixes.domain;

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
public class ChrClassUiDisplay {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "ChrClassesID", columnDefinition = "tinyint UNSIGNED not null")
    private Short chrClassesID;

    @ColumnDefault("'0'")
    @Column(name = "AdvGuidePlayerConditionID", columnDefinition = "int UNSIGNED not null")
    private Long advGuidePlayerConditionID;

    @ColumnDefault("'0'")
    @Column(name = "SplashPlayerConditionID", columnDefinition = "int UNSIGNED not null")
    private Long splashPlayerConditionID;

}