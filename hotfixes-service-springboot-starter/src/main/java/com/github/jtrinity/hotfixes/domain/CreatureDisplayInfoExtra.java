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
@Table(name = "creature_display_info_extra")
public class CreatureDisplayInfoExtra {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @ColumnDefault("0")
    @Column(name = "DisplayRaceID", nullable = false)
    private Byte displayRaceID;

    @ColumnDefault("0")
    @Column(name = "DisplaySexID", nullable = false)
    private Byte displaySexID;

    @ColumnDefault("0")
    @Column(name = "DisplayClassID", nullable = false)
    private Byte displayClassID;

    @ColumnDefault("0")
    @Column(name = "SkinID", nullable = false)
    private Byte skinID;

    @ColumnDefault("0")
    @Column(name = "FaceID", nullable = false)
    private Byte faceID;

    @ColumnDefault("0")
    @Column(name = "HairStyleID", nullable = false)
    private Byte hairStyleID;

    @ColumnDefault("0")
    @Column(name = "HairColorID", nullable = false)
    private Byte hairColorID;

    @ColumnDefault("0")
    @Column(name = "FacialHairID", nullable = false)
    private Byte facialHairID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Byte flags;

    @ColumnDefault("0")
    @Column(name = "BakeMaterialResourcesID", nullable = false)
    private Integer bakeMaterialResourcesID;

    @ColumnDefault("0")
    @Column(name = "HDBakeMaterialResourcesID", nullable = false)
    private Integer hDBakeMaterialResourcesID;

    @ColumnDefault("'0'")
    @Column(name = "CustomDisplayOption1", columnDefinition = "tinyint UNSIGNED not null")
    private Short customDisplayOption1;

    @ColumnDefault("'0'")
    @Column(name = "CustomDisplayOption2", columnDefinition = "tinyint UNSIGNED not null")
    private Short customDisplayOption2;

    @ColumnDefault("'0'")
    @Column(name = "CustomDisplayOption3", columnDefinition = "tinyint UNSIGNED not null")
    private Short customDisplayOption3;

}