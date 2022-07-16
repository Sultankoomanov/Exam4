package com.Attractor;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        run();
    }

    private static void run() {

        FileService cats;
        cats = FileService.read();
        cats.printCats();

//        List<Cat>> movieList = FileService.readFile();
//        List<Cat> cats = movieList.get("cats");
    }

}
