package playerparticles;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class SpiralCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;
        Location location = player.getLocation();

        double radius = 0.5;
        final double[] y = {0};

        new BukkitRunnable() {
            @Override
            public void run() {
                double x = radius * Math.cos(y[0]);
                double z = radius * Math.sin(y[0]);
                player.spawnParticle(Particle.REDSTONE, location.add(x, y[0], z), 10, new Particle.DustTransition(Color.RED, Color.AQUA, 1f));
                y[0] = y[0] + 0.1;
            }
        }.runTaskTimerAsynchronously(PlayerParticles.getPlugin() , 0 , 10);

        return true;
    }
}
