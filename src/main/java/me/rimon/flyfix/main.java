package me.rimon.flyfix;

import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new listener(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}