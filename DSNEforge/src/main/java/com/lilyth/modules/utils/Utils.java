package com.lilyth.modules.utils;

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
}
