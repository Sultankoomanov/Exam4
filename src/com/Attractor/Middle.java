package com.Attractor;

public class Middle extends Cat implements Action{
    public Middle(String name, int age, int feed, int happyLevel, int health, int averageLevel) {
        super(name, age, feed, happyLevel, health, averageLevel);
    }

    @Override
    public void eat(Cat cat) {
        cat.setFeed(cat.getFeed()+7);
    }

    @Override
    public void play(Cat cat) {

    }

    @Override
    public void toVet(Cat cat) {

    }
}
