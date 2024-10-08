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
@Table(name = "heirloom")
@Db2DataBind(name = "Heirloom.db2", layoutHash = 0x36887C6F, indexField = 9, fields = {
        @Db2Field(name = "sourceText", type = Db2Type.STRING),
        @Db2Field(name = "itemID", type = Db2Type.INT, signed = true),
        @Db2Field(name = "legacyItemID", type = Db2Type.INT, signed = true),
        @Db2Field(name = "legacyUpgradedItemID", type = Db2Type.INT, signed = true),
        @Db2Field(name = "staticUpgradedItemID", type = Db2Type.INT, signed = true),
        @Db2Field(name = {"upgradeItemID1", "upgradeItemID2", "upgradeItemID3"}, type = Db2Type.INT, signed = true),
        @Db2Field(name = {"upgradeItemBonusListID1", "upgradeItemBonusListID2", "upgradeItemBonusListID3"}, type = Db2Type.SHORT),
        @Db2Field(name = "flags", type = Db2Type.BYTE),
        @Db2Field(name = "sourceTypeEnum", type = Db2Type.BYTE, signed = true),
        @Db2Field(name = "id", type = Db2Type.INT)
})
public class Heirloom implements DbcEntity {
    @Column(name = "SourceText")
    private LocalizedString sourceText;

    @Column(name = "ItemID")
    private Integer itemID;

    @Column(name = "LegacyItemID")
    private Integer legacyItemID;

    @Column(name = "LegacyUpgradedItemID")
    private Integer legacyUpgradedItemID;

    @Column(name = "StaticUpgradedItemID")
    private Integer staticUpgradedItemID;

    @Column(name = "UpgradeItemID1")
    private Integer upgradeItemID1;

    @Column(name = "UpgradeItemID2")
    private Integer upgradeItemID2;

    @Column(name = "UpgradeItemID3")
    private Integer upgradeItemID3;

    @Column(name = "UpgradeItemBonusListID1")
    private Short upgradeItemBonusListID1;

    @Column(name = "UpgradeItemBonusListID2")
    private Short upgradeItemBonusListID2;

    @Column(name = "UpgradeItemBonusListID3")
    private Short upgradeItemBonusListID3;

    @Column(name = "Flags")
    private Byte flags;

    @Column(name = "SourceTypeEnum")
    private Byte sourceTypeEnum;

    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

}
