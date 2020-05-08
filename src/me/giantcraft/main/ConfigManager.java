package me.giantcraft.main;

import java.io.File;
import java.io.IOException;

import org.bukkit.Color;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigManager {

	private Main main = Main.getPlugin(Main.class);

	//Files & configurations here
	public FileConfiguration CustomMobscfg;
	public File CustomMobsFile;
	//---------------------------

	public void setup()
	{
		if(!main.getDataFolder().exists())
		{
			main.getDataFolder().mkdir();
		}
	
		CustomMobsFile = new File(main.getDataFolder(), "CustomMobs.yml");
		
		if(!CustomMobsFile.exists())
		{
			try
			{
				CustomMobsFile.createNewFile();
			}
			catch(IOException e)
			{
				main.getLogger().info(Color.RED + "Could not create CustomMobs.yml file.");
			}
		}
		
		CustomMobscfg = YamlConfiguration.loadConfiguration(CustomMobsFile);	
	}

	public FileConfiguration getCustomMobs()
	{
		return CustomMobscfg;
	}
	
	public void saveCustomMobs()
	{
		try 
		{
			CustomMobscfg.save(CustomMobsFile);
		}
		catch(IOException e)
		{
			main.getLogger().info(Color.RED + "Could not save CustomMobs.yml file.");
		}
	}
	
	public void reloadCustomMobs()
	{
		CustomMobscfg = YamlConfiguration.loadConfiguration(CustomMobsFile);
	}
}
