package com.github.jtrinity.dbc;

import com.github.jtrinity.cache.DbcEntityStore;
import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.domain.*;

public interface DbcObjectManager {

    default DbcEntityStore<Achievement> achievement() {
        return getEntityStore(DbcObjects.Achievement);
    }

    default Achievement achievement(Integer id) {
        return achievement().get(id);
    }

    default DbcEntityStore<AchievementCategory> achievementCategory() {
        return getEntityStore(DbcObjects.AchievementCategory);
    }

    default AchievementCategory achievementCategory(Integer id) {
        return achievementCategory().get(id);
    }

    default DbcEntityStore<AnimationDatum> animationData() {
        return getEntityStore(DbcObjects.AnimationData);
    }

    default AnimationDatum animationData(Integer id) {
        return animationData().get(id);
    }

    default DbcEntityStore<AnimKit> animKit() {
        return getEntityStore(DbcObjects.AnimKit);
    }

    default AnimKit animKit(Integer id) {
        return animKit().get(id);
    }

    default DbcEntityStore<AreaGroupMember> areaGroupMember() {
        return getEntityStore(DbcObjects.AreaGroupMember);
    }

    default AreaGroupMember areaGroupMember(Integer id) {
        return areaGroupMember().get(id);
    }

    default DbcEntityStore<AreaTable> areaTable() {
        return getEntityStore(DbcObjects.AreaTable);
    }

    default AreaTable areaTable(Integer id) {
        return areaTable().get(id);
    }

    default DbcEntityStore<AreaTrigger> areaTrigger() {
        return getEntityStore(DbcObjects.AreaTrigger);
    }

    default AreaTrigger areaTrigger(Integer id) {
        return areaTrigger().get(id);
    }

    default DbcEntityStore<AreaTriggerActionSet> areaTriggerActionSet() {
        return getEntityStore(DbcObjects.AreaTriggerActionSet);
    }

    default AreaTriggerActionSet areaTriggerActionSet(Integer id) {
        return areaTriggerActionSet().get(id);
    }

    default DbcEntityStore<ArmorLocation> armorLocation() {
        return getEntityStore(DbcObjects.ArmorLocation);
    }

    default ArmorLocation armorLocation(Integer id) {
        return armorLocation().get(id);
    }

    default DbcEntityStore<AuctionHouse> auctionHouse() {
        return getEntityStore(DbcObjects.AuctionHouse);
    }

    default AuctionHouse auctionHouse(Integer id) {
        return auctionHouse().get(id);
    }

    default DbcEntityStore<BankBagSlotPrice> bankBagSlotPrices() {
        return getEntityStore(DbcObjects.BankBagSlotPrices);
    }

    default BankBagSlotPrice bankBagSlotPrices(Integer id) {
        return bankBagSlotPrices().get(id);
    }

    default DbcEntityStore<BannedAddon> bannedAddons() {
        return getEntityStore(DbcObjects.BannedAddons);
    }

    default BannedAddon bannedAddons(Integer id) {
        return bannedAddons().get(id);
    }

    default DbcEntityStore<BarberShopStyle> barberShopStyle() {
        return getEntityStore(DbcObjects.BarberShopStyle);
    }

    default BarberShopStyle barberShopStyle(Integer id) {
        return barberShopStyle().get(id);
    }

    default DbcEntityStore<BattlePetAbility> battlePetAbility() {
        return getEntityStore(DbcObjects.BattlePetAbility);
    }

    default BattlePetAbility battlePetAbility(Integer id) {
        return battlePetAbility().get(id);
    }

    default DbcEntityStore<BattlePetBreedQuality> battlePetBreedQuality() {
        return getEntityStore(DbcObjects.BattlePetBreedQuality);
    }

    default BattlePetBreedQuality battlePetBreedQuality(Integer id) {
        return battlePetBreedQuality().get(id);
    }

    default DbcEntityStore<BattlePetBreedState> battlePetBreedState() {
        return getEntityStore(DbcObjects.BattlePetBreedState);
    }

    default BattlePetBreedState battlePetBreedState(Integer id) {
        return battlePetBreedState().get(id);
    }

    default DbcEntityStore<BattlePetSpecie> battlePetSpecies() {
        return getEntityStore(DbcObjects.BattlePetSpecies);
    }

    default BattlePetSpecie battlePetSpecies(Integer id) {
        return battlePetSpecies().get(id);
    }

    default DbcEntityStore<BattlePetSpeciesState> battlePetSpeciesState() {
        return getEntityStore(DbcObjects.BattlePetSpeciesState);
    }

    default BattlePetSpeciesState battlePetSpeciesState(Integer id) {
        return battlePetSpeciesState().get(id);
    }

    default DbcEntityStore<BattlemasterList> battleMasterList() {
        return getEntityStore(DbcObjects.BattlemasterList);
    }

    default BattlemasterList battleMasterList(Integer id) {
        return battleMasterList().get(id);
    }

    default DbcEntityStore<BroadcastText> broadcastText() {
        return getEntityStore(DbcObjects.BroadcastText);
    }

    default BroadcastText broadcastText(Integer id) {
        return broadcastText().get(id);
    }

    default DbcEntityStore<CfgCategory> cfgCategories() {
        return getEntityStore(DbcObjects.CfgCategories);
    }

    default CfgCategory cfgCategories(Integer id) {
        return cfgCategories().get(id);
    }

    default DbcEntityStore<CfgRegion> cfgRegions() {
        return getEntityStore(DbcObjects.CfgRegions);
    }

    default CfgRegion cfgRegions(Integer id) {
        return cfgRegions().get(id);
    }

    default DbcEntityStore<CharTitle> charTitles() {
        return getEntityStore(DbcObjects.CharTitles);
    }

    default CharTitle charTitles(Integer id) {
        return charTitles().get(id);
    }

    default DbcEntityStore<CharacterLoadout> characterLoadout() {
        return getEntityStore(DbcObjects.CharacterLoadout);
    }

    default CharacterLoadout characterLoadout(Integer id) {
        return characterLoadout().get(id);
    }

    default DbcEntityStore<CharacterLoadoutItem> characterLoadoutItem() {
        return getEntityStore(DbcObjects.CharacterLoadoutItem);
    }

    default CharacterLoadoutItem characterLoadoutItem(Integer id) {
        return characterLoadoutItem().get(id);
    }

    default DbcEntityStore<ChatChannel> chatChannels() {
        return getEntityStore(DbcObjects.ChatChannels);
    }

    default ChatChannel chatChannels(Integer id) {
        return chatChannels().get(id);
    }

    default DbcEntityStore<ChrClassUiDisplay> chrClassUIDisplay() {
        return getEntityStore(DbcObjects.ChrClassUIDisplay);
    }

    default ChrClassUiDisplay chrClassUIDisplay(Integer id) {
        return chrClassUIDisplay().get(id);
    }

    default DbcEntityStore<ChrClass> chrClasses() {
        return getEntityStore(DbcObjects.ChrClasses);
    }

    default ChrClass chrClasses(Integer id) {
        return chrClasses().get(id);
    }

    default DbcEntityStore<ChrClassesXPowerType> chrClassesXPowerTypes() {
        return getEntityStore(DbcObjects.ChrClassesXPowerTypes);
    }

    default ChrClassesXPowerType chrClassesXPowerTypes(Integer id) {
        return chrClassesXPowerTypes().get(id);
    }

    default DbcEntityStore<ChrCustomizationChoice> chrCustomizationChoice() {
        return getEntityStore(DbcObjects.ChrCustomizationChoice);
    }

    default ChrCustomizationChoice chrCustomizationChoice(Integer id) {
        return chrCustomizationChoice().get(id);
    }

    default DbcEntityStore<ChrCustomizationDisplayInfo> chrCustomizationDisplayInfo() {
        return getEntityStore(DbcObjects.ChrCustomizationDisplayInfo);
    }

    default ChrCustomizationDisplayInfo chrCustomizationDisplayInfo(Integer id) {
        return chrCustomizationDisplayInfo().get(id);
    }

