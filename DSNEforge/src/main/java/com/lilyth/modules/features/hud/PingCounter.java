package com.lilyth.modules.features.hud;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class PingCounter {
    public static final DSNEforge main = DSNEforge.getInstance();
    public final Config config = DSNEforge.getConfig();
    public void pingCounterGUI(TickEvent.RenderTickEvent event){
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.thePlayer == null || mc.theWorld == null) return;
        if(!Minecraft.getMinecraft().isSingleplayer()){
            mc.fontRendererObj.drawStringWithShadow(String.valueOf("Ping: " + mc.getCurrentServerData().pingToServer), ((float)mc.displayWidth / 200) * config.PING_COUNTER_X, ((float)mc.displayHeight / 200) * config.PING_COUNTER_Y, 0xFFFFFF);
        }
    }
}