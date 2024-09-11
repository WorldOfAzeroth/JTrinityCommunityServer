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
@Table(name = "mount_capability")
public class MountCapability {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "ReqRidingSkill", columnDefinition = "smallint UNSIGNED not null")
    private Integer reqRidingSkill;

    @ColumnDefault("'0'")
    @Column(name = "ReqAreaID", columnDefinition = "smallint UNSIGNED not null")
    private Integer reqAreaID;

    @ColumnDefault("'0'")
    @Column(name = "ReqSpellAuraID", columnDefinition = "int UNSIGNED not null")
    private Long reqSpellAuraID;

    @ColumnDefault("0")
    @Column(name = "ReqSpellKnownID", nullable = false)
    private Integer reqSpellKnownID;

    @ColumnDefault("0")
    @Column(name = "ModSpellAuraID", nullable = false)
    private Integer modSpellAuraID;

    @ColumnDefault("0")
    @Column(name = "ReqMapID", nullable = false)
    private Short reqMapID;

}