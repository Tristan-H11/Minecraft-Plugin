package com.github.tristanh11.ourownplugin;

import com.github.tristanh11.ourownplugin.commands.Ping;
import com.github.tristanh11.ourownplugin.util.CommandUtils;
import com.github.tristanh11.ourownplugin.util.MessageUtils;
import org.bukkit.plugin.java.JavaPlugin;

public final class OurOwnPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().info("Plugin gestartet");
        MessageUtils.sendConsole("Plugin gestartet");

        CommandUtils.registerCommand("ping", new Ping(), this);     //Diese Zeile kopieren

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        this.getLogger().info("Plugin gestoppt");
        MessageUtils.sendConsole("Plugin gestoppt");
    }
}
