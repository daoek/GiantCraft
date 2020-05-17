package me.giantcraft.rewards;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd_redeem implements CommandExecutor {

	GuiReward rewards = new GuiReward();
	
	// The full code for this command
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (sender instanceof Player) {			// If the command is executed by the player
			Player player = (Player) sender;
			
			//rewards.openInv(player);
			//rewards.giveReward(player.getPlayer());
			
			player.sendMessage("Opening Rewards menu.");
		}
		
		return true;		// Return something.. (You can leave this at 'false')
	}

}
