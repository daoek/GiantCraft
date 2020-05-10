package me.giantcraft.rewards;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GuiReward implements Listener {

	private Inventory inv;

	// Pretty important!!
	public GuiReward() {
		inv = Bukkit.createInventory(null, 9, "Choose a reward..");		// Creates the inventory
		setItems();														// Putting the items to the inventory
	}
	
	// Do you want items in the inventory? Then don't remove this!
	public void setItems() {
		inv.addItem(createGuiItem(Material.CHEST, 2, "Reward I", "Click to claim reward!"));
	}
	
	// Little method to create an item for the GUI. With applying custom names, slots and description
	protected ItemStack createGuiItem(final Material material, final int slot, final String name, final String...lore) {
		
		final ItemStack item = new ItemStack(material, slot);
		final ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(name);				// Sets the name of the item
		meta.setLore(Arrays.asList(lore));		// Sets the description of the item
		item.setItemMeta(meta);					// Save the item meta
		
		return item;							// Gives what you want
	}
	
	// You can call this method to open the inventory for the player. For example, you can use this in a command or when the player joins.
	public void openInv(final HumanEntity ent) {
		ent.openInventory(inv);
	}
	
	// Prevent players from grabbing items from the inventory
	@EventHandler
	public void onInventoryClick(InventoryDragEvent event) {
		if(event.getInventory() == inv) {
			event.setCancelled(true);
		}
	}
	
}
