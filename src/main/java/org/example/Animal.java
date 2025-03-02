package org.example;

public abstract class Animal {
//    String name;
//    int distRun;
//    int distSwim;
//    int heightJump;
//
//    public Animal (String name, int run, int swim, int jump){
//        this.name = name;
//        this.distRun = run;
//        this.distSwim = swim;
//        this.heightJump = jump;
//    }
    public abstract void jamp(String name, int heightJump);
    public abstract void run(String name, int distRun);
    public abstract void swim(String name, int distSwim);

}
