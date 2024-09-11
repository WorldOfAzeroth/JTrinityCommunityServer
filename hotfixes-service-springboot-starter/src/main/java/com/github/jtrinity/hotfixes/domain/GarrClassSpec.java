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
@Table(name = "garr_class_spec")
public class GarrClassSpec {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "ClassSpec")
    private String classSpec;

    @Lob
    @Column(name = "ClassSpecMale")
    private String classSpecMale;

    @Lob
    @Column(name = "ClassSpecFemale")
    private String classSpecFemale;

    @ColumnDefault("'0'")
    @Column(name = "UiTextureAtlasMemberID", columnDefinition = "smallint UNSIGNED not null")
    private Integer uiTextureAtlasMemberID;

    @ColumnDefault("'0'")
    @Column(name = "GarrFollItemSetID", columnDefinition = "smallint UNSIGNED not null")
    private Integer garrFollItemSetID;

    @ColumnDefault("'0'")
    @Column(name = "FollowerClassLimit", columnDefinition = "tinyint UNSIGNED not null")
    private Short followerClassLimit;

    @ColumnDefault("'0'")
    @Column(name = "Flags", columnDefinition = "tinyint UNSIGNED not null")
    private Short flags;

}