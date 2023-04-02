package com.lilyth.modules.utils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

public class JSON {
    public static HashMap<String, Integer> eyes = new HashMap<>();
    public static void saveEyes() {
        JSONObject obj = new JSONObject();
        for(String key : eyes.keySet()) {
            obj.put(key, eyes.get(key));
        }
        try (FileWriter file = new FileWriter("./config/DSNEforge/data.json")) {
            file.write(obj.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
    public static void loadEyes() {
        JSONParser parser = new JSONParser();
        try(Reader reader =  new FileReader("./config/DSNEforge/data.json")) {
            eyes.clear();
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            eyes.put("cosmic", (int) jsonObject.getOrDefault("cosmic", 0));
            eyes.put("flaming", (int) jsonObject.getOrDefault("flaming", 0));
            eyes.put("normal", (int) jsonObject.getOrDefault("normal", 0));
            eyes.put("ice", (int) jsonObject.getOrDefault("ice", 0));
            eyes.put("radio", (int) jsonObject.getOrDefault("radio", 0));
            eyes.put("divine", (int) jsonObject.getOrDefault("divine", 0));
            eyes.put("ameliorate", (int) jsonObject.getOrDefault("ameliorate", 0));
            eyes.put("placed", (int) jsonObject.getOrDefault("placed", 0));
            eyes.put("divplaced", (int) jsonObject.getOrDefault("divplaced", 0));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static void incrEye(String eye) {
        eyes.put(eye, eyes.get(eye)+1);
        saveEyes();
    }
}
