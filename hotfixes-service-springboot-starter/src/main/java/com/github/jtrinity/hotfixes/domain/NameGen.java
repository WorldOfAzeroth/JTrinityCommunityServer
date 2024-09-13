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
@Table(name = "name_gen")
@Db2File(name = "NameGen.db2", fileDataId = 1122117, layoutHash = 0xE43165A8)
public class NameGen {
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
    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING_NOT_LOCALIZED)
    private String name;

    @ColumnDefault("'0'")
    @Column(name = "RaceID", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 2, type = Db2Type.BYTE)
    private Short raceID;

    @ColumnDefault("'0'")
    @Column(name = "Sex", columnDefinition = "tinyint UNSIGNED not null")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Short sex;

}