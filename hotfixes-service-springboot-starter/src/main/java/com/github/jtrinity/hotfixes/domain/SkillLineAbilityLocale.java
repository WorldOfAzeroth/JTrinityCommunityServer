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
@Table(name = "skill_line_ability_locale")
public class SkillLineAbilityLocale {
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
    @Column(name = "AbilityVerb_lang")
    private String abilityverbLang;

    @Lob
    @Column(name = "AbilityAllVerb_lang")
    private String abilityallverbLang;

}