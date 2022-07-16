package com.Attractor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class FileService {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final Path path = Paths.get("./cats.json");

    public static Map<String, List<Cat>> readFile(){

        String json;
        try {
            json = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return gson.fromJson(json, new TypeToken<Map<String, List<Cat>>>() {}.getType());
    }

    public static void writeFile(Cat[] cats){
        String json = gson.toJson(cats);

        byte[] arr = json.getBytes();
        try {
            Files.write(path, arr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}