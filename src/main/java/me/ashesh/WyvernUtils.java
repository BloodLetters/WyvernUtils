package me.ashesh;

import me.ashesh.Event.Durability;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WyvernUtils extends JavaPlugin {

    private static WyvernUtils ins = null;

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        this.getServer().getPluginManager().registerEvents(new Durability(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public WyvernUtils() {
        ins = this;
    }

    public static WyvernUtils getInstance() {
        return ins;
    }
}
