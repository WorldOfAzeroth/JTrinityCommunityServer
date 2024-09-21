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
@Table(name = "friendship_rep_reaction")
@Db2File(name = "FriendshipRepReaction.db2", layoutHash = 0x9C412E5B, parentIndexField = 2)
public class FriendshipRepReaction implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    @Db2Field(fieldIndex = 0, type = Db2Type.INT)
    private Integer id;


    @Column(name = "Reaction")
    @Db2Field(fieldIndex = 1, type = Db2Type.STRING)
    private LocalizedString reaction;


    @Column(name = "ReactionThreshold")
    @Db2Field(fieldIndex = 2, type = Db2Type.SHORT)
    private Short reactionThreshold;


    @Column(name = "FriendshipRepID")
    @Db2Field(fieldIndex = 3, type = Db2Type.BYTE)
    private Byte friendshipRepID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;


}
