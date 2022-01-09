package com.github.tristanh11.ourownplugin.EventHandler;


import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;


public class StoneBreakEvent implements Listener {

    public void handleStoneBreak(StoneBreakEvent event) {
        //Alternative 1 ???
        Player player = event.getEntity();
        event.getDrops().clear();
        // Dann festlegen, was wirklich gedropt werden soll

        //Alternative 2 ???
        event.getBlock().getDrops(event.getPlayer().getItemInHand());
        event.getBlock().setType(Material.AIR);
        //Dann festlegen was gedropt werden soll

    }
}



























