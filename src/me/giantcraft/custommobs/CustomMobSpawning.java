package me.giantcraft.custommobs;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Snowman;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Witch;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.loot.LootTable;

public class CustomMobSpawning {
	
	CustomMobManager manager;
	
	
	Snowman snowman;
	Creeper creeper;
	Enderman enderman;
	Spider spider;
	MagmaCube magmacube;
	Skeleton skeleton;
	Ghast ghast;
	Zombie zombie;
	Slime slime;
	Silverfish silverfish;
	CaveSpider cavespider;
	PigZombie zombiepigman;
	Witch witch;
	WitherSkeleton witherskeleton;
	IronGolem irongolem;
	Blaze blaze;
	
	public CustomMobSpawning(CustomMobManager manager)
	{
		this.manager = manager;
	}
	
	@SuppressWarnings("deprecation")
	public void SpawnCustomMob(Location loc, World world, CustomMob customMob)
	{
		boolean changedTpLocation = false;
		if(customMob.tpLocation == null)
		{
			customMob.tpLocation = loc;
			changedTpLocation = true;
		}
		
		switch(customMob.mobTyp.toUpperCase())
		{
		case "SNOWMAN":{
			snowman = null;
			snowman = world.spawn(loc, Snowman.class);
			snowman.setCustomName(customMob.name);
			snowman.setCustomNameVisible(true);
			snowman.setMaxHealth(customMob.health);
			snowman.setHealth(customMob.health);
			snowman.setLootTable(customMob.loot);
			snowman.setPersistent(customMob.despawnable);
			snowman.setSilent(customMob.silent);
			snowman.setVelocity(customMob.velocity);
			snowman.teleport(customMob.tpLocation);
			snowman.setCanPickupItems(customMob.canPickUpItems);
			snowman.addPotionEffects(customMob.potionEffects);
			snowman.getEquipment().setBoots(customMob.boots);
			snowman.getEquipment().setLeggings(customMob.leggings);
			snowman.getEquipment().setChestplate(customMob.chestPlate);
			snowman.getEquipment().setHelmet(customMob.helmet);
			snowman.getEquipment().setItemInMainHand(customMob.mainHand);
			snowman.getEquipment().setItemInOffHand(customMob.offHand);
			snowman.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			snowman.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			snowman.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			snowman.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			snowman.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			snowman.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "CREEPER":{
			creeper = null;
			creeper = world.spawn(loc, Creeper.class);
			creeper.setCustomName(customMob.name);
			creeper.setCustomNameVisible(true);
			creeper.setMaxHealth(customMob.health);
			creeper.setHealth(customMob.health);
			creeper.setLootTable(customMob.loot);
			creeper.setPersistent(customMob.despawnable);
			creeper.setSilent(customMob.silent);
			creeper.setVelocity(customMob.velocity);
			creeper.teleport(customMob.tpLocation);
			creeper.setCanPickupItems(customMob.canPickUpItems);
			creeper.addPotionEffects(customMob.potionEffects);
			creeper.getEquipment().setBoots(customMob.boots);
			creeper.getEquipment().setLeggings(customMob.leggings);
			creeper.getEquipment().setChestplate(customMob.chestPlate);
			creeper.getEquipment().setHelmet(customMob.helmet);
			creeper.getEquipment().setItemInMainHand(customMob.mainHand);
			creeper.getEquipment().setItemInOffHand(customMob.offHand);
			creeper.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			creeper.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			creeper.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			creeper.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			creeper.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			creeper.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "ENDERMAN":{
			enderman = null;
			enderman = world.spawn(loc, Enderman.class);
			enderman.setCustomName(customMob.name);
			enderman.setCustomNameVisible(true);
			enderman.setMaxHealth(customMob.health);
			enderman.setHealth(customMob.health);
			enderman.setLootTable(customMob.loot);
			enderman.setPersistent(customMob.despawnable);
			enderman.setSilent(customMob.silent);
			enderman.setVelocity(customMob.velocity);
			enderman.teleport(customMob.tpLocation);
			enderman.setCanPickupItems(customMob.canPickUpItems);
			enderman.addPotionEffects(customMob.potionEffects);
			enderman.getEquipment().setBoots(customMob.boots);
			enderman.getEquipment().setLeggings(customMob.leggings);
			enderman.getEquipment().setChestplate(customMob.chestPlate);
			enderman.getEquipment().setHelmet(customMob.helmet);
			enderman.getEquipment().setItemInMainHand(customMob.mainHand);
			enderman.getEquipment().setItemInOffHand(customMob.offHand);
			enderman.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			enderman.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			enderman.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			enderman.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			enderman.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			enderman.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "SPIDER":{
			spider = null;
			spider = world.spawn(loc, Spider.class);
			spider.setCustomName(customMob.name);
			spider.setCustomNameVisible(true);
			spider.setMaxHealth(customMob.health);
			spider.setHealth(customMob.health);
			spider.setLootTable(customMob.loot);
			spider.setPersistent(customMob.despawnable);
			spider.setSilent(customMob.silent);
			spider.setVelocity(customMob.velocity);
			spider.teleport(customMob.tpLocation);
			spider.setCanPickupItems(customMob.canPickUpItems);
			spider.addPotionEffects(customMob.potionEffects);
			spider.getEquipment().setBoots(customMob.boots);
			spider.getEquipment().setLeggings(customMob.leggings);
			spider.getEquipment().setChestplate(customMob.chestPlate);
			spider.getEquipment().setHelmet(customMob.helmet);
			spider.getEquipment().setItemInMainHand(customMob.mainHand);
			spider.getEquipment().setItemInOffHand(customMob.offHand);
			spider.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			spider.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			spider.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			spider.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			spider.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			spider.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "MAGMACUBE":{
			magmacube = null;
			magmacube = world.spawn(loc, MagmaCube.class);
			magmacube.setCustomName(customMob.name);
			magmacube.setCustomNameVisible(true);
			magmacube.setMaxHealth(customMob.health);
			magmacube.setHealth(customMob.health);
			magmacube.setLootTable(customMob.loot);
			magmacube.setPersistent(customMob.despawnable);
			magmacube.setSilent(customMob.silent);
			magmacube.setVelocity(customMob.velocity);
			magmacube.teleport(customMob.tpLocation);
			magmacube.setCanPickupItems(customMob.canPickUpItems);
			magmacube.addPotionEffects(customMob.potionEffects);
			magmacube.getEquipment().setBoots(customMob.boots);
			magmacube.getEquipment().setLeggings(customMob.leggings);
			magmacube.getEquipment().setChestplate(customMob.chestPlate);
			magmacube.getEquipment().setHelmet(customMob.helmet);
			magmacube.getEquipment().setItemInMainHand(customMob.mainHand);
			magmacube.getEquipment().setItemInOffHand(customMob.offHand);
			magmacube.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			magmacube.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			magmacube.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			magmacube.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			magmacube.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			magmacube.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "SKELETON":{
			skeleton = null;
			skeleton = world.spawn(loc, Skeleton.class);
			skeleton.setCustomName(customMob.name);
			skeleton.setCustomNameVisible(true);
			skeleton.setMaxHealth(customMob.health);
			skeleton.setHealth(customMob.health);
			skeleton.setLootTable(customMob.loot);
			skeleton.setPersistent(customMob.despawnable);
			skeleton.setSilent(customMob.silent);
			skeleton.setVelocity(customMob.velocity);
			skeleton.teleport(customMob.tpLocation);
			skeleton.setCanPickupItems(customMob.canPickUpItems);
			skeleton.addPotionEffects(customMob.potionEffects);
			skeleton.getEquipment().setBoots(customMob.boots);
			skeleton.getEquipment().setLeggings(customMob.leggings);
			skeleton.getEquipment().setChestplate(customMob.chestPlate);
			skeleton.getEquipment().setHelmet(customMob.helmet);
			skeleton.getEquipment().setItemInMainHand(customMob.mainHand);
			skeleton.getEquipment().setItemInOffHand(customMob.offHand);
			skeleton.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			skeleton.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			skeleton.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			skeleton.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			skeleton.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			skeleton.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "GHAST":{
			ghast = null;
			ghast = world.spawn(loc, Ghast.class);
			ghast.setCustomName(customMob.name);
			ghast.setCustomNameVisible(true);
			ghast.setMaxHealth(customMob.health);
			ghast.setHealth(customMob.health);
			ghast.setLootTable(customMob.loot);
			ghast.setPersistent(customMob.despawnable);
			ghast.setSilent(customMob.silent);
			ghast.setVelocity(customMob.velocity);
			ghast.teleport(customMob.tpLocation);
			ghast.setCanPickupItems(customMob.canPickUpItems);
			ghast.addPotionEffects(customMob.potionEffects);
			ghast.getEquipment().setBoots(customMob.boots);
			ghast.getEquipment().setLeggings(customMob.leggings);
			ghast.getEquipment().setChestplate(customMob.chestPlate);
			ghast.getEquipment().setHelmet(customMob.helmet);
			ghast.getEquipment().setItemInMainHand(customMob.mainHand);
			ghast.getEquipment().setItemInOffHand(customMob.offHand);
			ghast.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			ghast.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			ghast.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			ghast.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			ghast.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			ghast.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "ZOMBIE":{
			zombie = null;
			zombie = world.spawn(loc, Zombie.class);
			zombie.setCustomName(customMob.name);
			zombie.setCustomNameVisible(true);
			zombie.setMaxHealth(customMob.health);
			zombie.setHealth(customMob.health);
			zombie.setLootTable(customMob.loot);
			zombie.setPersistent(customMob.despawnable);
			zombie.setSilent(customMob.silent);
			zombie.setVelocity(customMob.velocity);
			zombie.teleport(customMob.tpLocation);
			zombie.setCanPickupItems(customMob.canPickUpItems);
			zombie.addPotionEffects(customMob.potionEffects);
			zombie.getEquipment().setBoots(customMob.boots);
			zombie.getEquipment().setLeggings(customMob.leggings);
			zombie.getEquipment().setChestplate(customMob.chestPlate);
			zombie.getEquipment().setHelmet(customMob.helmet);
			zombie.getEquipment().setItemInMainHand(customMob.mainHand);
			zombie.getEquipment().setItemInOffHand(customMob.offHand);
			zombie.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			zombie.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			zombie.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			zombie.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			zombie.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			zombie.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "SLIME":{
			slime = null;
			slime = world.spawn(loc, Slime.class);
			slime.setCustomName(customMob.name);
			slime.setCustomNameVisible(true);
			slime.setMaxHealth(customMob.health);
			slime.setHealth(customMob.health);
			slime.setLootTable(customMob.loot);
			slime.setPersistent(customMob.despawnable);
			slime.setSilent(customMob.silent);
			slime.setVelocity(customMob.velocity);
			slime.teleport(customMob.tpLocation);
			slime.setCanPickupItems(customMob.canPickUpItems);
			slime.addPotionEffects(customMob.potionEffects);
			slime.getEquipment().setBoots(customMob.boots);
			slime.getEquipment().setLeggings(customMob.leggings);
			slime.getEquipment().setChestplate(customMob.chestPlate);
			slime.getEquipment().setHelmet(customMob.helmet);
			slime.getEquipment().setItemInMainHand(customMob.mainHand);
			slime.getEquipment().setItemInOffHand(customMob.offHand);
			slime.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			slime.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			slime.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			slime.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			slime.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			slime.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "SILVERFISH":{
			silverfish = null;
			silverfish = world.spawn(loc, Silverfish.class);
			silverfish.setCustomName(customMob.name);
			silverfish.setCustomNameVisible(true);
			silverfish.setMaxHealth(customMob.health);
			silverfish.setHealth(customMob.health);
			silverfish.setLootTable(customMob.loot);
			silverfish.setPersistent(customMob.despawnable);
			silverfish.setSilent(customMob.silent);
			silverfish.setVelocity(customMob.velocity);
			silverfish.teleport(customMob.tpLocation);
			silverfish.setCanPickupItems(customMob.canPickUpItems);
			silverfish.addPotionEffects(customMob.potionEffects);
			silverfish.getEquipment().setBoots(customMob.boots);
			silverfish.getEquipment().setLeggings(customMob.leggings);
			silverfish.getEquipment().setChestplate(customMob.chestPlate);
			silverfish.getEquipment().setHelmet(customMob.helmet);
			silverfish.getEquipment().setItemInMainHand(customMob.mainHand);
			silverfish.getEquipment().setItemInOffHand(customMob.offHand);
			silverfish.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			silverfish.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			silverfish.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			silverfish.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			silverfish.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			silverfish.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "CAVESPIDER":{
			cavespider = null;
			cavespider = world.spawn(loc, CaveSpider.class);
			cavespider.setCustomName(customMob.name);
			cavespider.setCustomNameVisible(true);
			cavespider.setMaxHealth(customMob.health);
			cavespider.setHealth(customMob.health);
			cavespider.setLootTable(customMob.loot);
			cavespider.setPersistent(customMob.despawnable);
			cavespider.setSilent(customMob.silent);
			cavespider.setVelocity(customMob.velocity);
			cavespider.teleport(customMob.tpLocation);
			cavespider.setCanPickupItems(customMob.canPickUpItems);
			cavespider.addPotionEffects(customMob.potionEffects);
			cavespider.getEquipment().setBoots(customMob.boots);
			cavespider.getEquipment().setLeggings(customMob.leggings);
			cavespider.getEquipment().setChestplate(customMob.chestPlate);
			cavespider.getEquipment().setHelmet(customMob.helmet);
			cavespider.getEquipment().setItemInMainHand(customMob.mainHand);
			cavespider.getEquipment().setItemInOffHand(customMob.offHand);
			cavespider.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			cavespider.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			cavespider.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			cavespider.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			cavespider.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			cavespider.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "ZOMBIEPIGMAN":{
			zombiepigman = null;
			zombiepigman = world.spawn(loc, PigZombie.class);
			zombiepigman.setCustomName(customMob.name);
			zombiepigman.setCustomNameVisible(true);
			zombiepigman.setMaxHealth(customMob.health);
			zombiepigman.setHealth(customMob.health);
			zombiepigman.setLootTable(customMob.loot);
			zombiepigman.setPersistent(customMob.despawnable);
			zombiepigman.setSilent(customMob.silent);
			zombiepigman.setVelocity(customMob.velocity);
			zombiepigman.teleport(customMob.tpLocation);
			zombiepigman.setCanPickupItems(customMob.canPickUpItems);
			zombiepigman.addPotionEffects(customMob.potionEffects);
			zombiepigman.getEquipment().setBoots(customMob.boots);
			zombiepigman.getEquipment().setLeggings(customMob.leggings);
			zombiepigman.getEquipment().setChestplate(customMob.chestPlate);
			zombiepigman.getEquipment().setHelmet(customMob.helmet);
			zombiepigman.getEquipment().setItemInMainHand(customMob.mainHand);
			zombiepigman.getEquipment().setItemInOffHand(customMob.offHand);
			zombiepigman.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			zombiepigman.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			zombiepigman.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			zombiepigman.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			zombiepigman.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			zombiepigman.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "WITCH":{
			witch = null;
			witch = world.spawn(loc, Witch.class);
			witch.setCustomName(customMob.name);
			witch.setCustomNameVisible(true);
			witch.setMaxHealth(customMob.health);
			witch.setHealth(customMob.health);
			witch.setLootTable(customMob.loot);
			witch.setPersistent(customMob.despawnable);
			witch.setSilent(customMob.silent);
			witch.setVelocity(customMob.velocity);
			witch.teleport(customMob.tpLocation);
			witch.setCanPickupItems(customMob.canPickUpItems);
			witch.addPotionEffects(customMob.potionEffects);
			witch.getEquipment().setBoots(customMob.boots);
			witch.getEquipment().setLeggings(customMob.leggings);
			witch.getEquipment().setChestplate(customMob.chestPlate);
			witch.getEquipment().setHelmet(customMob.helmet);
			witch.getEquipment().setItemInMainHand(customMob.mainHand);
			witch.getEquipment().setItemInOffHand(customMob.offHand);
			witch.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			witch.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			witch.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			witch.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			witch.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			witch.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "WITHERSKELETON":{
			witherskeleton = null;
			witherskeleton = world.spawn(loc, WitherSkeleton.class);
			witherskeleton.setCustomName(customMob.name);
			witherskeleton.setCustomNameVisible(true);
			witherskeleton.setMaxHealth(customMob.health);
			witherskeleton.setHealth(customMob.health);
			witherskeleton.setLootTable(customMob.loot);
			witherskeleton.setPersistent(customMob.despawnable);
			witherskeleton.setSilent(customMob.silent);
			witherskeleton.setVelocity(customMob.velocity);
			witherskeleton.teleport(customMob.tpLocation);
			witherskeleton.setCanPickupItems(customMob.canPickUpItems);
			witherskeleton.addPotionEffects(customMob.potionEffects);
			witherskeleton.getEquipment().setBoots(customMob.boots);
			witherskeleton.getEquipment().setLeggings(customMob.leggings);
			witherskeleton.getEquipment().setChestplate(customMob.chestPlate);
			witherskeleton.getEquipment().setHelmet(customMob.helmet);
			witherskeleton.getEquipment().setItemInMainHand(customMob.mainHand);
			witherskeleton.getEquipment().setItemInOffHand(customMob.offHand);
			witherskeleton.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			witherskeleton.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			witherskeleton.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			witherskeleton.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			witherskeleton.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			witherskeleton.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "IRONGOLEM":{
			irongolem = null;
			irongolem = world.spawn(loc, IronGolem.class);
			irongolem.setCustomName(customMob.name);
			irongolem.setCustomNameVisible(true);
			irongolem.setMaxHealth(customMob.health);
			irongolem.setHealth(customMob.health);
			irongolem.setLootTable(customMob.loot);
			irongolem.setPersistent(customMob.despawnable);
			irongolem.setSilent(customMob.silent);
			irongolem.setVelocity(customMob.velocity);
			irongolem.teleport(customMob.tpLocation);
			irongolem.setCanPickupItems(customMob.canPickUpItems);
			irongolem.addPotionEffects(customMob.potionEffects);
			irongolem.getEquipment().setBoots(customMob.boots);
			irongolem.getEquipment().setLeggings(customMob.leggings);
			irongolem.getEquipment().setChestplate(customMob.chestPlate);
			irongolem.getEquipment().setHelmet(customMob.helmet);
			irongolem.getEquipment().setItemInMainHand(customMob.mainHand);
			irongolem.getEquipment().setItemInOffHand(customMob.offHand);
			irongolem.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			irongolem.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			irongolem.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			irongolem.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			irongolem.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			irongolem.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		case "BLAZE":{
			blaze = null;
			blaze = world.spawn(loc, Blaze.class);
			blaze.setCustomName(customMob.name);
			blaze.setCustomNameVisible(true);
			blaze.setMaxHealth(customMob.health);
			blaze.setHealth(customMob.health);
			blaze.setLootTable(customMob.loot);
			blaze.setPersistent(customMob.despawnable);
			blaze.setSilent(customMob.silent);
			blaze.setVelocity(customMob.velocity);
			blaze.teleport(customMob.tpLocation);
			blaze.setCanPickupItems(customMob.canPickUpItems);
			blaze.addPotionEffects(customMob.potionEffects);
			blaze.getEquipment().setBoots(customMob.boots);
			blaze.getEquipment().setLeggings(customMob.leggings);
			blaze.getEquipment().setChestplate(customMob.chestPlate);
			blaze.getEquipment().setHelmet(customMob.helmet);
			blaze.getEquipment().setItemInMainHand(customMob.mainHand);
			blaze.getEquipment().setItemInOffHand(customMob.offHand);
			blaze.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			blaze.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			blaze.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			blaze.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			blaze.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			blaze.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			break;
		}
		default:
			manager.ConfigMistake("a mob type is not specified correctly.");
		}
		
		if(changedTpLocation)
		{
			customMob.tpLocation = null;
		}
	}
	
	@SuppressWarnings("deprecation")
	public LivingEntity SpawnCustomMobWithReturn(Location loc, World world, CustomMob customMob)
	{	
		if(customMob.tpLocation == null)
		{
			customMob.tpLocation = loc;
		}
		
		switch(customMob.mobTyp.toUpperCase())
		{
		case "SNOWMAN":{
			snowman = null;
			snowman = world.spawn(loc, Snowman.class);
			snowman.setCustomName(customMob.name);
			snowman.setCustomNameVisible(true);
			snowman.setMaxHealth(customMob.health);
			snowman.setHealth(customMob.health);
			snowman.setLootTable(customMob.loot);
			snowman.setPersistent(customMob.despawnable);
			snowman.setSilent(customMob.silent);
			snowman.setVelocity(customMob.velocity);
			snowman.teleport(customMob.tpLocation);
			snowman.setCanPickupItems(customMob.canPickUpItems);
			snowman.addPotionEffects(customMob.potionEffects);
			snowman.getEquipment().setBoots(customMob.boots);
			snowman.getEquipment().setLeggings(customMob.leggings);
			snowman.getEquipment().setChestplate(customMob.chestPlate);
			snowman.getEquipment().setHelmet(customMob.helmet);
			snowman.getEquipment().setItemInMainHand(customMob.mainHand);
			snowman.getEquipment().setItemInOffHand(customMob.offHand);
			snowman.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			snowman.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			snowman.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			snowman.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			snowman.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			snowman.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return snowman;
		}
		case "CREEPER":{
			creeper = null;
			creeper = world.spawn(loc, Creeper.class);
			creeper.setCustomName(customMob.name);
			creeper.setCustomNameVisible(true);
			creeper.setMaxHealth(customMob.health);
			creeper.setHealth(customMob.health);
			creeper.setLootTable(customMob.loot);
			creeper.setPersistent(customMob.despawnable);
			creeper.setSilent(customMob.silent);
			creeper.setVelocity(customMob.velocity);
			creeper.teleport(customMob.tpLocation);
			creeper.setCanPickupItems(customMob.canPickUpItems);
			creeper.addPotionEffects(customMob.potionEffects);
			creeper.getEquipment().setBoots(customMob.boots);
			creeper.getEquipment().setLeggings(customMob.leggings);
			creeper.getEquipment().setChestplate(customMob.chestPlate);
			creeper.getEquipment().setHelmet(customMob.helmet);
			creeper.getEquipment().setItemInMainHand(customMob.mainHand);
			creeper.getEquipment().setItemInOffHand(customMob.offHand);
			creeper.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			creeper.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			creeper.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			creeper.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			creeper.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			creeper.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return creeper;
		}
		case "ENDERMAN":{
			enderman = null;
			enderman = world.spawn(loc, Enderman.class);
			enderman.setCustomName(customMob.name);
			enderman.setCustomNameVisible(true);
			enderman.setMaxHealth(customMob.health);
			enderman.setHealth(customMob.health);
			enderman.setLootTable(customMob.loot);
			enderman.setPersistent(customMob.despawnable);
			enderman.setSilent(customMob.silent);
			enderman.setVelocity(customMob.velocity);
			enderman.teleport(customMob.tpLocation);
			enderman.setCanPickupItems(customMob.canPickUpItems);
			enderman.addPotionEffects(customMob.potionEffects);
			enderman.getEquipment().setBoots(customMob.boots);
			enderman.getEquipment().setLeggings(customMob.leggings);
			enderman.getEquipment().setChestplate(customMob.chestPlate);
			enderman.getEquipment().setHelmet(customMob.helmet);
			enderman.getEquipment().setItemInMainHand(customMob.mainHand);
			enderman.getEquipment().setItemInOffHand(customMob.offHand);
			enderman.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			enderman.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			enderman.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			enderman.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			enderman.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			enderman.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return enderman;
		}
		case "SPIDER":{
			spider = null;
			spider = world.spawn(loc, Spider.class);
			spider.setCustomName(customMob.name);
			spider.setCustomNameVisible(true);
			spider.setMaxHealth(customMob.health);
			spider.setHealth(customMob.health);
			spider.setLootTable(customMob.loot);
			spider.setPersistent(customMob.despawnable);
			spider.setSilent(customMob.silent);
			spider.setVelocity(customMob.velocity);
			spider.teleport(customMob.tpLocation);
			spider.setCanPickupItems(customMob.canPickUpItems);
			spider.addPotionEffects(customMob.potionEffects);
			spider.getEquipment().setBoots(customMob.boots);
			spider.getEquipment().setLeggings(customMob.leggings);
			spider.getEquipment().setChestplate(customMob.chestPlate);
			spider.getEquipment().setHelmet(customMob.helmet);
			spider.getEquipment().setItemInMainHand(customMob.mainHand);
			spider.getEquipment().setItemInOffHand(customMob.offHand);
			spider.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			spider.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			spider.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			spider.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			spider.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			spider.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return spider;
		}
		case "MAGMACUBE":{
			magmacube = null;
			magmacube = world.spawn(loc, MagmaCube.class);
			magmacube.setCustomName(customMob.name);
			magmacube.setCustomNameVisible(true);
			magmacube.setMaxHealth(customMob.health);
			magmacube.setHealth(customMob.health);
			magmacube.setLootTable(customMob.loot);
			magmacube.setPersistent(customMob.despawnable);
			magmacube.setSilent(customMob.silent);
			magmacube.setVelocity(customMob.velocity);
			magmacube.teleport(customMob.tpLocation);
			magmacube.setCanPickupItems(customMob.canPickUpItems);
			magmacube.addPotionEffects(customMob.potionEffects);
			magmacube.getEquipment().setBoots(customMob.boots);
			magmacube.getEquipment().setLeggings(customMob.leggings);
			magmacube.getEquipment().setChestplate(customMob.chestPlate);
			magmacube.getEquipment().setHelmet(customMob.helmet);
			magmacube.getEquipment().setItemInMainHand(customMob.mainHand);
			magmacube.getEquipment().setItemInOffHand(customMob.offHand);
			magmacube.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			magmacube.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			magmacube.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			magmacube.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			magmacube.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			magmacube.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return magmacube;
		}
		case "SKELETON":{
			skeleton = null;
			skeleton = world.spawn(loc, Skeleton.class);
			skeleton.setCustomName(customMob.name);
			skeleton.setCustomNameVisible(true);
			skeleton.setMaxHealth(customMob.health);
			skeleton.setHealth(customMob.health);
			skeleton.setLootTable(customMob.loot);
			skeleton.setPersistent(customMob.despawnable);
			skeleton.setSilent(customMob.silent);
			skeleton.setVelocity(customMob.velocity);
			skeleton.teleport(customMob.tpLocation);
			skeleton.setCanPickupItems(customMob.canPickUpItems);
			skeleton.addPotionEffects(customMob.potionEffects);
			skeleton.getEquipment().setBoots(customMob.boots);
			skeleton.getEquipment().setLeggings(customMob.leggings);
			skeleton.getEquipment().setChestplate(customMob.chestPlate);
			skeleton.getEquipment().setHelmet(customMob.helmet);
			skeleton.getEquipment().setItemInMainHand(customMob.mainHand);
			skeleton.getEquipment().setItemInOffHand(customMob.offHand);
			skeleton.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			skeleton.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			skeleton.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			skeleton.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			skeleton.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			skeleton.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return skeleton;
		}
		case "GHAST":{
			ghast = null;
			ghast = world.spawn(loc, Ghast.class);
			ghast.setCustomName(customMob.name);
			ghast.setCustomNameVisible(true);
			ghast.setMaxHealth(customMob.health);
			ghast.setHealth(customMob.health);
			ghast.setLootTable(customMob.loot);
			ghast.setPersistent(customMob.despawnable);
			ghast.setSilent(customMob.silent);
			ghast.setVelocity(customMob.velocity);
			ghast.teleport(customMob.tpLocation);
			ghast.setCanPickupItems(customMob.canPickUpItems);
			ghast.addPotionEffects(customMob.potionEffects);
			ghast.getEquipment().setBoots(customMob.boots);
			ghast.getEquipment().setLeggings(customMob.leggings);
			ghast.getEquipment().setChestplate(customMob.chestPlate);
			ghast.getEquipment().setHelmet(customMob.helmet);
			ghast.getEquipment().setItemInMainHand(customMob.mainHand);
			ghast.getEquipment().setItemInOffHand(customMob.offHand);
			ghast.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			ghast.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			ghast.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			ghast.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			ghast.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			ghast.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return ghast;
		}
		case "ZOMBIE":{
			zombie = null;
			zombie = world.spawn(loc, Zombie.class);
			zombie.setCustomName(customMob.name);
			zombie.setCustomNameVisible(true);
			zombie.setMaxHealth(customMob.health);
			zombie.setHealth(customMob.health);
			zombie.setLootTable(customMob.loot);
			zombie.setPersistent(customMob.despawnable);
			zombie.setSilent(customMob.silent);
			zombie.setVelocity(customMob.velocity);
			zombie.teleport(customMob.tpLocation);
			zombie.setCanPickupItems(customMob.canPickUpItems);
			zombie.addPotionEffects(customMob.potionEffects);
			zombie.getEquipment().setBoots(customMob.boots);
			zombie.getEquipment().setLeggings(customMob.leggings);
			zombie.getEquipment().setChestplate(customMob.chestPlate);
			zombie.getEquipment().setHelmet(customMob.helmet);
			zombie.getEquipment().setItemInMainHand(customMob.mainHand);
			zombie.getEquipment().setItemInOffHand(customMob.offHand);
			zombie.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			zombie.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			zombie.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			zombie.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			zombie.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			zombie.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return zombie;
		}
		case "SLIME":{
			slime = null;
			slime = world.spawn(loc, Slime.class);
			slime.setCustomName(customMob.name);
			slime.setCustomNameVisible(true);
			slime.setMaxHealth(customMob.health);
			slime.setHealth(customMob.health);
			slime.setLootTable(customMob.loot);
			slime.setPersistent(customMob.despawnable);
			slime.setSilent(customMob.silent);
			slime.setVelocity(customMob.velocity);
			slime.teleport(customMob.tpLocation);
			slime.setCanPickupItems(customMob.canPickUpItems);
			slime.addPotionEffects(customMob.potionEffects);
			slime.getEquipment().setBoots(customMob.boots);
			slime.getEquipment().setLeggings(customMob.leggings);
			slime.getEquipment().setChestplate(customMob.chestPlate);
			slime.getEquipment().setHelmet(customMob.helmet);
			slime.getEquipment().setItemInMainHand(customMob.mainHand);
			slime.getEquipment().setItemInOffHand(customMob.offHand);
			slime.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			slime.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			slime.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			slime.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			slime.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			slime.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return slime;
		}
		case "SILVERFISH":{
			silverfish = null;
			silverfish = world.spawn(loc, Silverfish.class);
			silverfish.setCustomName(customMob.name);
			silverfish.setCustomNameVisible(true);
			silverfish.setMaxHealth(customMob.health);
			silverfish.setHealth(customMob.health);
			silverfish.setLootTable(customMob.loot);
			silverfish.setPersistent(customMob.despawnable);
			silverfish.setSilent(customMob.silent);
			silverfish.setVelocity(customMob.velocity);
			silverfish.teleport(customMob.tpLocation);
			silverfish.setCanPickupItems(customMob.canPickUpItems);
			silverfish.addPotionEffects(customMob.potionEffects);
			silverfish.getEquipment().setBoots(customMob.boots);
			silverfish.getEquipment().setLeggings(customMob.leggings);
			silverfish.getEquipment().setChestplate(customMob.chestPlate);
			silverfish.getEquipment().setHelmet(customMob.helmet);
			silverfish.getEquipment().setItemInMainHand(customMob.mainHand);
			silverfish.getEquipment().setItemInOffHand(customMob.offHand);
			silverfish.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			silverfish.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			silverfish.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			silverfish.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			silverfish.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			silverfish.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return silverfish;
		}
		case "CAVESPIDER":{
			cavespider = null;
			cavespider = world.spawn(loc, CaveSpider.class);
			cavespider.setCustomName(customMob.name);
			cavespider.setCustomNameVisible(true);
			cavespider.setMaxHealth(customMob.health);
			cavespider.setHealth(customMob.health);
			cavespider.setLootTable(customMob.loot);
			cavespider.setPersistent(customMob.despawnable);
			cavespider.setSilent(customMob.silent);
			cavespider.setVelocity(customMob.velocity);
			cavespider.teleport(customMob.tpLocation);
			cavespider.setCanPickupItems(customMob.canPickUpItems);
			cavespider.addPotionEffects(customMob.potionEffects);
			cavespider.getEquipment().setBoots(customMob.boots);
			cavespider.getEquipment().setLeggings(customMob.leggings);
			cavespider.getEquipment().setChestplate(customMob.chestPlate);
			cavespider.getEquipment().setHelmet(customMob.helmet);
			cavespider.getEquipment().setItemInMainHand(customMob.mainHand);
			cavespider.getEquipment().setItemInOffHand(customMob.offHand);
			cavespider.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			cavespider.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			cavespider.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			cavespider.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			cavespider.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			cavespider.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return cavespider;
		}
		case "ZOMBIEPIGMAN":{
			zombiepigman = null;
			zombiepigman = world.spawn(loc, PigZombie.class);
			zombiepigman.setCustomName(customMob.name);
			zombiepigman.setCustomNameVisible(true);
			zombiepigman.setMaxHealth(customMob.health);
			zombiepigman.setHealth(customMob.health);
			zombiepigman.setLootTable(customMob.loot);
			zombiepigman.setPersistent(customMob.despawnable);
			zombiepigman.setSilent(customMob.silent);
			zombiepigman.setVelocity(customMob.velocity);
			zombiepigman.teleport(customMob.tpLocation);
			zombiepigman.setCanPickupItems(customMob.canPickUpItems);
			zombiepigman.addPotionEffects(customMob.potionEffects);
			zombiepigman.getEquipment().setBoots(customMob.boots);
			zombiepigman.getEquipment().setLeggings(customMob.leggings);
			zombiepigman.getEquipment().setChestplate(customMob.chestPlate);
			zombiepigman.getEquipment().setHelmet(customMob.helmet);
			zombiepigman.getEquipment().setItemInMainHand(customMob.mainHand);
			zombiepigman.getEquipment().setItemInOffHand(customMob.offHand);
			zombiepigman.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			zombiepigman.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			zombiepigman.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			zombiepigman.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			zombiepigman.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			zombiepigman.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return zombiepigman;
		}
		case "WITCH":{
			witch = null;
			witch = world.spawn(loc, Witch.class);
			witch.setCustomName(customMob.name);
			witch.setCustomNameVisible(true);
			witch.setMaxHealth(customMob.health);
			witch.setHealth(customMob.health);
			witch.setLootTable(customMob.loot);
			witch.setPersistent(customMob.despawnable);
			witch.setSilent(customMob.silent);
			witch.setVelocity(customMob.velocity);
			witch.teleport(customMob.tpLocation);
			witch.setCanPickupItems(customMob.canPickUpItems);
			witch.addPotionEffects(customMob.potionEffects);
			witch.getEquipment().setBoots(customMob.boots);
			witch.getEquipment().setLeggings(customMob.leggings);
			witch.getEquipment().setChestplate(customMob.chestPlate);
			witch.getEquipment().setHelmet(customMob.helmet);
			witch.getEquipment().setItemInMainHand(customMob.mainHand);
			witch.getEquipment().setItemInOffHand(customMob.offHand);
			witch.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			witch.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			witch.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			witch.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			witch.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			witch.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return witch;
		}
		case "WITHERSKELETON":{
			witherskeleton = null;
			witherskeleton = world.spawn(loc, WitherSkeleton.class);
			witherskeleton.setCustomName(customMob.name);
			witherskeleton.setCustomNameVisible(true);
			witherskeleton.setMaxHealth(customMob.health);
			witherskeleton.setHealth(customMob.health);
			witherskeleton.setLootTable(customMob.loot);
			witherskeleton.setPersistent(customMob.despawnable);
			witherskeleton.setSilent(customMob.silent);
			witherskeleton.setVelocity(customMob.velocity);
			witherskeleton.teleport(customMob.tpLocation);
			witherskeleton.setCanPickupItems(customMob.canPickUpItems);
			witherskeleton.addPotionEffects(customMob.potionEffects);
			witherskeleton.getEquipment().setBoots(customMob.boots);
			witherskeleton.getEquipment().setLeggings(customMob.leggings);
			witherskeleton.getEquipment().setChestplate(customMob.chestPlate);
			witherskeleton.getEquipment().setHelmet(customMob.helmet);
			witherskeleton.getEquipment().setItemInMainHand(customMob.mainHand);
			witherskeleton.getEquipment().setItemInOffHand(customMob.offHand);
			witherskeleton.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			witherskeleton.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			witherskeleton.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			witherskeleton.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			witherskeleton.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			witherskeleton.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return witherskeleton;
		}
		case "IRONGOLEM":{
			irongolem = null;
			irongolem = world.spawn(loc, IronGolem.class);
			irongolem.setCustomName(customMob.name);
			irongolem.setCustomNameVisible(true);
			irongolem.setMaxHealth(customMob.health);
			irongolem.setHealth(customMob.health);
			irongolem.setLootTable(customMob.loot);
			irongolem.setPersistent(customMob.despawnable);
			irongolem.setSilent(customMob.silent);
			irongolem.setVelocity(customMob.velocity);
			irongolem.teleport(customMob.tpLocation);
			irongolem.setCanPickupItems(customMob.canPickUpItems);
			irongolem.addPotionEffects(customMob.potionEffects);
			irongolem.getEquipment().setBoots(customMob.boots);
			irongolem.getEquipment().setLeggings(customMob.leggings);
			irongolem.getEquipment().setChestplate(customMob.chestPlate);
			irongolem.getEquipment().setHelmet(customMob.helmet);
			irongolem.getEquipment().setItemInMainHand(customMob.mainHand);
			irongolem.getEquipment().setItemInOffHand(customMob.offHand);
			irongolem.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			irongolem.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			irongolem.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			irongolem.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			irongolem.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			irongolem.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return irongolem;
		}
		case "BLAZE":{
			blaze = null;
			blaze = world.spawn(loc, Blaze.class);
			blaze.setCustomName(customMob.name);
			blaze.setCustomNameVisible(true);
			blaze.setMaxHealth(customMob.health);
			blaze.setHealth(customMob.health);
			blaze.setLootTable(customMob.loot);
			blaze.setPersistent(customMob.despawnable);
			blaze.setSilent(customMob.silent);
			blaze.setVelocity(customMob.velocity);
			blaze.teleport(customMob.tpLocation);
			blaze.setCanPickupItems(customMob.canPickUpItems);
			blaze.addPotionEffects(customMob.potionEffects);
			blaze.getEquipment().setBoots(customMob.boots);
			blaze.getEquipment().setLeggings(customMob.leggings);
			blaze.getEquipment().setChestplate(customMob.chestPlate);
			blaze.getEquipment().setHelmet(customMob.helmet);
			blaze.getEquipment().setItemInMainHand(customMob.mainHand);
			blaze.getEquipment().setItemInOffHand(customMob.offHand);
			blaze.getEquipment().setBootsDropChance(customMob.bootsDropChange);
			blaze.getEquipment().setLeggingsDropChance(customMob.leggingsDropChange);
			blaze.getEquipment().setChestplateDropChance(customMob.chestPlateDropChange);
			blaze.getEquipment().setHelmetDropChance(customMob.helmetDropChange);		
			blaze.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChange);
			blaze.getEquipment().setItemInOffHandDropChance(customMob.offHandDropChange);
			return blaze;
		}
		default:
			manager.ConfigMistake("a mob type is not specified correctly.");
		}
		return null;
	}
}