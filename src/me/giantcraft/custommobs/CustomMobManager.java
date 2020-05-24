package me.giantcraft.custommobs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import me.giantcraft.main.Main;

public class CustomMobManager {
	
	Main main;
	public CustomMobSpawning customMobSpawning;
	FileConfiguration customMobConfig;
	List<CustomMob> customImportedMobs;
	Object[] ConfigNames;
	
	
	public CustomMobManager(Main main)
	{
		this.main = main;
		customMobSpawning = new CustomMobSpawning(this);
		customMobConfig = main.ConfigManager.getCustomMobs();
		customImportedMobs = new ArrayList<CustomMob>();
	}
	
	public void ImportCustomMobsFromConfig()
	{			
		ConfigNames = customMobConfig.getKeys(false).toArray();
		
		for(int i = 0; i < ConfigNames.length; i++)
		{		
			String currentConfigName = null;
			currentConfigName = ConfigNames[i].toString();
			
			//new customMob profile
			customImportedMobs.add(new CustomMob());
			
			//Config Name
			customImportedMobs.get(i).configName = currentConfigName;

			//Display Name
			if (customMobConfig.contains(currentConfigName + ".name")) { customImportedMobs.get(i).name = customMobConfig.getString(currentConfigName + ".name"); }
			else { ConfigMistake("There is no name specified for customMob: " + currentConfigName); customImportedMobs.remove(i); return;}
			
			//MobType
			if(customMobConfig.contains(currentConfigName + ".mobtype")) { customImportedMobs.get(i).mobTyp = customMobConfig.getString(currentConfigName + ".mobtype"); }
			else { ConfigMistake("There is no mobtype specified for customMob: " + currentConfigName); customImportedMobs.remove(i); return;}
			
			//Health
			if (customMobConfig.contains(currentConfigName + ".health")) { customImportedMobs.get(i).health = customMobConfig.getInt(currentConfigName + ".health"); }
			
			//Loot
			if(customMobConfig.contains(currentConfigName + ".loot"))
			{
				//custom item drops
				Set<String> lootItems = customMobConfig.getConfigurationSection(currentConfigName + ".loot").getKeys(false);
				Collection<ItemStack> items = new ArrayList<ItemStack>();
				customImportedMobs.get(i).lootDropChance = new ArrayList<Double>();
				
				for (String item: lootItems) {
					
					if(customMobConfig.contains(currentConfigName + ".loot." + item + ".material") && customMobConfig.contains(currentConfigName + ".loot." + item + ".amount" ) && customMobConfig.contains(currentConfigName + ".loot." + item + ".chance"))
					{
						Material itemMaterial = Material.getMaterial(customMobConfig.getString(currentConfigName + ".loot." + item + ".material"));
						int itemAmount = customMobConfig.getInt(currentConfigName + ".loot." + item + ".amount");
						items.add(new ItemStack(itemMaterial,itemAmount));
						
						customImportedMobs.get(i).lootDropChance.add(customMobConfig.getDouble(currentConfigName + ".loot." + item + ".chance"));
					}
					else
					{
						ConfigMistake("No material or amount or chance specified for: " + item + " for customMob: " + currentConfigName);
					}
				}
				
				if(items.size() > 0)
				{
					customImportedMobs.get(i).loot = items;
				}
			}
			
			//target
			if(customMobConfig.contains(currentConfigName + ".target")) { customImportedMobs.get(i).target = customMobConfig.getString(currentConfigName + ".target"); }
			
			//velocity
			if(customMobConfig.contains(currentConfigName + ".velocity"))
			{
				if(customMobConfig.contains(currentConfigName + ".velocity.x") && customMobConfig.contains(currentConfigName + ".velocity.y") && customMobConfig.contains(currentConfigName + ".velocity.z"))
				{
					Double x = customMobConfig.getDouble(currentConfigName + ".velocity.x");
					Double y = customMobConfig.getDouble(currentConfigName + ".velocity.y");
					Double z = customMobConfig.getDouble(currentConfigName + ".velocity.z");
					customImportedMobs.get(i).velocity = new Vector(x,y,z);
				}
				else
				{
					ConfigMistake("No x or y or z specified in velocity for customMob: " + currentConfigName);
				}
			}
			
			
			//tpLocation
			if(customMobConfig.contains(currentConfigName + ".tplocation"))
			{
				if(customMobConfig.contains(currentConfigName + ".tplocation.x") && customMobConfig.contains(currentConfigName + ".tplocation.y") && customMobConfig.contains(currentConfigName + ".tplocation.z"))
				{
					Double x = customMobConfig.getDouble(currentConfigName + ".tplocation.x");
					Double y = customMobConfig.getDouble(currentConfigName + ".tplocation.y");
					Double z = customMobConfig.getDouble(currentConfigName + ".tplocation.z");
					customImportedMobs.get(i).tpLocation = new Location(null, x,y,z);
				}
				else
				{
					ConfigMistake("No x or y or z specified in velocity for customMob: " + currentConfigName);
				}
			}
			
			
			//default item drops
			if(customMobConfig.contains(currentConfigName + ".defaultdrops")) { customImportedMobs.get(i).dropDefaultLoot = customMobConfig.getBoolean(currentConfigName + ".defaultdrops"); }
			
			//canPickUpItems
			if (customMobConfig.contains(currentConfigName + ".canpickupitems")) { customImportedMobs.get(i).canPickUpItems = customMobConfig.getBoolean(currentConfigName + ".canpickupitems"); }
			
			//despawnable
			if(customMobConfig.contains(currentConfigName + ".despawnable")) { customImportedMobs.get(i).despawnable = customMobConfig.getBoolean(currentConfigName + ".despawnable"); }
			
			//silent
			if (customMobConfig.contains(currentConfigName + ".silent")) { customImportedMobs.get(i).silent = customMobConfig.getBoolean(currentConfigName + ".silent"); }
		
			//potioneffects
			if(customMobConfig.contains(currentConfigName + ".potioneffects"))
			{
				Set<String> potionsKeys = customMobConfig.getConfigurationSection(currentConfigName + ".potioneffects").getKeys(false);
				Collection<PotionEffect> potionEffects = new ArrayList<PotionEffect>();
				
				for(String potionKey : potionsKeys)
				{
					if(customMobConfig.contains(currentConfigName + potionKey + ".potioneffecttype") && customMobConfig.contains(currentConfigName + potionKey + ".duration") && customMobConfig.contains(currentConfigName + potionKey + ".strength"))
					{
						PotionEffectType effect = PotionEffectType.getByName(customMobConfig.getString(currentConfigName + potionKey + ".potioneffecttype"));
						int duration = customMobConfig.getInt(currentConfigName + potionKey + ".duration");
						int strength = customMobConfig.getInt(currentConfigName + potionKey + ".strength");
						potionEffects.add(new PotionEffect(effect,duration,strength));
					}
					else
					{
						ConfigMistake("No potioneffecttype or duration or strength specified in " + potionKey + "for customMob: " + currentConfigName);
					}
				}
				
				if(potionEffects.size() > 0)
				{
					customImportedMobs.get(i).potionEffects = potionEffects;
				}
			}
			
			//armor
			if(customMobConfig.contains(currentConfigName + ".armor"))
			{
				//boots
				if(customMobConfig.contains(currentConfigName + ".armor.boots"))
				{
					if(customMobConfig.contains(currentConfigName + ".armor.boots.material") && customMobConfig.contains(currentConfigName + ".armor.boots.dropchance"))
					{
						customImportedMobs.get(i).boots = new ItemStack(Material.getMaterial(customMobConfig.getString(currentConfigName + ".armor.boots.material")));
						customImportedMobs.get(i).bootsDropChance = (float) customMobConfig.getDouble(currentConfigName + ".armor.boots.dropchance");
					}
					else
					{
						ConfigMistake("No material or dropchance specified for boots for customMob: " + currentConfigName);
					}
				}
				
				//leggings
				if(customMobConfig.contains(currentConfigName + ".armor.leggings"))
				{
					if(customMobConfig.contains(currentConfigName + ".armor.leggings.material") && customMobConfig.contains(currentConfigName + ".armor.leggings.dropchance"))
					{
						customImportedMobs.get(i).leggings = new ItemStack(Material.getMaterial(customMobConfig.getString(currentConfigName + ".armor.leggings.material")));
						customImportedMobs.get(i).leggingsDropChance = (float) customMobConfig.getDouble(currentConfigName + ".armor.leggings.dropchance");
					}
					else
					{
						ConfigMistake("No material or dropchance specified for leggings for customMob: " + currentConfigName);
					}
				}
				
				//chestplate
				if(customMobConfig.contains(currentConfigName + ".armor.chestplate"))
				{
					if(customMobConfig.contains(currentConfigName + ".armor.chestplate.material") && customMobConfig.contains(currentConfigName + ".armor.chestplate.dropchance"))
					{
						customImportedMobs.get(i).chestPlate = new ItemStack(Material.getMaterial(customMobConfig.getString(currentConfigName + ".armor.chestplate.material")));
						customImportedMobs.get(i).chestPlateDropChance = (float) customMobConfig.getDouble(currentConfigName + ".armor.chestplate.dropchance");
					}
					else
					{
						ConfigMistake("No material or dropchance specified for chestplate for customMob: " + currentConfigName);
					}
				}
				
				//helmet
				if(customMobConfig.contains(currentConfigName + ".armor.helmet"))
				{
					if(customMobConfig.contains(currentConfigName + ".armor.helmet.material") && customMobConfig.contains(currentConfigName + ".armor.helmet.dropchance"))
					{
						customImportedMobs.get(i).helmet = new ItemStack(Material.getMaterial(customMobConfig.getString(currentConfigName + ".armor.helmet.material")));
						customImportedMobs.get(i).helmetDropChance = (float) customMobConfig.getDouble(currentConfigName + ".armor.helmet.dropchance");
					}
					else
					{
						ConfigMistake("No material or dropchance specified for helmet for customMob: " + currentConfigName);
					}
				}
				
				//mainhand
				if(customMobConfig.contains(currentConfigName + ".armor.mainhand"))
				{
					if(customMobConfig.contains(currentConfigName + ".armor.mainhand.material") && customMobConfig.contains(currentConfigName + ".armor.mainhand.dropchance"))
					{
						customImportedMobs.get(i).mainHand = new ItemStack(Material.getMaterial(customMobConfig.getString(currentConfigName + ".armor.mainhand.material")));
						customImportedMobs.get(i).mainHandDropChance = (float) customMobConfig.getDouble(currentConfigName + ".armor.mainhand.dropchance");
					}
					else
					{
						ConfigMistake("No material or dropchance specified for mainhand for customMob: " + currentConfigName);
					}
				}

			}
		
		}
	}
	
