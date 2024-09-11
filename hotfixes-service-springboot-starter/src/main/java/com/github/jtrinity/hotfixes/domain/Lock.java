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
@Table(name = "`lock`")
public class Lock {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Index1", nullable = false)
    private Integer index1;

    @ColumnDefault("0")
    @Column(name = "Index2", nullable = false)
    private Integer index2;

    @ColumnDefault("0")
    @Column(name = "Index3", nullable = false)
    private Integer index3;

    @ColumnDefault("0")
    @Column(name = "Index4", nullable = false)
    private Integer index4;

    @ColumnDefault("0")
    @Column(name = "Index5", nullable = false)
    private Integer index5;

    @ColumnDefault("0")
    @Column(name = "Index6", nullable = false)
    private Integer index6;

    @ColumnDefault("0")
    @Column(name = "Index7", nullable = false)
    private Integer index7;

    @ColumnDefault("0")
    @Column(name = "Index8", nullable = false)
    private Integer index8;

    @ColumnDefault("'0'")
    @Column(name = "Skill1", columnDefinition = "smallint UNSIGNED not null")
    private Integer skill1;

    @ColumnDefault("'0'")
    @Column(name = "Skill2", columnDefinition = "smallint UNSIGNED not null")
    private Integer skill2;

    @ColumnDefault("'0'")
    @Column(name = "Skill3", columnDefinition = "smallint UNSIGNED not null")
    private Integer skill3;

    @ColumnDefault("'0'")
    @Column(name = "Skill4", columnDefinition = "smallint UNSIGNED not null")
    private Integer skill4;

    @ColumnDefault("'0'")
    @Column(name = "Skill5", columnDefinition = "smallint UNSIGNED not null")
    private Integer skill5;

    @ColumnDefault("'0'")
    @Column(name = "Skill6", columnDefinition = "smallint UNSIGNED not null")
    private Integer skill6;

    @ColumnDefault("'0'")
    @Column(name = "Skill7", columnDefinition = "smallint UNSIGNED not null")
    private Integer skill7;

    @ColumnDefault("'0'")
    @Column(name = "Skill8", columnDefinition = "smallint UNSIGNED not null")
    private Integer skill8;

    @ColumnDefault("'0'")
    @Column(name = "Type1", columnDefinition = "tinyint UNSIGNED not null")
    private Short type1;

    @ColumnDefault("'0'")
    @Column(name = "Type2", columnDefinition = "tinyint UNSIGNED not null")
    private Short type2;

    @ColumnDefault("'0'")
    @Column(name = "Type3", columnDefinition = "tinyint UNSIGNED not null")
    private Short type3;

    @ColumnDefault("'0'")
    @Column(name = "Type4", columnDefinition = "tinyint UNSIGNED not null")
    private Short type4;

    @ColumnDefault("'0'")
    @Column(name = "Type5", columnDefinition = "tinyint UNSIGNED not null")
    private Short type5;

    @ColumnDefault("'0'")
    @Column(name = "Type6", columnDefinition = "tinyint UNSIGNED not null")
    private Short type6;

    @ColumnDefault("'0'")
    @Column(name = "Type7", columnDefinition = "tinyint UNSIGNED not null")
    private Short type7;

    @ColumnDefault("'0'")
    @Column(name = "Type8", columnDefinition = "tinyint UNSIGNED not null")
    private Short type8;

    @ColumnDefault("'0'")
    @Column(name = "Action1", columnDefinition = "tinyint UNSIGNED not null")
    private Short action1;

    @ColumnDefault("'0'")
    @Column(name = "Action2", columnDefinition = "tinyint UNSIGNED not null")
    private Short action2;

    @ColumnDefault("'0'")
    @Column(name = "Action3", columnDefinition = "tinyint UNSIGNED not null")
    private Short action3;

    @ColumnDefault("'0'")
    @Column(name = "Action4", columnDefinition = "tinyint UNSIGNED not null")
    private Short action4;

    @ColumnDefault("'0'")
    @Column(name = "Action5", columnDefinition = "tinyint UNSIGNED not null")
    private Short action5;

    @ColumnDefault("'0'")
    @Column(name = "Action6", columnDefinition = "tinyint UNSIGNED not null")
    private Short action6;

    @ColumnDefault("'0'")
    @Column(name = "Action7", columnDefinition = "tinyint UNSIGNED not null")
    private Short action7;

    @ColumnDefault("'0'")
    @Column(name = "Action8", columnDefinition = "tinyint UNSIGNED not null")
    private Short action8;

}