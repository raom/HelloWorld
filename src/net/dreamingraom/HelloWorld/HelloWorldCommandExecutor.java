package net.dreamingraom.HelloWorld;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelloWorldCommandExecutor implements CommandExecutor {

    private HelloWorld plugin;
    
    public HelloWorldCommandExecutor(HelloWorld plugin) {
        this.plugin = plugin;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	if (args.length > 0) {
    	    sender.sendMessage("Too many arguments.");
    	    return false;
    	}
    	
    	Player player = null;
        if (sender instanceof Player) {
                player = (Player) sender;
        }
        
        if(cmd.getName().equalsIgnoreCase("helloworld")){
            if (player == null) {
                sender.sendMessage("HelloWorld run by console.");
            } else {
                if (player.hasPermission("helloworld.helloworld")) {
                    sender.sendMessage("HelloWorld run by " + player.getName() + ".");
                } else {
                    sender.sendMessage("You don't have permission.");
                    return false;
                }
            }
            return true;
        } //If this has happened the function will break and return true. if this hasn't happened the a value of false will be returned.
        return false; 
    }
}
