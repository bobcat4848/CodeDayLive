package main;


import org.bukkit.plugin.java.JavaPlugin;

public class CodeDayLive extends JavaPlugin {

    private CodeDayLive plugin;

    public void onEnable() {
        plugin = this;

        getCommand("pong").setExecutor(new Commands());
        getServer().getPluginManager().registerEvents(new BlockBreak(), this);
    }
}
