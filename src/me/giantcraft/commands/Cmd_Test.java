package me.giantcraft.commands;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;

public class Cmd_Test implements CommandExecutor, Listener {
	
	public static int result = 0;
	Random rnd = new Random();
	
	public static boolean guessing = false;
	
	// The full code for this command
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (sender instanceof Player) {			// If the command is executed by the player
			Player player = (Player) sender;
			
			result = rnd.nextInt(11);
			player.sendMessage(ChatColor.AQUA + "The winning number is " + result);
			Bukkit.broadcastMessage(ChatColor.GREEN + (ChatColor.BOLD + "A giveaway has begun ranging from 0 - 10"));
			
			guessing = true;
		}
		
		return true;
	}
	
	@EventHandler
	public void numberGuessing(AsyncPlayerChatEvent event) {
		
		if(guessing == true) {
			String input = event.getMessage();
			
			if(Integer.parseInt(input) == result) {
				
				event.getPlayer().sendMessage(ChatColor.DARK_GREEN + "You guessed it! Well done. Here is a reward");
				
				ItemStack reward = new ItemStack(Material.GOLDEN_APPLE, 5);
				event.getPlayer().getInventory().addItem(reward);
				
				Bukkit.broadcastMessage(ChatColor.BLUE + event.getPlayer().getDisplayName() + ChatColor.AQUA + " guessed the right number!");
				
				guessing = false;
			} else {
				event.getPlayer().sendMessage(ChatColor.YELLOW + "This is not the right number. Try it again!");
			}
			event.setCancelled(true);
		}
		
		
	}
}
