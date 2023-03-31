package com.lilyth.modules.trackers;

import com.lilyth.DSNEforge;
import com.lilyth.config.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.io.*;

public class EyesDropped {
    private final Config config = DSNEforge.getConfig();
    public String eyeCount1(){
        String asd = "";
        try {
            FileReader fileReader = new FileReader("./config/DSNEforge/SummoningEyes.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            asd = reader.readLine();
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return asd;
    }
    public String eyeCount2(){
        String asd = "";
        try {
            FileReader fileReader = new FileReader("./config/DSNEforge/IceEyes.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            asd = reader.readLine();
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return asd;
    }
    public String eyeCount3(){
        String asd = "";
        try {
            FileReader fileReader = new FileReader("./config/DSNEforge/CosmicEyes.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            asd = reader.readLine();
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return asd;
    }
    public String eyeCount4(){
        String asd = "";
        try {
            FileReader fileReader = new FileReader("./config/DSNEforge/RadioactiveEyes.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            asd = reader.readLine();
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return asd;
    }
    public String eyeCount5(){
        String asd = "";
        try {
            FileReader fileReader = new FileReader("./config/DSNEforge/FlamingEyes.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            asd = reader.readLine();
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return asd;
    }
    public String eyeCount6(){
        String asd = "";
        try {
            FileReader fileReader = new FileReader("./config/DSNEforge/DivineEyes.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            asd = reader.readLine();
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return asd;
    }
    public String eyeCount7(){
        String asd = "";
        try {
            FileReader fileReader = new FileReader("./config/DSNEforge/DivineAmeliorate.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            asd = reader.readLine();
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return asd;
    }
    public String eyeCount8(){
        String asd = "";
        try {
            FileReader fileReader = new FileReader("./config/DSNEforge/EyesPlaced.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            asd = reader.readLine();
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return asd;
    }
    public String eyeCount9(){
        String asd = "";
        try {
            FileReader fileReader = new FileReader("./config/DSNEforge/DivinesPlaced.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            asd = reader.readLine();
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return asd;
    }
    public void addEye(ClientChatReceivedEvent e){
        Minecraft mc = Minecraft.getMinecraft();
        String text = e.message.getUnformattedText();
        if(text.startsWith("RARE DROP! Summoning Eye")){
            try{
                FileReader fileReader = new FileReader("./config/DSNEforge/SummoningEyes.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String asd = reader.readLine();
                reader.close();
                FileWriter fileWriter = new FileWriter("./config/DSNEforge/SummoningEyes.txt", false);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                writer.write(String.valueOf(Integer.parseInt(asd) + 1));
                writer.close();

            }catch(IOException er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("RARE DROP! Ice Eye")){
            try{
                FileReader fileReader = new FileReader("./config/DSNEforge/IceEyes.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String asd = reader.readLine();
                reader.close();
                FileWriter fileWriter = new FileWriter("./config/DSNEforge/IceEyes.txt", false);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                writer.write(String.valueOf(Integer.parseInt(asd) + 1));
                writer.close();

            }catch(IOException er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("RARE DROP! Cosmic Eye")){
            try{
                FileReader fileReader = new FileReader("./config/DSNEforge/CosmicEyes.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String asd = reader.readLine();
                reader.close();
                FileWriter fileWriter = new FileWriter("./config/DSNEforge/CosmicEyes.txt", false);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                writer.write(String.valueOf(Integer.parseInt(asd) + 1));
                writer.close();

            }catch(IOException er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("CRAZY RARE DROP! Radioactive Eye")){
            try{
                FileReader fileReader = new FileReader("./config/DSNEforge/RadioactiveEyes.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String asd = reader.readLine();
                reader.close();
                FileWriter fileWriter = new FileWriter("./config/DSNEforge/RadioactiveEyes.txt", false);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                writer.write(String.valueOf(Integer.parseInt(asd) + 1));
                writer.close();

            }catch(IOException er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("RNGesus INCARNATE! Flaming Eye")){
            try{
                FileReader fileReader = new FileReader("./config/DSNEforge/FlamingEyes.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String asd = reader.readLine();
                reader.close();
                FileWriter fileWriter = new FileWriter("./config/DSNEforge/FlamingEyes.txt", false);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                writer.write(String.valueOf(Integer.parseInt(asd) + 1));
                writer.close();

            }catch(IOException er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("RNGesus INCARNATE! Divine Eye")){
            try{
                FileReader fileReader = new FileReader("./config/DSNEforge/DivineEyes.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String asd = reader.readLine();
                reader.close();
                FileWriter fileWriter = new FileWriter("./config/DSNEforge/DivineEyes.txt", false);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                writer.write(String.valueOf(Integer.parseInt(asd) + 1));
                writer.close();

            }catch(IOException er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("INSANE DROP! Divine Ameliorate")){
            try{
                FileReader fileReader = new FileReader("./config/DSNEforge/DivineAmeliorate.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String asd = reader.readLine();
                reader.close();
                FileWriter fileWriter = new FileWriter("./config/DSNEforge/DivineAmeliorate.txt", false);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                writer.write(String.valueOf(Integer.parseInt(asd) + 1));
                writer.close();

            }catch(IOException er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("* You placed a Summoning Eye!")){
            try{
                FileReader fileReader = new FileReader("./config/DSNEforge/EyesPlaced.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String asd = reader.readLine();
                reader.close();
                FileWriter fileWriter = new FileWriter("./config/DSNEforge/EyesPlaced.txt", false);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                writer.write(String.valueOf(Integer.parseInt(asd) + 1));
                writer.close();
            }catch(IOException er){
                System.out.println("An error has occured.");
                mc.thePlayer.addChatMessage(new ChatComponentText("Shit broke gg"));
            }
        }
        if(text.startsWith("* You placed a Divine Eye!")){
            try{
                FileReader fileReader = new FileReader("./config/DSNEforge/DivinesPlaced.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String asd = reader.readLine();
                reader.close();
                FileWriter fileWriter = new FileWriter("./config/DSNEforge/DivinesPlaced.txt", false);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                writer.write(String.valueOf(Integer.parseInt(asd) + 1));
                writer.close();
            }catch(IOException er){
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