package com.github.jtrinity.hotfixes.domain;

import com.github.jtrinity.hotfixes.db2.Db2Field;
import com.github.jtrinity.hotfixes.db2.Db2File;
import com.github.jtrinity.hotfixes.db2.Db2Type;

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
@Table(name = "language_words")
@Db2File(name = "LanguageWords.db2", fileDataId = 984702, layoutHash = 0x3FD82B89)
public class LanguageWord {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Word")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String word;

    @ColumnDefault("'0'")
    @Column(name = "LanguageID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Short languageID;

}