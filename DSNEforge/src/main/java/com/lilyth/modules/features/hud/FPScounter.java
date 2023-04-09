package com.lilyth.modules.features.hud;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class FPScounter {
    public static Config config = DSNEforge.getConfig();
    public void fpsCounterGUI(TickEvent.RenderTickEvent event){
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.thePlayer == null || mc.theWorld == null) return;
        mc.fontRendererObj.drawStringWithShadow("FPS: " + Minecraft.getDebugFPS(), ((float)mc.displayWidth / 200) * config.FPS_COUNTER_X, ((float)mc.displayHeight / 200) * config.FPS_COUNTER_Y, 0xFFFFFF);
    }
}