package me.ashesh.Event;

import me.ashesh.WyvernUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Random;

public class Durability implements Listener {

    @EventHandler
    public void onItemDamage(PlayerItemDamageEvent e) {
        ItemMeta meta = e.getItem().getItemMeta();
        if (meta instanceof org.bukkit.inventory.meta.Damageable) {

            Damageable dmeta = (Damageable) meta;
            int damage = dmeta.getDamage();

            Random random = new Random();
            if (random.nextDouble() < WyvernUtils.getInstance().getConfig().getDouble("formula.durability.chance")) {
                e.setCancelled(true);

                dmeta.setDamage(1);
                e.getItem().setItemMeta(dmeta);
            }
        }
    }
}
