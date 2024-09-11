package com.github.jtrinity.hotfixes.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@IdClass(DB2LocaleId.class)
@Entity
@Table(name = "garr_building_locale")
public class GarrBuildingLocale {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @Column(name = "locale", nullable = false, length = 4)
    private String locale;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "HordeName_lang")
    private String hordenameLang;

    @Lob
    @Column(name = "AllianceName_lang")
    private String alliancenameLang;

    @Lob
    @Column(name = "Description_lang")
    private String descriptionLang;

    @Lob
    @Column(name = "Tooltip_lang")
    private String tooltipLang;

}