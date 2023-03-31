package com.lilyth.modules.features.hud;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ToggleSprint {

    public static final DSNEforge main = DSNEforge.getInstance();
    public final Config config = DSNEforge.getConfig();
    public boolean isToggled = false;
    public KeyBinding toggleKey = Minecraft.getMinecraft().gameSettings.keyBindSprint;

    public void autoSprint(TickEvent.ClientTickEvent e){
        Minecraft mc = Minecraft.getMinecraft();
        if (toggleKey.isKeyDown()) {
            isToggled = !isToggled;
        }
        if (isToggled && mc.thePlayer.moveForward > 0) {
            mc.thePlayer.setSprinting(true);
        }
    }
    public void autoSprintGUI(TickEvent.RenderTickEvent e){
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.thePlayer == null || mc.theWorld == null || !isToggled) return;
        mc.fontRendererObj.drawStringWithShadow("Autosprint: enabled", ((float)mc.displayWidth / 200) * config.AUTOSPRINT_X, ((float)mc.displayHeight / 200) * config.AUTOSPRINT_Y, 0xFFFFFF);
    }
}
