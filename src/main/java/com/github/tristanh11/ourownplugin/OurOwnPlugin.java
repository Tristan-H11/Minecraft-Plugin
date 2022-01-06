package com.github.tristanh11.ourownplugin;

import com.github.tristanh11.ourownplugin.util.ConsoleUtils;
import org.bukkit.plugin.java.JavaPlugin;

public final class OurOwnPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().info("Plugin gestartet");
        ConsoleUtils.sendMessage("Plugin gestartet");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        this.getLogger().info("Plugin gestoppt");
        ConsoleUtils.sendMessage("Plugin gestoppt");
    }
}
