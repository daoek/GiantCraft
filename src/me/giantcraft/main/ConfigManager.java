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
	
	public FileConfiguration Wavescfg;
	public File WaveFile; 
	//---------------------------

	public void setup()
	{
		if(!main.getDataFolder().exists())
		{
			main.getDataFolder().mkdir();
		}
	
		//Custom mobs config file and config
		CustomMobsFile = new File(main.getDataFolder(), "CustomMobs.yml");
		if(!CustomMobsFile.exists())
		{
			try{
				CustomMobsFile.createNewFile();
			}catch(IOException e){
				main.getLogger().info(Color.RED + "Could not create CustomMobs.yml file.");
			}
		}
		CustomMobscfg = YamlConfiguration.loadConfiguration(CustomMobsFile);
		
		//waves config file and config
		WaveFile = new File(main.getDataFolder(), "RitualWaves.yml");
		if(!WaveFile.exists())
		{
			try{
				WaveFile.createNewFile();
			}catch(IOException e){
				main.getLogger().info(Color.RED + "Could not create RitualWaves.yml file.");
			}
		}
		Wavescfg = YamlConfiguration.loadConfiguration(WaveFile);
	}
	
	//Custom mobs methodes
	public FileConfiguration getCustomMobs()
	{
		return CustomMobscfg;
	}
	
	public void saveCustomMobs()
	{
		try {
			CustomMobscfg.save(CustomMobsFile);
		}catch(IOException e){
			main.getLogger().info(Color.RED + "Could not save CustomMobs.yml file.");
		}
	}
	
	public void reloadCustomMobs()
	{
		CustomMobscfg = YamlConfiguration.loadConfiguration(CustomMobsFile);
	}
	
	//waves methods
	public FileConfiguration getWaves()
	{
		return Wavescfg;
	}
	
	public void saveWaves()
	{
		try {
			Wavescfg.save(WaveFile);
		}catch(IOException e){
			main.getLogger().info(Color.RED + "Could not save CustomMobs.yml file.");
		}
	}
	
	public void reloadWaves()
	{
		Wavescfg = YamlConfiguration.loadConfiguration(WaveFile);
	}
}
