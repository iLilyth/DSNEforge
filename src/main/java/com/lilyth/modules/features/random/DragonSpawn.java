package com.lilyth.modules.features.random;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import gg.essential.universal.ChatColor;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.ClientChatReceivedEvent;

import java.io.*;

public class DragonSpawn {
    private static final DSNEforge main = DSNEforge.getInstance();
    private final Config config = DSNEforge.getConfig();
    public void dragonSpawn(ClientChatReceivedEvent e) {
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.thePlayer == null || mc.theWorld == null) return;
        String msg = e.message.getUnformattedText();
        if(msg.startsWith("* The Dragon Egg has spawned!")){
            mc.ingameGUI.displayTitle(ChatColor.WHITE + "EGG HAS SPAWNED!", "", 0, 20, 0);
        }
    }
}
