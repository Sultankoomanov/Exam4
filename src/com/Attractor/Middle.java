package com.Attractor;

public class Middle extends Cat implements Action{
//    public Middle(String name, int age, int feed, int happyLevel, int health, int averageLevel) {
//        super(name, age, feed, happyLevel, health, averageLevel);
//    }

    @Override
    public void eat(Cat cat) {
        cat.setFeed(cat.getFeed()+5);
        cat.setHappyLevel(cat.getHappyLevel()+5);
        cat.setAverageLevel();
    }

    @Override
    public void play(Cat cat) {
        cat.setFeed(cat.getFeed()-5);
        cat.setHappyLevel(cat.getHappyLevel()+5);
        cat.setHealth(cat.getHealth()+5);
        cat.setAverageLevel();
    }

    @Override
    public void toVet(Cat cat) {
        cat.setFeed(cat.getFeed()-5);
        cat.setHappyLevel(cat.getHappyLevel()-5);
        cat.setHealth(cat.getHealth()+5);
        cat.setAverageLevel();

    }
}
