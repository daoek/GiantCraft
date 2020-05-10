package me.giantcraft.main;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

// Command packages
import me.giantcraft.commands.Cmd_Help;
import me.giantcraft.commands.Cmd_Test;

public class Main extends JavaPlugin {

	// Global game variables
	public ConfigManager ConfigManager;
	public CustomMobs custommobs;
	
	@Override
	public void onEnable() {
		ConfigManager = new ConfigManager();
		ConfigManager.setup();
		custommobs = new CustomMobs();
		
		// TODO: Loading commands
		this.getCommand("gchelp").setExecutor(new Cmd_Help()); // Loading the 'help' command.
		this.getCommand("guess").setExecutor(new Cmd_Test());
		
		// Registring all events
		getServer().getPluginManager().registerEvents(new Events(this), this);
		getServer().getPluginManager().registerEvents(new Cmd_Test(), this);
		
		getLogger().info(ChatColor.GREEN + "Plugin has been enabled!"); // Let the user know that the plugin is enabled!
	}

	@Override
	public void onDisable() {
		
		ConfigManager.saveCustomMobs();
		ConfigManager.saveWaves();
		getLogger().info(ChatColor.RED + "Plugin has been disabled!"); // Saying bye to you!
	
	}

}
