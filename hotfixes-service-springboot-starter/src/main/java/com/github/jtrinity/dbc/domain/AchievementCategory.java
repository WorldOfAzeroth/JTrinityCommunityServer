package com.github.jtrinity.dbc.domain;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.common.LocalizedString;
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
@Table(name = "achievement_category")
@Db2DataBind(name = "Achievement_Category.db2", layoutHash = 0xED226BC9, indexField = 3, parentIndexField = 2, fields = {
        @Db2Field(name = "name", type = Db2Type.STRING),
        @Db2Field(name = "parent", type = Db2Type.SHORT),
        @Db2Field(name = "uiOrder", type = Db2Type.BYTE),
        @Db2Field(name = "id", type = Db2Type.INT, signed = true)
})
public class AchievementCategory implements DbcEntity {
    @Column(name = "Name")
    private LocalizedString name;

    @Column(name = "Parent")
    private Short parent;

    @Column(name = "UiOrder")
    private Byte uiOrder;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
