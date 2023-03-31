package com.lilyth.modules.listeners;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class RenderListener {
    private static final DSNEforge main = DSNEforge.getInstance();
    private final Config config = DSNEforge.getConfig();
    @SubscribeEvent
    public void onClientTick(TickEvent.RenderTickEvent event) {
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.thePlayer == null || mc.theWorld == null) return;
        if(!main.getUtils().isOnDragsim() || !main.getPlayerListener().HasNotRecentlyJoinedWorld()) return;
        main.getToggleSprint().autoSprintGUI(event);
        if(config.FPS_COUNTER){
            main.getFpscounter().fpsCounterGUI(event);
        }
        if(config.PING_COUNTER){
            main.getPingCounter().pingCounterGUI(event);
        }
        if(config.EYE_DISPLAY){
            main.getEyesDropped().eyeDropGui(event);
        }
    }
    @SubscribeEvent
    public void renderEntity(RenderLivingEvent.Specials.Pre<EntityLivingBase> event) {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.thePlayer == null || mc.theWorld == null || !main.getUtils().isOnDragsim() || !main.getPlayerListener().HasNotRecentlyJoinedWorld()) return;
        if (config.DMG_FORMATTING) {
            main.getDamageFormatting().damageFormatter(event);
        }
        if (config.RARE_DROPS) {
            main.getRareDropNotifier().rareDropNotifier(event);
        }
    }
}