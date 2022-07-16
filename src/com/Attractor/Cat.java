package com.Attractor;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private int feed;
    private int happyLevel;
    private int health;
    private int averageLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFeed() {
        return feed;
    }

    public void setFeed(int feed) {
        this.feed = feed;
    }

    public int getHappyLevel() {
        return happyLevel;
    }

    public void setHappyLevel(int happyLevel) {
        this.happyLevel = happyLevel;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAverageLevel() {
        return averageLevel;
    }

    public void setAverageLevel(int averageLevel) {
        this.averageLevel = averageLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && feed == cat.feed && happyLevel == cat.happyLevel && health == cat.health && averageLevel == cat.averageLevel && name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, feed, happyLevel, health, averageLevel);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", feed=" + feed +
                ", happyLevel=" + happyLevel +
                ", health=" + health +
                ", averageLevel=" + averageLevel +
                '}';
    }
}
