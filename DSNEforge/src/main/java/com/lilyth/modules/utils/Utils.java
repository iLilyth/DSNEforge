package com.lilyth.modules.utils;

import net.minecraft.client.Minecraft;

public class Utils {
    public boolean isOnDragsim() {
        Minecraft mc = Minecraft.getMinecraft();
        return Minecraft.getMinecraft().thePlayer != null && mc.getCurrentServerData().serverIP.contains("dragsim.co");
    }
}
