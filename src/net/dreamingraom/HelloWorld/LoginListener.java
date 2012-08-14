package net.dreamingraom.HelloWorld;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class LoginListener implements Listener {

    private HelloWorld plugin;
    
    public LoginListener(HelloWorld plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        this.plugin = plugin;
    }
    
    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent event) {
        if ( plugin.getConfig().getString("master").equals( event.getPlayer().getName() ) ) {
            event.getPlayer().chat( plugin.getConfig().getString("text") );
        }
        
    }
    
}
