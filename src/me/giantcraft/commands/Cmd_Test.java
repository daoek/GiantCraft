package me.giantcraft.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd_Test implements CommandExecutor {
	
	// The full code for this command
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if (sender instanceof Player) {			// If the command is executed by the player
			Player player = (Player) sender;
			
			for(int i=0;i<4;i++)
			{
				player.sendMessage(ChatColor.YELLOW+"Black"+ChatColor.WHITE+" and "+ChatColor.BLACK+"Yellow");
			}
		}
		
		return true;
	}

}
