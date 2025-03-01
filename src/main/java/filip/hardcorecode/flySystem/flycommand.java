package filip.hardcorecode.flySystem;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class flycommand implements CommandExecutor {
    public static String FlyMessageoff =  "§cthe Flightmode is disabled";
    public static String FlyMessagemeon =  "§athe Flightmode is enabled";
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;
        if (args.length == 0) {
            if (player.getAllowFlight()) {
                player.sendMessage(FlyMessageoff);
                player.setFlying(false);
                player.setAllowFlight(false);
                return true;
            }
            player.sendMessage(FlyMessagemeon);
            player.setAllowFlight(true);
            player.setFlying(true);
            return true;
        }
        return false;
    }
}