    default DbcEntityStore<ChrCustomizationElement> chrCustomizationElement() {
        return getEntityStore(DbcObjects.ChrCustomizationElement);
    }

    default ChrCustomizationElement chrCustomizationElement(Integer id) {
        return chrCustomizationElement().get(id);
    }

    default DbcEntityStore<ChrCustomizationOption> chrCustomizationOption() {
        return getEntityStore(DbcObjects.ChrCustomizationOption);
    }

    default ChrCustomizationOption chrCustomizationOption(Integer id) {
        return chrCustomizationOption().get(id);
    }

    default DbcEntityStore<ChrCustomizationReq> chrCustomizationReq() {
        return getEntityStore(DbcObjects.ChrCustomizationReq);
    }

    default ChrCustomizationReq chrCustomizationReq(Integer id) {
        return chrCustomizationReq().get(id);
    }

    default DbcEntityStore<ChrCustomizationReqChoice> chrCustomizationReqChoice() {
        return getEntityStore(DbcObjects.ChrCustomizationReqChoice);
    }

    default ChrCustomizationReqChoice chrCustomizationReqChoice(Integer id) {
        return chrCustomizationReqChoice().get(id);
    }

    default DbcEntityStore<ChrModel> chrModel() {
        return getEntityStore(DbcObjects.ChrModel);
    }

    default ChrModel chrModel(Integer id) {
        return chrModel().get(id);
    }

    default DbcEntityStore<ChrRaceXChrModel> chrRaceXChrModel() {
        return getEntityStore(DbcObjects.ChrRaceXChrModel);
    }

    default ChrRaceXChrModel chrRaceXChrModel(Integer id) {
        return chrRaceXChrModel().get(id);
    }

    default DbcEntityStore<ChrRace> chrRaces() {
        return getEntityStore(DbcObjects.ChrRaces);
    }

    default ChrRace chrRaces(Integer id) {
        return chrRaces().get(id);
    }

    default DbcEntityStore<CinematicCamera> cinematicCamera() {
        return getEntityStore(DbcObjects.CinematicCamera);
    }

    default CinematicCamera cinematicCamera(Integer id) {
        return cinematicCamera().get(id);
    }

    default DbcEntityStore<CinematicSequence> cinematicSequences() {
        return getEntityStore(DbcObjects.CinematicSequences);
    }

    default CinematicSequence cinematicSequences(Integer id) {
        return cinematicSequences().get(id);
    }

    default DbcEntityStore<ConditionalChrModel> conditionalChrModel() {
        return getEntityStore(DbcObjects.ConditionalChrModel);
    }

    default ConditionalChrModel conditionalChrModel(Integer id) {
        return conditionalChrModel().get(id);
    }

    default DbcEntityStore<ConditionalContentTuning> conditionalContentTuning() {
        return getEntityStore(DbcObjects.ConditionalContentTuning);
    }

    default ConditionalContentTuning conditionalContentTuning(Integer id) {
        return conditionalContentTuning().get(id);
    }

    default DbcEntityStore<ContentTuning> contentTuning() {
        return getEntityStore(DbcObjects.ContentTuning);
    }

    default ContentTuning contentTuning(Integer id) {
        return contentTuning().get(id);
    }

    default DbcEntityStore<ConversationLine> conversationLine() {
        return getEntityStore(DbcObjects.ConversationLine);
    }

    default ConversationLine conversationLine(Integer id) {
        return conversationLine().get(id);
    }

    default DbcEntityStore<CreatureDisplayInfo> creatureDisplayInfo() {
        return getEntityStore(DbcObjects.CreatureDisplayInfo);
    }

    default CreatureDisplayInfo creatureDisplayInfo(Integer id) {
        return creatureDisplayInfo().get(id);
    }

    default DbcEntityStore<CreatureDisplayInfoExtra> creatureDisplayInfoExtra() {
        return getEntityStore(DbcObjects.CreatureDisplayInfoExtra);
    }

    default CreatureDisplayInfoExtra creatureDisplayInfoExtra(Integer id) {
        return creatureDisplayInfoExtra().get(id);
    }

    default DbcEntityStore<CreatureFamily> creatureFamily() {
        return getEntityStore(DbcObjects.CreatureFamily);
    }

    default CreatureFamily creatureFamily(Integer id) {
        return creatureFamily().get(id);
    }

    default DbcEntityStore<CreatureModelDatum> creatureModelData() {
        return getEntityStore(DbcObjects.CreatureModelData);
    }

    default CreatureModelDatum creatureModelData(Integer id) {
        return creatureModelData().get(id);
    }

    default DbcEntityStore<CreatureType> creatureType() {
        return getEntityStore(DbcObjects.CreatureType);
    }

    default CreatureType creatureType(Integer id) {
        return creatureType().get(id);
    }

    default DbcEntityStore<Criteria> criteria() {
        return getEntityStore(DbcObjects.Criteria);
    }

    default Criteria criteria(Integer id) {
        return criteria().get(id);
    }

    default DbcEntityStore<CriteriaTree> criteriaTree() {
        return getEntityStore(DbcObjects.CriteriaTree);
    }

    default CriteriaTree criteriaTree(Integer id) {
        return criteriaTree().get(id);
    }

    default DbcEntityStore<CurrencyContainer> currencyContainer() {
        return getEntityStore(DbcObjects.CurrencyContainer);
    }

    default CurrencyContainer currencyContainer(Integer id) {
        return currencyContainer().get(id);
    }

    default DbcEntityStore<CurrencyType> currencyTypes() {
        return getEntityStore(DbcObjects.CurrencyTypes);
    }

    default CurrencyType currencyTypes(Integer id) {
        return currencyTypes().get(id);
    }

    default DbcEntityStore<Curve> curve() {
        return getEntityStore(DbcObjects.Curve);
    }

    default Curve curve(Integer id) {
        return curve().get(id);
    }

    default DbcEntityStore<CurvePoint> curvePoint() {
        return getEntityStore(DbcObjects.CurvePoint);
    }

    default CurvePoint curvePoint(Integer id) {
        return curvePoint().get(id);
    }

    default DbcEntityStore<DestructibleModelDatum> destructibleModelData() {
        return getEntityStore(DbcObjects.DestructibleModelData);
    }

    default DestructibleModelDatum destructibleModelData(Integer id) {
        return destructibleModelData().get(id);
    }

    default DbcEntityStore<Difficulty> difficulty() {
        return getEntityStore(DbcObjects.Difficulty);
    }

    default Difficulty difficulty(Integer id) {
        return difficulty().get(id);
    }

    default DbcEntityStore<DungeonEncounter> dungeonEncounter() {
        return getEntityStore(DbcObjects.DungeonEncounter);
    }

    default DungeonEncounter dungeonEncounter(Integer id) {
        return dungeonEncounter().get(id);
    }

    default DbcEntityStore<DurabilityCost> durabilityCosts() {
        return getEntityStore(DbcObjects.DurabilityCosts);
    }

    default DurabilityCost durabilityCosts(Integer id) {
        return durabilityCosts().get(id);
    }

    default DbcEntityStore<DurabilityQuality> durabilityQuality() {
        return getEntityStore(DbcObjects.DurabilityQuality);
    }

    default DurabilityQuality durabilityQuality(Integer id) {
        return durabilityQuality().get(id);
    }

    default DbcEntityStore<Emote> emotes() {
        return getEntityStore(DbcObjects.Emotes);
    }

    default Emote emotes(Integer id) {
        return emotes().get(id);
    }

    default DbcEntityStore<EmotesText> emotesText() {
        return getEntityStore(DbcObjects.EmotesText);
    }

    default EmotesText emotesText(Integer id) {
        return emotesText().get(id);
    }

    default DbcEntityStore<EmotesTextSound> emotesTextSound() {
        return getEntityStore(DbcObjects.EmotesTextSound);
    }

    default EmotesTextSound emotesTextSound(Integer id) {
        return emotesTextSound().get(id);
    }

    default DbcEntityStore<ExpectedStat> expectedStat() {
        return getEntityStore(DbcObjects.ExpectedStat);
    }

    default ExpectedStat expectedStat(Integer id) {
        return expectedStat().get(id);
    }

