package me.frank.christmastree;

import org.bukkit.*;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("[ChristmasTree] Plugin has started!");
        getCommand("christmastree").setExecutor(new TreeCommand());
        Bukkit.getServer().getPluginManager().registerEvents(this, this);

    }

    @Override
    public void onDisable() {
        System.out.println("[ChristmasTree] Plugin has stopped!");
    }

    @EventHandler
    public void inventoryClick(InventoryClickEvent event){
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.DARK_GREEN+"Christmas Tree")){
            if (Objects.requireNonNull(event.getCurrentItem()).getType() != Material.SPRUCE_SAPLING){
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event){
        if (Objects.requireNonNull(event.getItemInHand().getItemMeta()).getDisplayName().equalsIgnoreCase(ChatColor.DARK_GREEN+"Christmas Tree")){
            Player player = event.getPlayer();
            event.getBlockPlaced().applyBoneMeal(BlockFace.DOWN);
            event.getBlockPlaced().applyBoneMeal(BlockFace.DOWN);
            event.getBlockPlaced().applyBoneMeal(BlockFace.DOWN);
            event.getBlockPlaced().applyBoneMeal(BlockFace.DOWN);
            event.getBlockPlaced().applyBoneMeal(BlockFace.DOWN);
            event.getBlockPlaced().applyBoneMeal(BlockFace.DOWN);
            event.getBlockPlaced().applyBoneMeal(BlockFace.DOWN);
            event.getBlockPlaced().applyBoneMeal(BlockFace.DOWN);
            event.getBlockPlaced().applyBoneMeal(BlockFace.DOWN);
            event.getBlockPlaced().applyBoneMeal(BlockFace.DOWN);
            Bukkit.dispatchCommand(player, "/replacenear 10 spruce_leaves white_concrete,red_concrete,green_concrete");
        }
    }
}
