package org.example;

public class Cats extends Animal {


//    public Cats(String name, int run, int swim, int jump) {
//        super(name, run, swim, jump);
//    }
    int maxJamp = 3;
    int maxRun =200;
    int maxSwim = 0;

    @Override
    public void jamp(String name, int heightJump) {
        if (heightJump <= maxJamp)
            System.out.println(name + " прыгнул " + heightJump + " м ");
        else
            System.out.println(name + " не прыгнет " + heightJump + " м ");

    }

    @Override
    public void run(String name, int distRun) {
        if (distRun <= maxRun)
            System.out.println(name + " пробежал " + distRun + " м ");
        else
            System.out.println(name + " не пробежал " + distRun + " м ");
    }

    @Override
    public void swim(String name, int distSwim) {

        if (distSwim > maxSwim)
            System.out.println(name + " отказался плыть вовсе ");
        else
            System.out.println("Даже не предлагайте коту плавать");

    }
}