    default DbcEntityStore<ExpectedStatMod> expectedStatMod() {
        return getEntityStore(DbcObjects.ExpectedStatMod);
    }

    default ExpectedStatMod expectedStatMod(Integer id) {
        return expectedStatMod().get(id);
    }

    default DbcEntityStore<Faction> faction() {
        return getEntityStore(DbcObjects.Faction);
    }

    default Faction faction(Integer id) {
        return faction().get(id);
    }

    default DbcEntityStore<FactionTemplate> factionTemplate() {
        return getEntityStore(DbcObjects.FactionTemplate);
    }

    default FactionTemplate factionTemplate(Integer id) {
        return factionTemplate().get(id);
    }

    default DbcEntityStore<FriendshipRepReaction> friendshipRepReaction() {
        return getEntityStore(DbcObjects.FriendshipRepReaction);
    }

    default FriendshipRepReaction friendshipRepReaction(Integer id) {
        return friendshipRepReaction().get(id);
    }

    default DbcEntityStore<FriendshipReputation> friendshipReputation() {
        return getEntityStore(DbcObjects.FriendshipReputation);
    }

    default FriendshipReputation friendshipReputation(Integer id) {
        return friendshipReputation().get(id);
    }

    default DbcEntityStore<Gameobject> gameObjects() {
        return getEntityStore(DbcObjects.GameObjects);
    }

    default Gameobject gameObjects(Integer id) {
        return gameObjects().get(id);
    }

    default DbcEntityStore<GameobjectArtKit> gameObjectArtKit() {
        return getEntityStore(DbcObjects.GameObjectArtKit);
    }

    default GameobjectArtKit gameObjectArtKit(Integer id) {
        return gameObjectArtKit().get(id);
    }

    default DbcEntityStore<GameobjectDisplayInfo> gameObjectDisplayInfo() {
        return getEntityStore(DbcObjects.GameObjectDisplayInfo);
    }

    default GameobjectDisplayInfo gameObjectDisplayInfo(Integer id) {
        return gameObjectDisplayInfo().get(id);
    }

    default DbcEntityStore<GemProperty> gemProperties() {
        return getEntityStore(DbcObjects.GemProperties);
    }

    default GemProperty gemProperties(Integer id) {
        return gemProperties().get(id);
    }

    default DbcEntityStore<GlyphBindableSpell> glyphBindableSpell() {
        return getEntityStore(DbcObjects.GlyphBindableSpell);
    }

    default GlyphBindableSpell glyphBindableSpell(Integer id) {
        return glyphBindableSpell().get(id);
    }

    default DbcEntityStore<GlyphSlot> glyphSlot() {
        return getEntityStore(DbcObjects.GlyphSlot);
    }

    default GlyphSlot glyphSlot(Integer id) {
        return glyphSlot().get(id);
    }

    default DbcEntityStore<GlyphProperty> glyphProperties() {
        return getEntityStore(DbcObjects.GlyphProperties);
    }

    default GlyphProperty glyphProperties(Integer id) {
        return glyphProperties().get(id);
    }

    default DbcEntityStore<GlyphRequiredSpec> glyphRequiredSpec() {
        return getEntityStore(DbcObjects.GlyphRequiredSpec);
    }

    default GlyphRequiredSpec glyphRequiredSpec(Integer id) {
        return glyphRequiredSpec().get(id);
    }

    default DbcEntityStore<GossipNpcOption> gossipNPCOption() {
        return getEntityStore(DbcObjects.GossipNPCOption);
    }

    default GossipNpcOption gossipNPCOption(Integer id) {
        return gossipNPCOption().get(id);
    }

    default DbcEntityStore<GuildColorBackground> guildColorBackground() {
        return getEntityStore(DbcObjects.GuildColorBackground);
    }

    default GuildColorBackground guildColorBackground(Integer id) {
        return guildColorBackground().get(id);
    }

    default DbcEntityStore<GuildColorBorder> guildColorBorder() {
        return getEntityStore(DbcObjects.GuildColorBorder);
    }

    default GuildColorBorder guildColorBorder(Integer id) {
        return guildColorBorder().get(id);
    }

    default DbcEntityStore<GuildColorEmblem> guildColorEmblem() {
        return getEntityStore(DbcObjects.GuildColorEmblem);
    }

    default GuildColorEmblem guildColorEmblem(Integer id) {
        return guildColorEmblem().get(id);
    }

    default DbcEntityStore<GuildPerkSpell> guildPerkSpells() {
        return getEntityStore(DbcObjects.GuildPerkSpells);
    }

    default GuildPerkSpell guildPerkSpells(Integer id) {
        return guildPerkSpells().get(id);
    }

    default DbcEntityStore<Heirloom> heirloom() {
        return getEntityStore(DbcObjects.Heirloom);
    }

    default Heirloom heirloom(Integer id) {
        return heirloom().get(id);
    }

    default DbcEntityStore<Holiday> holidays() {
        return getEntityStore(DbcObjects.Holidays);
    }

    default Holiday holidays(Integer id) {
        return holidays().get(id);
    }

    default DbcEntityStore<ImportPriceArmor> importPriceArmor() {
        return getEntityStore(DbcObjects.ImportPriceArmor);
    }

    default ImportPriceArmor importPriceArmor(Integer id) {
        return importPriceArmor().get(id);
    }

    default DbcEntityStore<ImportPriceQuality> importPriceQuality() {
        return getEntityStore(DbcObjects.ImportPriceQuality);
    }

    default ImportPriceQuality importPriceQuality(Integer id) {
        return importPriceQuality().get(id);
    }

    default DbcEntityStore<ImportPriceShield> importPriceShield() {
        return getEntityStore(DbcObjects.ImportPriceShield);
    }

    default ImportPriceShield importPriceShield(Integer id) {
        return importPriceShield().get(id);
    }

    default DbcEntityStore<ImportPriceWeapon> importPriceWeapon() {
        return getEntityStore(DbcObjects.ImportPriceWeapon);
    }

    default ImportPriceWeapon importPriceWeapon(Integer id) {
        return importPriceWeapon().get(id);
    }

    default DbcEntityStore<ItemAppearance> itemAppearance() {
        return getEntityStore(DbcObjects.ItemAppearance);
    }

    default ItemAppearance itemAppearance(Integer id) {
        return itemAppearance().get(id);
    }

    default DbcEntityStore<ItemArmorQuality> itemArmorQuality() {
        return getEntityStore(DbcObjects.ItemArmorQuality);
    }

    default ItemArmorQuality itemArmorQuality(Integer id) {
        return itemArmorQuality().get(id);
    }

    default DbcEntityStore<ItemArmorShield> itemArmorShield() {
        return getEntityStore(DbcObjects.ItemArmorShield);
    }

    default ItemArmorShield itemArmorShield(Integer id) {
        return itemArmorShield().get(id);
    }

    default DbcEntityStore<ItemArmorTotal> itemArmorTotal() {
        return getEntityStore(DbcObjects.ItemArmorTotal);
    }

    default ItemArmorTotal itemArmorTotal(Integer id) {
        return itemArmorTotal().get(id);
    }

    default DbcEntityStore<ItemBagFamily> itemBagFamily() {
        return getEntityStore(DbcObjects.ItemBagFamily);
    }

    default ItemBagFamily itemBagFamily(Integer id) {
        return itemBagFamily().get(id);
    }

    default DbcEntityStore<ItemBonus> itemBonus() {
        return getEntityStore(DbcObjects.ItemBonus);
    }

    default ItemBonus itemBonus(Integer id) {
        return itemBonus().get(id);
    }

    default DbcEntityStore<ItemBonusListLevelDelta> itemBonusListLevelDelta() {
        return getEntityStore(DbcObjects.ItemBonusListLevelDelta);
    }

    default ItemBonusListLevelDelta itemBonusListLevelDelta(Integer id) {
        return itemBonusListLevelDelta().get(id);
    }

    default DbcEntityStore<ItemBonusTreeNode> itemBonusTreeNode() {
        return getEntityStore(DbcObjects.ItemBonusTreeNode);
    }

