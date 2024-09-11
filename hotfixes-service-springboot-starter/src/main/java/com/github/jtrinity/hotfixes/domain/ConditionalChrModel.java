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
@Table(name = "conditional_chr_model")
public class ConditionalChrModel {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "ChrModelID", columnDefinition = "int UNSIGNED not null")
    private Long chrModelID;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationReqID", nullable = false)
    private Integer chrCustomizationReqID;

    @ColumnDefault("0")
    @Column(name = "PlayerConditionID", nullable = false)
    private Integer playerConditionID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("0")
    @Column(name = "ChrCustomizationCategoryID", nullable = false)
    private Integer chrCustomizationCategoryID;

}