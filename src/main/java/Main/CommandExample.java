package Main;

import org.bukkit.ChatColor;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandExample extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if ( command.getName().equalsIgnoreCase("die") ) {
            if ( sender instanceof Player ) {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.AQUA + "You opeted to die");
                player.setHealth(0);
            }else if ( sender instanceof CommandSender ){
                System.out.println("The command do not work on console");

            }else if ( sender instanceof BlockCommandSender) {
                System.out.println("The command do not work on CommandBlock");

            }
        }

        return true;

    }
}
