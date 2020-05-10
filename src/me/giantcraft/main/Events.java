package me.giantcraft.main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public final class Events implements Listener{

	@EventHandler
	public void loginMessage(PlayerLoginEvent event)
	{
		event.getPlayer().sendMessage("Welcone to the server!");
	}
	
}