    default ItemBonusTreeNode itemBonusTreeNode(Integer id) {
        return itemBonusTreeNode().get(id);
    }

    default DbcEntityStore<ItemChildEquipment> itemChildEquipment() {
        return getEntityStore(DbcObjects.ItemChildEquipment);
    }

    default ItemChildEquipment itemChildEquipment(Integer id) {
        return itemChildEquipment().get(id);
    }

    default DbcEntityStore<ItemClass> itemClass() {
        return getEntityStore(DbcObjects.ItemClass);
    }

    default ItemClass itemClass(Integer id) {
        return itemClass().get(id);
    }

    default DbcEntityStore<ItemContextPickerEntry> itemContextPickerEntry() {
        return getEntityStore(DbcObjects.ItemContextPickerEntry);
    }

    default ItemContextPickerEntry itemContextPickerEntry(Integer id) {
        return itemContextPickerEntry().get(id);
    }

    default DbcEntityStore<ItemCurrencyCost> itemCurrencyCost() {
        return getEntityStore(DbcObjects.ItemCurrencyCost);
    }

    default ItemCurrencyCost itemCurrencyCost(Integer id) {
        return itemCurrencyCost().get(id);
    }

    default DbcEntityStore<ItemDamageAmmo> itemDamageAmmo() {
        return getEntityStore(DbcObjects.ItemDamageAmmo);
    }

    default ItemDamageAmmo itemDamageAmmo(Integer id) {
        return itemDamageAmmo().get(id);
    }

    default DbcEntityStore<ItemDamageOneHand> itemDamageOneHand() {
        return getEntityStore(DbcObjects.ItemDamageOneHand);
    }

    default ItemDamageOneHand itemDamageOneHand(Integer id) {
        return itemDamageOneHand().get(id);
    }

    default DbcEntityStore<ItemDamageOneHandCaster> itemDamageOneHandCaster() {
        return getEntityStore(DbcObjects.ItemDamageOneHandCaster);
    }

    default ItemDamageOneHandCaster itemDamageOneHandCaster(Integer id) {
        return itemDamageOneHandCaster().get(id);
    }

    default DbcEntityStore<ItemDamageTwoHand> itemDamageTwoHand() {
        return getEntityStore(DbcObjects.ItemDamageTwoHand);
    }

    default ItemDamageTwoHand itemDamageTwoHand(Integer id) {
        return itemDamageTwoHand().get(id);
    }

    default DbcEntityStore<ItemDamageTwoHandCaster> itemDamageTwoHandCaster() {
        return getEntityStore(DbcObjects.ItemDamageTwoHandCaster);
    }

    default ItemDamageTwoHandCaster itemDamageTwoHandCaster(Integer id) {
        return itemDamageTwoHandCaster().get(id);
    }

    default DbcEntityStore<ItemDisenchantLoot> itemDisenchantLoot() {
        return getEntityStore(DbcObjects.ItemDisenchantLoot);
    }

    default ItemDisenchantLoot itemDisenchantLoot(Integer id) {
        return itemDisenchantLoot().get(id);
    }

    default DbcEntityStore<ItemEffect> itemEffect() {
        return getEntityStore(DbcObjects.ItemEffect);
    }

    default ItemEffect itemEffect(Integer id) {
        return itemEffect().get(id);
    }

    default DbcEntityStore<Item> item() {
        return getEntityStore(DbcObjects.Item);
    }

    default Item item(Integer id) {
        return item().get(id);
    }

    default DbcEntityStore<ItemExtendedCost> itemExtendedCost() {
        return getEntityStore(DbcObjects.ItemExtendedCost);
    }

    default ItemExtendedCost itemExtendedCost(Integer id) {
        return itemExtendedCost().get(id);
    }

    default DbcEntityStore<ItemLevelSelector> itemLevelSelector() {
        return getEntityStore(DbcObjects.ItemLevelSelector);
    }

    default ItemLevelSelector itemLevelSelector(Integer id) {
        return itemLevelSelector().get(id);
    }

    default DbcEntityStore<ItemLevelSelectorQuality> itemLevelSelectorQuality() {
        return getEntityStore(DbcObjects.ItemLevelSelectorQuality);
    }

    default ItemLevelSelectorQuality itemLevelSelectorQuality(Integer id) {
        return itemLevelSelectorQuality().get(id);
    }

    default DbcEntityStore<ItemLevelSelectorQualitySet> itemLevelSelectorQualitySet() {
        return getEntityStore(DbcObjects.ItemLevelSelectorQualitySet);
    }

    default ItemLevelSelectorQualitySet itemLevelSelectorQualitySet(Integer id) {
        return itemLevelSelectorQualitySet().get(id);
    }

    default DbcEntityStore<ItemLimitCategory> itemLimitCategory() {
        return getEntityStore(DbcObjects.ItemLimitCategory);
    }

    default ItemLimitCategory itemLimitCategory(Integer id) {
        return itemLimitCategory().get(id);
    }

    default DbcEntityStore<ItemLimitCategoryCondition> itemLimitCategoryCondition() {
        return getEntityStore(DbcObjects.ItemLimitCategoryCondition);
    }

    default ItemLimitCategoryCondition itemLimitCategoryCondition(Integer id) {
        return itemLimitCategoryCondition().get(id);
    }

    default DbcEntityStore<ItemModifiedAppearance> itemModifiedAppearance() {
        return getEntityStore(DbcObjects.ItemModifiedAppearance);
    }

    default ItemModifiedAppearance itemModifiedAppearance(Integer id) {
        return itemModifiedAppearance().get(id);
    }

    default DbcEntityStore<ItemModifiedAppearanceExtra> itemModifiedAppearanceExtra() {
        return getEntityStore(DbcObjects.ItemModifiedAppearanceExtra);
    }

    default ItemModifiedAppearanceExtra itemModifiedAppearanceExtra(Integer id) {
        return itemModifiedAppearanceExtra().get(id);
    }

    default DbcEntityStore<ItemNameDescription> itemNameDescription() {
        return getEntityStore(DbcObjects.ItemNameDescription);
    }

    default ItemNameDescription itemNameDescription(Integer id) {
        return itemNameDescription().get(id);
    }

    default DbcEntityStore<ItemPriceBase> itemPriceBase() {
        return getEntityStore(DbcObjects.ItemPriceBase);
    }

    default ItemPriceBase itemPriceBase(Integer id) {
        return itemPriceBase().get(id);
    }

    default DbcEntityStore<ItemReforge> itemReforge() {
        return getEntityStore(DbcObjects.ItemReforge);
    }

    default ItemReforge itemReforge(Integer id) {
        return itemReforge().get(id);
    }

    default DbcEntityStore<ItemSearchName> itemSearchName() {
        return getEntityStore(DbcObjects.ItemSearchName);
    }

    default ItemSearchName itemSearchName(Integer id) {
        return itemSearchName().get(id);
    }

    default DbcEntityStore<ItemSet> itemSet() {
        return getEntityStore(DbcObjects.ItemSet);
    }

    default ItemSet itemSet(Integer id) {
        return itemSet().get(id);
    }

    default DbcEntityStore<ItemSetSpell> itemSetSpell() {
        return getEntityStore(DbcObjects.ItemSetSpell);
    }

    default ItemSetSpell itemSetSpell(Integer id) {
        return itemSetSpell().get(id);
    }

    default DbcEntityStore<ItemSparse> itemSparse() {
        return getEntityStore(DbcObjects.ItemSparse);
    }

    default ItemSparse itemSparse(Integer id) {
        return itemSparse().get(id);
    }

    default DbcEntityStore<ItemXBonusTree> itemXBonusTree() {
        return getEntityStore(DbcObjects.ItemXBonusTree);
    }

    default ItemXBonusTree itemXBonusTree(Integer id) {
        return itemXBonusTree().get(id);
    }

    default DbcEntityStore<JournalEncounter> journalEncounter() {
        return getEntityStore(DbcObjects.JournalEncounter);
    }

    default JournalEncounter journalEncounter(Integer id) {
        return journalEncounter().get(id);
    }

    default DbcEntityStore<JournalEncounterSection> journalEncounterSection() {
        return getEntityStore(DbcObjects.JournalEncounterSection);
    }

