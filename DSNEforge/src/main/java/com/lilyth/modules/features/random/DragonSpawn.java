package com.lilyth.modules.features.random;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import gg.essential.universal.ChatColor;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class DragonSpawn {

    public final Config config = DSNEforge.getConfig();
    public int respawnTimer;
    public void dragonSpawn(ClientChatReceivedEvent e) {
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.thePlayer == null || mc.theWorld == null) return;
        String msg = e.message.getUnformattedText();
        if(msg.startsWith("* The Dragon Egg has spawned!")){
            mc.ingameGUI.displayTitle(ChatColor.WHITE + "EGG HAS SPAWNED!", "", 0, 20, 0);
        }
        if(msg.startsWith("Dragon down!")){
            respawnTimer=240;
        }
    }

    public void dragonSpawnGUI(TickEvent.RenderTickEvent event){
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.thePlayer == null || mc.theWorld == null) return;
        mc.fontRendererObj.drawStringWithShadow("Dragon spawn in: " + (float)(respawnTimer / 20) + "s", ((float)mc.displayWidth / 200) * config.DRAGON_TIMER_X, ((float)mc.displayHeight / 200) * config.DRAGON_TIMER_Y, 0xFFFFFF);
    }

    public void dragonSpawnCountdown(TickEvent.ClientTickEvent event){
        if(respawnTimer>0){
            respawnTimer = respawnTimer - 1;
        }
    }
}
