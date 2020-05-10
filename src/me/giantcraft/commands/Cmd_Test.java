package me.giantcraft.commands;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Cmd_Test implements CommandExecutor, Listener {
	
	public static int result = 0;
	Random rnd = new Random();
	
	public static boolean guessing = false;
	
	// The full code for this command
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (sender instanceof Player) {			// If the command is executed by the player
			Player player = (Player) sender;
			
			rnd.nextInt(11);
			player.sendMessage(ChatColor.AQUA + "The winning number is " + result);
			Bukkit.broadcastMessage(ChatColor.GREEN + (ChatColor.BOLD + "A giveaway has begun ranging from 0 - 10"));
			
			guessing = true;
		}
		
		return true;
	}
}
