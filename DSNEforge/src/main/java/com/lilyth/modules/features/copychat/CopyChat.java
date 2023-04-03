package com.lilyth.modules.features.copychat;

import net.minecraft.client.Minecraft;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.ClientChatReceivedEvent;

public class CopyChat  {
    public void copyChat(ClientChatReceivedEvent e) {
        Minecraft mc = Minecraft.getMinecraft();
        if (e.message.getChatStyle().getChatClickEvent() != null) return;
        ChatComponentText text = new ChatComponentText(e.message.getUnformattedText());
        if (e.message.getChatStyle().getChatClickEvent() != null) return;
        text.setChatStyle(e.message.getChatStyle());
        text.getChatStyle().setChatClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, e.message.getUnformattedText()));
    }
}
