package com.lilyth.modules.features.hud;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ToggleSprint {
    public final Config config = DSNEforge.getConfig();
    public boolean isToggled = false;
    public int cooldown;
    public KeyBinding toggleKey = Minecraft.getMinecraft().gameSettings.keyBindSprint;

    public void autoSprint(TickEvent.ClientTickEvent event){
        Minecraft mc = Minecraft.getMinecraft();
        if(cooldown!=0){
            cooldown = cooldown - 1;
        }
        if(cooldown==0){
            if (toggleKey.isKeyDown()) {
                isToggled = !isToggled;
                cooldown = 20;
            }
        }
        if (isToggled && mc.thePlayer.moveForward > 0) {
            if(!mc.thePlayer.isSneaking()){
                mc.thePlayer.setSprinting(true);
            }
        }
    }
    public void autoSprintGUI(TickEvent.RenderTickEvent event){
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.thePlayer == null || mc.theWorld == null || !isToggled) return;
        mc.fontRendererObj.drawStringWithShadow("Autosprint: enabled", ((float)mc.displayWidth / 200) * config.AUTOSPRINT_X, ((float)mc.displayHeight / 200) * config.AUTOSPRINT_Y, 0xFFFFFF);
    }
}
