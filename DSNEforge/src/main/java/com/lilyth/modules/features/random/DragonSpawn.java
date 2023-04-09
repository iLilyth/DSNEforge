package com.lilyth.modules.features.random;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import gg.essential.universal.ChatColor;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class DragonSpawn {
    private static final DSNEforge main = DSNEforge.getInstance();

    public final Config config = DSNEforge.getConfig();
    public int respawnTimer;
    public void dragonSpawn(ClientChatReceivedEvent e) {
        Minecraft mc = Minecraft.getMinecraft();
        String msg = e.message.getUnformattedText();
        if(msg.startsWith("* The Dragon Egg has spawned!")){
            main.getUtils().showTitle(ChatColor.WHITE, "DRAGON EGG SPAWNED!");
        }
        if(msg.startsWith("Dragon down!")){
            respawnTimer=240;
        }
    }

    public void dragonSpawnGUI(TickEvent.RenderTickEvent event){
        Minecraft mc = Minecraft.getMinecraft();
        mc.fontRendererObj.drawStringWithShadow("Dragon spawn in: " + (float)(respawnTimer / 20) + "s", ((float)mc.displayWidth / 200) * config.DRAGON_TIMER_X, ((float)mc.displayHeight / 200) * config.DRAGON_TIMER_Y, 0xFFFFFF);
    }

    public void dragonSpawnCountdown(TickEvent.ClientTickEvent event){
        if(respawnTimer>0){
            respawnTimer = respawnTimer - 1;
        }
    }
}
