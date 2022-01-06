package com.github.tristanh11.ourownplugin.util;

import org.bukkit.Bukkit;

public class ConsoleUtils {

    public static void sendMessage(String message) {
        Bukkit.getServer().getConsoleSender().sendMessage(message);
    }
}
