package me.giantcraft.custommobs;

import java.util.Collection;

import me.giantcraft.main.Main;

public class CustomMobManager {
	
	Main main;
	
	public CustomMobManager(Main main)
	{
		this.main = main;
	}
	
	CustomMobSpawning customMobSpawning = new CustomMobSpawning();
	Collection<CustomMob> TypesOfMobs;
	
	void ImportCustomMobsFormConfig()
	{
		Object[] ConfigNames = main.ConfigManager.getCustomMobs().getStringList("ConfigNames").toArray();
		
		for(int i = 0; i < ConfigNames.length; i++)
		{
			main.getServer().broadcastMessage(ConfigNames[i].toString());
		}
	}
}
