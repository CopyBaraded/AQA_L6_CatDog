package org.example;

public class Dog extends Animal {


//    public Dog(String name, int run, int swim, int jump) {
//        super(name, run, swim, jump);
    //}
    int maxJamp = 5;
    int maxRun = 500;
    int maxSwim = 10;

    @Override
    public void jamp(String name, int heightJump) {
        if (heightJump <= maxJamp)
            System.out.println(name + "jamp" + heightJump + "m");
        else
            System.out.println(name + "not jump");
    }





}
