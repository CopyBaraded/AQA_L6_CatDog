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
    public void run(String name, int distRun){
        System.out.println("run" + distRun + "m");
    }
    public void swim(String name, int distSwim){
        System.out.println("swim" + distSwim + "m");
    }


}
