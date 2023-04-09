package com.lilyth.modules.features.notifiers;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import gg.essential.universal.ChatColor;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;

public class DivineSuperior {
    private static final DSNEforge main = DSNEforge.getInstance();
    public void divineSuperior(ClientChatReceivedEvent event) {
        Minecraft mc = Minecraft.getMinecraft();
        if (event.message.getUnformattedText().startsWith("* The SUPERIOR Dragon has spawned!")) {
            ChatColor chatColor = ChatColor.GOLD;
            String text = "SUPERIOR!";
            main.getUtils().showTitle(chatColor, text);
        }
        if (event.message.getUnformattedText().contains("* The DIVINE Dragon has spawned!")) {
            main.getUtils().showTitle(ChatColor.AQUA, "DIVINE!");
        }
    }
}