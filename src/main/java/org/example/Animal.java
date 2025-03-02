package org.example;

public class Animal implements BehaviorAnimal {
    int val;
    @Override
    public int jump() {
        return 0;
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public int swim() {
        return 0;
    }
}
