package me.giantcraft.main;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

// Command packages
import me.giantcraft.commands.Cmd_Help;
import me.giantcraft.commands.Cmd_Test;
import me.giantcraft.custommobs.CustomMobManager;
import me.giantcraft.rewards.Cmd_redeem;
import me.giantcraft.rewards.GuiReward;

public class Main extends JavaPlugin {

	// Global game variables
	public ConfigManager ConfigManager;
	public CustomMobManager customMobsManager;
	
	@Override
	public void onEnable() {
		ConfigManager = new ConfigManager();
		ConfigManager.setup();
		customMobsManager = new CustomMobManager(this);
		getServer().broadcastMessage("import mobs config before");
		customMobsManager.ImportCustomMobsFromConfig();
		getServer().broadcastMessage("import mobs config after");
		///
		// COMMANDS
		///
		
		// General
		this.getCommand("gchelp").setExecutor(new Cmd_Help()); // Loading the 'help' command.
		
		// Guessing game
		this.getCommand("guess").setExecutor(new Cmd_Test());
		
		// Periodic reward system
		this.getCommand("redeem").setExecutor(new Cmd_redeem());
		
		///
		// EVENTS
		///
		getServer().getPluginManager().registerEvents(new Events(this), this);
		getServer().getPluginManager().registerEvents(new Cmd_Test(), this);
		getServer().getPluginManager().registerEvents(new GuiReward(), this);
		
		
		getLogger().info(ChatColor.GREEN + "Plugin has been enabled!"); // Let the user know that the plugin is enabled!
	}

	@Override
	public void onDisable() {
		ConfigManager.reloadCustomMobs();
		ConfigManager.reloadWaves();
		ConfigManager.saveCustomMobs();
		ConfigManager.saveWaves();
		
		getLogger().info(ChatColor.RED + "Plugin has been disabled!"); // Saying bye to you!
	
	}

}
