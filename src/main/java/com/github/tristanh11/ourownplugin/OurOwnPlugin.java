package com.github.tristanh11.ourownplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class OurOwnPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().info("Plugin gestartet");
        Bukkit.getServer().getConsoleSender().sendMessage("Plugin gestartet");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        this.getLogger().info("Plugin gestoppt");
        Bukkit.getServer().getConsoleSender().sendMessage("Plugin gestoppt");
    }
}
