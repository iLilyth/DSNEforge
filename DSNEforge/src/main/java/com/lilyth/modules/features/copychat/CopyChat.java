package com.lilyth.modules.features.copychat;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.ClientChatReceivedEvent;

public class CopyChat  {
    private static final DSNEforge main = DSNEforge.getInstance();
    private final Config config = DSNEforge.getConfig();
    public void copyChat(ClientChatReceivedEvent e) {
        Minecraft mc = Minecraft.getMinecraft();
        ChatComponentText text = new ChatComponentText(e.message.getUnformattedText());
        text.setChatStyle(e.message.getChatStyle());
        text.getChatStyle().setChatClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, e.message.getUnformattedText()));
    }
}
