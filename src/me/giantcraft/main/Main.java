package me.giantcraft.main;

import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

// Command packages
import me.giantcraft.commands.Cmd_Help;

// Game packages
import me.giantcraft.mBossBattle.*;

public class Main extends JavaPlugin {

	// Global game variables

		@Override
		public void onEnable() {

			// TODO: Loading in configuration file

			// TODO: Loading commands
			this.getCommand("gchelp").setExecutor(new Cmd_Help());  // Loading the 'help' command.
			
			getLogger().info(Color.GREEN + "Plugin has been enabled!");	// Let the user know that the plugin is enabled!
		}

		@Override
		public void onDisable()
		{
			getLogger().info(Color.RED + "Plugin has been disabled!");	// Saying bye to you!
		}
	
}
