package com.lilyth.modules.features.notifiers;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.RenderLivingEvent;

public class RareDropNotifier {
    String[] target = {"Booster Bread", "Shadow Assassin", "Eagle Wing", "Dragon Wing", "Necron's", "Giant's Sword", "Infernal Crimson", "Warden Helmet", "Terminator", "Divine Alloy", "Book of Seidr", "Platinum Egg", "Hyperion", "Scylla", "@)$&#^ #*$(@)", "Sorrow", "Divine Handle", "Golden String", "Celestium"};

    public void rareDropNotifier(RenderLivingEvent.Specials.Pre<EntityLivingBase> e) {
        Minecraft mc = Minecraft.getMinecraft();
        Entity entity = e.entity;
        if(dragonDownlol){
            if (entity.hasCustomName()) {
                if (entity.getName().contains("§k")) {
                    for (int i = 0; i < target.length; i++) {
                        if (entity.getName().contains(target[i])) {
                            mc.ingameGUI.displayTitle(entity.getName(), "", 0, 100, 0);
                            dragonDownlol = false;
                        }
                    }
                }
            }
        }

    }
    public boolean dragonDownlol;
    public void dragonDown(ClientChatReceivedEvent event) {
        String msg = event.message.getUnformattedText();
        if(msg.startsWith("Dragon down!")){
            dragonDownlol = true;
        }
    }
}