    default JournalEncounterSection journalEncounterSection(Integer id) {
        return journalEncounterSection().get(id);
    }

    default DbcEntityStore<JournalInstance> journalInstance() {
        return getEntityStore(DbcObjects.JournalInstance);
    }

    default JournalInstance journalInstance(Integer id) {
        return journalInstance().get(id);
    }

    default DbcEntityStore<JournalTier> journalTier() {
        return getEntityStore(DbcObjects.JournalTier);
    }

    default JournalTier journalTier(Integer id) {
        return journalTier().get(id);
    }

    default DbcEntityStore<Keychain> keychain() {
        return getEntityStore(DbcObjects.Keychain);
    }

    default Keychain keychain(Integer id) {
        return keychain().get(id);
    }

    default DbcEntityStore<KeystoneAffix> keystoneAffix() {
        return getEntityStore(DbcObjects.KeystoneAffix);
    }

    default KeystoneAffix keystoneAffix(Integer id) {
        return keystoneAffix().get(id);
    }

    default DbcEntityStore<LanguageWord> languageWords() {
        return getEntityStore(DbcObjects.LanguageWords);
    }

    default LanguageWord languageWords(Integer id) {
        return languageWords().get(id);
    }

    default DbcEntityStore<Language> languages() {
        return getEntityStore(DbcObjects.Languages);
    }

    default Language languages(Integer id) {
        return languages().get(id);
    }

    default DbcEntityStore<LfgDungeon> lFGDungeons() {
        return getEntityStore(DbcObjects.LFGDungeons);
    }

    default LfgDungeon lFGDungeons(Integer id) {
        return lFGDungeons().get(id);
    }

    default DbcEntityStore<Light> light() {
        return getEntityStore(DbcObjects.Light);
    }

    default Light light(Integer id) {
        return light().get(id);
    }

    default DbcEntityStore<LiquidType> liquidType() {
        return getEntityStore(DbcObjects.LiquidType);
    }

    default LiquidType liquidType(Integer id) {
        return liquidType().get(id);
    }

    default DbcEntityStore<Location> location() {
        return getEntityStore(DbcObjects.Location);
    }

    default Location location(Integer id) {
        return location().get(id);
    }

    default DbcEntityStore<Lock> lock() {
        return getEntityStore(DbcObjects.Lock);
    }

    default Lock lock(Integer id) {
        return lock().get(id);
    }

    default DbcEntityStore<MailTemplate> mailTemplate() {
        return getEntityStore(DbcObjects.MailTemplate);
    }

    default MailTemplate mailTemplate(Integer id) {
        return mailTemplate().get(id);
    }

    default DbcEntityStore<MapEntry> map() {
        return getEntityStore(DbcObjects.Map);
    }

    default MapEntry map(Integer id) {
        return map().get(id);
    }

    default DbcEntityStore<MapChallengeMode> mapChallengeMode() {
        return getEntityStore(DbcObjects.MapChallengeMode);
    }

    default MapChallengeMode mapChallengeMode(Integer id) {
        return mapChallengeMode().get(id);
    }

    default DbcEntityStore<MapDifficulty> mapDifficulty() {
        return getEntityStore(DbcObjects.MapDifficulty);
    }

    default MapDifficulty mapDifficulty(Integer id) {
        return mapDifficulty().get(id);
    }

    default DbcEntityStore<MapDifficultyXCondition> mapDifficultyXCondition() {
        return getEntityStore(DbcObjects.MapDifficultyXCondition);
    }

    default MapDifficultyXCondition mapDifficultyXCondition(Integer id) {
        return mapDifficultyXCondition().get(id);
    }

    default DbcEntityStore<ModifierTree> modifierTree() {
        return getEntityStore(DbcObjects.ModifierTree);
    }

    default ModifierTree modifierTree(Integer id) {
        return modifierTree().get(id);
    }

    default DbcEntityStore<MountCapability> mountCapability() {
        return getEntityStore(DbcObjects.MountCapability);
    }

    default MountCapability mountCapability(Integer id) {
        return mountCapability().get(id);
    }

    default DbcEntityStore<Mount> mount() {
        return getEntityStore(DbcObjects.Mount);
    }

    default Mount mount(Integer id) {
        return mount().get(id);
    }

    default DbcEntityStore<MountTypeXCapability> mountTypeXCapability() {
        return getEntityStore(DbcObjects.MountTypeXCapability);
    }

    default MountTypeXCapability mountTypeXCapability(Integer id) {
        return mountTypeXCapability().get(id);
    }

    default DbcEntityStore<MountXDisplay> mountXDisplay() {
        return getEntityStore(DbcObjects.MountXDisplay);
    }

    default MountXDisplay mountXDisplay(Integer id) {
        return mountXDisplay().get(id);
    }

    default DbcEntityStore<Movie> movie() {
        return getEntityStore(DbcObjects.Movie);
    }

    default Movie movie(Integer id) {
        return movie().get(id);
    }

    default DbcEntityStore<MythicPlusSeason> mythicPlusSeason() {
        return getEntityStore(DbcObjects.MythicPlusSeason);
    }

    default MythicPlusSeason mythicPlusSeason(Integer id) {
        return mythicPlusSeason().get(id);
    }

    default DbcEntityStore<NameGen> nameGen() {
        return getEntityStore(DbcObjects.NameGen);
    }

    default NameGen nameGen(Integer id) {
        return nameGen().get(id);
    }

    default DbcEntityStore<NamesProfanity> namesProfanity() {
        return getEntityStore(DbcObjects.NamesProfanity);
    }

    default NamesProfanity namesProfanity(Integer id) {
        return namesProfanity().get(id);
    }

    default DbcEntityStore<NamesReserved> namesReserved() {
        return getEntityStore(DbcObjects.NamesReserved);
    }

    default NamesReserved namesReserved(Integer id) {
        return namesReserved().get(id);
    }

    default DbcEntityStore<NamesReservedLocale> namesReservedLocale() {
        return getEntityStore(DbcObjects.NamesReservedLocale);
    }

    default NamesReservedLocale namesReservedLocale(Integer id) {
        return namesReservedLocale().get(id);
    }

    default DbcEntityStore<NumTalentsAtLevel> numTalentsAtLevel() {
        return getEntityStore(DbcObjects.NumTalentsAtLevel);
    }

    default NumTalentsAtLevel numTalentsAtLevel(Integer id) {
        return numTalentsAtLevel().get(id);
    }

    default DbcEntityStore<OverrideSpellDatum> overrideSpellData() {
        return getEntityStore(DbcObjects.OverrideSpellData);
    }

    default OverrideSpellDatum overrideSpellData(Integer id) {
        return overrideSpellData().get(id);
    }

    default DbcEntityStore<ParagonReputation> paragonReputation() {
        return getEntityStore(DbcObjects.ParagonReputation);
    }

    default ParagonReputation paragonReputation(Integer id) {
        return paragonReputation().get(id);
    }

    default DbcEntityStore<Path> path() {
        return getEntityStore(DbcObjects.Path);
    }

    default Path path(Integer id) {
        return path().get(id);
    }

    default DbcEntityStore<PathNode> pathNode() {
        return getEntityStore(DbcObjects.PathNode);
    }

    default PathNode pathNode(Integer id) {
        return pathNode().get(id);
    }

    default DbcEntityStore<PathProperty> pathProperty() {
        return getEntityStore(DbcObjects.PathProperty);
    }

    default PathProperty pathProperty(Integer id) {
        return pathProperty().get(id);
    }

    default DbcEntityStore<Phase> phase() {
        return getEntityStore(DbcObjects.Phase);
    }

    default Phase phase(Integer id) {
        return phase().get(id);
    }

    default DbcEntityStore<PhaseXPhaseGroup> phaseXPhaseGroup() {
        return getEntityStore(DbcObjects.PhaseXPhaseGroup);
    }

    default PhaseXPhaseGroup phaseXPhaseGroup(Integer id) {
        return phaseXPhaseGroup().get(id);
    }

