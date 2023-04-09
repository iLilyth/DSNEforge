package com.lilyth.modules.mixins;

import com.lilyth.DSNEforge;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(GuiIngame.class)
public abstract class MixinGuiIngameForge {

    private String title;
    private String subtitle;
    private int fadeIn;
    private int displayTime;
    private final Minecraft mc = Minecraft.getMinecraft();

    @Inject(method = "displayTitle", at = @At("HEAD"), cancellable = true)
    public void cancelTitle(String title, String subTitle, int timeFadeIn, int displayTime, int timeFadeOut, CallbackInfo ci) {
        System.out.println("title");
        if (DSNEforge.instance.getRareDropNotifier().cancelSomeEyes(title)){
            this.title = null;
            this.subtitle = null;
            this.fadeIn = 0;
            this.displayTime = 0;
            ci.cancel();
        }
    }

    @Inject(method = "renderGameOverlay", at = @At("RETURN"))

    private void onRenderGameOverlay(float partialTicks, CallbackInfo ci) {
        if (this.title != null || this.subtitle != null) {
            Gui.drawRect(0, 0, this.mc.displayWidth, this.mc.displayHeight / 3, -2147483648);
            int titleWidth = this.mc.fontRendererObj.getStringWidth(this.title);
            int subtitleWidth = this.mc.fontRendererObj.getStringWidth(this.subtitle);
            int x = (this.mc.displayWidth - Math.max(titleWidth, subtitleWidth)) / 2;
            int y = this.mc.displayHeight / 3;
            this.mc.fontRendererObj.drawString(this.title, x, y, 16777215);
            this.mc.fontRendererObj.drawString(this.subtitle, x, y + this.mc.fontRendererObj.FONT_HEIGHT + 3, 16777215);
            this.title = null;
            this.subtitle = null;
            this.fadeIn = 0;
            this.displayTime = 0;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setFadeIn(int fadeIn) {
        this.fadeIn = fadeIn;
    }

    public void setDisplayTime(int displayTime) {
        this.displayTime = displayTime;
    }
}
