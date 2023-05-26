package me.rimon.flyfix;

import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

import me.rimon.flyfix.Listeners.FlyListener;
import me.rimon.flyfix.Listeners.MainListener;
import me.rimon.flyfix.Listeners.EssentialFlyEnable;

public final class Main extends JavaPlugin
{
	public static NamespacedKey isFlyingKey;
	public static NamespacedKey flyingEnabledKey;
	
    @Override
    public void onEnable()
    {
    	isFlyingKey = new NamespacedKey(this, "isFlying");
    	flyingEnabledKey = new NamespacedKey(this, "toggleflight");
    	
        getServer().getPluginManager().registerEvents(new MainListener(), this);
        getServer().getPluginManager().registerEvents(new FlyListener(), this);
        getServer().getPluginManager().registerEvents(new EssentialFlyEnable(), this);
    }

    @Override
    public void onDisable() {}
}
