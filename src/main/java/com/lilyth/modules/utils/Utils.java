package com.lilyth.modules.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;

import javax.vecmath.Vector3d;

public class Utils {
    public boolean isOnDragsim() {
        Minecraft mc = Minecraft.getMinecraft();
        EntityPlayerSP player = Minecraft.getMinecraft().thePlayer;;
        if (player == null) {
            return false;
        } else {
            return mc.getCurrentServerData().serverIP.contains("dragsim.net");
        }
    }
}
