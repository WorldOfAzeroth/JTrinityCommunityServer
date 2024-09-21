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
@Table(name = "world_effect")
@Db2File(name = "WorldEffect.db2", layoutHash = 0x2E9B9BFD)
public class WorldEffect implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "TargetAsset")
    @Db2Field(fieldIndex = 1, type = Db2Type.INT, signed = true)
    private Integer targetAsset;


    @Column(name = "CombatConditionID")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short combatConditionID;


    @Column(name = "TargetType")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte targetType;


    @Column(name = "WhenToDisplay")
    @Db2Field(fieldIndex = 4, type = Db2Type.BYTE)
    private Byte whenToDisplay;


    @Column(name = "QuestFeedbackEffectID")
    @Db2Field(fieldIndex = 5, type = Db2Type.INT)
    private Integer questFeedbackEffectID;


    @Column(name = "PlayerConditionID")
    @Db2Field(fieldIndex = 6, type = Db2Type.INT)
    private Integer playerConditionID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
