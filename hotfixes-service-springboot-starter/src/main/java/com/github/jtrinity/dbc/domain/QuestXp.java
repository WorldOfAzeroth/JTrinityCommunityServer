package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.db2.Db2Field;
import com.github.jtrinity.dbc.db2.Db2DataBind;
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
@Table(name = "quest_xp")
@Db2DataBind(name = "QuestXP.db2", layoutHash = 0xCB76B4C0, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = {"difficulty1", "difficulty2", "difficulty3", "difficulty4", "difficulty5", "difficulty6", "difficulty7", "difficulty8", "difficulty9", "difficulty10"}, type = Db2Type.SHORT)
})
public class QuestXp implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Difficulty1")
    private Short difficulty1;

    @Column(name = "Difficulty2")
    private Short difficulty2;

    @Column(name = "Difficulty3")
    private Short difficulty3;

    @Column(name = "Difficulty4")
    private Short difficulty4;

    @Column(name = "Difficulty5")
    private Short difficulty5;

    @Column(name = "Difficulty6")
    private Short difficulty6;

    @Column(name = "Difficulty7")
    private Short difficulty7;

    @Column(name = "Difficulty8")
    private Short difficulty8;

    @Column(name = "Difficulty9")
    private Short difficulty9;

    @Column(name = "Difficulty10")
    private Short difficulty10;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
