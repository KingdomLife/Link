package com.ewm2000.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
    private Connection connection;
    private String host, database, username, password;
    private int port;
  

	@Override
	public void onEnable(){
		this.getConfig();this.getCommand("Report").setExecutor(new CommandReport());
		  
			host = "localhost";
	        port = 3306;
	        database = "TestDatabase";
	        username = "user";
	        password = "pass";    
	}
	@Override
	public void onDisable(){
		
	}
	public void openConnection() throws SQLException, ClassNotFoundException {
	    if (connection != null && !connection.isClosed()) {
	        return;
	    }

	    synchronized (this) {
	        if (connection != null && !connection.isClosed()) {
	            return;
	        } 
	        Class.forName("com.mysql.jdbc.Driver");
	        connection = DriverManager.getConnection("jdbc:mysql://" + this.host+ ":" + this.port + "/" + this.database, this.username, this.password);
	    }
	}
}
