package me.giantcraft.custommobs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.loot.LootContext;
import org.bukkit.loot.LootContext.Builder;
import org.bukkit.loot.LootTable;
import org.jetbrains.annotations.NotNull;

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
		customMobConfig = main.ConfigManager.getCustomMobs();
		customMobSpawning = new CustomMobSpawning(this);
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
			
			//MobType
			if(customMobConfig.contains(currentConfigName + ".mobtype")) { customImportedMobs.get(i).mobTyp = customMobConfig.getString(currentConfigName + ".mobtype"); }
			else { ConfigMistake("There is no mobtype specified for customMob: " + currentConfigName); customImportedMobs.remove(i); return;}
			
			//Health
			if (customMobConfig.contains(currentConfigName + ".health")) { customImportedMobs.get(i).health = customMobConfig.getInt(currentConfigName + ".health"); }
			
			//Loot
			if(customMobConfig.contains(currentConfigName + ".loot"))
			{
				String[] lootItems = (String[]) customMobConfig.getConfigurationSection(currentConfigName + ".loot").getKeys(false).toArray();
				ItemStack[] items = new ItemStack[lootItems.length];
			
				for (int j = 0; j < lootItems.length; j++) {
					if(customMobConfig.contains(currentConfigName + ".loot." + lootItems[j] + ".material") && customMobConfig.contains(currentConfigName + ".loot." + lootItems[j] + ".amount"))
					{
						Material itemMaterial = Material.getMaterial(customMobConfig.getString(currentConfigName + ".loot." + lootItems[j] + ".material"));
						int itemAmount = customMobConfig.getInt(currentConfigName + ".loot." + lootItems[j] + ".amount");
						items[j] = new ItemStack(itemMaterial,itemAmount);
						
						ConfigMistake(itemMaterial.toString());
						ConfigMistake(Integer.toString(itemAmount));
					}
					else
					{
						ConfigMistake("no material or amount specified for: " + lootItems[j] + ". In customMob: " + currentConfigName);
					}
				}
				
				ConfigMistake(Integer.toString(items.length));
				if(items.length != 0)
				{
					Location location = new Location(main.getServer().getWorlds().get(1), 1, 1, 1);
					Inventory inventory = Bukkit.createInventory(null, items.length);
					Random random = new Random(1);
					Builder lootContext = new LootContext.Builder(new Location(main.getServer().getWorlds().get(0), 0, 0, 0)); 
					LootContext context = new LootContext(location, 1, 1, null, null); 
					
					inventory.setContents(items);
					
					ConfigMistake(items.toString());
					
					LootTable lootTable = null;
					lootTable.fillInventory(inventory, random, lootContex);
					
					customImportedMobs.get(i).loot = lootTable;
				}
			}
			//target
			if(customMobConfig.contains(currentConfigName + ".target")) { customImportedMobs.get(i).target = customMobConfig.getString(currentConfigName + ".target"); }
			
			//canPickUpItems
			if (customMobConfig.contains(currentConfigName + ".health")) { customImportedMobs.get(i).health = customMobConfig.getInt(currentConfigName + ".health"); }
		}
	}
	
	public void ConfigMistake(String reason)
	{
		main.getServer().broadcastMessage(ChatColor.DARK_RED + "ERROR in customMob config becouse: " + ChatColor.WHITE + reason);
	}
	
	public CustomMob getCustomMobProfile(String ConfigName)
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
}
