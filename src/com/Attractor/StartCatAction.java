package com.Attractor;

import java.util.Random;
import java.util.Scanner;

public class StartCatAction {

    public static FileService cats;

    public void start() {

        cats = FileService.read();
        cats.printCats();
        addCat();

    }



    public  void addCat() {
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



    public void chooseOperation() {
        try {
            Scanner scanner = new Scanner(System.in);
            int scan = scanner.nextInt();

            System.out.println("Какое действие вы хотите совершить?");
            System.out.println("1 - Добавить кота");
            System.out.println("2 - Играть с котом");
            System.out.println("3 - Покормить кота");
            System.out.println("4 - Отвести к ветеринару");

            switch (scan) {
                case 1:
                        addCat();
                        System.out.println("Вы добавили кота");
                        chooseOperation();
                        break;
                case  2:
                    System.out.println("Вы выбрали играть с котом");
                    cats.printCats();
                    int cats1 = chooseCat();
                    cats.getCats().get(cats1 - 1).play();

            }
        }
    }

    public int chooseCat() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Неверное значение");
        }
        return 100;
    }


    }


