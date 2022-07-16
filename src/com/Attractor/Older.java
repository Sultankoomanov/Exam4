package com.Attractor;

public class Older extends Cat implements Action{
//    public Older(String name, int age, int feed, int happyLevel, int health, int averageLevel) {
//        super(name, age, feed, happyLevel, health, averageLevel);
//    }

    @Override
    public void eat(Cat cat) {
        cat.setFeed(cat.getFeed()+4);
        cat.setHappyLevel(cat.getHappyLevel()+4);
        cat.setAverageLevel();
    }

    @Override
    public void play(Cat cat) {
        cat.setFeed(cat.getFeed()-6);
        cat.setHappyLevel(cat.getHappyLevel()+4);
        cat.setHealth(cat.getHealth()+4);
        cat.setAverageLevel();

    }

    @Override
    public void toVet(Cat cat) {
        cat.setFeed(cat.getFeed()-6);
        cat.setHappyLevel(cat.getHappyLevel()-6);
        cat.setHealth(cat.getHealth()+4);
        cat.setAverageLevel();
    }
}