    default DbcEntityStore<PlayerCondition> playerCondition() {
        return getEntityStore(DbcObjects.PlayerCondition);
    }

    default PlayerCondition playerCondition(Integer id) {
        return playerCondition().get(id);
    }

    default DbcEntityStore<PowerDisplay> powerDisplay() {
        return getEntityStore(DbcObjects.PowerDisplay);
    }

    default PowerDisplay powerDisplay(Integer id) {
        return powerDisplay().get(id);
    }

    default DbcEntityStore<PowerType> powerType() {
        return getEntityStore(DbcObjects.PowerType);
    }

    default PowerType powerType(Integer id) {
        return powerType().get(id);
    }

    default DbcEntityStore<PrestigeLevelInfo> prestigeLevelInfo() {
        return getEntityStore(DbcObjects.PrestigeLevelInfo);
    }

    default PrestigeLevelInfo prestigeLevelInfo(Integer id) {
        return prestigeLevelInfo().get(id);
    }

    default DbcEntityStore<PvpDifficulty> pVPDifficulty() {
        return getEntityStore(DbcObjects.PVPDifficulty);
    }

    default PvpDifficulty pVPDifficulty(Integer id) {
        return pVPDifficulty().get(id);
    }

    default DbcEntityStore<PvpItem> pVPItem() {
        return getEntityStore(DbcObjects.PVPItem);
    }

    default PvpItem pVPItem(Integer id) {
        return pVPItem().get(id);
    }

    default DbcEntityStore<PvpSeason> pvpSeason() {
        return getEntityStore(DbcObjects.PvpSeason);
    }

    default PvpSeason pvpSeason(Integer id) {
        return pvpSeason().get(id);
    }

    default DbcEntityStore<PvpTier> pvpTier() {
        return getEntityStore(DbcObjects.PvpTier);
    }

    default PvpTier pvpTier(Integer id) {
        return pvpTier().get(id);
    }

    default DbcEntityStore<QuestFactionReward> questFactionReward() {
        return getEntityStore(DbcObjects.QuestFactionReward);
    }

    default QuestFactionReward questFactionReward(Integer id) {
        return questFactionReward().get(id);
    }

    default DbcEntityStore<QuestInfo> questInfo() {
        return getEntityStore(DbcObjects.QuestInfo);
    }

    default QuestInfo questInfo(Integer id) {
        return questInfo().get(id);
    }

    default DbcEntityStore<QuestLineXQuest> questLineXQuest() {
        return getEntityStore(DbcObjects.QuestLineXQuest);
    }

    default QuestLineXQuest questLineXQuest(Integer id) {
        return questLineXQuest().get(id);
    }

    default DbcEntityStore<QuestMoneyReward> questMoneyReward() {
        return getEntityStore(DbcObjects.QuestMoneyReward);
    }

    default QuestMoneyReward questMoneyReward(Integer id) {
        return questMoneyReward().get(id);
    }

    default DbcEntityStore<QuestPackageItem> questPackageItem() {
        return getEntityStore(DbcObjects.QuestPackageItem);
    }

    default QuestPackageItem questPackageItem(Integer id) {
        return questPackageItem().get(id);
    }

    default DbcEntityStore<QuestSort> questSort() {
        return getEntityStore(DbcObjects.QuestSort);
    }

    default QuestSort questSort(Integer id) {
        return questSort().get(id);
    }

    default DbcEntityStore<QuestV2> questV2() {
        return getEntityStore(DbcObjects.QuestV2);
    }

    default QuestV2 questV2(Integer id) {
        return questV2().get(id);
    }

    default DbcEntityStore<QuestXp> questXP() {
        return getEntityStore(DbcObjects.QuestXP);
    }

    default QuestXp questXP(Integer id) {
        return questXP().get(id);
    }

    default DbcEntityStore<RandPropPoint> randPropPoints() {
        return getEntityStore(DbcObjects.RandPropPoints);
    }

    default RandPropPoint randPropPoints(Integer id) {
        return randPropPoints().get(id);
    }

    default DbcEntityStore<RewardPack> rewardPack() {
        return getEntityStore(DbcObjects.RewardPack);
    }

    default RewardPack rewardPack(Integer id) {
        return rewardPack().get(id);
    }

    default DbcEntityStore<RewardPackXCurrencyType> rewardPackXCurrencyType() {
        return getEntityStore(DbcObjects.RewardPackXCurrencyType);
    }

    default RewardPackXCurrencyType rewardPackXCurrencyType(Integer id) {
        return rewardPackXCurrencyType().get(id);
    }

    default DbcEntityStore<RewardPackXItem> rewardPackXItem() {
        return getEntityStore(DbcObjects.RewardPackXItem);
    }

    default RewardPackXItem rewardPackXItem(Integer id) {
        return rewardPackXItem().get(id);
    }

    default DbcEntityStore<Scenario> scenario() {
        return getEntityStore(DbcObjects.Scenario);
    }

    default Scenario scenario(Integer id) {
        return scenario().get(id);
    }

    default DbcEntityStore<ScenarioStep> scenarioStep() {
        return getEntityStore(DbcObjects.ScenarioStep);
    }

    default ScenarioStep scenarioStep(Integer id) {
        return scenarioStep().get(id);
    }

    default DbcEntityStore<SceneScript> sceneScript() {
        return getEntityStore(DbcObjects.SceneScript);
    }

    default SceneScript sceneScript(Integer id) {
        return sceneScript().get(id);
    }

    default DbcEntityStore<SceneScriptGlobalText> sceneScriptGlobalText() {
        return getEntityStore(DbcObjects.SceneScriptGlobalText);
    }

    default SceneScriptGlobalText sceneScriptGlobalText(Integer id) {
        return sceneScriptGlobalText().get(id);
    }

    default DbcEntityStore<SceneScriptPackage> sceneScriptPackage() {
        return getEntityStore(DbcObjects.SceneScriptPackage);
    }

    default SceneScriptPackage sceneScriptPackage(Integer id) {
        return sceneScriptPackage().get(id);
    }

    default DbcEntityStore<SceneScriptText> sceneScriptText() {
        return getEntityStore(DbcObjects.SceneScriptText);
    }

    default SceneScriptText sceneScriptText(Integer id) {
        return sceneScriptText().get(id);
    }

    default DbcEntityStore<ServerMessage> serverMessages() {
        return getEntityStore(DbcObjects.ServerMessages);
    }

    default ServerMessage serverMessages(Integer id) {
        return serverMessages().get(id);
    }

    default DbcEntityStore<SkillLine> skillLine() {
        return getEntityStore(DbcObjects.SkillLine);
    }

    default SkillLine skillLine(Integer id) {
        return skillLine().get(id);
    }

    default DbcEntityStore<SkillLineAbility> skillLineAbility() {
        return getEntityStore(DbcObjects.SkillLineAbility);
    }

    default SkillLineAbility skillLineAbility(Integer id) {
        return skillLineAbility().get(id);
    }

    default DbcEntityStore<SkillRaceClassInfo> skillRaceClassInfo() {
        return getEntityStore(DbcObjects.SkillRaceClassInfo);
    }

    default SkillRaceClassInfo skillRaceClassInfo(Integer id) {
        return skillRaceClassInfo().get(id);
    }

    default DbcEntityStore<SoundKit> soundKit() {
        return getEntityStore(DbcObjects.SoundKit);
    }

    default SoundKit soundKit(Integer id) {
        return soundKit().get(id);
    }

    default DbcEntityStore<SpellAuraOption> spellAuraOptions() {
        return getEntityStore(DbcObjects.SpellAuraOptions);
    }

    default SpellAuraOption spellAuraOptions(Integer id) {
        return spellAuraOptions().get(id);
    }

    default DbcEntityStore<SpellAuraRestriction> spellAuraRestrictions() {
        return getEntityStore(DbcObjects.SpellAuraRestrictions);
    }

    default SpellAuraRestriction spellAuraRestrictions(Integer id) {
        return spellAuraRestrictions().get(id);
    }

    default DbcEntityStore<SpellCastTime> spellCastTimes() {
        return getEntityStore(DbcObjects.SpellCastTimes);
    }

