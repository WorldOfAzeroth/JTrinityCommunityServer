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
@Table(name = "friendship_rep_reaction")
@Db2DataBind(name = "FriendshipRepReaction.db2", layoutHash = 0x9C412E5B, parentIndexField = 2, fields = {
        @Db2Field(name = "id", type = Db2Type.INT),
        @Db2Field(name = "reaction", type = Db2Type.STRING),
        @Db2Field(name = "reactionThreshold", type = Db2Type.SHORT),
        @Db2Field(name = "friendshipRepID", type = Db2Type.BYTE)
})
public class FriendshipRepReaction implements DbcEntity {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Column(name = "Reaction")
    private LocalizedString reaction;

    @Column(name = "ReactionThreshold")
    private Short reactionThreshold;

    @Column(name = "FriendshipRepID")
    private Byte friendshipRepID;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
