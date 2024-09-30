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
@Table(name = "quest_info")
@Db2DataBind(name = "QuestInfo.db2", layoutHash = 0x4F45F445, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "infoName", type = Db2Type.STRING),
        @Db2Field(name = "profession", type = Db2Type.SHORT),
        @Db2Field(name = "type", type = Db2Type.BYTE, signed = true),
        @Db2Field(name = "Modifiers", type = Db2Type.BYTE)
})
public class QuestInfo implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "InfoName")
    private LocalizedString infoName;

    @Column(name = "Profession")
    private Short profession;

    @Column(name = "Type")
    private Byte type;

    @Column(name = "Modifiers")
    private Byte Modifiers;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
