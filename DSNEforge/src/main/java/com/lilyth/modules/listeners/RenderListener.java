package com.lilyth.modules.listeners;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class RenderListener {
    private static final DSNEforge main = DSNEforge.getInstance();
    private final Config config = DSNEforge.getConfig();
    public boolean guiOpen;
    @SubscribeEvent
    public void onClientTick(TickEvent.RenderTickEvent event) {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.thePlayer == null || mc.theWorld == null) return;
        if (main.getUtils().isOnDragsim() && main.getPlayerListener().HasNotRecentlyJoinedWorld()) {
            if (!guiOpen) {
                main.getToggleSprint().autoSprintGUI(event);
                if (config.FPS_COUNTER) {
                    main.getFpscounter().fpsCounterGUI(event);
                }
                if (config.PING_COUNTER) {
                    if (!Minecraft.getMinecraft().isSingleplayer()) {
                        main.getPingCounter().pingCounterGUI(event);
                    }
                }
                if (config.EYE_DISPLAY) {
                    main.getEyesDropped().eyeDropGui(event);
                }
                if (config.DRAGON_TIMER) {
                    main.getDragonSpawn().dragonSpawnGUI(event);
                }
            }
        }
    }
    @SubscribeEvent
    public void onGuiOpened(GuiOpenEvent event){
        guiOpen = event.gui != null;
    }

    @SubscribeEvent
    public void renderEntity(RenderLivingEvent.Specials.Pre<EntityLivingBase> event) {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.thePlayer != null && mc.theWorld != null && main.getUtils().isOnDragsim() && main.getPlayerListener().HasNotRecentlyJoinedWorld()) {
            if (config.DMG_FORMATTING) {
                main.getDamageFormatting().damageFormatter(event);
            }
            if (config.RARE_DROPS) {
                if(!config.RARE_DROPS_1){
                    main.getRareDropNotifier().rareDropNotifier1(event);
                }
                main.getRareDropNotifier().rareDropNotifier2(event);
                main.getRareDropNotifier().rareDropNotifier3(event);
                main.getRareDropNotifier().rareDropNotifier4(event);
            }
            if (config.ENDERMAN_WAYPOINTS) {
                main.getEndermanWaypoints().endermanWaypoints(event);
            }
        }
    }
}