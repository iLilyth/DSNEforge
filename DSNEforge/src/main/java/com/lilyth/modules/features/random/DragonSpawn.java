package com.lilyth.modules.features.random;

import gg.essential.universal.ChatColor;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;

import java.io.*;

public class DragonSpawn {
    public void dragonSpawn(ClientChatReceivedEvent e) {
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.thePlayer == null || mc.theWorld == null) return;
        String msg = e.message.getUnformattedText();
        if(msg.startsWith("* The Dragon Egg has spawned!")){
            mc.ingameGUI.displayTitle(ChatColor.WHITE + "EGG HAS SPAWNED!", "", 0, 20, 0);
        }
    }
}
