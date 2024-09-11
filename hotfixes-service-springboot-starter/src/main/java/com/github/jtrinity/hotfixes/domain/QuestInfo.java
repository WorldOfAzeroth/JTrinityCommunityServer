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
@Table(name = "quest_info")
public class QuestInfo {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "InfoName")
    private String infoName;

    @ColumnDefault("0")
    @Column(name = "Type", nullable = false)
    private Byte type;

    @ColumnDefault("0")
    @Column(name = "Modifiers", nullable = false)
    private Integer modifiers;

    @ColumnDefault("'0'")
    @Column(name = "Profession", columnDefinition = "smallint UNSIGNED not null")
    private Integer profession;

}