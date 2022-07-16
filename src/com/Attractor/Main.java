package com.Attractor;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        run();
    }

    private static void run() {

        FileService cats = FileService.read();
        cats.printCats();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавить нового кота: ");
        System.out.println("Дайте имя коту: ");
        String name = scanner.next();
        System.out.println("Введите возраст кота: ");
        int age = scanner.nextInt();
        System.out.println("Введите здоровье кота: ");
        int health = scanner.nextInt();
        System.out.println("Введите счастье кота: ");
        int happyLevel = scanner.nextInt();
        System.out.println("Введите сытость: ");
        int feed = scanner.nextInt();
        System.out.println("Введите средний уровень кота: ");
        int average = scanner.nextInt();

        Random random = new Random();
        int rnd = random.nextInt(80)+20;

        try {
            Cat cat = new Cat(name,age,feed, happyLevel, health, average);
            cats.addCats(cat);
        } catch (Exception e) {
            e.printStackTrace();

    }
        cats.printCats();

    }

//    private static void addCat() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Добавить нового кота: ");
//        System.out.println("Дайте имя коту: ");
//        String name = scanner.next();
//        System.out.println("Введите возраст кота: ");
//        int age = scanner.nextInt();
//        System.out.println("Введите здоровье кота: ");
//        int health = scanner.nextInt();
//        System.out.println("Введите счастье кота: ");
//        int happyLevel = scanner.nextInt();
//        System.out.println("Введите сытость: ");
//        int feed = scanner.nextInt();
//        System.out.println("Введите средний уровень кота: ");
//        int average = scanner.nextInt();
//
//        Random random = new Random();
//        int rnd = random.nextInt(80)+20;
//
//        try {
//            Cat cat = new Cat(name,age,feed, happyLevel, health, average);
//
//        }
//
//    }

}
