package com.lilyth.modules.features.notifiers;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import gg.essential.universal.ChatColor;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;

public class DivineSuperior {
    private static final DSNEforge main = DSNEforge.getInstance();
    private final Config config = DSNEforge.getConfig();
    public void divineSuperior(ClientChatReceivedEvent event) {
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.theWorld==null || mc.thePlayer==null || !main.getUtils().isOnDragsim() || !config.DRAGON_NOTIFIER) return;
        if (event.message.getUnformattedText().startsWith("* The SUPERIOR Dragon has spawned!")) {
            mc.ingameGUI.displayTitle(ChatColor.GOLD + "SUPERIOR!", "", 0, 60, 0);
        }
        if (event.message.getUnformattedText().contains("* The DIVINE Dragon has spawned!")) {
            mc.ingameGUI.displayTitle(ChatColor.AQUA + "DIVINE!", "", 0, 60, 0);
        }
    }
}