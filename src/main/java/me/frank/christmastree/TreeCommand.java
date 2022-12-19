package me.frank.christmastree;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TreeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("christmastree") || args.length == 0){
            Player player = (Player) sender;
            Inventory gui = Bukkit.createInventory(player, 27, ChatColor.DARK_GREEN+"Christmas Tree");

            ItemStack green = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
            ItemStack red = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemStack tree = new ItemStack(Material.SPRUCE_SAPLING);

            ItemMeta greenmeta = green.getItemMeta();
            ItemMeta redmeta = red.getItemMeta();
            ItemMeta treemeta = tree.getItemMeta();

            assert treemeta != null;
            treemeta.setDisplayName(ChatColor.DARK_GREEN+"Christmas Tree");

            green.setItemMeta(greenmeta);
            red.setItemMeta(redmeta);
            tree.setItemMeta(treemeta);

            gui.setItem(0, green);
            gui.setItem(1, green);
            gui.setItem(2, green);
            gui.setItem(3, green);
            gui.setItem(4, green);
            gui.setItem(5, green);
            gui.setItem(6, green);
            gui.setItem(7, green);
            gui.setItem(8, green);
            gui.setItem(9, green);
            gui.setItem(10, green);
            gui.setItem(11, green);
            gui.setItem(12, green);
            gui.setItem(13, tree);
            gui.setItem(14, red);
            gui.setItem(15, red);
            gui.setItem(16, red);
            gui.setItem(17, red);
            gui.setItem(18, red);
            gui.setItem(19, red);
            gui.setItem(20, red);
            gui.setItem(21, red);
            gui.setItem(22, red);
            gui.setItem(23, red);
            gui.setItem(24, red);
            gui.setItem(25, red);
            gui.setItem(26, red);

            player.openInventory(gui);

        }
        return false;
    }
}
