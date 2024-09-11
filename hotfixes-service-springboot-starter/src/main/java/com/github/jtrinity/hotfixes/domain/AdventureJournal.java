package com.github.jtrinity.hotfixes.domain;

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
@Table(name = "adventure_journal")
public class AdventureJournal {
    @Id
    @ColumnDefault("'0'")
    @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
    private Integer id;

    @Id
    @ColumnDefault("0")
    @Column(name = "VerifiedBuild", nullable = false)
    private Integer verifiedBuild;

    @Lob
    @Column(name = "Name")
    private String name;

    @Lob
    @Column(name = "Description")
    private String description;

    @Lob
    @Column(name = "ButtonText")
    private String buttonText;

    @Lob
    @Column(name = "RewardDescription")
    private String rewardDescription;

    @Lob
    @Column(name = "ContinueDescription")
    private String continueDescription;

    @ColumnDefault("'0'")
    @Column(name = "Type", columnDefinition = "tinyint UNSIGNED not null")
    private Short type;

    @ColumnDefault("'0'")
    @Column(name = "PlayerConditionID", columnDefinition = "int UNSIGNED not null")
    private Long playerConditionID;

    @ColumnDefault("0")
    @Column(name = "Flags", nullable = false)
    private Integer flags;

    @ColumnDefault("'0'")
    @Column(name = "ButtonActionType", columnDefinition = "tinyint UNSIGNED not null")
    private Short buttonActionType;

    @ColumnDefault("0")
    @Column(name = "TextureFileDataID", nullable = false)
    private Integer textureFileDataID;

    @ColumnDefault("'0'")
    @Column(name = "LfgDungeonID", columnDefinition = "smallint UNSIGNED not null")
    private Integer lfgDungeonID;

    @ColumnDefault("'0'")
    @Column(name = "QuestID", columnDefinition = "int UNSIGNED not null")
    private Long questID;

    @ColumnDefault("'0'")
    @Column(name = "BattleMasterListID", columnDefinition = "smallint UNSIGNED not null")
    private Integer battleMasterListID;

    @ColumnDefault("'0'")
    @Column(name = "PriorityMin", columnDefinition = "tinyint UNSIGNED not null")
    private Short priorityMin;

    @ColumnDefault("'0'")
    @Column(name = "PriorityMax", columnDefinition = "tinyint UNSIGNED not null")
    private Short priorityMax;

    @ColumnDefault("0")
    @Column(name = "ItemID", nullable = false)
    private Integer itemID;

    @ColumnDefault("'0'")
    @Column(name = "ItemQuantity", columnDefinition = "int UNSIGNED not null")
    private Long itemQuantity;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyType", columnDefinition = "smallint UNSIGNED not null")
    private Integer currencyType;

    @ColumnDefault("'0'")
    @Column(name = "CurrencyQuantity", columnDefinition = "tinyint UNSIGNED not null")
    private Short currencyQuantity;

    @ColumnDefault("'0'")
    @Column(name = "UiMapID", columnDefinition = "smallint UNSIGNED not null")
    private Integer uiMapID;

    @ColumnDefault("'0'")
    @Column(name = "BonusPlayerConditionID1", columnDefinition = "int UNSIGNED not null")
    private Long bonusPlayerConditionID1;

    @ColumnDefault("'0'")
    @Column(name = "BonusPlayerConditionID2", columnDefinition = "int UNSIGNED not null")
    private Long bonusPlayerConditionID2;

    @ColumnDefault("'0'")
    @Column(name = "BonusValue1", columnDefinition = "tinyint UNSIGNED not null")
    private Short bonusValue1;

    @ColumnDefault("'0'")
    @Column(name = "BonusValue2", columnDefinition = "tinyint UNSIGNED not null")
    private Short bonusValue2;

}