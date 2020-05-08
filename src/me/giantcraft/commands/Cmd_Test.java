package me.giantcraft.commands;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Cmd_Test implements CommandExecutor {
	
	int result = 0;
	Random rnd = new Random();
	
	boolean guessing = false;
	
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
	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event) {
		
		if (guessing = true) 
		{
			if (event.getMessage().contains(Integer.toString(result))) {
		        Bukkit.broadcastMessage(ChatColor.GREEN + 
		        		event.getPlayer().getName() + 
		        		ChatColor.DARK_GREEN + 
		        		"has won the battle!");
		        
		        guessing = false;
		    }
		    else 
		    {
		    	event.getPlayer().sendMessage(ChatColor.DARK_RED + "Saik! Thats the wrong number! OOOOOOOH!");
		    }
		}
	    
	}

}
