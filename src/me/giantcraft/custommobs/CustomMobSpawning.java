package me.giantcraft.custommobs;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Monster;
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
			changedTpLocation = true;
			customMob.tpLocation = loc;
		}
		else
		{
			customMob.tpLocation.setWorld(world);
		}
		
		Monster mob = (Monster) world.spawnEntity(loc, getEntityByName(customMob.mobTyp));
		
		mob.setCustomName(customMob.name);
		mob.setCustomNameVisible(true);
		mob.setMaxHealth(customMob.health);
		mob.setHealth(customMob.health);
		mob.setPersistent(customMob.despawnable);
		mob.setSilent(customMob.silent);
		mob.setVelocity(customMob.velocity);
		mob.teleport(customMob.tpLocation);
		mob.setCanPickupItems(customMob.canPickUpItems);
		mob.addPotionEffects(customMob.potionEffects);
		mob.getEquipment().setBoots(customMob.boots);
		mob.getEquipment().setLeggings(customMob.leggings);
		mob.getEquipment().setChestplate(customMob.chestPlate);
		mob.getEquipment().setHelmet(customMob.helmet);
		mob.getEquipment().setItemInMainHand(customMob.mainHand);
		mob.getEquipment().setBootsDropChance(customMob.bootsDropChance);
		mob.getEquipment().setLeggingsDropChance(customMob.leggingsDropChance);
		mob.getEquipment().setChestplateDropChance(customMob.chestPlateDropChance);
		mob.getEquipment().setHelmetDropChance(customMob.helmetDropChance);		
		mob.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChance);
		
		if(changedTpLocation)
		{
			customMob.tpLocation = null;
		}
		else
		{
			customMob.tpLocation.setWorld(null);
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public Monster SpawnCustomMobWithReturn(Location loc, World world, CustomMob customMob)
	{	
			boolean changedTpLocation = false;
			
			if(customMob.tpLocation == null)
			{
				changedTpLocation = true;
				customMob.tpLocation = loc;
			}
			else
			{
				customMob.tpLocation.setWorld(world);
			}
			
			Monster mob = (Monster) world.spawnEntity(loc, getEntityByName(customMob.mobTyp));
			
			mob.setCustomName(customMob.name);
			mob.setCustomNameVisible(true);
			mob.setMaxHealth(customMob.health);
			mob.setHealth(customMob.health);
			mob.setPersistent(customMob.despawnable);
			mob.setSilent(customMob.silent);
			mob.setVelocity(customMob.velocity);
			mob.teleport(customMob.tpLocation);
			mob.setCanPickupItems(customMob.canPickUpItems);
			mob.addPotionEffects(customMob.potionEffects);
			mob.getEquipment().setBoots(customMob.boots);
			mob.getEquipment().setLeggings(customMob.leggings);
			mob.getEquipment().setChestplate(customMob.chestPlate);
			mob.getEquipment().setHelmet(customMob.helmet);
			mob.getEquipment().setItemInMainHand(customMob.mainHand);
			mob.getEquipment().setBootsDropChance(customMob.bootsDropChance);
			mob.getEquipment().setLeggingsDropChance(customMob.leggingsDropChance);
			mob.getEquipment().setChestplateDropChance(customMob.chestPlateDropChance);
			mob.getEquipment().setHelmetDropChance(customMob.helmetDropChance);		
			mob.getEquipment().setItemInMainHandDropChance(customMob.mainHandDropChance);
			
			if(changedTpLocation)
			{
				customMob.tpLocation = null;
			}
			else
			{
				customMob.tpLocation.setWorld(null);
			}
		
		return mob;
	}
	
	public EntityType getEntityByName(String name)
	{
		for(EntityType type : EntityType.values())
		{
			if(type.name().equalsIgnoreCase(name.toLowerCase()))
			{
				return type;
			}
		}
		return null; 
	}
}