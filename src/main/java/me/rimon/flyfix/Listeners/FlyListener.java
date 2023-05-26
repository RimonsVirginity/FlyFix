package me.rimon.flyfix.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import me.rimon.flyfix.Main;

public class FlyListener implements Listener
{
    @EventHandler
    public void playerToggleFly(PlayerToggleFlightEvent e)
    {
        PersistentDataContainer data = e.getPlayer().getPersistentDataContainer();
        if (e.isFlying()) data.set(Main.isFlyingKey, PersistentDataType.STRING, "fly");
        else data.remove(Main.isFlyingKey);
    }
}
