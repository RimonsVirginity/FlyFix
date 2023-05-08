package me.rimon.flyfix;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.persistence.PersistentDataType;

public class listener implements Listener {

    private final main instance;
    public listener(main instance){this.instance = instance;}
    @EventHandler
    public void onPlayerChangedWorldEvent(PlayerChangedWorldEvent e) {
        //checks when the player changes world
        Player player = e.getPlayer();
        NamespacedKey key = new NamespacedKey(instance, "isFlying");
        NamespacedKey flyKey = new NamespacedKey(instance, "toggleflight");
            if (player.getPersistentDataContainer().has(key, PersistentDataType.STRING)) {
                //checks if player has permission to fly
                player.setAllowFlight(true);
                player.setFlying(true);
                //enabled fly for player
            }
            else if (player.getPersistentDataContainer().has(flyKey, PersistentDataType.STRING)){
                player.setAllowFlight(true);
            }
        }
    }

