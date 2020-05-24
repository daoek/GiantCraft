package me.giantcraft.custommobs;

import java.util.Collection;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

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
		if(main.customMobsManager.isAnCustomMob(event.getEntity().getName()))
		{
			LivingEntity entity = event.getEntity();
			CustomMob mob = main.customMobsManager.getCustomMobProfileFromMobName(entity.getName());
			
			if(mob.dropDefaultLoot == false)
			{
				event.getDrops().clear();
			}
			
			if(mob.loot != null)
			{
				int index = 0;
				Random rd = new Random();
				Collection<ItemStack> customDrops = mob.loot;
				
				for(ItemStack item: customDrops)
				{
					Material material = item.getType();
					Double amount = (double) item.getAmount();
					Double chance = mob.lootDropChance.get(index);
					Double RandomNumber = rd.nextDouble();
					int dropAmount = 0;
					
					dropAmount = (int)Math.round((RandomNumber * amount)*chance);
		
					event.getDrops().add(new ItemStack(material, dropAmount));
					index++;
				}
			}
		}
		else
		{
			//for normal mob types
		}
	}

}
