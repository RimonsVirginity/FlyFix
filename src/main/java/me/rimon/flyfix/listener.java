package me.rimon.flyfix;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class listener implements Listener {

    @EventHandler
    public void onPlayerChangedWorldEvent(PlayerChangedWorldEvent e){
        //checks when the player changes world
        Player player = e.getPlayer();
        if (player.hasPermission("essentials.fly")){
            //checks if player has permission to fly
            player.setAllowFlight(true);
            player.setFlying(true);
            //enabled fly for player
        }

    }

}
