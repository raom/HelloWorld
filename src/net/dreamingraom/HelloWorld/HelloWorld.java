package net.dreamingraom.HelloWorld;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorld extends JavaPlugin {

    private HelloWorldCommandExecutor myExecutor;
    
    public void onEnable() {
        myExecutor = new HelloWorldCommandExecutor(this);
        getCommand("helloworld").setExecutor(myExecutor);
        
        new LoginListener(this);
        
        getConfig();
        saveDefaultConfig();
        
        // Duplicate information
        //getLogger().info( this.toString() + " enabled.");
    }
     
    public void onDisable() {
        // Duplicate information
        //getLogger().info( this.toString() + " disabled.");
    }


}
