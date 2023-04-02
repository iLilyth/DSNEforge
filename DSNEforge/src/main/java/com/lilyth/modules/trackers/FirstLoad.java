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
                File file1 = new File("./config/DSNEforge/SummoningEyes.txt");
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
                File file2 = new File("./config/DSNEforge/IceEyes.txt");
                if(file2.createNewFile()){
                    try{
                        FileWriter writer = new FileWriter(file2);
                        writer.write(String.valueOf(0));
                        writer.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    System.out.println("File created:" + file2.getName() + " @ " + file2.getPath());
                    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("File created @ ./config/DSNEforge/").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.LIGHT_PURPLE).setBold(true)));
                }else{
                    System.out.println("File already exists.");
                }
                File file3 = new File("./config/DSNEforge/CosmicEyes.txt");
                if(file3.createNewFile()){
                    try{
                        FileWriter writer = new FileWriter(file3);
                        writer.write(String.valueOf(0));
                        writer.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    System.out.println("File created:" + file3.getName() + " @ " + file3.getPath());
                    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("File created @ ./config/DSNEforge/").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.LIGHT_PURPLE).setBold(true)));
                }else{
                    System.out.println("File already exists.");
                }
                File file4 = new File("./config/DSNEforge/RadioactiveEyes.txt");
                if(file4.createNewFile()){
                    try{
                        FileWriter writer = new FileWriter(file4);
                        writer.write(String.valueOf(0));
                        writer.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    System.out.println("File created:" + file4.getName() + " @ " + file4.getPath());
                    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("File created @ ./config/DSNEforge/").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.LIGHT_PURPLE).setBold(true)));
                }else{
                    System.out.println("File already exists.");
                }
                File file5 = new File("./config/DSNEforge/FlamingEyes.txt");
                if(file5.createNewFile()){
                    try{
                        FileWriter writer = new FileWriter(file5);
                        writer.write(String.valueOf(0));
                        writer.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    System.out.println("File created:" + file5.getName() + " @ " + file5.getPath());
                    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("File created @ ./config/DSNEforge/").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.LIGHT_PURPLE).setBold(true)));
                }else{
                    System.out.println("File already exists.");
                }
                File file6 = new File("./config/DSNEforge/DivineEyes.txt");
                if(file6.createNewFile()){
                    try{
                        FileWriter writer = new FileWriter(file6);
                        writer.write(String.valueOf(0));
                        writer.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    System.out.println("File created:" + file6.getName() + " @ " + file6.getPath());
                    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("File created @ ./config/DSNEforge/").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.LIGHT_PURPLE).setBold(true)));
                }else{
                    System.out.println("File already exists.");
                }
                File file7 = new File("./config/DSNEforge/DivineAmeliorate.txt");
                if(file7.createNewFile()){
                    try{
                        FileWriter writer = new FileWriter(file7);
                        writer.write(String.valueOf(0));
                        writer.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    System.out.println("File created:" + file7.getName() + " @ " + file7.getPath());
                    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("File created @ ./config/DSNEforge/").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.LIGHT_PURPLE).setBold(true)));
                }else{
                    System.out.println("File already exists.");
                }
                File file8 = new File("./config/DSNEforge/EyesPlaced.txt");
                if(file8.createNewFile()){
                    try{
                        FileWriter writer = new FileWriter(file8);
                        writer.write(String.valueOf(0));
                        writer.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    System.out.println("File created:" + file8.getName() + " @ " + file8.getPath());
                    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("File created @ ./config/DSNEforge/").setChatStyle(new ChatStyle().setColor(EnumChatFormatting.LIGHT_PURPLE).setBold(true)));
                }else{
                    System.out.println("File already exists.");
                }
                File file9 = new File("./config/DSNEforge/DivinesPlaced.txt");
                if(file9.createNewFile()){
                    try{
                        FileWriter writer = new FileWriter(file9);
                        writer.write(String.valueOf(0));
                        writer.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    System.out.println("File created:" + file9.getName() + " @ " + file9.getPath());
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
