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
@Table(name = "azerite_power_set_member")
public class AzeritePowerSetMember {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("'0'")
    @Column(name = "AzeritePowerSetID", columnDefinition = "int UNSIGNED not null")
    private Long azeritePowerSetID;

    @ColumnDefault("0")
    @Column(name = "AzeritePowerID", nullable = false)
    private Integer azeritePowerID;

    @ColumnDefault("0")
    @Column(name = "Class", nullable = false)
    private Integer classField;

    @ColumnDefault("'0'")
    @Column(name = "Tier", columnDefinition = "tinyint UNSIGNED not null")
    private Short tier;

    @ColumnDefault("0")
    @Column(name = "OrderIndex", nullable = false)
    private Integer orderIndex;

}