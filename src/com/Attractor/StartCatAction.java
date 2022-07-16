package com.Attractor;

import java.util.Random;
import java.util.Scanner;

public class StartCatAction {

    public static FileService cats;

    public void start() {
        cats = FileService.read();
        cats.printCats();
        chooseOperation();
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
                Cat cat = new Cat();
                cats.addCats(cat);
            } catch (Exception e) {
                e.printStackTrace();

            }
            cats.printCats();
        }

    public void chooseOperation() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Какое действие вы хотите совершить?");
            System.out.println("1 - Добавить кота");
            System.out.println("2 - Играть с котом");
            System.out.println("3 - Покормить кота");
            System.out.println("4 - Отвести к ветеринару");
            System.out.println("5 - Выход");
            int scan = scanner.nextInt();
            switch (scan) {
                case 1:
                    addCat();
                    System.out.println("Вы добавили кота");
                    chooseOperation();
                    break;
                case 2:
                    System.out.println("Вы выбрали играть с котом");
                    cats.printCats();
                    int cats1 = chooseCat();
                    cats.getCats().get(cats1 - 1).playCat();
                    cats.printCats();
                    chooseOperation();
                    break;
                case 3:
                    System.out.println("Вы выбрали кормить кота");
                    cats.printCats();
                    cats1 = chooseCat();
                    cats.getCats().get(cats1 - 1).eat();
                    cats.printCats();
                    chooseOperation();
                    break;
                case 4:
                    System.out.println("Вы выбрали отвести к ветеринару кота");
                    cats.printCats();
                    cats1 = chooseCat();
                    cats.getCats().get(cats1 - 1).vet();
                    cats.printCats();
                    chooseOperation();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Неверно ввели");
                    chooseOperation();
            }
        } catch (Exception e) {
            System.out.println("Неверно ввели!!!!");
            chooseOperation();
        }
    }

    public int chooseCat() {
        try {
            System.out.println("Выберите номер кота");
            Scanner scanner1 = new Scanner(System.in);
            return scanner1.nextInt();
        } catch (Exception e) {
            System.out.println("Неверное значение");
            return 100;
        }
    }

    }


