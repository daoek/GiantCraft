package me.giantcraft.custommobs;

import java.util.ArrayList;
import java.util.Collection;

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

	public String target = null;
	
	public Vector velocity = new Vector(0,0,0);
	
	public Location tpLocation = null;
	
	public boolean canPickUpItems = false;
	public boolean despawnable = true;
	public boolean silent = false;
			
	public Collection<PotionEffect> potionEffects = new ArrayList<PotionEffect>();
	
	public ItemStack boots = null;
	public ItemStack leggings = null;
	public ItemStack chestPlate = null;
	public ItemStack helmet = null;
	public ItemStack mainHand = null;
	public ItemStack offHand = null;
	
	public float bootsDropChange = 0f;
	public float leggingsDropChange = 0f;
	public float chestPlateDropChange = 0f;
	public float helmetDropChange = 0f;
	public float mainHandDropChange = 0f;
	public float offHandDropChange = 0f;
}
