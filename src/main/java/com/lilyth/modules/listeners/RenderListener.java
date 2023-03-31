package com.lilyth.modules.listeners;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.server.S45PacketTitle;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.client.GuiIngameForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import org.lwjgl.opengl.GL11;

import java.util.Objects;

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