package com.Attractor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FileService {

    ArrayList <Cat> cats;
    public List<Cat> catsList;

    public FileService() {
        var filePath = Path.of("cats.json");
        Gson gson = new Gson();
        try {
            cats = new ArrayList<>();
            catsList = List.of(gson.fromJson(Files.readString(filePath), Cat[].class));
            cats.addAll(catsList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static FileService read() {
        return new FileService();
    }

    public ArrayList<Cat> getCats() {
        return cats;
    }
    public void addCats(Cat cat) {
        cats.add(cat);
    }
    public void printCats() {
        System.out.println("№   |  имя    |  возраст   |  здоровье    |  сытость   | средний уровень");
        System.out.println("------------------------------------------------------------------------");
        int count = 1;
        for (Cat c : cats) {
            System.out.printf("%s  |   %s  \t|   %s  \t|   %s  \t|   %s  \t    |    %s  |\n",count, c.getName(), c.getAge(),c.getHealth(),c.getFeed(),c.getAverageLevel());
            count++;
        }
    }
}