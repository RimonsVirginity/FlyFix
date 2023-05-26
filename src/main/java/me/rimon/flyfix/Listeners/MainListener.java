package me.rimon.flyfix.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.persistence.PersistentDataType;

import me.rimon.flyfix.Main;

public class MainListener implements Listener
{
    @EventHandler
    public void onPlayerChangedWorldEvent(PlayerChangedWorldEvent e)
    {
        Player player = e.getPlayer();
        if (player.getPersistentDataContainer().has(Main.isFlyingKey, PersistentDataType.STRING))
        {
            player.setAllowFlight(true);
            player.setFlying(true);
        }
        else if(player.getPersistentDataContainer().has(Main.flyingEnabledKey, PersistentDataType.STRING)) player.setAllowFlight(true);
    }
}