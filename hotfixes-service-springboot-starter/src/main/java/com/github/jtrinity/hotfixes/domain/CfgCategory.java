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
@Table(name = "cfg_categories")
public class CfgCategory {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @ColumnDefault("'0'")
    @Column(name = "LocaleMask", columnDefinition = "smallint UNSIGNED not null")
    private Integer localeMask;

    @ColumnDefault("'0'")
    @Column(name = "CreateCharsetMask", columnDefinition = "tinyint UNSIGNED not null")
    private Short createCharsetMask;

    @ColumnDefault("'0'")
    @Column(name = "ExistingCharsetMask", columnDefinition = "tinyint UNSIGNED not null")
    private Short existingCharsetMask;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

    @ColumnDefault("0")
    @Column(name = "`Order`", nullable = false)
    private Byte order;

}