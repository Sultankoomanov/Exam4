package com.Attractor;

public class Young extends Cat implements Action{
//    public Young(String name, int age, int feed, int happyLevel, int health, int averageLevel) {
//        super(name, age, feed, happyLevel, health, averageLevel);
//    }

    @Override
    public void eat(Cat cat) {
        cat.setFeed(cat.getFeed()+7);
        cat.setHappyLevel(cat.getHappyLevel()+7);
        cat.setAverageLevel();
    }

    @Override
    public void play(Cat cat) {
        cat.setFeed(cat.getFeed()-3);
        cat.setHappyLevel(cat.getHappyLevel()+7);
        cat.setHealth(cat.getHealth()+7);
        cat.setAverageLevel();
    }

    @Override
    public void toVet(Cat cat) {
        cat.setFeed(cat.getFeed()-3);
        cat.setHappyLevel(cat.getHappyLevel()-3);
        cat.setHealth(cat.getHealth()+7);
        cat.setAverageLevel();
    }
}
