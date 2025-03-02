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
            System.out.println(name + " jamp " + heightJump + " m ");
        else
            System.out.println(name + " not jump " + heightJump + " m ");

    }

    @Override
    public void run(String name, int distRun) {
        if (distRun <= maxRun)
            System.out.println(name + " run " + distRun + " m ");
        else
            System.out.println(name + " not run " + distRun + " m ");
    }

    @Override
    public void swim(String name, int distSwim) {
        boolean b = distSwim != maxSwim;
            System.out.println(name + " cat not swim " + b);

    }
}
