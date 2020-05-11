package me.giantcraft.custommobs;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.IronGolem;
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

public class CustomMobSpawning {
	
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
	
	
	@SuppressWarnings("deprecation")
	public void SpawnCustomMob(Location loc, World world, CustomMob customMob)
	{
		
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
			snowman.setTarget(customMob.target);
			snowman.setVelocity(customMob.velocity);
			snowman.teleport(customMob.tpLocation);
			snowman.setCanPickupItems(customMob.canPickUpItems);
			snowman.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "CREEPER":{
			creeper = null;
			creeper = world.spawn(loc, Creeper.class);
			creeper.setCustomName("");
			creeper.setCustomNameVisible(true);
			creeper.setMaxHealth(0);
			creeper.setHealth(0);
			creeper.setLootTable(null);
			creeper.setPersistent(true);
			creeper.setSilent(true);
			creeper.setTarget(null);
			creeper.setVelocity(null);
			creeper.teleport(new Location(world, 0, 0, 0));
			creeper.setCanPickupItems(customMob.canPickUpItems);
			creeper.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "ENDERMAN":{
			enderman = null;
			enderman = world.spawn(loc, Enderman.class);
			enderman.setCustomName("");
			enderman.setCustomNameVisible(true);
			enderman.setMaxHealth(0);
			enderman.setHealth(0);
			enderman.setLootTable(null);
			enderman.setPersistent(true);
			enderman.setSilent(true);
			enderman.setTarget(null);
			enderman.setVelocity(null);
			enderman.teleport(new Location(world, 0, 0, 0));
			enderman.setCanPickupItems(customMob.canPickUpItems);
			enderman.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "SPIDER":{
			spider = null;
			spider = world.spawn(loc, Spider.class);
			spider.setCustomName("");
			spider.setCustomNameVisible(true);
			spider.setMaxHealth(0);
			spider.setHealth(0);
			spider.setLootTable(null);
			spider.setPersistent(true);
			spider.setSilent(true);
			spider.setTarget(null);
			spider.setVelocity(null);
			spider.teleport(new Location(world, 0, 0, 0));
			spider.setCanPickupItems(customMob.canPickUpItems);
			spider.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "MAGMACUBE":{
			magmacube = null;
			magmacube = world.spawn(loc, MagmaCube.class);
			magmacube.setCustomName("");
			magmacube.setCustomNameVisible(true);
			magmacube.setMaxHealth(0);
			magmacube.setHealth(0);
			magmacube.setLootTable(null);
			magmacube.setPersistent(true);
			magmacube.setSilent(true);
			magmacube.setTarget(null);
			magmacube.setVelocity(null);
			magmacube.teleport(new Location(world, 0, 0, 0));
			magmacube.setCanPickupItems(customMob.canPickUpItems);
			magmacube.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "SKELETON":{
			skeleton = null;
			skeleton = world.spawn(loc, Skeleton.class);
			skeleton.setCustomName("");
			skeleton.setCustomNameVisible(true);
			skeleton.setMaxHealth(0);
			skeleton.setHealth(0);
			skeleton.setLootTable(null);
			skeleton.setPersistent(true);
			skeleton.setSilent(true);
			skeleton.setTarget(null);
			skeleton.setVelocity(null);
			skeleton.teleport(new Location(world, 0, 0, 0));
			skeleton.setCanPickupItems(customMob.canPickUpItems);
			skeleton.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "GHAST":{
			ghast = null;
			ghast = world.spawn(loc, Ghast.class);
			ghast.setCustomName("");
			ghast.setCustomNameVisible(true);
			ghast.setMaxHealth(0);
			ghast.setHealth(0);
			ghast.setLootTable(null);
			ghast.setPersistent(true);
			ghast.setSilent(true);
			ghast.setTarget(null);
			ghast.setVelocity(null);
			ghast.teleport(new Location(world, 0, 0, 0));
			ghast.setCanPickupItems(customMob.canPickUpItems);
			ghast.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "ZOMBIE":{
			zombie = null;
			zombie = world.spawn(loc, Zombie.class);
			zombie.setCustomName("");
			zombie.setCustomNameVisible(true);
			zombie.setMaxHealth(0);
			zombie.setHealth(0);
			zombie.setLootTable(null);
			zombie.setPersistent(true);
			zombie.setSilent(true);
			zombie.setTarget(null);
			zombie.setVelocity(null);
			zombie.teleport(new Location(world, 0, 0, 0));
			zombie.setCanPickupItems(customMob.canPickUpItems);
			zombie.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "SLIME":{
			slime = null;
			slime = world.spawn(loc, Slime.class);
			slime.setCustomName("");
			slime.setCustomNameVisible(true);
			slime.setMaxHealth(0);
			slime.setHealth(0);
			slime.setLootTable(null);
			slime.setPersistent(true);
			slime.setSilent(true);
			slime.setTarget(null);
			slime.setVelocity(null);
			slime.teleport(new Location(world, 0, 0, 0));
			slime.setCanPickupItems(customMob.canPickUpItems);
			slime.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "SILVERFISH":{
			silverfish = null;
			silverfish = world.spawn(loc, Silverfish.class);
			silverfish.setCustomName("");
			silverfish.setCustomNameVisible(true);
			silverfish.setMaxHealth(0);
			silverfish.setHealth(0);
			silverfish.setLootTable(null);
			silverfish.setPersistent(true);
			silverfish.setSilent(true);
			silverfish.setTarget(null);
			silverfish.setVelocity(null);
			silverfish.teleport(new Location(world, 0, 0, 0));
			silverfish.setCanPickupItems(customMob.canPickUpItems);
			silverfish.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "CAVESPIDER":{
			cavespider = null;
			cavespider = world.spawn(loc, CaveSpider.class);
			cavespider.setCustomName("");
			cavespider.setCustomNameVisible(true);
			cavespider.setMaxHealth(0);
			cavespider.setHealth(0);
			cavespider.setLootTable(null);
			cavespider.setPersistent(true);
			cavespider.setSilent(true);
			cavespider.setTarget(null);
			cavespider.setVelocity(null);
			cavespider.teleport(new Location(world, 0, 0, 0));
			cavespider.setCanPickupItems(customMob.canPickUpItems);
			cavespider.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "ZOMBIEPIGMAN":{
			zombiepigman = null;
			zombiepigman = world.spawn(loc, PigZombie.class);
			zombiepigman.setCustomName("");
			zombiepigman.setCustomNameVisible(true);
			zombiepigman.setMaxHealth(0);
			zombiepigman.setHealth(0);
			zombiepigman.setLootTable(null);
			zombiepigman.setPersistent(true);
			zombiepigman.setSilent(true);
			zombiepigman.setTarget(null);
			zombiepigman.setVelocity(null);
			zombiepigman.teleport(new Location(world, 0, 0, 0));
			zombiepigman.setCanPickupItems(customMob.canPickUpItems);
			zombiepigman.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "WITCH":{
			witch = null;
			witch = world.spawn(loc, Witch.class);
			witch.setCustomName("");
			witch.setCustomNameVisible(true);
			witch.setMaxHealth(0);
			witch.setHealth(0);
			witch.setLootTable(null);
			witch.setPersistent(true);
			witch.setSilent(true);
			witch.setTarget(null);
			witch.setVelocity(null);
			witch.teleport(new Location(world, 0, 0, 0));
			witch.setCanPickupItems(customMob.canPickUpItems);
			witch.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "WITHERSKELETON":{
			witherskeleton = null;
			witherskeleton = world.spawn(loc, WitherSkeleton.class);
			witherskeleton.setCustomName("");
			witherskeleton.setCustomNameVisible(true);
			witherskeleton.setMaxHealth(0);
			witherskeleton.setHealth(0);
			witherskeleton.setLootTable(null);
			witherskeleton.setPersistent(true);
			witherskeleton.setSilent(true);
			witherskeleton.setTarget(null);
			witherskeleton.setVelocity(null);
			witherskeleton.teleport(new Location(world, 0, 0, 0));
			witherskeleton.setCanPickupItems(customMob.canPickUpItems);
			witherskeleton.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "IRONGOLEM":{
			irongolem = null;
			irongolem = world.spawn(loc, IronGolem.class);
			irongolem.setCustomName("");
			irongolem.setCustomNameVisible(true);
			irongolem.setMaxHealth(0);
			irongolem.setHealth(0);
			irongolem.setLootTable(null);
			irongolem.setPersistent(true);
			irongolem.setSilent(true);
			irongolem.setTarget(null);
			irongolem.setVelocity(null);
			irongolem.teleport(new Location(world, 0, 0, 0));
			irongolem.setCanPickupItems(customMob.canPickUpItems);
			irongolem.addPotionEffects(customMob.potionEffects);
			break;
		}
		case "BLAZE":{
			blaze = null;
			blaze = world.spawn(loc, Blaze.class);
			blaze.setCustomName("");
			blaze.setCustomNameVisible(true);
			blaze.setMaxHealth(0);
			blaze.setHealth(0);
			blaze.setLootTable(null);
			blaze.setPersistent(true);
			blaze.setSilent(true);
			blaze.setTarget(null);
			blaze.setVelocity(null);
			blaze.teleport(new Location(world, 0, 0, 0));
			blaze.setCanPickupItems(customMob.canPickUpItems);
			blaze.addPotionEffects(customMob.potionEffects);
			break;
		}
		default:
			//config mistake
		}
	}
}