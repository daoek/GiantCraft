package me.giantcraft.custommobs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.util.Vector;

public class CustomMob {
	
	public String configName = "DefaultConfigName";
	public String name = "DefaultName";
	public String mobTyp = "";
	
	public int health = 20;
	
	public Collection<ItemStack> loot = null;
	public List<Double> lootDropChance = null;

	public String target = null;
	
	public Vector velocity = new Vector(0,0,0);
	
	public Location tpLocation = null;
	
	public boolean dropDefaultLoot = true;
	public boolean canPickUpItems = false;
	public boolean despawnable = true;
	public boolean silent = false;
			
	public Collection<PotionEffect> potionEffects = new ArrayList<PotionEffect>();
	
	public ItemStack boots = null;
	public ItemStack leggings = null;
	public ItemStack chestPlate = null;
	public ItemStack helmet = null;
	public ItemStack mainHand = null;
	
	public float bootsDropChance = 0f;
	public float leggingsDropChance = 0f;
	public float chestPlateDropChance = 0f;
	public float helmetDropChance = 0f;
	public float mainHandDropChance = 0f;
}
