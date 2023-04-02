package com.lilyth.modules.features.notifiers;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import tv.twitch.chat.Chat;

public class RareDropNotifier {
    String[] target1 = {"Shadow Assassin", "Livid Dagger", "Frozen Scythe"};
    String[] target2 = {"Eagle Wing", "Dragon Wing", "Necron's", "Giant's Sword", "Platinum Egg", "Booster Bread", "Terminator"};
    String[] target3 = {"Infernal Crimson", "Warden Helmet", "Hyperion", "Scylla", "Book of Seidr", "Divine Helmet"};
    String[] target4 = {"Divine Alloy", "@)$&#^ #*$(@)", "Sorrow", "Divine Handle", "Golden String", "Celestium"};
    public boolean dragonDownlol1;
    public boolean dragonDownlol2;
    public boolean dragonDownlol3;
    public boolean dragonDownlol4;

    public void rareDropNotifier1(RenderLivingEvent.Specials.Pre<EntityLivingBase> e) {
        Minecraft mc = Minecraft.getMinecraft();
        Entity entity = e.entity;
        if(dragonDownlol1){
            if (entity.getName().contains("§k")) {
                for (String s : target1) {
                    if (entity.getName().contains(s)) {
                        mc.ingameGUI.displayTitle(entity.getName(), "", 0, 100, 0);
                    }
                }
                dragonDownlol1 = false;
            }
        }
    }
    public void rareDropNotifier2(RenderLivingEvent.Specials.Pre<EntityLivingBase> e) {
        Minecraft mc = Minecraft.getMinecraft();
        Entity entity = e.entity;
        if(dragonDownlol2){
            if (entity.getName().contains("§k")) {
                for (String s : target2) {
                    if (entity.getName().contains(s)) {
                        mc.ingameGUI.displayTitle(entity.getName(), "", 0, 100, 0);
                    }
                }
                dragonDownlol2 = false;
            }
        }
    }
    public void rareDropNotifier3(RenderLivingEvent.Specials.Pre<EntityLivingBase> e) {
        Minecraft mc = Minecraft.getMinecraft();
        Entity entity = e.entity;
        if (dragonDownlol3) {
            if (entity.getName().contains("§k")) {
                for (String s : target3) {
                    if (entity.getName().contains(s)) {
                        mc.ingameGUI.displayTitle(entity.getName(), "", 0, 100, 0);
                    }
                }
                dragonDownlol3 = false;
            }
        }
    }
    public void rareDropNotifier4(RenderLivingEvent.Specials.Pre<EntityLivingBase> e) {
        Minecraft mc = Minecraft.getMinecraft();
        Entity entity = e.entity;
        if (dragonDownlol4) {
            if (entity.getName().contains("§k")) {
                for (String s : target4) {
                    if (entity.getName().contains(s)) {
                        mc.ingameGUI.displayTitle(entity.getName(), "", 0, 100, 0);

                    }
                }
                dragonDownlol4 = false;
            }
        }
    }
    public void dragonDown(ClientChatReceivedEvent event) {
        String msg = event.message.getUnformattedText();
        if(msg.startsWith("Dragon down!")){
            dragonDownlol1 = true;
            dragonDownlol2 = true;
            dragonDownlol3 = true;
            dragonDownlol4 = true;

        }
    }
}
