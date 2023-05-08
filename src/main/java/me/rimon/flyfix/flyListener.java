package me.rimon.flyfix;

import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class flyListener implements Listener {

    private final main instance;
    public flyListener(main instance){this.instance = instance;}
    @EventHandler
    public void playerToggleFly(PlayerToggleFlightEvent e) {

        PersistentDataContainer data = e.getPlayer().getPersistentDataContainer();
        NamespacedKey key = new NamespacedKey(instance, "isFlying");
        if (e.isFlying()) {
            data.set(key, PersistentDataType.STRING, "fly");
        } else
            data.remove(key);
    }
}
