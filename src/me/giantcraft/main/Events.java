package me.giantcraft.main;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public final class Events implements Listener{

	@EventHandler
	public void moveMessage(PlayerJoinEvent event)
	{
		event.getPlayer().sendMessage(ChatColor.BLUE + "Welcome to the server! Enjoy!!!");
	}
	
}
