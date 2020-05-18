package me.giantcraft.custommobs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import me.giantcraft.main.Main;

public class CustomMobLootDropsManager implements Listener {
	
	Main main;
	
	public CustomMobLootDropsManager(Main main)
	{
		this.main = main;
	}
	
	@EventHandler
	void onMobDeath(EntityDeathEvent event)
	{
		main.getServer().broadcastMessage(event.getEntity().getName());
		if(event.getEntity().getKiller() != null && main.customMobsManager.isAnCustomMob(event.getEntity().getName()))
		{
			
		}
	}

}
