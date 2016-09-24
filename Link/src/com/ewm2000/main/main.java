package com.ewm2000.main;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
	FileConfiguration config = getConfig();

	@Override
	public void onEnable(){
		this.getConfig();this.getCommand("Report").setExecutor(new CommandReport());
	}
	@Override
	public void onDisable(){
		
	}
}
