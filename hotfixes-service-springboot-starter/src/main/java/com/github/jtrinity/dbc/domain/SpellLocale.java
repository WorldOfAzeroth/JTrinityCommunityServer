package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
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
@Table(name = "spell_locale")
public class SpellLocale {
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
    @Column(name = "Name")
    private String name;

    @Lob
    @Column(name = "NameSubtext")
    private String nameSubtext;

    @Lob
    @Column(name = "Description")
    private String description;

    @Lob
    @Column(name = "AuraDescription")
    private String auraDescription;

}