	public void ConfigMistake(String reason)
	{
		main.getServer().broadcastMessage(ChatColor.DARK_RED + "ERROR in customMob config becouse: " + ChatColor.WHITE + reason);
	}
	
	public CustomMob getCustomMobProfileFromConfigName(String ConfigName)
	{
		for(int i = 0; i < customImportedMobs.size(); i++)
		{
			String ConfigNameProfile = customImportedMobs.get(i).configName;
			
			if(ConfigName.equals(ConfigNameProfile.toString()))
			{
				return customImportedMobs.get(i);
			}

		}
		
		ConfigMistake(ConfigName + " does not exist in customMobs config");		
		return null;
	}
	
	public CustomMob getCustomMobProfileFromMobName(String MobName)
	{
		for(int i = 0; i < customImportedMobs.size(); i++)
		{
			String mobname = customImportedMobs.get(i).name;
			
			if(mobname.equals(MobName.toString()))
			{
				return customImportedMobs.get(i);
			}

		}
		
		ConfigMistake(MobName + " does not exist in customMobs config");		
		return null;
	}
	
	public boolean isAnCustomMob(String MobName)
	{
		for(int i = 0; i < customImportedMobs.size(); i++)
		{
			String mobname = customImportedMobs.get(i).name;
			
			if(mobname.equals(MobName.toString()))
			{
				return true;
			}

		}
		return false;
	}
}
