package com.github.tristanh11.ourownplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Health implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            ((Player) sender).setHealth(22.0);
            sender.sendMessage("You are healed");
            return true;
        }
        return false;
    }
}
