package com.lilyth.modules.trackers;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FirstLoad {
    public boolean firstLoad() {
        String data = null;
        try {
            File theDir = new File("./config/DSNEforge");
            if(!theDir.exists()){
                FileUtils.forceMkdir(theDir);
                Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Folder created @ ./config/DSNEforge").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.LIGHT_PURPLE).setBold(true)));
            }
            File file = new File("./config/DSNEforge/FirstLoad.txt");
            if(file.createNewFile()){
                System.out.println("File created:" + file.getName() + " @ " + file.getPath());
                Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("File created @ ./config/DSNEforge/").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.LIGHT_PURPLE).setBold(true)));
                File file1 = new File("./config/DSNEforge/data.json");
                if(file1.createNewFile()){
                    try{
                        FileWriter writer = new FileWriter(file1);
                        writer.write(String.valueOf(0));
                        writer.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    System.out.println("File created:" + file1.getName() + " @ " + file1.getPath());
                    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("File created @ ./config/DSNEforge/").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.LIGHT_PURPLE).setBold(true)));
                }else{
                    System.out.println("File already exists.");
                }

            }else{
                System.out.println("File already exists.");
                data = "a";
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        return data==null;
    }
}
