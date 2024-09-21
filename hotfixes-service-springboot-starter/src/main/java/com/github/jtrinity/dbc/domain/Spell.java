package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.common.LocalizedString;
import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2File;
import com.github.jtrinity.dbc.db2.Db2Type;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@ToString
@IdClass(DB2Id.class)
@Entity
@Table(name = "spell")
@Db2File(name = "Spell.db2", layoutHash = 0x2273DFFF)
public class Spell implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Name")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString name;


    @Column(name = "NameSubtext")
    @Db2Field(fieldIndex = 2, type = Db2Type.STRING)
    private LocalizedString nameSubtext;


    @Column(name = "Description")
    @Db2Field(fieldIndex = 3, type = Db2Type.STRING)
    private LocalizedString description;


    @Column(name = "AuraDescription")
    @Db2Field(fieldIndex = 4, type = Db2Type.STRING)
    private LocalizedString auraDescription;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
