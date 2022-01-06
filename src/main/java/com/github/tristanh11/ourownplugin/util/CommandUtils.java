package com.github.tristanh11.ourownplugin.util;

import com.github.tristanh11.ourownplugin.OurOwnPlugin;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.PluginCommand;

public class CommandUtils {
    /**
     * Registriert einen Command. Notwendig, damit er vom Server erkannt und ausgeführt werden kann.
     *
     * @param command  Der einzugebene Befehl ohne "/". "/ping" benötigt nur "ping" als Parameter.
     * @param executor Die Klasse, die den Befehl ausführen soll. "/ping" benötigt "new Ping()".
     * @param instance Instanz der Main-Klasse. Meist einfach nur "this"
     */
    public static void registerCommand(String command, CommandExecutor executor, OurOwnPlugin instance) {
        PluginCommand cmd = instance.getCommand(command);
        if (cmd != null) {
            cmd.setExecutor(executor);
            return;
        }
        instance.getLogger().info("Fehler beim Registrieren des Commands " + command);
    }
}
