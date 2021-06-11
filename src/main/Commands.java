package main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // /pong
            if (command.getName().equalsIgnoreCase("pong")) {
                if (player.hasPermission("codeday.fly")) {
                    player.setAllowFlight(true);
                } else {
                    player.sendMessage("You do not have permission to fly!");
                }
            }
        }
        return false;
    }
}
