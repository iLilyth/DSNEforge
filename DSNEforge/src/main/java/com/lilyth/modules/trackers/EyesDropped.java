package com.lilyth.modules.trackers;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import com.lilyth.modules.utils.JSON;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.io.*;

public class EyesDropped {
    private final Config config = DSNEforge.getConfig();
    public String eyeCount1(){
        return JSON.eyes.getOrDefault("normal", 0).toString();
    }
    public String eyeCount2(){
        return JSON.eyes.getOrDefault("ice", 0).toString();
    }
    public String eyeCount3(){
        return JSON.eyes.getOrDefault("cosmic", 0).toString();
    }
    public String eyeCount4(){
        return JSON.eyes.getOrDefault("radio", 0).toString();
    }
    public String eyeCount5(){
        return JSON.eyes.getOrDefault("flaming", 0).toString();
    }
    public String eyeCount6(){
        return JSON.eyes.getOrDefault("divine", 0).toString();
    }
    public String eyeCount7(){
        return JSON.eyes.getOrDefault("ameliorate", 0).toString();
    }
    public String eyeCount8(){
        return JSON.eyes.getOrDefault("placed", 0).toString();
    }
    public String eyeCount9(){
        return JSON.eyes.getOrDefault("divplaced", 0).toString();
    }
    public void addEye(ClientChatReceivedEvent e){
        Minecraft mc = Minecraft.getMinecraft();
        String text = e.message.getUnformattedText();
        if(text.startsWith("RARE DROP! Summoning Eye")){
            try{
                JSON.incrEye("normal");

            }catch(Exception er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("RARE DROP! Ice Eye")){
            try{
                JSON.incrEye("ice");

            }catch(Exception er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("RARE DROP! Cosmic Eye")){
            try{
                JSON.incrEye("cosmic");

            }catch(Exception er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("CRAZY RARE DROP! Radioactive Eye")){
            try{
                JSON.incrEye("radio");
            }catch(Exception er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("RNGesus INCARNATE! Flaming Eye")){
            try{
                JSON.incrEye("flaming");

            }catch(Exception er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("RNGesus INCARNATE! Divine Eye")){
            try{
                JSON.incrEye("divine");

            }catch(Exception er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("INSANE DROP! Divine Ameliorate")){
            try{
                JSON.incrEye("ameliorate");

            }catch(Exception er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("* You placed a Summoning Eye!")){
            try{
                JSON.incrEye("placed");

            }catch(Exception er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("* You placed a Divine Eye!")){
            try{
                JSON.incrEye("divplaced");

            }catch(Exception er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
    }
    public void eyeDropGui(TickEvent.RenderTickEvent event){
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.thePlayer == null || mc.theWorld == null) return;
        mc.fontRendererObj.drawStringWithShadow("Eyes placed: " + eyeCount8(), ((float)mc.displayWidth / 200) * config.EYE_DISPLAY_X, ((float)mc.displayHeight / 200) * config.EYE_DISPLAY_Y - 30, 0xAA00AA);
        mc.fontRendererObj.drawStringWithShadow("Eyes placed: " + eyeCount9(), ((float)mc.displayWidth / 200) * config.EYE_DISPLAY_X, ((float)mc.displayHeight / 200) * config.EYE_DISPLAY_Y - 20, 0x55FFFF);
        mc.fontRendererObj.drawStringWithShadow("Summoning Eyes: " + eyeCount1(), ((float)mc.displayWidth / 200) * config.EYE_DISPLAY_X, ((float)mc.displayHeight / 200) * config.EYE_DISPLAY_Y, 0xAA00AA);
        mc.fontRendererObj.drawStringWithShadow("Ice Eyes: " + eyeCount2(), (((float)mc.displayWidth / 200) * config.EYE_DISPLAY_X), (((float)mc.displayHeight / 200) * config.EYE_DISPLAY_Y) + 10, 0x00AAAA);
        mc.fontRendererObj.drawStringWithShadow("Cosmic Eyes: " + eyeCount3(), (((float)mc.displayWidth / 200) * config.EYE_DISPLAY_X), (((float)mc.displayHeight / 200) * config.EYE_DISPLAY_Y) + 20, 0xFF55FF);
        mc.fontRendererObj.drawStringWithShadow("Radioactive Eyes: " + eyeCount4(), (((float)mc.displayWidth / 200) * config.EYE_DISPLAY_X), (((float)mc.displayHeight / 200) * config.EYE_DISPLAY_Y) + 30, 0x55FF55);
        mc.fontRendererObj.drawStringWithShadow("Flaming Eyes: " + eyeCount5(), (((float)mc.displayWidth / 200) * config.EYE_DISPLAY_X), (((float)mc.displayHeight / 200) * config.EYE_DISPLAY_Y) + 40, 0xFF5555);
        mc.fontRendererObj.drawStringWithShadow("Divine Eyes: " + eyeCount6(), (((float)mc.displayWidth / 200) * config.EYE_DISPLAY_X), (((float)mc.displayHeight / 200) * config.EYE_DISPLAY_Y) + 50, 0x55FFFF);
        mc.fontRendererObj.drawStringWithShadow("Divine Ameliorate: " + eyeCount7(), (((float)mc.displayWidth / 200) * config.EYE_DISPLAY_X), (((float)mc.displayHeight / 200) * config.EYE_DISPLAY_Y) + 60, 0x55FFFF);

    }

}