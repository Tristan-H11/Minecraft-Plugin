package com.github.tristanh11.ourownplugin;

import com.github.tristanh11.ourownplugin.commands.Health;
import com.github.tristanh11.ourownplugin.commands.Ping;
import com.github.tristanh11.ourownplugin.util.CommandUtils;
import com.github.tristanh11.ourownplugin.util.MessageUtils;
import org.bukkit.plugin.java.JavaPlugin;

public final class OurOwnPlugin extends JavaPlugin {

    /*
    Checkliste Command erstellen:
    1. Klasse in "commands" anlegen.
    2. CommandUtils.registerCommand
    3. plugin.yml um den command mit description und usage ergänzen.
     */

    @Override
    public void onEnable() {
        this.getLogger().info("Plugin gestartet");
        MessageUtils.sendConsole("Plugin gestartet");

        CommandUtils.registerCommand("ping", new Ping(), this);     //Diese Zeile kopieren
        CommandUtils.registerCommand("heal", new Health(), this);
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Plugin gestoppt");
        MessageUtils.sendConsole("Plugin gestoppt");
    }
}
