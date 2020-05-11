package me.giantcraft.custommobs;

import java.util.Collection;

import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;
import org.bukkit.loot.LootTable;
import org.bukkit.potion.PotionEffect;
import org.bukkit.util.Vector;

public class CustomMob {
	public String configName = "DefaultConfigName";
	public String name = "DefaultName";
	public String mobTyp = "";
	public int health = 20;
	public LootTable loot = null;
	public boolean despawnable = true;
	public boolean silent = false;
	public LivingEntity target = null;
	public Vector velocity = null;
	public Location tpLocation = null;
	public boolean canPickUpItems = false;
	public Collection<PotionEffect> potionEffects = null;
}
