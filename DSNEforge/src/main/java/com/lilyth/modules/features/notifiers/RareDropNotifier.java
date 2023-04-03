package com.lilyth.modules.features.notifiers;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.RenderLivingEvent;

public class RareDropNotifier {
    public String[] target1 = {"Livid Dagger", "Frozen Scythe"};
    public String[] target2 = {"Eagle Wing", "Shadow Assassin", "Dragon Wing", "Necron's", "Giant's Sword", "Platinum Egg", "Booster Bread", "Terminator"};
    public String[] target3 = {"Infernal Crimson", "Warden Helmet", "Hyperion", "Scylla", "Book of Seidr", "Divine Helmet"};
    public String[] target4 = {"Divine Alloy", "@)$&#^ #*$(@)", "Sorrow", "Divine Handle", "Golden String", "Celestium"};
    public int[] playSoundPitch = {1, 2, 3, 5, 8, 13};
    public int timeout;
    public boolean dragonDownlol1;
    public boolean dragonDownlol2;
    public boolean dragonDownlol3;
    public boolean dragonDownlol4;


    public void rareDropNotifier1(RenderLivingEvent.Specials.Pre<EntityLivingBase> e) {
        Minecraft mc = Minecraft.getMinecraft();
        Entity entity = e.entity;
        if(dragonDownlol1){
            if(entity.hasCustomName()){
                if (entity.getName().contains("§k")) {
                    for (int i = 0; i < target1.length; i++) {
                        if (entity.getName().contains(target1[i])) {
                            mc.ingameGUI.displayTitle(entity.getName(), "", 0, 100, 0);
                            for (int soundPitch : playSoundPitch) {
                                mc.thePlayer.playSound("random.orb", 1, soundPitch);
                            }
                            dragonDownlol1 = false;
                        }
                    }
                }
            }
        }
    }
    public void rareDropNotifier2(RenderLivingEvent.Specials.Pre<EntityLivingBase> e) {
        Minecraft mc = Minecraft.getMinecraft();
        Entity entity = e.entity;
        if(dragonDownlol2){
            if(entity.hasCustomName()){
                if (entity.getName().contains("§k")) {
                    for (int i = 0; i < target2.length; i++) {
                        if (entity.getName().contains(target2[i])) {
                            mc.ingameGUI.displayTitle(entity.getName(), "", 0, 100, 0);
                            for (int soundPitch : playSoundPitch) {
                                mc.thePlayer.playSound("random.orb", 1, soundPitch);
                            }
                            dragonDownlol2 = false;
                        }
                    }
                }
            }
        }
    }
    public void rareDropNotifier3(RenderLivingEvent.Specials.Pre<EntityLivingBase> e) {
        Minecraft mc = Minecraft.getMinecraft();
        Entity entity = e.entity;
        if (dragonDownlol3) {
            if(entity.hasCustomName()){
                if (entity.getName().contains("§k")) {
                    for (int i = 0; i < target3.length; i++) {
                        if (entity.getName().contains(target3[i])) {
                            mc.ingameGUI.displayTitle(entity.getName(), "", 0, 100, 0);
                            for (int soundPitch : playSoundPitch) {
                                mc.thePlayer.playSound("random.orb", 1, soundPitch);
                            }
                            dragonDownlol3 = false;
                        }
                    }
                }
            }
        }
    }
    public void rareDropNotifier4(RenderLivingEvent.Specials.Pre<EntityLivingBase> e) {
        Minecraft mc = Minecraft.getMinecraft();
        Entity entity = e.entity;
        if (dragonDownlol4) {
            if(entity.hasCustomName()){
                if (entity.getName().contains("§k")) {
                    for (int i = 0; i < target4.length; i++) {
                        if (entity.getName().contains(target4[i])) {
                            mc.ingameGUI.displayTitle(entity.getName(), "", 0, 100, 0);
                            for (int soundPitch : playSoundPitch) {
                                mc.thePlayer.playSound("random.orb", 1, soundPitch);
                            }
                            dragonDownlol4 = false;
                        }
                    }
                }
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
            timeout = 40;
        }
    }

    public void timeoutCount(){
        timeout = timeout - 1;
    }


}
