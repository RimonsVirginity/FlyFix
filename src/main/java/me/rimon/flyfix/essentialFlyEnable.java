package me.rimon.flyfix;

import net.ess3.api.events.FlyStatusChangeEvent;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class essentialFlyEnable implements Listener {
 private final main instance;

 public essentialFlyEnable(main instance){this.instance = instance;}
    @EventHandler
    public void onFlyEnable(FlyStatusChangeEvent e){
        Player player = e.getAffected().getBase().getPlayer();
        if (player == null) return;
        PersistentDataContainer data =player.getPersistentDataContainer();
        NamespacedKey key = new NamespacedKey(instance,"toggleflight");
        if (e.getValue()) {
            data.set(key, PersistentDataType.STRING, "flyenabled");
        } else
            data.remove(key);

    }

}
