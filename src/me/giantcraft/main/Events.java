package me.giantcraft.main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener{
	
	Main main;
	
	Events(Main main)
	{
		this.main = main;
	}
	
	@EventHandler
	public void moveMessage(PlayerJoinEvent event)
	{
		event.getPlayer().sendMessage(ChatColor.BLUE + "Welcome to the server! Enjoy!!!");
	}
	
	@EventHandler
	public void onBreakBlock(BlockBreakEvent event)
	{
		//main.custommobs.SpawnCustomMob("creeper", event.getBlock().getLocation().add(0,1,0), event.getPlayer().getWorld());
	}
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {
		//Player player = event.getPlayer();
		
		if(event.getMessage() == "gold") {
			for(int i = 0; i<100; i++) {
				//main.custommobs.SpawnCustomMob("creeper", player.getLocation().add(0, 50, 0), event.getPlayer().getWorld());
			}
		}
	}
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();
		
		if(event.getMessage() == "gold") {
			for(int i = 0; i<100; i++) {
				main.custommobs.SpawnCustomMob("creeper", player.getLocation().add(0, 50, 0), event.getPlayer().getWorld());
			}
		}
	}
}
