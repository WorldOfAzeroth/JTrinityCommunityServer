package com.github.jtrinity.dbc;

import com.github.jtrinity.cache.DbcEntityStore;
import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.common.Locale;
import com.github.jtrinity.common.Pair;
import com.github.jtrinity.dbc.domain.*;
import com.github.jtrinity.dbc.model.*;
import com.github.jtrinity.shard.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

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

    default DbcEntityStore<AdventureJournal> adventureJournal() {
        return getEntityStore(DbcObjects.AdventureJournal);
    }

    default AdventureJournal adventureJournal(Integer id) {
        return adventureJournal().get(id);
    }

    default DbcEntityStore<AdventureMapPoi> adventureMapPoi() {
        return getEntityStore(DbcObjects.AdventureMapPoi);
    }

    default AdventureMapPoi adventureMapPoi(Integer id) {
        return adventureMapPoi().get(id);
    }

    default DbcEntityStore<AnimationData> animationData() {
        return getEntityStore(DbcObjects.AnimationData);
    }

    default AnimationData animationData(Integer id) {
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

    default DbcEntityStore<Artifact> artifact() {
        return getEntityStore(DbcObjects.Artifact);
    }

    default Artifact artifact(Integer id) {
        return artifact().get(id);
    }

    default DbcEntityStore<ArtifactAppearance> artifactAppearance() {
        return getEntityStore(DbcObjects.ArtifactAppearance);
    }

    default ArtifactAppearance artifactAppearance(Integer id) {
        return artifactAppearance().get(id);
    }

    default DbcEntityStore<ArtifactAppearanceSet> artifactAppearanceSet() {
        return getEntityStore(DbcObjects.ArtifactAppearanceSet);
    }

    default ArtifactAppearanceSet artifactAppearanceSet(Integer id) {
        return artifactAppearanceSet().get(id);
    }

    default DbcEntityStore<ArtifactCategory> artifactCategory() {
        return getEntityStore(DbcObjects.ArtifactCategory);
    }

    default ArtifactCategory artifactCategory(Integer id) {
        return artifactCategory().get(id);
    }

    default DbcEntityStore<ArtifactPower> artifactPower() {
        return getEntityStore(DbcObjects.ArtifactPower);
    }

    default ArtifactPower artifactPower(Integer id) {
        return artifactPower().get(id);
    }

    default DbcEntityStore<ArtifactPowerLink> artifactPowerLink() {
        return getEntityStore(DbcObjects.ArtifactPowerLink);
    }

    default ArtifactPowerLink artifactPowerLink(Integer id) {
        return artifactPowerLink().get(id);
    }

    default DbcEntityStore<ArtifactPowerPicker> artifactPowerPicker() {
        return getEntityStore(DbcObjects.ArtifactPowerPicker);
    }

    default ArtifactPowerPicker artifactPowerPicker(Integer id) {
        return artifactPowerPicker().get(id);
    }

    default DbcEntityStore<ArtifactPowerRank> artifactPowerRank() {
        return getEntityStore(DbcObjects.ArtifactPowerRank);
    }

    default ArtifactPowerRank artifactPowerRank(Integer id) {
        return artifactPowerRank().get(id);
    }

    default DbcEntityStore<ArtifactQuestXp> artifactQuestXp() {
        return getEntityStore(DbcObjects.ArtifactQuestXp);
    }

    default ArtifactQuestXp artifactQuestXp(Integer id) {
        return artifactQuestXp().get(id);
    }

    default DbcEntityStore<ArtifactTier> artifactTier() {
        return getEntityStore(DbcObjects.ArtifactTier);
    }

    default ArtifactTier artifactTier(Integer id) {
        return artifactTier().get(id);
    }

    default DbcEntityStore<ArtifactUnlock> artifactUnlock() {
        return getEntityStore(DbcObjects.ArtifactUnlock);
    }

    default ArtifactUnlock artifactUnlock(Integer id) {
        return artifactUnlock().get(id);
    }

    default DbcEntityStore<AuctionHouse> auctionHouse() {
        return getEntityStore(DbcObjects.AuctionHouse);
    }

    default AuctionHouse auctionHouse(Integer id) {
        return auctionHouse().get(id);
    }

    default DbcEntityStore<BankBagSlotPrice> bankBagSlotPrice() {
        return getEntityStore(DbcObjects.BankBagSlotPrice);
    }

    default BankBagSlotPrice bankBagSlotPrice(Integer id) {
        return bankBagSlotPrice().get(id);
    }

    default DbcEntityStore<BannedAddon> bannedAddon() {
        return getEntityStore(DbcObjects.BannedAddon);
    }

    default BannedAddon bannedAddon(Integer id) {
        return bannedAddon().get(id);
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

    default DbcEntityStore<BattlePetSpecie> battlePetSpecie() {
        return getEntityStore(DbcObjects.BattlePetSpecie);
    }

    default BattlePetSpecie battlePetSpecie(Integer id) {
        return battlePetSpecie().get(id);
    }

    default DbcEntityStore<BattlePetSpeciesState> battlePetSpeciesState() {
        return getEntityStore(DbcObjects.BattlePetSpeciesState);
    }

    default BattlePetSpeciesState battlePetSpeciesState(Integer id) {
        return battlePetSpeciesState().get(id);
    }

    default DbcEntityStore<BattleMasterList> battleMasterList() {
        return getEntityStore(DbcObjects.BattleMasterList);
    }

    default BattleMasterList battleMasterList(Integer id) {
        return battleMasterList().get(id);
    }

    default DbcEntityStore<BroadcastText> broadcastText() {
        return getEntityStore(DbcObjects.BroadcastText);
    }

    default BroadcastText broadcastText(Integer id) {
        return broadcastText().get(id);
    }

    default DbcEntityStore<CfgCategory> cfgCategory() {
        return getEntityStore(DbcObjects.CfgCategory);
    }

    default CfgCategory cfgCategory(Integer id) {
        return cfgCategory().get(id);
    }

    default DbcEntityStore<CfgRegion> cfgRegion() {
        return getEntityStore(DbcObjects.CfgRegion);
    }

    default CfgRegion cfgRegion(Integer id) {
        return cfgRegion().get(id);
    }

    default DbcEntityStore<CharacterFacialHairStyle> characterFacialHairStyle() {
        return getEntityStore(DbcObjects.CharacterFacialHairStyle);
    }

    default CharacterFacialHairStyle characterFacialHairStyle(Integer id) {
        return characterFacialHairStyle().get(id);
    }

    default DbcEntityStore<CharBaseSection> charBaseSection() {
        return getEntityStore(DbcObjects.CharBaseSection);
    }

    default CharBaseSection charBaseSection(Integer id) {
        return charBaseSection().get(id);
    }

    default DbcEntityStore<CharSection> charSection() {
        return getEntityStore(DbcObjects.CharSection);
    }

    default CharSection charSection(Integer id) {
        return charSection().get(id);
    }

    default DbcEntityStore<CharStartOutfit> charStartOutfit() {
        return getEntityStore(DbcObjects.CharStartOutfit);
    }

    default CharStartOutfit charStartOutfit(Integer id) {
        return charStartOutfit().get(id);
    }

    default DbcEntityStore<CharTitle> charTitle() {
        return getEntityStore(DbcObjects.CharTitle);
    }

    default CharTitle charTitle(Integer id) {
        return charTitle().get(id);
    }

    default DbcEntityStore<ChatChannel> chatChannel() {
        return getEntityStore(DbcObjects.ChatChannel);
    }

    default ChatChannel chatChannel(Integer id) {
        return chatChannel().get(id);
    }

    default DbcEntityStore<ChrClass> chrClass() {
        return getEntityStore(DbcObjects.ChrClass);
    }

    default ChrClass chrClass(Integer id) {
        return chrClass().get(id);
    }

    default DbcEntityStore<ChrClassesXPowerType> chrClassesXPowerType() {
        return getEntityStore(DbcObjects.ChrClassesXPowerType);
    }

    default ChrClassesXPowerType chrClassesXPowerType(Integer id) {
        return chrClassesXPowerType().get(id);
    }

    default DbcEntityStore<ChrRace> chrRace() {
        return getEntityStore(DbcObjects.ChrRace);
    }

    default ChrRace chrRace(Integer id) {
        return chrRace().get(id);
    }

    default DbcEntityStore<ChrSpecialization> chrSpecialization() {
        return getEntityStore(DbcObjects.ChrSpecialization);
    }

    default ChrSpecialization chrSpecialization(Integer id) {
        return chrSpecialization().get(id);
    }

    default DbcEntityStore<CinematicCamera> cinematicCamera() {
        return getEntityStore(DbcObjects.CinematicCamera);
    }

    default CinematicCamera cinematicCamera(Integer id) {
        return cinematicCamera().get(id);
    }

    default DbcEntityStore<CinematicSequence> cinematicSequence() {
        return getEntityStore(DbcObjects.CinematicSequence);
    }

    default CinematicSequence cinematicSequence(Integer id) {
        return cinematicSequence().get(id);
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

    default DbcEntityStore<CreatureModelData> creatureModelData() {
        return getEntityStore(DbcObjects.CreatureModelData);
    }

    default CreatureModelData creatureModelData(Integer id) {
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

    default DbcEntityStore<CurrencyType> currencyType() {
        return getEntityStore(DbcObjects.CurrencyType);
    }

    default CurrencyType currencyType(Integer id) {
        return currencyType().get(id);
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

    default DbcEntityStore<DestructibleModelData> destructibleModelData() {
        return getEntityStore(DbcObjects.DestructibleModelData);
    }

    default DestructibleModelData destructibleModelData(Integer id) {
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

    default DbcEntityStore<DurabilityCost> durabilityCost() {
        return getEntityStore(DbcObjects.DurabilityCost);
    }

    default DurabilityCost durabilityCost(Integer id) {
        return durabilityCost().get(id);
    }

    default DbcEntityStore<DurabilityQuality> durabilityQuality() {
        return getEntityStore(DbcObjects.DurabilityQuality);
    }

    default DurabilityQuality durabilityQuality(Integer id) {
        return durabilityQuality().get(id);
    }

    default DbcEntityStore<Emote> emote() {
        return getEntityStore(DbcObjects.Emote);
    }

    default Emote emote(Integer id) {
        return emote().get(id);
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

    default DbcEntityStore<GameObjectArtKit> gameObjectArtKit() {
        return getEntityStore(DbcObjects.GameObjectArtKit);
    }

    default GameObjectArtKit gameObjectArtKit(Integer id) {
        return gameObjectArtKit().get(id);
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

    default DbcEntityStore<GameObjectDisplayInfo> gameObjectDisplayInfo() {
        return getEntityStore(DbcObjects.GameObjectDisplayInfo);
    }

    default GameObjectDisplayInfo gameObjectDisplayInfo(Integer id) {
        return gameObjectDisplayInfo().get(id);
    }

    default DbcEntityStore<GameObject> gameObject() {
        return getEntityStore(DbcObjects.GameObject);
    }

    default GameObject gameObject(Integer id) {
        return gameObject().get(id);
    }

    default DbcEntityStore<GarrAbility> garrAbility() {
        return getEntityStore(DbcObjects.GarrAbility);
    }

    default GarrAbility garrAbility(Integer id) {
        return garrAbility().get(id);
    }

    default DbcEntityStore<GarrBuilding> garrBuilding() {
        return getEntityStore(DbcObjects.GarrBuilding);
    }

    default GarrBuilding garrBuilding(Integer id) {
        return garrBuilding().get(id);
    }

    default DbcEntityStore<GarrBuildingPlotInst> garrBuildingPlotInst() {
        return getEntityStore(DbcObjects.GarrBuildingPlotInst);
    }

    default GarrBuildingPlotInst garrBuildingPlotInst(Integer id) {
        return garrBuildingPlotInst().get(id);
    }

    default DbcEntityStore<GarrClassSpec> garrClassSpec() {
        return getEntityStore(DbcObjects.GarrClassSpec);
    }

    default GarrClassSpec garrClassSpec(Integer id) {
        return garrClassSpec().get(id);
    }

    default DbcEntityStore<GarrFollower> garrFollower() {
        return getEntityStore(DbcObjects.GarrFollower);
    }

    default GarrFollower garrFollower(Integer id) {
        return garrFollower().get(id);
    }

    default DbcEntityStore<GarrFollowerXAbility> garrFollowerXAbility() {
        return getEntityStore(DbcObjects.GarrFollowerXAbility);
    }

    default GarrFollowerXAbility garrFollowerXAbility(Integer id) {
        return garrFollowerXAbility().get(id);
    }

    default DbcEntityStore<GarrPlot> garrPlot() {
        return getEntityStore(DbcObjects.GarrPlot);
    }

    default GarrPlot garrPlot(Integer id) {
        return garrPlot().get(id);
    }

    default DbcEntityStore<GarrPlotBuilding> garrPlotBuilding() {
        return getEntityStore(DbcObjects.GarrPlotBuilding);
    }

    default GarrPlotBuilding garrPlotBuilding(Integer id) {
        return garrPlotBuilding().get(id);
    }

    default DbcEntityStore<GarrPlotInstance> garrPlotInstance() {
        return getEntityStore(DbcObjects.GarrPlotInstance);
    }

    default GarrPlotInstance garrPlotInstance(Integer id) {
        return garrPlotInstance().get(id);
    }

    default DbcEntityStore<GarrSiteLevel> garrSiteLevel() {
        return getEntityStore(DbcObjects.GarrSiteLevel);
    }

    default GarrSiteLevel garrSiteLevel(Integer id) {
        return garrSiteLevel().get(id);
    }

    default DbcEntityStore<GarrSiteLevelPlotInst> garrSiteLevelPlotInst() {
        return getEntityStore(DbcObjects.GarrSiteLevelPlotInst);
    }

    default GarrSiteLevelPlotInst garrSiteLevelPlotInst(Integer id) {
        return garrSiteLevelPlotInst().get(id);
    }

    default DbcEntityStore<GarrTalentTree> garrTalentTree() {
        return getEntityStore(DbcObjects.GarrTalentTree);
    }

    default GarrTalentTree garrTalentTree(Integer id) {
        return garrTalentTree().get(id);
    }

    default DbcEntityStore<GemProperty> gemProperty() {
        return getEntityStore(DbcObjects.GemProperty);
    }

    default GemProperty gemProperty(Integer id) {
        return gemProperty().get(id);
    }

    default DbcEntityStore<GlyphBindableSpell> glyphBindableSpell() {
        return getEntityStore(DbcObjects.GlyphBindableSpell);
    }

    default GlyphBindableSpell glyphBindableSpell(Integer id) {
        return glyphBindableSpell().get(id);
    }

    default DbcEntityStore<GlyphProperty> glyphProperty() {
        return getEntityStore(DbcObjects.GlyphProperty);
    }

    default GlyphProperty glyphProperty(Integer id) {
        return glyphProperty().get(id);
    }

    default DbcEntityStore<GlyphRequiredSpec> glyphRequiredSpec() {
        return getEntityStore(DbcObjects.GlyphRequiredSpec);
    }

    default GlyphRequiredSpec glyphRequiredSpec(Integer id) {
        return glyphRequiredSpec().get(id);
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

    default DbcEntityStore<GuildPerkSpell> guildPerkSpell() {
        return getEntityStore(DbcObjects.GuildPerkSpell);
    }

    default GuildPerkSpell guildPerkSpell(Integer id) {
        return guildPerkSpell().get(id);
    }

    default DbcEntityStore<Heirloom> heirloom() {
        return getEntityStore(DbcObjects.Heirloom);
    }

    default Heirloom heirloom(Integer id) {
        return heirloom().get(id);
    }

    default DbcEntityStore<Holiday> holiday() {
        return getEntityStore(DbcObjects.Holiday);
    }

    default Holiday holiday(Integer id) {
        return holiday().get(id);
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

    default DbcEntityStore<ItemRandomProperty> itemRandomProperty() {
        return getEntityStore(DbcObjects.ItemRandomPropertie);
    }

    default ItemRandomProperty itemRandomProperty(Integer id) {
        return itemRandomProperty().get(id);
    }

    default DbcEntityStore<ItemRandomSuffix> itemRandomSuffix() {
        return getEntityStore(DbcObjects.ItemRandomSuffix);
    }

    default ItemRandomSuffix itemRandomSuffix(Integer id) {
        return itemRandomSuffix().get(id);
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

    default DbcEntityStore<ItemSpec> itemSpec() {
        return getEntityStore(DbcObjects.ItemSpec);
    }

    default ItemSpec itemSpec(Integer id) {
        return itemSpec().get(id);
    }

    default DbcEntityStore<ItemSpecOverride> itemSpecOverride() {
        return getEntityStore(DbcObjects.ItemSpecOverride);
    }

    default ItemSpecOverride itemSpecOverride(Integer id) {
        return itemSpecOverride().get(id);
    }

    default DbcEntityStore<ItemUpgrade> itemUpgrade() {
        return getEntityStore(DbcObjects.ItemUpgrade);
    }

    default ItemUpgrade itemUpgrade(Integer id) {
        return itemUpgrade().get(id);
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

    default DbcEntityStore<JournalEncounterItem> journalEncounterItem() {
        return getEntityStore(DbcObjects.JournalEncounterItem);
    }

    default JournalEncounterItem journalEncounterItem(Integer id) {
        return journalEncounterItem().get(id);
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

    default DbcEntityStore<LanguageWord> languageWord() {
        return getEntityStore(DbcObjects.LanguageWord);
    }

    default LanguageWord languageWord(Integer id) {
        return languageWord().get(id);
    }

    default DbcEntityStore<Language> language() {
        return getEntityStore(DbcObjects.Language);
    }

    default Language language(Integer id) {
        return language().get(id);
    }

    default DbcEntityStore<LfgDungeon> lfgDungeon() {
        return getEntityStore(DbcObjects.LfgDungeon);
    }

    default LfgDungeon lfgDungeon(Integer id) {
        return lfgDungeon().get(id);
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

    default DbcEntityStore<OverrideSpellData> overrideSpellData() {
        return getEntityStore(DbcObjects.OverrideSpellData);
    }

    default OverrideSpellData overrideSpellData(Integer id) {
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

    default DbcEntityStore<PvpDifficulty> pvpDifficulty() {
        return getEntityStore(DbcObjects.PvpDifficulty);
    }

    default PvpDifficulty pvpDifficulty(Integer id) {
        return pvpDifficulty().get(id);
    }

    default DbcEntityStore<PvpItem> pvpItem() {
        return getEntityStore(DbcObjects.PvpItem);
    }

    default PvpItem pvpItem(Integer id) {
        return pvpItem().get(id);
    }

    default DbcEntityStore<PvpReward> pvpReward() {
        return getEntityStore(DbcObjects.PvpReward);
    }

    default PvpReward pvpReward(Integer id) {
        return pvpReward().get(id);
    }

    default DbcEntityStore<PvpTalent> pvpTalent() {
        return getEntityStore(DbcObjects.PvpTalent);
    }

    default PvpTalent pvpTalent(Integer id) {
        return pvpTalent().get(id);
    }

    default DbcEntityStore<PvpTalentUnlock> pvpTalentUnlock() {
        return getEntityStore(DbcObjects.PvpTalentUnlock);
    }

    default PvpTalentUnlock pvpTalentUnlock(Integer id) {
        return pvpTalentUnlock().get(id);
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

    default DbcEntityStore<QuestXp> questXp() {
        return getEntityStore(DbcObjects.QuestXp);
    }

    default QuestXp questXp(Integer id) {
        return questXp().get(id);
    }

    default DbcEntityStore<RandPropPoint> randPropPoint() {
        return getEntityStore(DbcObjects.RandPropPoint);
    }

    default RandPropPoint randPropPoint(Integer id) {
        return randPropPoint().get(id);
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

    default DbcEntityStore<RulesetItemUpgrade> rulesetItemUpgrade() {
        return getEntityStore(DbcObjects.RulesetItemUpgrade);
    }

    default RulesetItemUpgrade rulesetItemUpgrade(Integer id) {
        return rulesetItemUpgrade().get(id);
    }

    default DbcEntityStore<SandboxScaling> sandboxScaling() {
        return getEntityStore(DbcObjects.SandboxScaling);
    }

    default SandboxScaling sandboxScaling(Integer id) {
        return sandboxScaling().get(id);
    }

    default DbcEntityStore<ScalingStatDistribution> scalingStatDistribution() {
        return getEntityStore(DbcObjects.ScalingStatDistribution);
    }

    default ScalingStatDistribution scalingStatDistribution(Integer id) {
        return scalingStatDistribution().get(id);
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

    default DbcEntityStore<ServerMessage> serverMessage() {
        return getEntityStore(DbcObjects.ServerMessages);
    }

    default ServerMessage serverMessage(Integer id) {
        return serverMessage().get(id);
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

    default DbcEntityStore<SpecializationSpell> specializationSpell() {
        return getEntityStore(DbcObjects.SpecializationSpell);
    }

    default SpecializationSpell specializationSpell(Integer id) {
        return specializationSpell().get(id);
    }

    default DbcEntityStore<Spell> spell() {
        return getEntityStore(DbcObjects.Spell);
    }

    default Spell spell(Integer id) {
        return spell().get(id);
    }

    default DbcEntityStore<SpellAuraOption> spellAuraOption() {
        return getEntityStore(DbcObjects.SpellAuraOption);
    }

    default SpellAuraOption spellAuraOption(Integer id) {
        return spellAuraOption().get(id);
    }

    default DbcEntityStore<SpellAuraRestriction> spellAuraRestriction() {
        return getEntityStore(DbcObjects.SpellAuraRestriction);
    }

    default SpellAuraRestriction spellAuraRestriction(Integer id) {
        return spellAuraRestriction().get(id);
    }

    default DbcEntityStore<SpellCastTime> spellCastTime() {
        return getEntityStore(DbcObjects.SpellCastTime);
    }

    default SpellCastTime spellCastTime(Integer id) {
        return spellCastTime().get(id);
    }

    default DbcEntityStore<SpellCastingRequirement> spellCastingRequirement() {
        return getEntityStore(DbcObjects.SpellCastingRequirement);
    }

    default SpellCastingRequirement spellCastingRequirement(Integer id) {
        return spellCastingRequirement().get(id);
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

    default DbcEntityStore<SpellClassOption> spellClassOption() {
        return getEntityStore(DbcObjects.SpellClassOption);
    }

    default SpellClassOption spellClassOption(Integer id) {
        return spellClassOption().get(id);
    }

    default DbcEntityStore<SpellCooldown> spellCooldown() {
        return getEntityStore(DbcObjects.SpellCooldown);
    }

    default SpellCooldown spellCooldown(Integer id) {
        return spellCooldown().get(id);
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

    default DbcEntityStore<SpellEquippedItem> spellEquippedItem() {
        return getEntityStore(DbcObjects.SpellEquippedItem);
    }

    default SpellEquippedItem spellEquippedItem(Integer id) {
        return spellEquippedItem().get(id);
    }

    default DbcEntityStore<SpellFocusObject> spellFocusObject() {
        return getEntityStore(DbcObjects.SpellFocusObject);
    }

    default SpellFocusObject spellFocusObject(Integer id) {
        return spellFocusObject().get(id);
    }

    default DbcEntityStore<SpellInterrupt> spellInterrupt() {
        return getEntityStore(DbcObjects.SpellInterrupt);
    }

    default SpellInterrupt spellInterrupt(Integer id) {
        return spellInterrupt().get(id);
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

    default DbcEntityStore<SpellLevel> spellLevel() {
        return getEntityStore(DbcObjects.SpellLevel);
    }

    default SpellLevel spellLevel(Integer id) {
        return spellLevel().get(id);
    }

    default DbcEntityStore<SpellMisc> spellMisc() {
        return getEntityStore(DbcObjects.SpellMisc);
    }

    default SpellMisc spellMisc(Integer id) {
        return spellMisc().get(id);
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
        return getEntityStore(DbcObjects.SpellRadiu);
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

    default DbcEntityStore<SpellReagent> spellReagent() {
        return getEntityStore(DbcObjects.SpellReagent);
    }

    default SpellReagent spellReagent(Integer id) {
        return spellReagent().get(id);
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

    default DbcEntityStore<SpellTargetRestriction> spellTargetRestriction() {
        return getEntityStore(DbcObjects.SpellTargetRestriction);
    }

    default SpellTargetRestriction spellTargetRestriction(Integer id) {
        return spellTargetRestriction().get(id);
    }

    default DbcEntityStore<SpellTotem> spellTotem() {
        return getEntityStore(DbcObjects.SpellTotem);
    }

    default SpellTotem spellTotem(Integer id) {
        return spellTotem().get(id);
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

    default DbcEntityStore<SummonProperty> summonProperty() {
        return getEntityStore(DbcObjects.SummonProperty);
    }

    default SummonProperty summonProperty(Integer id) {
        return summonProperty().get(id);
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

    default DbcEntityStore<TaxiNode> taxiNode() {
        return getEntityStore(DbcObjects.TaxiNode);
    }

    default TaxiNode taxiNode(Integer id) {
        return taxiNode().get(id);
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

    default DbcEntityStore<WmoAreaTable> wmoAreaTable() {
        return getEntityStore(DbcObjects.WmoAreaTable);
    }

    default WmoAreaTable wmoAreaTable(Integer id) {
        return wmoAreaTable().get(id);
    }

    default DbcEntityStore<WorldEffect> worldEffect() {
        return getEntityStore(DbcObjects.WorldEffect);
    }

    default WorldEffect worldEffect(Integer id) {
        return worldEffect().get(id);
    }

    default DbcEntityStore<WorldMapArea> worldMapArea() {
        return getEntityStore(DbcObjects.WorldMapArea);
    }

    default WorldMapArea worldMapArea(Integer id) {
        return worldMapArea().get(id);
    }

    default DbcEntityStore<WorldMapOverlay> worldMapOverlay() {
        return getEntityStore(DbcObjects.WorldMapOverlay);
    }

    default WorldMapOverlay worldMapOverlay(Integer id) {
        return worldMapOverlay().get(id);
    }

    default DbcEntityStore<WorldMapTransform> worldMapTransform() {
        return getEntityStore(DbcObjects.WorldMapTransform);
    }

    default WorldMapTransform worldMapTransform(Integer id) {
        return worldMapTransform().get(id);
    }

    default DbcEntityStore<WorldSafeLoc> worldSafeLoc() {
        return getEntityStore(DbcObjects.WorldSafeLoc);
    }

    default WorldSafeLoc worldSafeLoc(Integer id) {
        return worldSafeLoc().get(id);
    }

    default DbcEntityStore<WorldStateExpression> worldStateExpression() {
        return getEntityStore(DbcObjects.WorldStateExpression);
    }

    default WorldStateExpression worldStateExpression(Integer id) {
        return worldStateExpression().get(id);
    }

    <T extends DbcEntity> DbcEntityStore<T> getEntityStore(DbcObjects object);


    int getEmptyAnimStateID();

    List<Short> getAreasForGroup(Short areaGroupId);

    boolean isInArea(Short objectAreaId, Short areaId);

    List<ArtifactPower> getArtifactPowers(Short artifactId);

    Set<Short> getArtifactPowerLinks(Short artifactPowerId);

    ArtifactPowerRank getArtifactPowerRank(Short artifactPowerId, Byte rank);

    String getBroadcastTextValue(BroadcastText broadcastText);

    String getBroadcastTextValue(BroadcastText broadcastText, Locale locale, Gender gender, boolean forceGender);

    Integer getBroadcastTextDuration(Integer broadcastTextId);

    Integer getBroadcastTextDuration(Integer broadcastTextId, Locale locale);

    boolean hasCharacterFacialHairStyle(Byte race, Byte gender, Byte variationId);

    boolean hasCharSections(byte race, byte gender, CharBaseSectionVariation variation);

    CharSection getCharSection(Byte race, Byte gender, CharBaseSectionVariation variation, Byte variationIndex, Byte colorIndex);

    CharStartOutfit getCharStartOutfit(byte race, byte klass, byte gender);


    String getClassName(int klass, Locale locale);

    ChrSpecialization getChrSpecializationByIndex(Classes classes, int index);

    ChrSpecialization getDefaultChrSpecializationForClass(Classes classes);

    Integer getPowerIndexByClass(Power power, Integer classId);

    Map<Integer, List<Integer>> getRequiredCustomizationChoices(Integer chrCustomizationReqId);

    String getChrRaceName(Byte race);

    Integer getRedirectedContentTuningId(Integer contentTuningId, Integer redirectFlag);

    boolean hasContentTuningLabel(Integer contentTuningId, Integer label);

    String getCreatureFamilyPetName(Integer petfamily, Locale locale);

    Pair<Float, Float> getCurveXAxisRange(Integer curveId);

    float getCurveValueAt(Integer curveId, float x);

    float getCurveValueAt(CurveInterpolationMode mode, List<DBCPosition2D> points, float x);

    EmotesTextSound getTextSoundEmoteFor(Integer emote, Byte race, Byte gender, Byte class_);

    float evaluateExpectedStat(ExpectedStatType stat, Integer level, Integer expansion, Integer contentTuningId, Classes unitClass, Integer mythicPlusMilestoneSeason);

    List<Integer> getFactionTeamList(Integer faction);

    Set<FriendshipRepReaction> getFriendshipRepReactions(Integer friendshipRepID);

    Integer getGlobalCurveId(GlobalCurve globalCurveType);

    List<Integer> getGlyphBindableSpells(Integer glyphPropertiesId);

    Heirloom getHeirloomByItemId(Integer itemId);

    ItemChildEquipment getItemChildEquipment(Integer itemId);

    ItemClass getItemClassByOldEnum(Integer itemClass);

    boolean hasItemCurrencyCost(Integer itemId);

    List<ItemLimitCategoryCondition> getItemLimitCategoryConditions(Integer categoryId);

    Integer getItemDisplayId(Integer itemId, Integer appearanceModId);

    ItemModifiedAppearance getItemModifiedAppearance(Integer itemId, Integer appearanceModId);

    ItemModifiedAppearance getDefaultItemModifiedAppearance(Integer itemId);

    List<ItemSetSpell> getItemSetSpells(Integer itemSetId);

    JournalTier getJournalTier(Integer index);

    List<ItemSpecOverride> getItemSpecOverrides(Integer itemId);

    JournalInstance getJournalInstanceByMapId(Integer mapId);

    List<JournalEncounterItem> getJournalItemsByEncounter(Integer encounterId);

    List<JournalEncounter> getJournalEncounterByJournalInstanceId(Integer instanceId);

    LfgDungeon getLfgDungeon(Integer mapId, Difficulty difficulty);

    Integer getDefaultMapLight(Integer mapId);

    Integer getLiquidFlags(Integer liquidType);

    MapDifficulty getDefaultMapDifficulty(Integer mapId);

    MapDifficulty getDefaultMapDifficulty(Integer mapId, Difficulty difficulty);

    MapDifficulty getMapDifficultyData(Integer mapId, Difficulty difficulty);

    MapDifficulty getDownscaledMapDifficultyData(Integer mapId, Difficulty difficulty);

    String getNameGenEntry(Byte race, Byte gender);

    Map<Integer, PlayerCondition> getMapDifficultyConditions(Integer mapDifficultyId);

    Mount getMount(Integer spellId);

    Mount getMountById(Integer id);

    Set<MountTypeXCapability> getMountCapabilities(Integer mountType);

    List<MountXDisplay> getMountDisplays(Integer mountId);

    String getNameGen(Byte race, Byte gender);

    ResponseCode validateName(String name);

    ResponseCode validateName(String name, Locale locale);

    Integer getNumTalentsAtLevel(Integer level, Classes playerClass);

    ParagonReputation getParagonReputation(Integer factionId);

    PathDb2 getPath(Integer pathId);

    List<Integer> getPhasesForGroup(Integer group);

    PowerType getPowerType(Power power);

    PowerType getPowerTypeByName(String name);

    Byte getPvpItemLevelBonus(Integer itemId);

    Byte getMaxPrestige();

    PvpDifficulty getBattlegroundBracketByLevel(Integer mapId, Integer level);

    PvpDifficulty getBattlegroundBracketById(Integer mapId, BattlegroundBracketId id);

    Integer getRewardPackIDForPvpRewardByHonorLevelAndPrestige(byte honorLevel, byte prestige);

    Integer getRequiredHonorLevelForPvpTalent(PvpTalent talentInfo);

    List<PvpTalent> getPvpTalentsByPosition(Classes class_, Integer tier, Integer column);


    List<QuestLineXQuest> getQuestsForQuestLine(Integer questLineId);

    List<QuestPackageItem> getQuestPackageItems(Integer questPackageID);

    List<QuestPackageItem> getQuestPackageItemsFallback(Integer questPackageID);

    Integer getQuestUniqueBitFlag(Integer questId);

    List<RewardPackXCurrencyType> getRewardPackCurrencyTypesByRewardID(Integer rewardPackID);

    List<RewardPackXItem> getRewardPackItemsByRewardID(Integer rewardPackID);

    Integer getRulesetItemUpgrade(Integer itemId);

    SkillRaceClassInfo getSkillRaceClassInfo(Integer skill, Byte race, Classes class_);


    List<SkillLine> getSkillLinesForParentSkill(Integer parentSkillId);

    List<SkillLineAbility> getSkillLineAbilitiesBySkill(Integer skillId);

    SkillRaceClassInfo getSkillRaceClassInfo(Integer skill, Byte race, Byte class_);

    List<SkillRaceClassInfo> getSkillRaceClassInfo(Integer skill);

    boolean isValidSpellFamilyName(SpellFamilyName family);

    List<SpellProcsPerMinuteMod> getSpellProcPerMinuteMods(Integer spellProcPerMinuteId);

    List<SpellVisualMissile> getSpellVisualMissiles(Integer spellVisualMissileSetId);

    TaxiPath getTaxiPath(Integer from, Integer to);

    boolean isTotemCategoryCompatibleWith(Integer itemTotemCategoryId, Integer requiredTotemCategoryId, boolean requireAllTote);

    boolean IsToyItem(Integer toy);

    List<TransmogSet> getTransmogSetsForItemModifiedAppearance(Integer itemModifiedAppearanceId);

    List<TransmogSetItem> getTransmogSetItems(Integer transmogSetId);

    boolean getUiMapPosition(float x, float y, float z, Integer mapId, Integer areaId, Integer wmoDoodadPlacementId, Integer wmoGroupId, UiMapSystem system, boolean local);

    DBCPosition2D zone2MapCoordinates(Integer areaId);

    DBCPosition2D map2ZoneCoordinates(Integer areaId);

    boolean isUiMapPhase(Integer phaseId);

    WmoAreaTable getWMOAreaTable(Integer rootId, Integer adtId, Integer groupId);

    Set<Integer> getPVPStatIDsForMap(Integer mapId);

    List<ItemEffect> getItemEffectsForItemId(Integer itemId);

    WorldSafeLoc getWorldSafeLoc(Integer id);

    void determineAlternateMapPosition(Integer mapId, float x, float y, float z);

    Set<Integer> getDefaultItemBonusTree(Integer itemId, ItemContext itemContext);


}
