package me.giantcraft.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.fusesource.jansi.Ansi.Color;

public class Cmd_Test implements CommandExecutor {

	// The full code for this command
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (sender instanceof Player) {			// If the command is executed by the player
			Player player = (Player) sender;
			int c = 0;
			while (c<4)
			{
				player.sendMessage(Color.YELLOW+"Black"+Color.WHITE+" and "+Color.BLACK+"Yellow");
				c++;
			}
			
			// TODO: Put your code here!
		}
		
		return false;		// Return something.. (You can leave this at 'false')
	}

}
