package com.lilyth.modules.utils;

import gg.essential.universal.ChatColor;
import net.minecraft.client.Minecraft;

public class Utils {
    public boolean isOnDragsim() {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.isSingleplayer()) {
            return false;
        } else {
            return mc.getCurrentServerData().serverIP.contains("dragsim.net");
        }
    }

    public void showTitle(ChatColor chatColor, String text){
        Minecraft.getMinecraft().ingameGUI.displayTitle(chatColor + text, "", 0, 65, 0);
    }

}
