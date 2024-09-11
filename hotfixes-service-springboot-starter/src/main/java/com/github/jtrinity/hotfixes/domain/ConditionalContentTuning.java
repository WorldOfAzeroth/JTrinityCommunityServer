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
@Table(name = "conditional_content_tuning")
public class ConditionalContentTuning {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "OrderIndex", nullable = false)
    private Integer orderIndex;

    @ColumnDefault("0")
    @Column(name = "RedirectContentTuningID", nullable = false)
    private Integer redirectContentTuningID;

    @ColumnDefault("0")
    @Column(name = "RedirectFlag", nullable = false)
    private Integer redirectFlag;

    @ColumnDefault("'0'")
    @Column(name = "ParentContentTuningID", columnDefinition = "int UNSIGNED not null")
    private Long parentContentTuningID;

}