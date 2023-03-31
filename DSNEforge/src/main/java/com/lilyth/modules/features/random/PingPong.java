package com.lilyth.modules.features.random;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class PingPong {
    private static final DSNEforge main = DSNEforge.getInstance();
    @SubscribeEvent
    public void pingPong(ClientChatReceivedEvent event){
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.theWorld==null || mc.thePlayer==null || !main.getUtils().isOnDragsim()) return;
        if(event.message.getUnformattedText().contains("ping")) {
            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("pong!"));
        }
    }
}
