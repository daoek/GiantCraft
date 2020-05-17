package me.giantcraft.rewards;

import org.bukkit.event.Listener;

public class GuiReward implements Listener {

	/*remove this comment for the code
	 * 
	 * 
	 * 
	private Inventory inv;

	// Pretty important!!
	public GuiReward() {
		inv = Bukkit.createInventory(null, 18, "Available rewards");		// Creates the inventory
		setItems();														// Putting the items to the inventory
	}
	
	// Do you want items in the inventory? Then don't remove this!
	public void setItems() {
		inv.setItem(2, createGuiItem(Material.IRON_INGOT, 16, ChatColor.WHITE +
				"16x Iron Ingots", 
				""));
		inv.setItem(3, createGuiItem(Material.GOLD_INGOT, 10, ChatColor.GOLD +
				"10x Gold Ingots",
				""));
		inv.setItem(4, createGuiItem(Material.DIAMOND, 8, ChatColor.AQUA +
				"8x Diamonds",
				""));
		inv.setItem(5, createGuiItem(Material.GOLDEN_APPLE, 5, ChatColor.YELLOW +
				"5x Golden Apples",
				""));
		inv.setItem(6, createGuiItem(Material.PIG_SPAWN_EGG, 1, ChatColor.LIGHT_PURPLE +
				"1x Pig Spawn Egg",
				""));
		inv.setItem(6, createGuiItem(Material.SHEEP_SPAWN_EGG, 1, ChatColor.GRAY +
				"1x Sheep Spawn Egg",
				""));
		inv.setItem(6, createGuiItem(Material.COW_SPAWN_EGG, 1, ChatColor.DARK_GRAY +
				"1x Cow Spawn Egg",
				""));
		inv.setItem(6, createGuiItem(Material.ELYTRA, 1, ChatColor.DARK_PURPLE +
				"1x Elytra",
				""));
		inv.setItem(6, createGuiItem(Material.TOTEM_OF_UNDYING, 1, ChatColor.DARK_AQUA +
				"1x Totem of Undying",
				""));
		inv.setItem(12, createGuiItem(Material.GREEN_CONCRETE, 1, ChatColor.GREEN +
				"Proceed",
				"Click to claim reward!"));
		inv.setItem(14, createGuiItem(Material.RED_CONCRETE, 1, ChatColor.RED +
				"Cancel", ""));
		
	}
	
	// Little method to create an item for the GUI. With applying custom names, slots and description
	protected ItemStack createGuiItem(final Material material, final int amount, final String name, final String...lore) {
		
		final ItemStack item = new ItemStack(material, amount);
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
	public void onInventoryClick(InventoryClickEvent event) {
		
		Player player = (Player) event.getWhoClicked(); // The player that clicked the item
		ItemStack clicked = event.getCurrentItem(); 	// The item that was clicked
		//Inventory inventory = event.getInventory(); 	// The inventory that was clicked in.
		ItemMeta clickmeta = clicked.getItemMeta();
		
		if(event.getInventory() == inv) {
			
			if (clicked.getType() == Material.GREEN_CONCRETE) { // The item that the player clicked it dirt
				event.setCancelled(true); // Make it so the dirt is back in its original spot
				
				giveReward(player.getPlayer());
				
				player.closeInventory(); // Closes there inventory
;			}
			else if (clicked.getType() == Material.RED_CONCRETE) {
				player.closeInventory();
			}
			else {
				
				player.sendMessage("You dragged something... NOT GOOD MAN!");
				
				if (clickmeta.getDisplayName() == "Reward I") {
					player.closeInventory(); // Closes there inventory
				}
			}
			event.setCancelled(true);
		}
		
	}
	
	public void giveReward(Player winner) {
		
		int slot = 0;
		Random rnd = new Random();
		
		winner.sendMessage(ChatColor.GOLD + "Your rewards:");
		
		Firework fw = winner.getWorld().spawn(winner.getLocation(), Firework.class);
		FireworkMeta fwm = fw.getFireworkMeta();
		FireworkEffect effect = FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).build();
		
		fwm.addEffects(effect);
		fwm.setPower(0);
		fw.setFireworkMeta(fwm);
		
		for(int i=0; i<3; i++) {
			slot = rnd.nextInt(9);
			switch(slot) {
				case 0:
					winner.getInventory().addItem(new ItemStack(Material.IRON_INGOT, 16));
					winner.sendMessage("- 16x IRON INGOTS");
					break;
				case 1:
					winner.getInventory().addItem(new ItemStack(Material.GOLD_INGOT, 10));
					winner.sendMessage("- 10x GOLD INGOTS");
					break;
				case 2:
					winner.getInventory().addItem(new ItemStack(Material.DIAMOND, 8));
					winner.sendMessage("- 8x DIAMONDS");
					break;
				case 3:
					winner.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 5));
					winner.sendMessage("- 5x GOLDEN APPLES");
					break;
				case 4:
					winner.getInventory().addItem(new ItemStack(Material.PIG_SPAWN_EGG, 1));
					winner.sendMessage("- 1x PIG SPAWN EGG");
					break;
				case 5:
					winner.getInventory().addItem(new ItemStack(Material.SHEEP_SPAWN_EGG, 1));
					winner.sendMessage("- 1x SHEEP SPAWN EGG");
					break;
				case 6:
					winner.getInventory().addItem(new ItemStack(Material.COW_SPAWN_EGG, 1));
					winner.sendMessage("- 1x COW SPAWN EGG");
					break;
				case 7:
					winner.getInventory().addItem(new ItemStack(Material.ELYTRA, 1));
					winner.sendMessage("- 1x ELYTRA");
					break;
				case 8:
					winner.getInventory().addItem(new ItemStack(Material.TOTEM_OF_UNDYING, 1));
					winner.sendMessage("- 8x TOTEM OF UNDYING");
					break;
			}
		}
		
		
		
		
	}
	*/
}