    default SpellCastTime spellCastTimes(Integer id) {
        return spellCastTimes().get(id);
    }

    default DbcEntityStore<SpellCastingRequirement> spellCastingRequirements() {
        return getEntityStore(DbcObjects.SpellCastingRequirements);
    }

    default SpellCastingRequirement spellCastingRequirements(Integer id) {
        return spellCastingRequirements().get(id);
    }

    default DbcEntityStore<SpellCategories> spellCategories() {
        return getEntityStore(DbcObjects.SpellCategories);
    }

    default SpellCategories spellCategories(Integer id) {
        return spellCategories().get(id);
    }

    default DbcEntityStore<SpellCategory> spellCategory() {
        return getEntityStore(DbcObjects.SpellCategory);
    }

    default SpellCategory spellCategory(Integer id) {
        return spellCategory().get(id);
    }

    default DbcEntityStore<SpellClassOption> spellClassOptions() {
        return getEntityStore(DbcObjects.SpellClassOptions);
    }

    default SpellClassOption spellClassOptions(Integer id) {
        return spellClassOptions().get(id);
    }

    default DbcEntityStore<SpellCooldown> spellCooldowns() {
        return getEntityStore(DbcObjects.SpellCooldowns);
    }

    default SpellCooldown spellCooldowns(Integer id) {
        return spellCooldowns().get(id);
    }

    default DbcEntityStore<SpellDuration> spellDuration() {
        return getEntityStore(DbcObjects.SpellDuration);
    }

    default SpellDuration spellDuration(Integer id) {
        return spellDuration().get(id);
    }

    default DbcEntityStore<SpellEffect> spellEffect() {
        return getEntityStore(DbcObjects.SpellEffect);
    }

    default SpellEffect spellEffect(Integer id) {
        return spellEffect().get(id);
    }

    default DbcEntityStore<SpellEquippedItem> spellEquippedItems() {
        return getEntityStore(DbcObjects.SpellEquippedItems);
    }

    default SpellEquippedItem spellEquippedItems(Integer id) {
        return spellEquippedItems().get(id);
    }

    default DbcEntityStore<SpellFocusObject> spellFocusObject() {
        return getEntityStore(DbcObjects.SpellFocusObject);
    }

    default SpellFocusObject spellFocusObject(Integer id) {
        return spellFocusObject().get(id);
    }

    default DbcEntityStore<SpellInterrupt> spellInterrupts() {
        return getEntityStore(DbcObjects.SpellInterrupts);
    }

    default SpellInterrupt spellInterrupts(Integer id) {
        return spellInterrupts().get(id);
    }

    default DbcEntityStore<SpellItemEnchantment> spellItemEnchantment() {
        return getEntityStore(DbcObjects.SpellItemEnchantment);
    }

    default SpellItemEnchantment spellItemEnchantment(Integer id) {
        return spellItemEnchantment().get(id);
    }

    default DbcEntityStore<SpellItemEnchantmentCondition> spellItemEnchantmentCondition() {
        return getEntityStore(DbcObjects.SpellItemEnchantmentCondition);
    }

    default SpellItemEnchantmentCondition spellItemEnchantmentCondition(Integer id) {
        return spellItemEnchantmentCondition().get(id);
    }

    default DbcEntityStore<SpellKeyboundOverride> spellKeyboundOverride() {
        return getEntityStore(DbcObjects.SpellKeyboundOverride);
    }

    default SpellKeyboundOverride spellKeyboundOverride(Integer id) {
        return spellKeyboundOverride().get(id);
    }

    default DbcEntityStore<SpellLabel> spellLabel() {
        return getEntityStore(DbcObjects.SpellLabel);
    }

    default SpellLabel spellLabel(Integer id) {
        return spellLabel().get(id);
    }

    default DbcEntityStore<SpellLearnSpell> spellLearnSpell() {
        return getEntityStore(DbcObjects.SpellLearnSpell);
    }

    default SpellLearnSpell spellLearnSpell(Integer id) {
        return spellLearnSpell().get(id);
    }

    default DbcEntityStore<SpellLevel> spellLevels() {
        return getEntityStore(DbcObjects.SpellLevels);
    }

    default SpellLevel spellLevels(Integer id) {
        return spellLevels().get(id);
    }

    default DbcEntityStore<SpellMisc> spellMisc() {
        return getEntityStore(DbcObjects.SpellMisc);
    }

    default SpellMisc spellMisc(Integer id) {
        return spellMisc().get(id);
    }

    default DbcEntityStore<SpellName> spellName() {
        return getEntityStore(DbcObjects.SpellName);
    }

    default SpellName spellName(Integer id) {
        return spellName().get(id);
    }

    default DbcEntityStore<SpellPower> spellPower() {
        return getEntityStore(DbcObjects.SpellPower);
    }

    default SpellPower spellPower(Integer id) {
        return spellPower().get(id);
    }

    default DbcEntityStore<SpellPowerDifficulty> spellPowerDifficulty() {
        return getEntityStore(DbcObjects.SpellPowerDifficulty);
    }

    default SpellPowerDifficulty spellPowerDifficulty(Integer id) {
        return spellPowerDifficulty().get(id);
    }

    default DbcEntityStore<SpellProcsPerMinute> spellProcsPerMinute() {
        return getEntityStore(DbcObjects.SpellProcsPerMinute);
    }

    default SpellProcsPerMinute spellProcsPerMinute(Integer id) {
        return spellProcsPerMinute().get(id);
    }

    default DbcEntityStore<SpellProcsPerMinuteMod> spellProcsPerMinuteMod() {
        return getEntityStore(DbcObjects.SpellProcsPerMinuteMod);
    }

    default SpellProcsPerMinuteMod spellProcsPerMinuteMod(Integer id) {
        return spellProcsPerMinuteMod().get(id);
    }

    default DbcEntityStore<SpellRadius> spellRadius() {
        return getEntityStore(DbcObjects.SpellRadius);
    }

    default SpellRadius spellRadius(Integer id) {
        return spellRadius().get(id);
    }

    default DbcEntityStore<SpellRange> spellRange() {
        return getEntityStore(DbcObjects.SpellRange);
    }

    default SpellRange spellRange(Integer id) {
        return spellRange().get(id);
    }

    default DbcEntityStore<SpellReagent> spellReagents() {
        return getEntityStore(DbcObjects.SpellReagents);
    }

    default SpellReagent spellReagents(Integer id) {
        return spellReagents().get(id);
    }

    default DbcEntityStore<SpellReagentsCurrency> spellReagentsCurrency() {
        return getEntityStore(DbcObjects.SpellReagentsCurrency);
    }

    default SpellReagentsCurrency spellReagentsCurrency(Integer id) {
        return spellReagentsCurrency().get(id);
    }

    default DbcEntityStore<SpellScaling> spellScaling() {
        return getEntityStore(DbcObjects.SpellScaling);
    }

    default SpellScaling spellScaling(Integer id) {
        return spellScaling().get(id);
    }

    default DbcEntityStore<SpellShapeshift> spellShapeshift() {
        return getEntityStore(DbcObjects.SpellShapeshift);
    }

    default SpellShapeshift spellShapeshift(Integer id) {
        return spellShapeshift().get(id);
    }

    default DbcEntityStore<SpellShapeshiftForm> spellShapeshiftForm() {
        return getEntityStore(DbcObjects.SpellShapeshiftForm);
    }

    default SpellShapeshiftForm spellShapeshiftForm(Integer id) {
        return spellShapeshiftForm().get(id);
    }

    default DbcEntityStore<SpellTargetRestriction> spellTargetRestrictions() {
        return getEntityStore(DbcObjects.SpellTargetRestrictions);
    }

    default SpellTargetRestriction spellTargetRestrictions(Integer id) {
        return spellTargetRestrictions().get(id);
    }

    default DbcEntityStore<SpellTotem> spellTotems() {
        return getEntityStore(DbcObjects.SpellTotems);
    }

    default SpellTotem spellTotems(Integer id) {
        return spellTotems().get(id);
    }

    default DbcEntityStore<SpellVisual> spellVisual() {
        return getEntityStore(DbcObjects.SpellVisual);
    }

