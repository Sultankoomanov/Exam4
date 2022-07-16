package com.Attractor;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {

    public static Cat[] getGoods(){
        Gson gson = new Gson();
        Path path = Paths.get("./cats.json");

        String json;
        try {
            json = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return gson.fromJson(json, Cat[].class);
    }
}