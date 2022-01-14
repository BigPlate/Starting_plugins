package starting_plugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.World;
import org.bukkit.GameRule;

public final class java extends JavaPlugin {
    @Override
    public void onEnable() {
        World world = getServer().getWorld("world");
        world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
        getLogger().info("Test plugin has been enabled.");

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
