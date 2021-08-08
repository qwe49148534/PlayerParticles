package playerparticles;

import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerParticles extends JavaPlugin {

    private static PlayerParticles plugin;

    public static PlayerParticles getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {

        plugin = this;

        getServer().getPluginManager().registerEvents(new MoveEvent() , this);
        getCommand("spiral").setExecutor(new SpiralCommand());

    }

}
