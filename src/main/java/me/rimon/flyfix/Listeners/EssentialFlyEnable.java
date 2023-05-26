package me.rimon.flyfix.Listeners;

import net.ess3.api.events.FlyStatusChangeEvent;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import me.rimon.flyfix.Main;

public class EssentialFlyEnable implements Listener
{
    @EventHandler
    public void onFlyEnable(FlyStatusChangeEvent e)
    {
        Player player = e.getAffected().getBase().getPlayer();
        if (player == null) return;
        
        PersistentDataContainer data =player.getPersistentDataContainer();
        
        if (e.getValue()) data.set(Main.flyingEnabledKey, PersistentDataType.STRING, "flyenabled");
        else data.remove(Main.flyingEnabledKey);
    }
}
