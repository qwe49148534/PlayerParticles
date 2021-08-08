package playerparticles;

import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveEvent implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent e){

        Player player = e.getPlayer();

        player.spawnParticle(Particle.TOTEM , player.getLocation() , 0 , 0,1,0 );

    }
}
