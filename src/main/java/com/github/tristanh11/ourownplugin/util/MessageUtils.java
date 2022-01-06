package com.github.tristanh11.ourownplugin.util;

import org.bukkit.Bukkit;

public class MessageUtils {

    /**
     * Sendet eine Nachricht in die Serverkonsole.
     * @param message Nachricht, die gesendet werden soll.
     */
    public static void sendConsole(String message) {
        Bukkit.getServer().getConsoleSender().sendMessage(message);
    }

    /**
     * Sendet eine Nachricht an alle Spieler auf dem Server.
     * @param message Nachricht, die gesendet werden soll.
     */
    public static void sendIngame(String message) {
        Bukkit.getServer().broadcastMessage(message);
    }
}
