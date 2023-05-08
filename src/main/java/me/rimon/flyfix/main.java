package me.rimon.flyfix;

import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new listener(this),this);
        getServer().getPluginManager().registerEvents(new flyListener(this),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
