package com.ewm2000.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class CommandReport implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)){
			sender.sendMessage("Players Only");
			return true;
		}
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("report")){
			
			if(args.length == 0){
				p.sendMessage(ChatColor.GREEN +"Requires a message");
			}
			
			if(args.length == 1){
				
			}
		}
		return true;
	}

}