    default SpellVisual spellVisual(Integer id) {
        return spellVisual().get(id);
    }

    default DbcEntityStore<SpellVisualEffectName> spellVisualEffectName() {
        return getEntityStore(DbcObjects.SpellVisualEffectName);
    }

    default SpellVisualEffectName spellVisualEffectName(Integer id) {
        return spellVisualEffectName().get(id);
    }

    default DbcEntityStore<SpellVisualMissile> spellVisualMissile() {
        return getEntityStore(DbcObjects.SpellVisualMissile);
    }

    default SpellVisualMissile spellVisualMissile(Integer id) {
        return spellVisualMissile().get(id);
    }

    default DbcEntityStore<SpellVisualKit> spellVisualKit() {
        return getEntityStore(DbcObjects.SpellVisualKit);
    }

    default SpellVisualKit spellVisualKit(Integer id) {
        return spellVisualKit().get(id);
    }

    default DbcEntityStore<SpellXSpellVisual> spellXSpellVisual() {
        return getEntityStore(DbcObjects.SpellXSpellVisual);
    }

    default SpellXSpellVisual spellXSpellVisual(Integer id) {
        return spellXSpellVisual().get(id);
    }

    default DbcEntityStore<SummonProperty> summonProperties() {
        return getEntityStore(DbcObjects.SummonProperties);
    }

    default SummonProperty summonProperties(Integer id) {
        return summonProperties().get(id);
    }

    default DbcEntityStore<TactKey> tactKey() {
        return getEntityStore(DbcObjects.TactKey);
    }

    default TactKey tactKey(Integer id) {
        return tactKey().get(id);
    }

    default DbcEntityStore<Talent> talent() {
        return getEntityStore(DbcObjects.Talent);
    }

    default Talent talent(Integer id) {
        return talent().get(id);
    }

    default DbcEntityStore<TalentTab> talentTab() {
        return getEntityStore(DbcObjects.TalentTab);
    }

    default TalentTab talentTab(Integer id) {
        return talentTab().get(id);
    }

    default DbcEntityStore<TalentTreePrimarySpell> talentTreePrimarySpells() {
        return getEntityStore(DbcObjects.TalentTreePrimarySpells);
    }

    default TalentTreePrimarySpell talentTreePrimarySpells(Integer id) {
        return talentTreePrimarySpells().get(id);
    }

    default DbcEntityStore<TaxiNode> taxiNodes() {
        return getEntityStore(DbcObjects.TaxiNodes);
    }

    default TaxiNode taxiNodes(Integer id) {
        return taxiNodes().get(id);
    }

    default DbcEntityStore<TaxiPath> taxiPath() {
        return getEntityStore(DbcObjects.TaxiPath);
    }

    default TaxiPath taxiPath(Integer id) {
        return taxiPath().get(id);
    }

    default DbcEntityStore<TaxiPathNode> taxiPathNode() {
        return getEntityStore(DbcObjects.TaxiPathNode);
    }

    default TaxiPathNode taxiPathNode(Integer id) {
        return taxiPathNode().get(id);
    }

    default DbcEntityStore<TotemCategory> totemCategory() {
        return getEntityStore(DbcObjects.TotemCategory);
    }

    default TotemCategory totemCategory(Integer id) {
        return totemCategory().get(id);
    }

    default DbcEntityStore<Toy> toy() {
        return getEntityStore(DbcObjects.Toy);
    }

    default Toy toy(Integer id) {
        return toy().get(id);
    }

    default DbcEntityStore<TransmogHoliday> transmogHoliday() {
        return getEntityStore(DbcObjects.TransmogHoliday);
    }

    default TransmogHoliday transmogHoliday(Integer id) {
        return transmogHoliday().get(id);
    }

    default DbcEntityStore<TransmogSet> transmogSet() {
        return getEntityStore(DbcObjects.TransmogSet);
    }

    default TransmogSet transmogSet(Integer id) {
        return transmogSet().get(id);
    }

    default DbcEntityStore<TransmogSetGroup> transmogSetGroup() {
        return getEntityStore(DbcObjects.TransmogSetGroup);
    }

    default TransmogSetGroup transmogSetGroup(Integer id) {
        return transmogSetGroup().get(id);
    }

    default DbcEntityStore<TransmogSetItem> transmogSetItem() {
        return getEntityStore(DbcObjects.TransmogSetItem);
    }

    default TransmogSetItem transmogSetItem(Integer id) {
        return transmogSetItem().get(id);
    }

    default DbcEntityStore<TransportAnimation> transportAnimation() {
        return getEntityStore(DbcObjects.TransportAnimation);
    }

    default TransportAnimation transportAnimation(Integer id) {
        return transportAnimation().get(id);
    }

    default DbcEntityStore<TransportRotation> transportRotation() {
        return getEntityStore(DbcObjects.TransportRotation);
    }

    default TransportRotation transportRotation(Integer id) {
        return transportRotation().get(id);
    }

    default DbcEntityStore<UiMap> uiMap() {
        return getEntityStore(DbcObjects.UiMap);
    }

    default UiMap uiMap(Integer id) {
        return uiMap().get(id);
    }

    default DbcEntityStore<UiMapAssignment> uiMapAssignment() {
        return getEntityStore(DbcObjects.UiMapAssignment);
    }

    default UiMapAssignment uiMapAssignment(Integer id) {
        return uiMapAssignment().get(id);
    }

    default DbcEntityStore<UiMapLink> uiMapLink() {
        return getEntityStore(DbcObjects.UiMapLink);
    }

    default UiMapLink uiMapLink(Integer id) {
        return uiMapLink().get(id);
    }

    default DbcEntityStore<UiMapXMapArt> uiMapXMapArt() {
        return getEntityStore(DbcObjects.UiMapXMapArt);
    }

    default UiMapXMapArt uiMapXMapArt(Integer id) {
        return uiMapXMapArt().get(id);
    }

    default DbcEntityStore<UnitCondition> unitCondition() {
        return getEntityStore(DbcObjects.UnitCondition);
    }

    default UnitCondition unitCondition(Integer id) {
        return unitCondition().get(id);
    }

    default DbcEntityStore<UnitPowerBar> unitPowerBar() {
        return getEntityStore(DbcObjects.UnitPowerBar);
    }

    default UnitPowerBar unitPowerBar(Integer id) {
        return unitPowerBar().get(id);
    }

    default DbcEntityStore<Vehicle> vehicle() {
        return getEntityStore(DbcObjects.Vehicle);
    }

    default Vehicle vehicle(Integer id) {
        return vehicle().get(id);
    }

    default DbcEntityStore<VehicleSeat> vehicleSeat() {
        return getEntityStore(DbcObjects.VehicleSeat);
    }

    default VehicleSeat vehicleSeat(Integer id) {
        return vehicleSeat().get(id);
    }

    default DbcEntityStore<Vignette> vignette() {
        return getEntityStore(DbcObjects.Vignette);
    }

    default Vignette vignette(Integer id) {
        return vignette().get(id);
    }

    default DbcEntityStore<WmoAreaTable> wMOAreaTable() {
        return getEntityStore(DbcObjects.WMOAreaTable);
    }

    default WmoAreaTable wMOAreaTable(Integer id) {
        return wMOAreaTable().get(id);
    }

    default DbcEntityStore<WorldEffect> worldEffect() {
        return getEntityStore(DbcObjects.WorldEffect);
    }

    default WorldEffect worldEffect(Integer id) {
        return worldEffect().get(id);
    }

    default DbcEntityStore<WorldMapOverlay> worldMapOverlay() {
        return getEntityStore(DbcObjects.WorldMapOverlay);
    }

    default WorldMapOverlay worldMapOverlay(Integer id) {
        return worldMapOverlay().get(id);
    }

    default DbcEntityStore<WorldStateExpression> worldStateExpression() {
        return getEntityStore(DbcObjects.WorldStateExpression);
    }

    default WorldStateExpression worldStateExpression(Integer id) {
        return worldStateExpression().get(id);
    }


    <T extends DbcEntity> DbcEntityStore<T> getEntityStore(DbcObjects object);

}
